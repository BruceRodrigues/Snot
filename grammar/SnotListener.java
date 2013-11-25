// Generated from ../grammar/Snot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SnotParser}.
 */
public interface SnotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SnotParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull SnotParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull SnotParser.Argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(@NotNull SnotParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(@NotNull SnotParser.ValueExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(@NotNull SnotParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(@NotNull SnotParser.CompareExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SnotParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SnotParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#andOrOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndOrOrExpression(@NotNull SnotParser.AndOrOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#andOrOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndOrOrExpression(@NotNull SnotParser.AndOrOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(@NotNull SnotParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(@NotNull SnotParser.AddOrSubExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull SnotParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull SnotParser.LoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull SnotParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull SnotParser.CommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull SnotParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull SnotParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(@NotNull SnotParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(@NotNull SnotParser.Var_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull SnotParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull SnotParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull SnotParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull SnotParser.Function_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(@NotNull SnotParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(@NotNull SnotParser.Class_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull SnotParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull SnotParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#minusExpression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull SnotParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#minusExpression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull SnotParser.MinusExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull SnotParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull SnotParser.NotExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#call_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCall_procedure(@NotNull SnotParser.Call_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#call_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCall_procedure(@NotNull SnotParser.Call_procedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(@NotNull SnotParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(@NotNull SnotParser.SelectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#call_method}.
	 * @param ctx the parse tree
	 */
	void enterCall_method(@NotNull SnotParser.Call_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#call_method}.
	 * @param ctx the parse tree
	 */
	void exitCall_method(@NotNull SnotParser.Call_methodContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#multDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpression(@NotNull SnotParser.MultDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#multDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpression(@NotNull SnotParser.MultDivExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SnotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SnotParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(@NotNull SnotParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(@NotNull SnotParser.IdExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#parenExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(@NotNull SnotParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#parenExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(@NotNull SnotParser.ParenExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(@NotNull SnotParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(@NotNull SnotParser.AttributionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SnotParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull SnotParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull SnotParser.Parameter_listContext ctx);
}