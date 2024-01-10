import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tests {

    @ParameterizedTest
    @MethodSource("getCorrectFiles")
    public void correctLambda(final String displayName) {

        compareTrees(res, syntaxAnalyzer.parse(displayName));
    }

    public static Stream<Arguments> getCorrectFiles() {
        return Stream.of(
                Arguments.of("simple")
        );
    }
}
