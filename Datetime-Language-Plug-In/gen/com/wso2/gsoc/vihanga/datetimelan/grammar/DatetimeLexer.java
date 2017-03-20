// Generated from D:/Developer/My Projects/GSoC-2017/IDEA-Plug-Ins/Datetime-Language-Plug-In/src/com/wso2/gsoc/vihanga/datetimelan/grammar\Datetime.g4 by ANTLR 4.6
package com.wso2.gsoc.vihanga.datetimelan.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatetimeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ALPHA=15, DIGIT=16, LINE_COMMENT=17, 
		COMMENT=18, WS=19, MON=20, TUE=21, WED=22, THU=23, FRI=24, SAT=25, SUN=26, 
		JAN=27, FEB=28, MAR=29, APR=30, MAY=31, JUN=32, JUL=33, AUG=34, SEP=35, 
		OCT=36, NOV=37, DEC=38, ERRCHAR=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "CHAR", "ALPHA", "DIGIT", 
		"NOTALPHANUMERIC", "LINE_COMMENT", "COMMENT", "WS", "MON", "TUE", "WED", 
		"THU", "FRI", "SAT", "SUN", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", 
		"JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "ERRCHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "':'", "'UT'", "'GMT'", "'EST'", "'EDT'", "'CST'", "'CDT'", 
		"'MST'", "'MDT'", "'PST'", "'PDT'", "'+'", "'-'", null, null, null, null, 
		null, "'Mon'", "'Tue'", "'Wed'", "'Thu'", "'Fri'", "'Sat'", "'Sun'", "'Jan'", 
		"'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", 
		"'Oct'", "'Nov'", "'Dec'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ALPHA", "DIGIT", "LINE_COMMENT", "COMMENT", "WS", "MON", 
		"TUE", "WED", "THU", "FRI", "SAT", "SUN", "JAN", "FEB", "MAR", "APR", 
		"MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "ERRCHAR"
	};
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


	public DatetimeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datetime.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0091\n\24\f\24\16\24\u0094"+
		"\13\24\3\24\5\24\u0097\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u009f\n"+
		"\25\f\25\16\25\u00a2\13\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u00aa\n"+
		"\26\r\26\16\26\u00ab\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\4\u0092\u00a0\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\2!\21#\22%\2\'\23)\24+\25-\26/\27\61\30\63\31\65"+
		"\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)\3\2\b\3\2\2\u0081\4\2"+
		"C\\c|\3\2\62;\5\2\62;C\\c|\3\3\f\f\5\2\13\f\17\17\"\"\u00ff\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t\\"+
		"\3\2\2\2\13`\3\2\2\2\rd\3\2\2\2\17h\3\2\2\2\21l\3\2\2\2\23p\3\2\2\2\25"+
		"t\3\2\2\2\27x\3\2\2\2\31|\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37"+
		"\u0084\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3"+
		"\2\2\2)\u009a\3\2\2\2+\u00a9\3\2\2\2-\u00af\3\2\2\2/\u00b3\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00bb\3\2\2\2\65\u00bf\3\2\2\2\67\u00c3\3\2\2\29\u00c7"+
		"\3\2\2\2;\u00cb\3\2\2\2=\u00cf\3\2\2\2?\u00d3\3\2\2\2A\u00d7\3\2\2\2C"+
		"\u00db\3\2\2\2E\u00df\3\2\2\2G\u00e3\3\2\2\2I\u00e7\3\2\2\2K\u00eb\3\2"+
		"\2\2M\u00ef\3\2\2\2O\u00f3\3\2\2\2Q\u00f7\3\2\2\2S\u00fb\3\2\2\2UV\7."+
		"\2\2V\4\3\2\2\2WX\7<\2\2X\6\3\2\2\2YZ\7W\2\2Z[\7V\2\2[\b\3\2\2\2\\]\7"+
		"I\2\2]^\7O\2\2^_\7V\2\2_\n\3\2\2\2`a\7G\2\2ab\7U\2\2bc\7V\2\2c\f\3\2\2"+
		"\2de\7G\2\2ef\7F\2\2fg\7V\2\2g\16\3\2\2\2hi\7E\2\2ij\7U\2\2jk\7V\2\2k"+
		"\20\3\2\2\2lm\7E\2\2mn\7F\2\2no\7V\2\2o\22\3\2\2\2pq\7O\2\2qr\7U\2\2r"+
		"s\7V\2\2s\24\3\2\2\2tu\7O\2\2uv\7F\2\2vw\7V\2\2w\26\3\2\2\2xy\7R\2\2y"+
		"z\7U\2\2z{\7V\2\2{\30\3\2\2\2|}\7R\2\2}~\7F\2\2~\177\7V\2\2\177\32\3\2"+
		"\2\2\u0080\u0081\7-\2\2\u0081\34\3\2\2\2\u0082\u0083\7/\2\2\u0083\36\3"+
		"\2\2\2\u0084\u0085\t\2\2\2\u0085 \3\2\2\2\u0086\u0087\t\3\2\2\u0087\""+
		"\3\2\2\2\u0088\u0089\t\4\2\2\u0089$\3\2\2\2\u008a\u008b\n\5\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\7\61\2\2\u008d\u008e\7\61\2\2\u008e\u0092\3\2\2"+
		"\2\u008f\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0097\t\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\b\24\2\2\u0099(\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7,\2\2"+
		"\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\b\25\2\2\u00a7*\3\2\2\2\u00a8\u00aa\t\7\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b\26\2\2\u00ae,\3\2\2\2\u00af\u00b0\7O\2\2"+
		"\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7V\2"+
		"\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6\60\3\2\2\2\u00b7\u00b8"+
		"\7Y\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7f\2\2\u00ba\62\3\2\2\2\u00bb\u00bc"+
		"\7V\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7w\2\2\u00be\64\3\2\2\2\u00bf\u00c0"+
		"\7H\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7k\2\2\u00c2\66\3\2\2\2\u00c3\u00c4"+
		"\7U\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c68\3\2\2\2\u00c7\u00c8"+
		"\7U\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7p\2\2\u00ca:\3\2\2\2\u00cb\u00cc"+
		"\7L\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2\u00ce<\3\2\2\2\u00cf\u00d0"+
		"\7H\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7d\2\2\u00d2>\3\2\2\2\u00d3\u00d4"+
		"\7O\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7t\2\2\u00d6@\3\2\2\2\u00d7\u00d8"+
		"\7C\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7t\2\2\u00daB\3\2\2\2\u00db\u00dc"+
		"\7O\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7{\2\2\u00deD\3\2\2\2\u00df\u00e0"+
		"\7L\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7p\2\2\u00e2F\3\2\2\2\u00e3\u00e4"+
		"\7L\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7n\2\2\u00e6H\3\2\2\2\u00e7\u00e8"+
		"\7C\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7i\2\2\u00eaJ\3\2\2\2\u00eb\u00ec"+
		"\7U\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7r\2\2\u00eeL\3\2\2\2\u00ef\u00f0"+
		"\7Q\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7v\2\2\u00f2N\3\2\2\2\u00f3\u00f4"+
		"\7P\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7x\2\2\u00f6P\3\2\2\2\u00f7\u00f8"+
		"\7F\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7e\2\2\u00faR\3\2\2\2\u00fb\u00fc"+
		"\13\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b*\2\2\u00feT\3\2\2\2\7\2\u0092"+
		"\u0096\u00a0\u00ab\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}