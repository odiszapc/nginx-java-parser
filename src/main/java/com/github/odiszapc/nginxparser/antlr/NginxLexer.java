// Generated from Nginx.g4 by ANTLR 4.5.3

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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Value=15, STR_EXT=16, 
		Comment=17, REGEXP_PREFIXED=18, QUOTED_STRING=19, SINGLE_QUOTED=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "Value", "STR_EXT", "Comment", 
		"REGEXP_PREFIXED", "QUOTED_STRING", "RegexpPrefix", "StringCharacters", 
		"EscapeSequence", "SINGLE_QUOTED", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "'if'", "'('", "')'", "'\\.'", "'^'", "'location'", 
		"'rewrite'", "'last'", "'break'", "'redirect'", "'permanent'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Value", "STR_EXT", "Comment", "REGEXP_PREFIXED", "QUOTED_STRING", 
		"SINGLE_QUOTED", "WS"
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


	public NginxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nginx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\5\20x\n\20\3\21\6\21{\n\21\r\21\16\21|"+
		"\3\22\3\22\7\22\u0081\n\22\f\22\16\22\u0084\13\22\3\23\3\23\6\23\u0088"+
		"\n\23\r\23\16\23\u0089\3\24\3\24\5\24\u008e\n\24\3\24\3\24\3\25\3\25\5"+
		"\25\u0094\n\25\3\26\3\26\6\26\u0098\n\26\r\26\16\26\u0099\3\27\3\27\5"+
		"\27\u009e\n\27\3\30\3\30\7\30\u00a2\n\30\f\30\16\30\u00a5\13\30\3\30\3"+
		"\30\3\31\6\31\u00aa\n\31\r\31\16\31\u00ab\3\31\3\31\2\2\32\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\2+\2-\2/\26\61\27\3\2\13\13\2##%&((,<??Aac|~~\u0080\u0080\4"+
		"\2\f\f\17\17\13\2##%&((*<??Aac|~~\u0080\u0080\3\2\u0080\u0080\3\2,,\4"+
		"\2$$^^\n\2$$))^^ddhhppttvv\4\2))^^\5\2\13\f\17\17\"\"\u00b7\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67"+
		"\3\2\2\2\t9\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21C\3\2\2\2\23"+
		"E\3\2\2\2\25N\3\2\2\2\27V\3\2\2\2\31[\3\2\2\2\33a\3\2\2\2\35j\3\2\2\2"+
		"\37w\3\2\2\2!z\3\2\2\2#~\3\2\2\2%\u0085\3\2\2\2\'\u008b\3\2\2\2)\u0091"+
		"\3\2\2\2+\u0097\3\2\2\2-\u009b\3\2\2\2/\u009f\3\2\2\2\61\u00a9\3\2\2\2"+
		"\63\64\7=\2\2\64\4\3\2\2\2\65\66\7}\2\2\66\6\3\2\2\2\678\7\177\2\28\b"+
		"\3\2\2\29:\7k\2\2:;\7h\2\2;\n\3\2\2\2<=\7*\2\2=\f\3\2\2\2>?\7+\2\2?\16"+
		"\3\2\2\2@A\7^\2\2AB\7\60\2\2B\20\3\2\2\2CD\7`\2\2D\22\3\2\2\2EF\7n\2\2"+
		"FG\7q\2\2GH\7e\2\2HI\7c\2\2IJ\7v\2\2JK\7k\2\2KL\7q\2\2LM\7p\2\2M\24\3"+
		"\2\2\2NO\7t\2\2OP\7g\2\2PQ\7y\2\2QR\7t\2\2RS\7k\2\2ST\7v\2\2TU\7g\2\2"+
		"U\26\3\2\2\2VW\7n\2\2WX\7c\2\2XY\7u\2\2YZ\7v\2\2Z\30\3\2\2\2[\\\7d\2\2"+
		"\\]\7t\2\2]^\7g\2\2^_\7c\2\2_`\7m\2\2`\32\3\2\2\2ab\7t\2\2bc\7g\2\2cd"+
		"\7f\2\2de\7k\2\2ef\7t\2\2fg\7g\2\2gh\7e\2\2hi\7v\2\2i\34\3\2\2\2jk\7r"+
		"\2\2kl\7g\2\2lm\7t\2\2mn\7o\2\2no\7c\2\2op\7p\2\2pq\7g\2\2qr\7p\2\2rs"+
		"\7v\2\2s\36\3\2\2\2tx\5!\21\2ux\5\'\24\2vx\5/\30\2wt\3\2\2\2wu\3\2\2\2"+
		"wv\3\2\2\2x \3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\"\3\2\2\2~\u0082\7%\2\2\177\u0081\n\3\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083$\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\5)\25\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"&\3\2\2\2\u008b\u008d\7$\2\2\u008c\u008e\5+\26\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7$\2\2\u0090(\3\2\2\2\u0091"+
		"\u0093\t\5\2\2\u0092\u0094\t\6\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094*\3\2\2\2\u0095\u0098\n\7\2\2\u0096\u0098\5-\27\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a,\3\2\2\2\u009b\u009d\7^\2\2\u009c\u009e\t\b\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e.\3\2\2\2\u009f\u00a3\7)\2\2\u00a0"+
		"\u00a2\n\t\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7)\2\2\u00a7\60\3\2\2\2\u00a8\u00aa\t\n\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\b\31\2\2\u00ae\62\3\2\2\2\16\2w|\u0082\u0089\u008d"+
		"\u0093\u0097\u0099\u009d\u00a3\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}