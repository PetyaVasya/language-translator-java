// Generated from /Users/mac/IdeaProjects/language-translator-java/src/main/resources/MegaLanguage.g4 by ANTLR 4.13.1

package language;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MegaLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MegaLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(MegaLanguageParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MegaLanguageParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MegaLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseCommand}
	 * labeled alternative in {@link MegaLanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseCommand(MegaLanguageParser.BaseCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link MegaLanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MegaLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(MegaLanguageParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varEvaluated}
	 * labeled alternative in {@link MegaLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEvaluated(MegaLanguageParser.VarEvaluatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varRead}
	 * labeled alternative in {@link MegaLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRead(MegaLanguageParser.VarReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MegaLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link MegaLanguageParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInt(MegaLanguageParser.ReadIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readBoolean}
	 * labeled alternative in {@link MegaLanguageParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadBoolean(MegaLanguageParser.ReadBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MegaLanguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(MegaLanguageParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#commandBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandBlock(MegaLanguageParser.CommandBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(MegaLanguageParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MegaLanguageParser.ExpressionContext ctx);
}