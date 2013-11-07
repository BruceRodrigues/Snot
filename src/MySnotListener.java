// Generated from Snot.g4 by ANTLR 4.0

import java.util.ArrayList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class MySnotListener extends SnotBaseListener {
	public ArrayList<String> types_list = new ArrayList<String>();

	@Override public void enterExpression(SnotParser.ExpressionContext ctx) { }
	@Override public void exitExpression(SnotParser.ExpressionContext ctx) { }

	@Override public void enterArgument_list(SnotParser.Argument_listContext ctx) { }
	@Override public void exitArgument_list(SnotParser.Argument_listContext ctx) { }

	@Override public void enterArgument(SnotParser.ArgumentContext ctx) { }
	@Override public void exitArgument(SnotParser.ArgumentContext ctx) { }

	@Override public void enterFunction_declaration(SnotParser.Function_declarationContext ctx) {
		if(ctx.type().ID() != null && !types_list.contains(ctx.type().ID().toString())) {
			System.out.println("Erro-> Tipo de retorno nao conhecido: " + ctx.type().ID());	
		} 
	}
	@Override public void exitFunction_declaration(SnotParser.Function_declarationContext ctx) { }

	@Override public void enterDeclaration(SnotParser.DeclarationContext ctx) { }
	@Override public void exitDeclaration(SnotParser.DeclarationContext ctx) { }

	@Override public void enterClass_declaration(SnotParser.Class_declarationContext ctx) { }
	@Override public void exitClass_declaration(SnotParser.Class_declarationContext ctx) { 
		//Adicionando ID da classe na lista de tipos possiveis
		if(types_list.contains(ctx.ID().toString()))
			System.out.println("Erro-> Classe ja definida: " + ctx.ID());		else
			types_list.add(ctx.ID().toString()); 

	}

	@Override public void enterCall_procedure(SnotParser.Call_procedureContext ctx) { }
	@Override public void exitCall_procedure(SnotParser.Call_procedureContext ctx) { }

	@Override public void enterType(SnotParser.TypeContext ctx) { }
	@Override public void exitType(SnotParser.TypeContext ctx) { }

	@Override public void enterSelection(SnotParser.SelectionContext ctx) { }
	@Override public void exitSelection(SnotParser.SelectionContext ctx) { }

	@Override public void enterCall_method(SnotParser.Call_methodContext ctx) { }
	@Override public void exitCall_method(SnotParser.Call_methodContext ctx) { }

	@Override public void enterProgram(SnotParser.ProgramContext ctx) { }
	@Override public void exitProgram(SnotParser.ProgramContext ctx) { }

	@Override public void enterLoop(SnotParser.LoopContext ctx) { }
	@Override public void exitLoop(SnotParser.LoopContext ctx) { }

	@Override public void enterValue(SnotParser.ValueContext ctx) { }
	@Override public void exitValue(SnotParser.ValueContext ctx) { }

	@Override public void enterCommand(SnotParser.CommandContext ctx) { }
	@Override public void exitCommand(SnotParser.CommandContext ctx) { }

	@Override public void enterAttribution(SnotParser.AttributionContext ctx) { }
	@Override public void exitAttribution(SnotParser.AttributionContext ctx) { }

	@Override public void enterVar_declaration(SnotParser.Var_declarationContext ctx) { }
	@Override public void exitVar_declaration(SnotParser.Var_declarationContext ctx) { }

	@Override public void enterParameter_list(SnotParser.Parameter_listContext ctx) { }
	@Override public void exitParameter_list(SnotParser.Parameter_listContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}
