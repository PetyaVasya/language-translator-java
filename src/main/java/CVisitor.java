import language.ExpressionType;
import language.MegaLanguageBaseVisitor;
import language.MegaLanguageLexer;
import language.MegaLanguageParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CVisitor extends MegaLanguageBaseVisitor<StringBuilder> {

    private static final Set<Integer> SKIPPED_TERMINAL = Set.of(
            MegaLanguageLexer.LINE_END
    );
    private static final String COMMAND_END = ";";
    private static final StringBuilder EMPTY_SB = new StringBuilder();

    private int nestedCount;
    private final Set<String> declaredVariables;
    private final Map<String, String> variableRename;
    private int tmpCount;


    public CVisitor() {
        this.nestedCount = 0;
        this.declaredVariables = new HashSet<>();
        this.variableRename = new HashMap<>();
        this.tmpCount = 0;
    }

    @Override
    public StringBuilder visitErrorNode(ErrorNode node) {
        System.out.println(123);
        return super.visitErrorNode(node);
    }

    @Override
    public StringBuilder visitProgram(MegaLanguageParser.ProgramContext ctx) {
        return footer(header(stringBuilder()).append(super.visitProgram(ctx)));
    }

    @Override
    public StringBuilder visitBaseCommand(MegaLanguageParser.BaseCommandContext ctx) {
        return visitCommand(super.visitBaseCommand(ctx)).append(COMMAND_END);
    }

    @Override
    public StringBuilder visitStatement(MegaLanguageParser.StatementContext ctx) {
        return visitCommand(super.visitStatement(ctx));
    }

    @Override
    public StringBuilder visitCommandBlock(MegaLanguageParser.CommandBlockContext ctx) {
        nestedCount += 1;
        StringBuilder res = stringBuilder()
                .append("{")
                .append(visit(ctx.commands()));
        nestedCount -= 1;
        return res.append(fromNewLine("}"));
    }

    @Override
    public StringBuilder visitCommands(MegaLanguageParser.CommandsContext ctx) {
        if (ctx.command().isEmpty()) {
            return EMPTY_SB;
        }
        return super.visitCommands(ctx);
    }

    private StringBuilder statementVariables(String statementStart, MegaLanguageParser.CommandBlockContext... ctxs) {
        StringBuilder res = new StringBuilder();

        Arrays.stream(ctxs)
                .map(v -> v.variables)
                .map(Map::entrySet)
                .flatMap(Collection::stream)
                .map(v -> visitVarDeclaration(v.getKey(), v.getValue(), EMPTY_SB))
                .map(this::fromNewLine)
                .forEach(res::append);
        if (res.isEmpty()) {
            res.append(statementStart);
        } else {
            res.append(fromNewLine(statementStart));
        }
        return res;
    }

    @Override
    public StringBuilder visitCondition(MegaLanguageParser.ConditionContext ctx) {

        StringBuilder res = statementVariables(
                "if (",
                ctx.commandBlock().toArray(MegaLanguageParser.CommandBlockContext[]::new)
        )
                .append(visit(ctx.typeExpression()))
                .append(") ")
                .append(visit(ctx.commandBlock(0)));
        if (ctx.else_ != null) {
            res.append(" else ").append(visit(ctx.commandBlock(ctx.commandBlock().size() - 1)));
        }
        return res;
    }

    @Override
    public StringBuilder visitWhile(MegaLanguageParser.WhileContext ctx) {
        MegaLanguageParser.CommandBlockContext commandBlockContext = ctx.commandBlock();
        return statementVariables("while (", commandBlockContext)
                .append(visit(ctx.typeExpression()))
                .append(") ")
                .append(visit(commandBlockContext));
    }

    @Override
    public StringBuilder visitReadInt(MegaLanguageParser.ReadIntContext ctx) {
        return stringBuilder("scanf(\"%d\", &").append(ctx.name).append(")");
    }

    @Override
    public StringBuilder visitReadBoolean(MegaLanguageParser.ReadBooleanContext ctx) {
        String tmpVarName = genTmpVar();
        return visitVarDeclaration(tmpVarName, ExpressionType.INT, EMPTY_SB)
                .append(fromNewLine("scanf(\"%d\", &"))
                .append(tmpVarName).append(")")
                .append(fromNewLine(visitVarDeclaration(ctx.name, ExpressionType.BOOLEAN, stringBuilder(tmpVarName))));
    }

    @Override
    public StringBuilder visitPrint(MegaLanguageParser.PrintContext ctx) {
        return stringBuilder("printf(\"%d\", ").append(super.visitPrint(ctx)).append(")");
    }

    @Override
    public StringBuilder visitVarEvaluated(MegaLanguageParser.VarEvaluatedContext ctx) {
        return visitVarDeclaration(ctx.VARIABLE(), ctx.type, visit(ctx.typeExpression()));
    }

    @Override
    public StringBuilder visitVarRead(MegaLanguageParser.VarReadContext ctx) {
        return visitVarDeclaration(ctx.VARIABLE(), ctx.type, stringBuilder())
                .append(fromNewLine(visit(ctx.read())));
    }

    private StringBuilder visitVarDeclaration(String variableName, ExpressionType type, StringBuilder content) {
        StringBuilder res = new StringBuilder();
        if (declaredVariables.contains(variableName)) {
            if (content.isEmpty()) {
                return content;
            }
        } else {
            declaredVariables.add(variableName);
            res.append(type.cName).append(" ");
            if (content.isEmpty()) {
                return res.append(variableName).append(COMMAND_END);
            }
        }

        return res.append(variableName).append(" = ").append(content);
    }

    private StringBuilder visitVarDeclaration(TerminalNode variable, ExpressionType type, StringBuilder content) {
        return visitVarDeclaration(variable.getText(), type, content);
    }

    @Override
    public StringBuilder visitComp_op(MegaLanguageParser.Comp_opContext ctx) {
        return stringBuilder(ctx.getText());
    }

    @Override
    public StringBuilder visitTerminal(TerminalNode node) {
        if (!skipTerminal(node) && checkVocabulary(node) != null) {
            return stringBuilder(node.getSymbol().getText());
        } else {
            return null;
        }
    }

    @Override
    protected StringBuilder aggregateResult(StringBuilder aggregate, StringBuilder nextResult) {
        StringBuilder res = aggregate != null ? aggregate : stringBuilder();
        if (nextResult != null) {
            res.append(nextResult);
        }
        return res;
    }

    private String genTmpVar() {

        String tmpVarName = "tmp" + ++tmpCount;
        while (declaredVariables.contains(tmpVarName)) {
            tmpVarName = "tmp" + ++tmpCount;
        }
        return tmpVarName;
    }

    private boolean skipTerminal(TerminalNode node) {
        return SKIPPED_TERMINAL.contains(node.getSymbol().getType());
    }

    private StringBuilder visitCommand(StringBuilder commandSB) {
        return stringBuilder(true).append(fromNewLine(commandSB));
    }

    private StringBuilder header(StringBuilder stringBuilder) {
        StringBuilder res = stringBuilder
                .append("#include <stdio.h>")
                .append(fromNewLine("int main() {"));
        nestedCount += 1;
        return res;
    }

    private StringBuilder footer(StringBuilder stringBuilder) {
        nestedCount -= 1;
        return stringBuilder.append(fromNewLine("}"));
    }

    private String getPadding() {
        return " ".repeat(4 * nestedCount);
    }

    private StringBuilder stringBuilder(boolean newLine) {
        return new StringBuilder(newLine ? getPadding() : "");
    }

    private StringBuilder stringBuilder() {
        return stringBuilder(false);
    }

    private StringBuilder stringBuilder(String text) {
        return new StringBuilder(text);
    }

    private StringBuilder fromNewLine(String text) {
        StringBuilder res = stringBuilder();
        if (text != null && !text.isBlank()) {
            res.append(System.lineSeparator()).append(getPadding()).append(text);
        }
        return res;
    }

    private StringBuilder fromNewLine(StringBuilder sb) {
        StringBuilder res = stringBuilder();
        if (sb != null && !sb.isEmpty()) {
            res.append(System.lineSeparator()).append(getPadding()).append(sb);
        }
        return res;
    }

    private StringBuilder fromNewLine() {
        return fromNewLine("");
    }

//    @Override
//    public StringBuilder visitChildren(RuleNode node) {
//        return stringBuilder().append(super.visitChildren(node));
//    }

    private static String checkVocabulary(TerminalNode node) {
        return MegaLanguageLexer.VOCABULARY.getSymbolicName(node.getSymbol().getType());
    }
}
