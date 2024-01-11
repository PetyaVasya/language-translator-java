// Generated from /Users/mac/IdeaProjects/language-translator-java/src/main/resources/MegaLanguage.g4 by ANTLR 4.13.1

package language;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MegaLanguageParser}.
 */
public interface MegaLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MegaLanguageParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MegaLanguageParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MegaLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MegaLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseCommand}
	 * labeled alternative in {@link MegaLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterBaseCommand(MegaLanguageParser.BaseCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseCommand}
	 * labeled alternative in {@link MegaLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitBaseCommand(MegaLanguageParser.BaseCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement}
	 * labeled alternative in {@link MegaLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MegaLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link MegaLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MegaLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(MegaLanguageParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(MegaLanguageParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varEvaluated}
	 * labeled alternative in {@link MegaLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarEvaluated(MegaLanguageParser.VarEvaluatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varEvaluated}
	 * labeled alternative in {@link MegaLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarEvaluated(MegaLanguageParser.VarEvaluatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varRead}
	 * labeled alternative in {@link MegaLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarRead(MegaLanguageParser.VarReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varRead}
	 * labeled alternative in {@link MegaLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarRead(MegaLanguageParser.VarReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MegaLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MegaLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link MegaLanguageParser#read}.
	 * @param ctx the parse tree
	 */
	void enterReadInt(MegaLanguageParser.ReadIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link MegaLanguageParser#read}.
	 * @param ctx the parse tree
	 */
	void exitReadInt(MegaLanguageParser.ReadIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MegaLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MegaLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MegaLanguageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MegaLanguageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void enterCommandBlock(MegaLanguageParser.CommandBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void exitCommandBlock(MegaLanguageParser.CommandBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MegaLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MegaLanguageParser.ExpressionContext ctx);
}