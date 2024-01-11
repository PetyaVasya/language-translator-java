import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tests {

    private static final Path TEST_PATH = Path.of("./test");
    private static final FileVisitor<Path> DELETE_VISITOR = new SimpleFileVisitor<>() {
        @Override
        public FileVisitResult postVisitDirectory(
                Path dir, IOException exc) throws IOException {
            Files.delete(dir);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(
                Path file, BasicFileAttributes attrs)
                        throws IOException {
            Files.delete(file);
            return FileVisitResult.CONTINUE;
        }
    };

    private Path outputDirectory;

    @ParameterizedTest
    @MethodSource("getCorrectFiles")
    public void correctPrograms(final String displayName) throws IOException, InterruptedException {
        Path programDir = getProgramDirPath(displayName);
        Path convertedPath = createTempFile(".c");
        Path clangPath = createTempFile();
        Path outputPath = createTempFile();
        Main.main(new String[]{
                convertedPath.toString(),
                programDir.resolve("code.2c").toString()
        });
        Process compileProcess = new ProcessBuilder(
                "gcc", "-o", clangPath.toString(), convertedPath.toString()
        ).start();
        compileProcess.waitFor();
        Assertions.assertEquals(
                "",
                getError(compileProcess)
        );

        ProcessBuilder runBuilder = new ProcessBuilder(clangPath.toString())
                .redirectInput(programDir.resolve("in.txt").toFile())
                .redirectOutput(outputPath.toFile());
        Assertions.assertEquals(
                0,
                runBuilder.start().waitFor()
        );

        System.out.println(getFileContent(convertedPath));

        Assertions.assertEquals(
                getFileContent(programDir.resolve("out.txt")),
                getFileContent(outputPath)
        );
    }

    public static Stream<Arguments> getCorrectFiles() {
        return Stream.of(
                Arguments.of("empty"),
                Arguments.of("print/single"),
                Arguments.of("print/many"),
                Arguments.of("simpleExpr"),
                Arguments.of("varExpr"),
                Arguments.of("read/one"),
                Arguments.of("read/one2"),
                Arguments.of("read/two"),
                Arguments.of("cond/1"),
                Arguments.of("cond/2"),
                Arguments.of("cond/3"),
                Arguments.of("if/1"),
                Arguments.of("if/2"),
                Arguments.of("if/3"),
                Arguments.of("if/4"),
                Arguments.of("while/countDown"),
                Arguments.of("while/log2")
        );
    }

    @BeforeAll
    public static void createTestDirectory() throws IOException {
        if (Files.notExists(TEST_PATH)) {
            Files.createDirectory(TEST_PATH);
        }
    }

    @BeforeEach
    public void getTmpDirectory() throws IOException {
        outputDirectory = Files.createTempDirectory(TEST_PATH, null);
    }

    @AfterAll
    public static void deleteTestDirectory() throws IOException {
        Files.walkFileTree(TEST_PATH, DELETE_VISITOR);
    }

    @AfterEach
    public void deleteTmpFile() throws IOException {
        Files.walkFileTree(outputDirectory, DELETE_VISITOR);
    }

    private Path createTempFile(String suffix) throws IOException {
        return Files.createTempFile(
                outputDirectory,
                null,
                suffix,
                PosixFilePermissions.asFileAttribute(
                        Set.of(PosixFilePermission.values())
                )
        );
    }

    private Path createTempFile() throws IOException {
        return createTempFile(null);
    }

    private Path getProgramDirPath(String name) {
        return Path.of("src/test/resources/programs", name);
    }

    private static String getFileContent(Path path) throws IOException {
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            return bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
    }

    private static String getError(Process process) {
        return process.errorReader().lines().collect(Collectors.joining());
    }
}
