package language;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

import java.util.List;

public class AmbiguousVariableException extends RecognitionException {
    public AmbiguousVariableException(List<String> variableNames, Parser recognizer) {
        super(
                "Variables \"" + variableNames + "\" has different types in \"if\" branches",
                recognizer,
                recognizer.getInputStream(),
                recognizer.getRuleContext()
        );
        this.setOffendingToken(recognizer.getCurrentToken());
    }
}
