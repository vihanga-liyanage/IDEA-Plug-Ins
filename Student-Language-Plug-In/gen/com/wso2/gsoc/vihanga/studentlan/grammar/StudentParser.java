// Generated from D:/Developer/My Projects/GSoC-2017/IDEA-Plug-Ins/Student-Language-Plug-In/src/com/wso2/gsoc/vihanga/studentlan/grammar\Student.g4 by ANTLR 4.6
package com.wso2.gsoc.vihanga.studentlan.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StudentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, INT=6, ADDRESS_SYMBOLS=7, STRING=8, 
		LINEEND=9, LPAREN=10, RPAREN=11, LINE_COMMENT=12, COMMENT=13, WS=14, STUDENT=15, 
		SID=16, NAME=17, AGE=18, ADDRESS=19;
	public static final int
		RULE_script = 0, RULE_student = 1, RULE_sid = 2, RULE_name = 3, RULE_age = 4, 
		RULE_address = 5, RULE_streetAddress = 6, RULE_city = 7, RULE_postalCode = 8, 
		RULE_country = 9;
	public static final String[] ruleNames = {
		"script", "student", "sid", "name", "age", "address", "streetAddress", 
		"city", "postalCode", "country"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", null, null, null, null, "';'", "'('", 
		"')'", null, null, null, "'Student'", "'SID'", "'Name'", "'Age'", "'Address'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ID", "INT", "ADDRESS_SYMBOLS", "STRING", 
		"LINEEND", "LPAREN", "RPAREN", "LINE_COMMENT", "COMMENT", "WS", "STUDENT", 
		"SID", "NAME", "AGE", "ADDRESS"
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

	@Override
	public String getGrammarFileName() { return "Student.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StudentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StudentParser.EOF, 0); }
		public List<StudentContext> student() {
			return getRuleContexts(StudentContext.class);
		}
		public StudentContext student(int i) {
			return getRuleContext(StudentContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STUDENT) {
				{
				{
				setState(20);
				student();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(EOF);
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

	public static class StudentContext extends ParserRuleContext {
		public SidContext sid() {
			return getRuleContext(SidContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AgeContext age() {
			return getRuleContext(AgeContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public StudentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_student; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterStudent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitStudent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitStudent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StudentContext student() throws RecognitionException {
		StudentContext _localctx = new StudentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_student);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(STUDENT);
			setState(29);
			match(T__0);
			setState(30);
			sid();
			setState(31);
			match(T__1);
			setState(32);
			name();
			setState(33);
			match(T__1);
			setState(34);
			age();
			setState(35);
			match(T__1);
			setState(36);
			address();
			setState(37);
			match(T__2);
			setState(38);
			match(LINEEND);
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

	public static class SidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StudentParser.ID, 0); }
		public SidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterSid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitSid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitSid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SidContext sid() throws RecognitionException {
		SidContext _localctx = new SidContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(SID);
			setState(41);
			match(T__3);
			setState(42);
			match(ID);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StudentParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(NAME);
			setState(45);
			match(T__3);
			setState(46);
			match(STRING);
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

	public static class AgeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StudentParser.INT, 0); }
		public AgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_age; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterAge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitAge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitAge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_age);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(AGE);
			setState(49);
			match(T__3);
			setState(50);
			match(INT);
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

	public static class AddressContext extends ParserRuleContext {
		public StreetAddressContext streetAddress() {
			return getRuleContext(StreetAddressContext.class,0);
		}
		public CityContext city() {
			return getRuleContext(CityContext.class,0);
		}
		public PostalCodeContext postalCode() {
			return getRuleContext(PostalCodeContext.class,0);
		}
		public CountryContext country() {
			return getRuleContext(CountryContext.class,0);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ADDRESS);
			setState(53);
			match(T__0);
			setState(54);
			streetAddress();
			setState(55);
			match(T__1);
			setState(56);
			city();
			setState(57);
			match(T__1);
			setState(58);
			postalCode();
			setState(59);
			match(T__1);
			setState(60);
			country();
			setState(61);
			match(T__2);
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

	public static class StreetAddressContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(StudentParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(StudentParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(StudentParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(StudentParser.INT, i);
		}
		public List<TerminalNode> ADDRESS_SYMBOLS() { return getTokens(StudentParser.ADDRESS_SYMBOLS); }
		public TerminalNode ADDRESS_SYMBOLS(int i) {
			return getToken(StudentParser.ADDRESS_SYMBOLS, i);
		}
		public StreetAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streetAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterStreetAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitStreetAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitStreetAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreetAddressContext streetAddress() throws RecognitionException {
		StreetAddressContext _localctx = new StreetAddressContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_streetAddress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ADDRESS_SYMBOLS) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ADDRESS_SYMBOLS) | (1L << STRING))) != 0) );
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

	public static class CityContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StudentParser.STRING, 0); }
		public CityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_city; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterCity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitCity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitCity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CityContext city() throws RecognitionException {
		CityContext _localctx = new CityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_city);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(STRING);
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

	public static class PostalCodeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StudentParser.INT, 0); }
		public PostalCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postalCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterPostalCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitPostalCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitPostalCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostalCodeContext postalCode() throws RecognitionException {
		PostalCodeContext _localctx = new PostalCodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_postalCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(INT);
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

	public static class CountryContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StudentParser.STRING, 0); }
		public CountryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_country; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).enterCountry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StudentListener ) ((StudentListener)listener).exitCountry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StudentVisitor ) return ((StudentVisitor<? extends T>)visitor).visitCountry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountryContext country() throws RecognitionException {
		CountryContext _localctx = new CountryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_country);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRING);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bC\n\b\r\b\16\bD\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\b\nD\2\31"+
		"\3\2\2\2\4\36\3\2\2\2\6*\3\2\2\2\b.\3\2\2\2\n\62\3\2\2\2\f\66\3\2\2\2"+
		"\16B\3\2\2\2\20F\3\2\2\2\22H\3\2\2\2\24J\3\2\2\2\26\30\5\4\3\2\27\26\3"+
		"\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3"+
		"\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\37\7\21\2\2\37 \7\3\2\2 !\5\6\4\2"+
		"!\"\7\4\2\2\"#\5\b\5\2#$\7\4\2\2$%\5\n\6\2%&\7\4\2\2&\'\5\f\7\2\'(\7\5"+
		"\2\2()\7\13\2\2)\5\3\2\2\2*+\7\22\2\2+,\7\6\2\2,-\7\7\2\2-\7\3\2\2\2."+
		"/\7\23\2\2/\60\7\6\2\2\60\61\7\n\2\2\61\t\3\2\2\2\62\63\7\24\2\2\63\64"+
		"\7\6\2\2\64\65\7\b\2\2\65\13\3\2\2\2\66\67\7\25\2\2\678\7\3\2\289\5\16"+
		"\b\29:\7\4\2\2:;\5\20\t\2;<\7\4\2\2<=\5\22\n\2=>\7\4\2\2>?\5\24\13\2?"+
		"@\7\5\2\2@\r\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"E\17\3\2\2\2FG\7\n\2\2G\21\3\2\2\2HI\7\b\2\2I\23\3\2\2\2JK\7\n\2\2K\25"+
		"\3\2\2\2\4\31D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}