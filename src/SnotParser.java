// Generated from Snot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnotParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TYPE_DECLARATION=2, MODIFIER=3, EQUAL=4, NOT_EQUAL=5, LESSER=6, 
		GREATER=7, LESSER_OR_EQUAL=8, GREATER_OR_EQUAL=9, SUM=10, MINUS=11, MULTIPLICATION=12, 
		DIVISION=13, STRING_LITERAL=14, FLOAT_LITERAL=15, INT_LITERAL=16, BOOLEAN_LITERAL=17, 
		TRUE=18, FALSE=19, NOT=20, LOGICAL=21, AND=22, OR=23, IF=24, ELSE=25, 
		WHILE=26, FOR=27, IN=28, ID=29, ATTRIBUTION_SIGN=30, OPEN_CURLY=31, CLOSE_CURLY=32, 
		OPEN_PARENTHESIS=33, CLOSE_PARENTHESIS=34, OPEN_SQUARE_BRACKET=35, CLOSE_SQUARE_BRACKET=36, 
		COMMA=37, SEMICOLON=38, DOT=39, WS=40, COMMENT=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'class'", "TYPE_DECLARATION", "MODIFIER", "'=='", "'!='", 
		"'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "STRING_LITERAL", 
		"FLOAT_LITERAL", "INT_LITERAL", "BOOLEAN_LITERAL", "'true'", "'false'", 
		"'not'", "LOGICAL", "'and'", "'or'", "'if'", "'else'", "'while'", "'for'", 
		"'in'", "ID", "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", 
		"';'", "'.'", "WS", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_class_declaration = 2, RULE_var_declaration = 3, 
		RULE_type = 4, RULE_value = 5, RULE_function_declaration = 6, RULE_parameter_list = 7, 
		RULE_argument_list = 8, RULE_argument = 9, RULE_command = 10, RULE_call_method = 11, 
		RULE_call_procedure = 12, RULE_attribution = 13, RULE_selection = 14, 
		RULE_expression = 15, RULE_loop = 16;
	public static final String[] ruleNames = {
		"program", "declaration", "class_declaration", "var_declaration", "type", 
		"value", "function_declaration", "parameter_list", "argument_list", "argument", 
		"command", "call_method", "call_procedure", "attribution", "selection", 
		"expression", "loop"
	};

	@Override
	public String getGrammarFileName() { return "Snot.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SnotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); declaration();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << TYPE_DECLARATION) | (1L << MODIFIER) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); var_declaration();
				setState(40); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); function_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); class_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(1);
			setState(47); match(ID);
			setState(48); match(OPEN_CURLY);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(49); var_declaration();
					setState(50); match(SEMICOLON);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_DECLARATION || _la==ID) {
				{
				{
				setState(57); function_declaration();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(SnotParser.MODIFIER, 0); }
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(SnotParser.INT_LITERAL, 0); }
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(65); match(MODIFIER);
				}
			}

			setState(68); type();
			setState(69); match(ID);
			setState(73);
			_la = _input.LA(1);
			if (_la==OPEN_SQUARE_BRACKET) {
				{
				setState(70); match(OPEN_SQUARE_BRACKET);
				setState(71); match(INT_LITERAL);
				setState(72); match(CLOSE_SQUARE_BRACKET);
				}
			}

			setState(77);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION_SIGN) {
				{
				setState(75); match(ATTRIBUTION_SIGN);
				setState(76); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_DECLARATION() { return getToken(SnotParser.TYPE_DECLARATION, 0); }
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==TYPE_DECLARATION || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SnotParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SnotParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SnotParser.STRING_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SnotParser.INT_LITERAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INT_LITERAL) | (1L << BOOLEAN_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); type();
			setState(84); match(ID);
			setState(85); match(OPEN_PARENTHESIS);
			setState(87);
			_la = _input.LA(1);
			if (_la==TYPE_DECLARATION || _la==ID) {
				{
				setState(86); parameter_list();
				}
			}

			setState(89); match(CLOSE_PARENTHESIS);
			setState(90); match(OPEN_CURLY);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_DECLARATION) | (1L << MODIFIER) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(91); command();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SnotParser.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(SnotParser.ID, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); type();
			setState(100); match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101); match(COMMA);
				setState(102); type();
				setState(103); match(ID);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); argument();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111); match(COMMA);
				setState(112); argument();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argument);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(ID);
				}
				break;
			case STRING_LITERAL:
			case FLOAT_LITERAL:
			case INT_LITERAL:
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Call_procedureContext call_procedure() {
			return getRuleContext(Call_procedureContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public Call_methodContext call_method() {
			return getRuleContext(Call_methodContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); call_procedure();
				setState(123); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); selection();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); loop();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); call_method();
				setState(128); match(SEMICOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130); var_declaration();
				setState(131); match(SEMICOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133); attribution();
				setState(134); match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_methodContext extends ParserRuleContext {
		public Call_procedureContext call_procedure() {
			return getRuleContext(Call_procedureContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public Call_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterCall_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitCall_method(this);
		}
	}

	public final Call_methodContext call_method() throws RecognitionException {
		Call_methodContext _localctx = new Call_methodContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_call_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(ID);
			setState(139); match(DOT);
			setState(140); call_procedure();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_procedureContext extends ParserRuleContext {
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public Call_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterCall_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitCall_procedure(this);
		}
	}

	public final Call_procedureContext call_procedure() throws RecognitionException {
		Call_procedureContext _localctx = new Call_procedureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_call_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(ID);
			setState(143); match(OPEN_PARENTHESIS);
			setState(145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(144); argument_list();
				}
			}

			setState(147); match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributionContext extends ParserRuleContext {
		public Call_procedureContext call_procedure() {
			return getRuleContext(Call_procedureContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(SnotParser.INT_LITERAL, 0); }
		public Call_methodContext call_method() {
			return getRuleContext(Call_methodContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(ID);
			setState(153);
			_la = _input.LA(1);
			if (_la==OPEN_SQUARE_BRACKET) {
				{
				setState(150); match(OPEN_SQUARE_BRACKET);
				setState(151); match(INT_LITERAL);
				setState(152); match(CLOSE_SQUARE_BRACKET);
				}
			}

			setState(155); match(ATTRIBUTION_SIGN);
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(156); call_procedure();
				}
				break;

			case 2:
				{
				setState(157); call_method();
				}
				break;

			case 3:
				{
				setState(158); expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(IF);
			setState(162); match(OPEN_PARENTHESIS);
			setState(163); expression(0);
			setState(164); match(CLOSE_PARENTHESIS);
			setState(165); match(OPEN_CURLY);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_DECLARATION) | (1L << MODIFIER) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(166); command();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172); match(CLOSE_CURLY);
			setState(182);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(173); match(ELSE);
				setState(174); match(OPEN_CURLY);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_DECLARATION) | (1L << MODIFIER) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
					{
					{
					setState(175); command();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181); match(CLOSE_CURLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnotParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(185); match(NOT);
				setState(186); expression(8);
				}
				break;

			case 2:
				{
				setState(187); match(MINUS);
				setState(188); expression(7);
				}
				break;

			case 3:
				{
				}
				break;

			case 4:
				{
				setState(190); match(OPEN_PARENTHESIS);
				setState(191); expression(0);
				setState(192); match(CLOSE_PARENTHESIS);
				}
				break;

			case 5:
				{
				setState(194); match(ID);
				}
				break;

			case 6:
				{
				setState(195); value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(199);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(200); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(202);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LESSER) | (1L << GREATER) | (1L << LESSER_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(203); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(205);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICATION || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(206); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(208);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(209); expression(4);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(SnotParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(SnotParser.ID, i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnotListener ) ((SnotListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		int _la;
		try {
			setState(241);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(WHILE);
				setState(216); expression(0);
				setState(217); match(OPEN_CURLY);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_DECLARATION) | (1L << MODIFIER) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
					{
					{
					setState(218); command();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224); match(CLOSE_CURLY);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); match(FOR);
				setState(228);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(227); type();
					}
					break;
				}
				setState(230); match(ID);
				setState(231); match(IN);
				setState(232); match(ID);
				setState(233); match(OPEN_CURLY);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_DECLARATION) | (1L << MODIFIER) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
					{
					{
					setState(234); command();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240); match(CLOSE_CURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3+\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4"+
		"\3\5\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\5\5P\n\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\bZ\n\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n\7\n"+
		"t\n\n\f\n\16\nw\13\n\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\5\16\u0094\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u009c\n\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00a2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00aa"+
		"\n\20\f\20\16\20\u00ad\13\20\3\20\3\20\3\20\3\20\7\20\u00b3\n\20\f\20"+
		"\16\20\u00b6\13\20\3\20\5\20\u00b9\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d5\n\21\f\21\16\21\u00d8\13"+
		"\21\3\22\3\22\3\22\3\22\7\22\u00de\n\22\f\22\16\22\u00e1\13\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00e7\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ee\n\22"+
		"\f\22\16\22\u00f1\13\22\3\22\5\22\u00f4\n\22\3\22\2\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\b\4\2\4\4\37\37\3\2\20\23\3\2\30\31\3\2"+
		"\6\13\3\2\16\17\3\2\f\r\u010a\2%\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\bD\3"+
		"\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16U\3\2\2\2\20e\3\2\2\2\22p\3\2\2\2\24z\3"+
		"\2\2\2\26\u008a\3\2\2\2\30\u008c\3\2\2\2\32\u0090\3\2\2\2\34\u0097\3\2"+
		"\2\2\36\u00a3\3\2\2\2 \u00c6\3\2\2\2\"\u00f3\3\2\2\2$&\5\4\3\2%$\3\2\2"+
		"\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\5\b\5\2*+\7(\2\2+/\3"+
		"\2\2\2,/\5\16\b\2-/\5\6\4\2.)\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60"+
		"\61\7\3\2\2\61\62\7\37\2\2\628\7!\2\2\63\64\5\b\5\2\64\65\7(\2\2\65\67"+
		"\3\2\2\2\66\63\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3"+
		"\2\2\2;=\5\16\b\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>"+
		"\3\2\2\2AB\7\"\2\2B\7\3\2\2\2CE\7\5\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2"+
		"FG\5\n\6\2GK\7\37\2\2HI\7%\2\2IJ\7\22\2\2JL\7&\2\2KH\3\2\2\2KL\3\2\2\2"+
		"LO\3\2\2\2MN\7 \2\2NP\5 \21\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QR\t\2\2\2"+
		"R\13\3\2\2\2ST\t\3\2\2T\r\3\2\2\2UV\5\n\6\2VW\7\37\2\2WY\7#\2\2XZ\5\20"+
		"\t\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7$\2\2\\`\7!\2\2]_\5\26\f\2^]\3"+
		"\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\"\2\2d\17"+
		"\3\2\2\2ef\5\n\6\2fm\7\37\2\2gh\7\'\2\2hi\5\n\6\2ij\7\37\2\2jl\3\2\2\2"+
		"kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2om\3\2\2\2pu\5\24"+
		"\13\2qr\7\'\2\2rt\5\24\13\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\23"+
		"\3\2\2\2wu\3\2\2\2x{\7\37\2\2y{\5\f\7\2zx\3\2\2\2zy\3\2\2\2{\25\3\2\2"+
		"\2|}\5\32\16\2}~\7(\2\2~\u008b\3\2\2\2\177\u008b\5\36\20\2\u0080\u008b"+
		"\5\"\22\2\u0081\u0082\5\30\r\2\u0082\u0083\7(\2\2\u0083\u008b\3\2\2\2"+
		"\u0084\u0085\5\b\5\2\u0085\u0086\7(\2\2\u0086\u008b\3\2\2\2\u0087\u0088"+
		"\5\34\17\2\u0088\u0089\7(\2\2\u0089\u008b\3\2\2\2\u008a|\3\2\2\2\u008a"+
		"\177\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0084\3\2\2"+
		"\2\u008a\u0087\3\2\2\2\u008b\27\3\2\2\2\u008c\u008d\7\37\2\2\u008d\u008e"+
		"\7)\2\2\u008e\u008f\5\32\16\2\u008f\31\3\2\2\2\u0090\u0091\7\37\2\2\u0091"+
		"\u0093\7#\2\2\u0092\u0094\5\22\n\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7$\2\2\u0096\33\3\2\2\2\u0097\u009b"+
		"\7\37\2\2\u0098\u0099\7%\2\2\u0099\u009a\7\22\2\2\u009a\u009c\7&\2\2\u009b"+
		"\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a1\7 "+
		"\2\2\u009e\u00a2\5\32\16\2\u009f\u00a2\5\30\r\2\u00a0\u00a2\5 \21\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\35\3\2\2"+
		"\2\u00a3\u00a4\7\32\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\5 \21\2\u00a6\u00a7"+
		"\7$\2\2\u00a7\u00ab\7!\2\2\u00a8\u00aa\5\26\f\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b8\7\"\2\2\u00af\u00b0\7\33\2\2\u00b0"+
		"\u00b4\7!\2\2\u00b1\u00b3\5\26\f\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b9\7\"\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\b\21\1\2\u00bb\u00bc\7\26\2\2\u00bc"+
		"\u00c7\5 \21\2\u00bd\u00be\7\r\2\2\u00be\u00c7\5 \21\2\u00bf\u00c7\3\2"+
		"\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\5 \21\2\u00c2\u00c3\7$\2\2\u00c3\u00c7"+
		"\3\2\2\2\u00c4\u00c7\7\37\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00ba\3\2\2\2"+
		"\u00c6\u00bd\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00d6\3\2\2\2\u00c8\u00c9\6\21\2\3"+
		"\u00c9\u00ca\t\4\2\2\u00ca\u00d5\5 \21\2\u00cb\u00cc\6\21\3\3\u00cc\u00cd"+
		"\t\5\2\2\u00cd\u00d5\5 \21\2\u00ce\u00cf\6\21\4\3\u00cf\u00d0\t\6\2\2"+
		"\u00d0\u00d5\5 \21\2\u00d1\u00d2\6\21\5\3\u00d2\u00d3\t\7\2\2\u00d3\u00d5"+
		"\5 \21\2\u00d4\u00c8\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7!\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\34\2\2\u00da\u00db"+
		"\5 \21\2\u00db\u00df\7!\2\2\u00dc\u00de\5\26\f\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00f4\3\2\2\2\u00e4"+
		"\u00e6\7\35\2\2\u00e5\u00e7\5\n\6\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea\7\36\2\2\u00ea"+
		"\u00eb\7\37\2\2\u00eb\u00ef\7!\2\2\u00ec\u00ee\5\26\f\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\7\"\2\2\u00f3\u00d9\3\2"+
		"\2\2\u00f3\u00e4\3\2\2\2\u00f4#\3\2\2\2\34\'.8>DKOY`muz\u008a\u0093\u009b"+
		"\u00a1\u00ab\u00b4\u00b8\u00c6\u00d4\u00d6\u00df\u00e6\u00ef\u00f3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}