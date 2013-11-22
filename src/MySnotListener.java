import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MySnotListener extends SnotBaseListener {
	SymbolTable sym = new SymbolTable();
		
	@Override
	public void enterIdExpression(SnotParser.IdExpressionContext ctx) {
		if(!sym.contains(ctx.ID().getText())){
			printError(ctx, "Variavel nao declarada: " + ctx.ID().getText());
	    }
	}

	@Override public void enterFunction_declaration(SnotParser.Function_declarationContext ctx) {
		//Verificar tipo de retorno
		if(ctx.type().ID() != null && !sym.containsType(ctx.type().ID().toString())) {
			System.err.println("Erro-> Tipo de retorno nao conhecido: " + ctx.type().ID());	
		}
		
		//Verificar se nome ta funcao ja eh usado em algum lugar
		if(sym.containsFunction(ctx.ID().getText()))
			System.err.println("Erro-> Id de funcao ja declarado: " + ctx.ID().getText());

		//Verificar tipo dos parametros
		if(ctx.parameter_list() != null) {
			List<SnotParser.TypeContext> t = ctx.parameter_list().type();
			List<TerminalNode> id = ctx.parameter_list().ID();
			for(int i = 0; i < t.size(); i++) {
				if(t.get(i).ID() != null && !sym.containsType(t.get(i).getText()))
					System.err.println("Erro-> Tipo nao reconhecido: " + t.get(i).getText());
			}	
		}	
		//Adiciona a funcao na lista de IDs, assim ela pode ser chamada
		sym.addFunction(ctx.ID().toString());
	}

	@Override public void enterClass_declaration(SnotParser.Class_declarationContext ctx) { 
		//Adicionando ID da classe na lista de tipos possiveis
		if(sym.containsClass(ctx.ID().toString()))
			System.out.println("Erro-> Classe ja definida: " + ctx.ID());		
		else
			sym.addClass(ctx.ID().toString()); 

	}

	@Override public void enterCall_procedure(SnotParser.Call_procedureContext ctx) { 
		//Verifica se o id do procedimento existe
		if(!sym.containsFunction(ctx.ID().getText()))
			System.err.println("Erro-> Funcao nao existente: " + ctx.ID().getText());

		//Verifica se o parametros passados existem, caso sejam ids.
		if(ctx.argument_list() != null) {
			List<SnotParser.ArgumentContext> list = ctx.argument_list().argument();
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).ID() != null && !sym.contains(list.get(i).getText()))
					System.err.println("Erro-> argumento nao declarado: " + list.get(i).getText());
			}	
		}
	}

	@Override public void enterAttribution(SnotParser.AttributionContext ctx) { 
		//Verificar se nome da var nao eh existente
		if(!sym.contains(ctx.ID().getText()))
			System.err.println("Erro:"+ctx.getStart().getLine()+":-> Variavel inexistente: " + ctx.ID().getText());

		//Verificar tipos de retorno
		if(ctx.call_procedure() != null) {
			System.err.println("procedure");
		} else if(ctx.call_method() != null) {
			System.err.println("method");
		} else if(ctx.expression() != null) {
			System.err.println("expression");
		} 
	}

	@Override public void enterVar_declaration(SnotParser.Var_declarationContext ctx) { 
		//Verificar tipo da variavel
		if(ctx.type().ID() != null && !sym.containsType(ctx.type().ID().toString())) {
			System.err.println("Erro-> Tipo nao conhecido: " + ctx.type().ID());	
		}
		
		//Verificar se nome da var ja eh usado em algum lugar
		if(sym.contains(ctx.ID().getText()))
			System.err.println("Erro-> Id ja declarado: " + ctx.ID().getText());

		//Adiciona a funcao na lista de IDs, assim ela pode ser chamada
		printDebug("Declarando variavel " + ctx.ID().getText());
		sym.addFunction(ctx.ID().toString());
	}

	private void printError(ParserRuleContext ctx, String erro) {
		System.err.println("Erro:"+ctx.getStart().getLine()+":-> "+ erro);
	}
	
	private void printDebug(String s) {
		System.err.println("DEBUG: " + s);
	}

	private boolean isPreDefinedType(String typeName) {

		if(typeName.equals("float") || typeName.equals("int") || typeName.equals("byte") || typeName.equals("string") ||
			typeName.equals("boolean") ) {
			return true;
		}
		return false;
	}
}
