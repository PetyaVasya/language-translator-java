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
        try (FileWriter fileWriter = new FileWriter(args[0])) {
            MegaLanguageLexer megaLanguageLexer = new MegaLanguageLexer(
                    CharStreams.fromPath(Path.of(args[1]))
            );
            TokenStream tokenStream = new CommonTokenStream(megaLanguageLexer);
            MegaLanguageParser parser = new MegaLanguageParser(tokenStream);
            parser.addErrorListener(new ThrowingErrorListener());
            ParseTree tree = parser.program();
            CVisitor visitor = new CVisitor();
            fileWriter.write(visitor.visit(tree).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
