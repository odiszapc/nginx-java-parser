// Generated from Nginx.g4 by ANTLR 4.3

    package com.github.odiszapc.nginxparser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, Value=15, STR_EXT=16, Comment=17, 
		QUOTED_STRING=18, SINGLE_QUOTED=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "Value", "STR_EXT", "Comment", 
		"QUOTED_STRING", "StringCharacters", "EscapeSequence", "SINGLE_QUOTED", 
		"WS"
	};


	public NginxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nginx.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20"+
		"t\n\20\3\21\6\21w\n\21\r\21\16\21x\3\22\3\22\7\22}\n\22\f\22\16\22\u0080"+
		"\13\22\3\23\3\23\5\23\u0084\n\23\3\23\3\23\3\24\3\24\6\24\u008a\n\24\r"+
		"\24\16\24\u008b\3\25\3\25\5\25\u0090\n\25\3\26\3\26\7\26\u0094\n\26\f"+
		"\26\16\26\u0097\13\26\3\26\3\26\3\27\6\27\u009c\n\27\r\27\16\27\u009d"+
		"\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\25-\26\3\2\b\13\2##&&((,<??"+
		"Aac|~~\u0080\u0080\4\2\f\f\17\17\4\2$$^^\n\2$$))^^ddhhppttvv\4\2))^^\5"+
		"\2\13\f\17\17\"\"\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2"+
		"\58\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21"+
		"V\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27a\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2"+
		"\35h\3\2\2\2\37s\3\2\2\2!v\3\2\2\2#z\3\2\2\2%\u0081\3\2\2\2\'\u0089\3"+
		"\2\2\2)\u008d\3\2\2\2+\u0091\3\2\2\2-\u009b\3\2\2\2/\60\7t\2\2\60\61\7"+
		"g\2\2\61\62\7f\2\2\62\63\7k\2\2\63\64\7t\2\2\64\65\7g\2\2\65\66\7e\2\2"+
		"\66\67\7v\2\2\67\4\3\2\2\289\7r\2\29:\7g\2\2:;\7t\2\2;<\7o\2\2<=\7c\2"+
		"\2=>\7p\2\2>?\7g\2\2?@\7p\2\2@A\7v\2\2A\6\3\2\2\2BC\7`\2\2C\b\3\2\2\2"+
		"DE\7n\2\2EF\7c\2\2FG\7u\2\2GH\7v\2\2H\n\3\2\2\2IJ\7}\2\2J\f\3\2\2\2KL"+
		"\7+\2\2L\16\3\2\2\2MN\7n\2\2NO\7q\2\2OP\7e\2\2PQ\7c\2\2QR\7v\2\2RS\7k"+
		"\2\2ST\7q\2\2TU\7p\2\2U\20\3\2\2\2VW\7d\2\2WX\7t\2\2XY\7g\2\2YZ\7c\2\2"+
		"Z[\7m\2\2[\22\3\2\2\2\\]\7*\2\2]\24\3\2\2\2^_\7k\2\2_`\7h\2\2`\26\3\2"+
		"\2\2ab\7^\2\2bc\7\60\2\2c\30\3\2\2\2de\7\177\2\2e\32\3\2\2\2fg\7=\2\2"+
		"g\34\3\2\2\2hi\7t\2\2ij\7g\2\2jk\7y\2\2kl\7t\2\2lm\7k\2\2mn\7v\2\2no\7"+
		"g\2\2o\36\3\2\2\2pt\5!\21\2qt\5%\23\2rt\5+\26\2sp\3\2\2\2sq\3\2\2\2sr"+
		"\3\2\2\2t \3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y"+
		"\"\3\2\2\2z~\7%\2\2{}\n\3\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177$\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\7$\2\2\u0082\u0084\5"+
		"\'\24\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7$\2\2\u0086&\3\2\2\2\u0087\u008a\n\4\2\2\u0088\u008a\5)\25\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c(\3\2\2\2\u008d\u008f\7^\2\2\u008e\u0090"+
		"\t\5\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090*\3\2\2\2\u0091"+
		"\u0095\7)\2\2\u0092\u0094\n\6\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7)\2\2\u0099,\3\2\2\2\u009a\u009c\t\7\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\27\2\2\u00a0.\3\2\2\2\f\2sx~\u0083"+
		"\u0089\u008b\u008f\u0095\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}