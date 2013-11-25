// Generated from ../grammar/Snot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnotLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'class'", "TYPE_DECLARATION", "MODIFIER", "'=='", "'!='", "'<'", "'>'", 
		"'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "STRING_LITERAL", "FLOAT_LITERAL", 
		"INT_LITERAL", "BOOLEAN_LITERAL", "'true'", "'false'", "'not'", "LOGICAL", 
		"'and'", "'or'", "'if'", "'else'", "'while'", "'for'", "'in'", "ID", "'='", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "','", "';'", "'.'", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__0", "TYPE_DECLARATION", "MODIFIER", "EQUAL", "NOT_EQUAL", "LESSER", 
		"GREATER", "LESSER_OR_EQUAL", "GREATER_OR_EQUAL", "SUM", "MINUS", "MULTIPLICATION", 
		"DIVISION", "STRING_LITERAL", "FLOAT_LITERAL", "INT_LITERAL", "BOOLEAN_LITERAL", 
		"TRUE", "FALSE", "CLASS", "NOT", "LOGICAL", "AND", "OR", "IF", "ELSE", 
		"WHILE", "FOR", "IN", "ID", "ATTRIBUTION_SIGN", "OPEN_CURLY", "CLOSE_CURLY", 
		"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
		"COMMA", "SEMICOLON", "DOT", "LETTER", "DIGIT", "BINARY", "WS", "COMMENT"
	};


	public SnotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Snot.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 43: WS_action((RuleContext)_localctx, actionIndex); break;

		case 44: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u0149\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0086\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0099\n\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17\u00b5\n\17\f\17\16\17\u00b8\13\17"+
		"\3\17\3\17\3\20\6\20\u00bd\n\20\r\20\16\20\u00be\3\20\3\20\7\20\u00c3"+
		"\n\20\f\20\16\20\u00c6\13\20\3\21\6\21\u00c9\n\21\r\21\16\21\u00ca\3\21"+
		"\5\21\u00ce\n\21\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00ee\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u010f\n\37\f\37\16\37\u0112\13\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u012b\n+\r+\16+\u012c\3,\3,"+
		"\6,\u0131\n,\r,\16,\u0132\3-\6-\u0136\n-\r-\16-\u0137\3-\3-\3.\3.\3.\3"+
		".\7.\u0140\n.\f.\16.\u0143\13.\3.\3.\3.\3.\3.\3\u0141/\3\3\1\5\4\1\7\5"+
		"\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\2\1+\26\1-\27\1/\30\1\61"+
		"\31\1\63\32\1\65\33\1\67\34\19\35\1;\36\1=\37\1? \1A!\1C\"\1E#\1G$\1I"+
		"%\1K&\1M\'\1O(\1Q)\1S\2\1U\2\1W\2\1Y*\2[+\3\3\2\5\4\2$$^^\6\2&&C\\aac"+
		"|\5\2\13\f\17\17\"\"\u0159\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5\u0085\3\2\2\2\7\u0098\3\2\2\2\t"+
		"\u009a\3\2\2\2\13\u009d\3\2\2\2\r\u00a0\3\2\2\2\17\u00a2\3\2\2\2\21\u00a4"+
		"\3\2\2\2\23\u00a7\3\2\2\2\25\u00aa\3\2\2\2\27\u00ac\3\2\2\2\31\u00ae\3"+
		"\2\2\2\33\u00b0\3\2\2\2\35\u00b2\3\2\2\2\37\u00bc\3\2\2\2!\u00cd\3\2\2"+
		"\2#\u00d1\3\2\2\2%\u00d3\3\2\2\2\'\u00d8\3\2\2\2)\u00de\3\2\2\2+\u00e4"+
		"\3\2\2\2-\u00ed\3\2\2\2/\u00ef\3\2\2\2\61\u00f3\3\2\2\2\63\u00f6\3\2\2"+
		"\2\65\u00f9\3\2\2\2\67\u00fe\3\2\2\29\u0104\3\2\2\2;\u0108\3\2\2\2=\u010b"+
		"\3\2\2\2?\u0113\3\2\2\2A\u0115\3\2\2\2C\u0117\3\2\2\2E\u0119\3\2\2\2G"+
		"\u011b\3\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2"+
		"\2\2Q\u0125\3\2\2\2S\u0127\3\2\2\2U\u012a\3\2\2\2W\u0130\3\2\2\2Y\u0135"+
		"\3\2\2\2[\u013b\3\2\2\2]^\7e\2\2^_\7n\2\2_`\7c\2\2`a\7u\2\2ab\7u\2\2b"+
		"\4\3\2\2\2cd\7h\2\2de\7n\2\2ef\7q\2\2fg\7c\2\2g\u0086\7v\2\2hi\7k\2\2"+
		"ij\7p\2\2j\u0086\7v\2\2kl\7d\2\2lm\7{\2\2mn\7v\2\2n\u0086\7g\2\2op\7u"+
		"\2\2pq\7v\2\2qr\7t\2\2rs\7k\2\2st\7p\2\2t\u0086\7i\2\2uv\7d\2\2vw\7q\2"+
		"\2wx\7q\2\2xy\7n\2\2yz\7g\2\2z{\7c\2\2{\u0086\7p\2\2|}\7x\2\2}~\7q\2\2"+
		"~\177\7k\2\2\177\u0086\7f\2\2\u0080\u0081\7e\2\2\u0081\u0082\7n\2\2\u0082"+
		"\u0083\7c\2\2\u0083\u0084\7u\2\2\u0084\u0086\7u\2\2\u0085c\3\2\2\2\u0085"+
		"h\3\2\2\2\u0085k\3\2\2\2\u0085o\3\2\2\2\u0085u\3\2\2\2\u0085|\3\2\2\2"+
		"\u0085\u0080\3\2\2\2\u0086\6\3\2\2\2\u0087\u0088\7i\2\2\u0088\u0089\7"+
		"n\2\2\u0089\u008a\7q\2\2\u008a\u008b\7d\2\2\u008b\u008c\7c\2\2\u008c\u0099"+
		"\7n\2\2\u008d\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0099\7v\2\2\u0092\u0093\7u\2\2\u0093\u0094\7v\2\2"+
		"\u0094\u0095\7c\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2\u0097\u0099"+
		"\7e\2\2\u0098\u0087\3\2\2\2\u0098\u008d\3\2\2\2\u0098\u0092\3\2\2\2\u0099"+
		"\b\3\2\2\2\u009a\u009b\7?\2\2\u009b\u009c\7?\2\2\u009c\n\3\2\2\2\u009d"+
		"\u009e\7#\2\2\u009e\u009f\7?\2\2\u009f\f\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1"+
		"\16\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\20\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\7?\2\2\u00a9"+
		"\24\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad"+
		"\30\3\2\2\2\u00ae\u00af\7,\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1"+
		"\34\3\2\2\2\u00b2\u00b6\7$\2\2\u00b3\u00b5\n\2\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba\36\3\2\2\2\u00bb"+
		"\u00bd\5U+\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\7\60\2\2\u00c1"+
		"\u00c3\5U+\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5 \3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9"+
		"\5U+\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ce\5W,\2\u00cd\u00c8\3\2\2"+
		"\2\u00cd\u00cc\3\2\2\2\u00ce\"\3\2\2\2\u00cf\u00d2\5%\23\2\u00d0\u00d2"+
		"\5\'\24\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7&\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2"+
		"\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd(\3\2\2\2\u00de\u00df\7"+
		"e\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3"+
		"\7u\2\2\u00e3*\3\2\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea\u00ee"+
		"\7f\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ee\7t\2\2\u00ed\u00e8\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1"+
		"\u00f2\7f\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7t\2\2\u00f5"+
		"\62\3\2\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7h\2\2\u00f8\64\3\2\2\2\u00f9"+
		"\u00fa\7g\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7g\2\2"+
		"\u00fd\66\3\2\2\2\u00fe\u00ff\7y\2\2\u00ff\u0100\7j\2\2\u0100\u0101\7"+
		"k\2\2\u0101\u0102\7n\2\2\u0102\u0103\7g\2\2\u01038\3\2\2\2\u0104\u0105"+
		"\7h\2\2\u0105\u0106\7q\2\2\u0106\u0107\7t\2\2\u0107:\3\2\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7p\2\2\u010a<\3\2\2\2\u010b\u0110\5S*\2\u010c\u010f"+
		"\5S*\2\u010d\u010f\4\62;\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111>\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0113\u0114\7?\2\2\u0114@\3\2\2\2\u0115\u0116\7}"+
		"\2\2\u0116B\3\2\2\2\u0117\u0118\7\177\2\2\u0118D\3\2\2\2\u0119\u011a\7"+
		"*\2\2\u011aF\3\2\2\2\u011b\u011c\7+\2\2\u011cH\3\2\2\2\u011d\u011e\7]"+
		"\2\2\u011eJ\3\2\2\2\u011f\u0120\7_\2\2\u0120L\3\2\2\2\u0121\u0122\7.\2"+
		"\2\u0122N\3\2\2\2\u0123\u0124\7=\2\2\u0124P\3\2\2\2\u0125\u0126\7\60\2"+
		"\2\u0126R\3\2\2\2\u0127\u0128\t\3\2\2\u0128T\3\2\2\2\u0129\u012b\4\62"+
		";\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012dV\3\2\2\2\u012e\u012f\7d\2\2\u012f\u0131\4\62\63\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133X\3\2\2\2\u0134\u0136\t\4\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\b-\2\2\u013aZ\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d"+
		"\7,\2\2\u013d\u0141\3\2\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7,\2\2\u0145\u0146\7\61\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\b.\3\2\u0148\\\3\2\2\2\22\2\u0085\u0098\u00b6"+
		"\u00be\u00c4\u00ca\u00cd\u00d1\u00ed\u010e\u0110\u012c\u0132\u0137\u0141";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}