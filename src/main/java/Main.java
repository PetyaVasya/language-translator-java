import language.MegaLanguageLexer;
import language.MegaLanguageParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("out.c")) {
            MegaLanguageLexer megaLanguageLexer = new MegaLanguageLexer(
                    CharStreams.fromPath(Path.of("src/main/resources/in.2c"))
            );
            TokenStream tokenStream = new CommonTokenStream(megaLanguageLexer);
            MegaLanguageParser parser = new MegaLanguageParser(tokenStream);
            ParseTree tree = parser.program();
            CVisitor visitor = new CVisitor();
            fileWriter.write(visitor.visit(tree).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
