package language;

import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class UnknownVariableException extends RecognitionException {
    public UnknownVariableException(String variableName, Parser recognizer) {
        super(
                "Variable \"" + variableName + "\" is not declared",
                recognizer,
                recognizer.getInputStream(),
                recognizer.getRuleContext()
        );
        this.setOffendingToken(recognizer.getCurrentToken());
    }
}
