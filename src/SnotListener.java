// Generated from Snot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SnotParser}.
 */
public interface SnotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SnotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SnotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SnotParser.ExpressionContext ctx);

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