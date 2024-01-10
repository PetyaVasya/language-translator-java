// Generated from /Users/mac/IdeaProjects/language-translator-java/src/main/resources/MegaLanguage.g4 by ANTLR 4.13.1

package language;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MegaLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, COMMENT=6, LBRACKET=7, RBRACKET=8, 
		EQ=9, WS=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, TIMES=15, DIV=16, 
		NUMBER=17, VARIABLE=18, DIGIT=19, LETTER=20, LINE_END=21, SPACE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "COMMENT", "LBRACKET", "RBRACKET", 
			"EQ", "WS", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "NUMBER", 
			"VARIABLE", "DIGIT", "LETTER", "LINE_END", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u043F\\u0435\\u0447\\u0430\\u0442\\u044C'", "'\\u0441\\u0447\\u0438\\u0442\\u0430\\u0442\\u044C\\u0427\\u0438\\u0441\\u043B\\u043E'", 
			"'\\u0435\\u0441\\u043B\\u0438'", "'\\u0438\\u043D\\u0430\\u0447\\u0435'", 
			"'\\u043F\\u043E\\u043A\\u0430'", null, "'{'", "'}'", "'='", null, "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "COMMENT", "LBRACKET", "RBRACKET", 
			"EQ", "WS", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "NUMBER", 
			"VARIABLE", "DIGIT", "LETTER", "LINE_END", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MegaLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MegaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005T\b\u0005"+
		"\n\u0005\f\u0005W\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\tb\b\t\u000b\t"+
		"\f\tc\u0001\t\u0003\tg\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0003\u0010x\b\u0010\u0001\u0010\u0004"+
		"\u0010{\b\u0010\u000b\u0010\f\u0010|\u0001\u0011\u0004\u0011\u0080\b\u0011"+
		"\u000b\u0011\f\u0011\u0081\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0004\u0014\u0089\b\u0014\u000b\u0014\f\u0014\u008a\u0001"+
		"\u0015\u0004\u0015\u008e\b\u0015\u000b\u0015\f\u0015\u008f\u0000\u0000"+
		"\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001"+
		"\u0000\u0004\u0001\u0000\n\n\u0001\u0000\r\r\u0002\u0000\n\n\r\r\u0002"+
		"\u0000\t\t  \u0098\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u00034\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007"+
		"F\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000"+
		"\u0000\u0000\rZ\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000"+
		"\u0011^\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015j"+
		"\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019n\u0001\u0000"+
		"\u0000\u0000\u001bp\u0001\u0000\u0000\u0000\u001dr\u0001\u0000\u0000\u0000"+
		"\u001ft\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#\u007f\u0001"+
		"\u0000\u0000\u0000%\u0083\u0001\u0000\u0000\u0000\'\u0085\u0001\u0000"+
		"\u0000\u0000)\u0088\u0001\u0000\u0000\u0000+\u008d\u0001\u0000\u0000\u0000"+
		"-.\u0005\u043f\u0000\u0000./\u0005\u0435\u0000\u0000/0\u0005\u0447\u0000"+
		"\u000001\u0005\u0430\u0000\u000012\u0005\u0442\u0000\u000023\u0005\u044c"+
		"\u0000\u00003\u0002\u0001\u0000\u0000\u000045\u0005\u0441\u0000\u0000"+
		"56\u0005\u0447\u0000\u000067\u0005\u0438\u0000\u000078\u0005\u0442\u0000"+
		"\u000089\u0005\u0430\u0000\u00009:\u0005\u0442\u0000\u0000:;\u0005\u044c"+
		"\u0000\u0000;<\u0005\u0427\u0000\u0000<=\u0005\u0438\u0000\u0000=>\u0005"+
		"\u0441\u0000\u0000>?\u0005\u043b\u0000\u0000?@\u0005\u043e\u0000\u0000"+
		"@\u0004\u0001\u0000\u0000\u0000AB\u0005\u0435\u0000\u0000BC\u0005\u0441"+
		"\u0000\u0000CD\u0005\u043b\u0000\u0000DE\u0005\u0438\u0000\u0000E\u0006"+
		"\u0001\u0000\u0000\u0000FG\u0005\u0438\u0000\u0000GH\u0005\u043d\u0000"+
		"\u0000HI\u0005\u0430\u0000\u0000IJ\u0005\u0447\u0000\u0000JK\u0005\u0435"+
		"\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005\u043f\u0000\u0000MN\u0005"+
		"\u043e\u0000\u0000NO\u0005\u043a\u0000\u0000OP\u0005\u0430\u0000\u0000"+
		"P\n\u0001\u0000\u0000\u0000QU\u0005#\u0000\u0000RT\b\u0000\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000XY\u0006\u0005\u0000\u0000Y\f\u0001\u0000\u0000\u0000Z[\u0005"+
		"{\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005}\u0000\u0000]\u0010"+
		"\u0001\u0000\u0000\u0000^_\u0005=\u0000\u0000_\u0012\u0001\u0000\u0000"+
		"\u0000`b\u0007\u0001\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000eg\u0003+\u0015\u0000fa\u0001\u0000\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\t\u0000\u0000i\u0014"+
		"\u0001\u0000\u0000\u0000jk\u0005(\u0000\u0000k\u0016\u0001\u0000\u0000"+
		"\u0000lm\u0005)\u0000\u0000m\u0018\u0001\u0000\u0000\u0000no\u0005+\u0000"+
		"\u0000o\u001a\u0001\u0000\u0000\u0000pq\u0005-\u0000\u0000q\u001c\u0001"+
		"\u0000\u0000\u0000rs\u0005*\u0000\u0000s\u001e\u0001\u0000\u0000\u0000"+
		"tu\u0005/\u0000\u0000u \u0001\u0000\u0000\u0000vx\u0003\u001b\r\u0000"+
		"wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000y{\u0003%\u0012\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\"\u0001\u0000"+
		"\u0000\u0000~\u0080\u0003\'\u0013\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u000209\u0000\u0084&\u0001\u0000\u0000\u0000\u0085\u0086\u0002"+
		"az\u0000\u0086(\u0001\u0000\u0000\u0000\u0087\u0089\u0007\u0002\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b*\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0003\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090,\u0001\u0000\u0000\u0000\t\u0000Ucfw|\u0081\u008a\u008f\u0001\u0000"+
		"\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}