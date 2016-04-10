// Generated from Nginx.g4 by ANTLR 4.5.3

    package com.github.odiszapc.nginxparser.antlr;
    import com.github.odiszapc.nginxparser.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Value=15, STR_EXT=16, 
		Comment=17, REGEXP_PREFIXED=18, QUOTED_STRING=19, SINGLE_QUOTED=20, WS=21;
	public static final int
		RULE_config = 0, RULE_statement = 1, RULE_genericStatement = 2, RULE_regexHeaderStatement = 3, 
		RULE_block = 4, RULE_genericBlockHeader = 5, RULE_if_statement = 6, RULE_if_body = 7, 
		RULE_regexp = 8, RULE_locationBlockHeader = 9, RULE_rewriteStatement = 10;
	public static final String[] ruleNames = {
		"config", "statement", "genericStatement", "regexHeaderStatement", "block", 
		"genericBlockHeader", "if_statement", "if_body", "regexp", "locationBlockHeader", 
		"rewriteStatement"
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

	@Override
	public String getGrammarFileName() { return "Nginx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NginxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfigContext extends ParserRuleContext {
		public NgxConfig ret;
		public StatementContext statement;
		public BlockContext block;
		public Token Comment;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_config);
		 ((ConfigContext)_localctx).ret =  new NgxConfig(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					((ConfigContext)_localctx).statement = statement();
					 _localctx.ret.addEntry(((ConfigContext)_localctx).statement.ret); 
					}
					break;
				case 2:
					{
					setState(25);
					((ConfigContext)_localctx).block = block();
					 _localctx.ret.addEntry(((ConfigContext)_localctx).block.ret); 
					}
					break;
				case 3:
					{
					setState(28);
					((ConfigContext)_localctx).Comment = match(Comment);
					 _localctx.ret.addEntry(new NgxComment((((ConfigContext)_localctx).Comment!=null?((ConfigContext)_localctx).Comment.getText():null))); 
					}
					break;
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << Value) | (1L << Comment) | (1L << REGEXP_PREFIXED))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public NgxParam ret;
		public RewriteStatementContext rewriteStatement;
		public GenericStatementContext genericStatement;
		public RegexHeaderStatementContext regexHeaderStatement;
		public RewriteStatementContext rewriteStatement() {
			return getRuleContext(RewriteStatementContext.class,0);
		}
		public GenericStatementContext genericStatement() {
			return getRuleContext(GenericStatementContext.class,0);
		}
		public RegexHeaderStatementContext regexHeaderStatement() {
			return getRuleContext(RegexHeaderStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(34);
				((StatementContext)_localctx).rewriteStatement = rewriteStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).rewriteStatement.ret; 
				}
				break;
			case Value:
				{
				setState(37);
				((StatementContext)_localctx).genericStatement = genericStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).genericStatement.ret; 
				}
				break;
			case REGEXP_PREFIXED:
				{
				setState(40);
				((StatementContext)_localctx).regexHeaderStatement = regexHeaderStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).regexHeaderStatement.ret; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(45);
			match(T__0);
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

	public static class GenericStatementContext extends ParserRuleContext {
		public NgxParam ret;
		public Token Value;
		public RegexpContext r;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public GenericStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterGenericStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitGenericStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitGenericStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericStatementContext genericStatement() throws RecognitionException {
		GenericStatementContext _localctx = new GenericStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericStatement);
		 ((GenericStatementContext)_localctx).ret =  new NgxParam(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((GenericStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((GenericStatementContext)_localctx).Value!=null?((GenericStatementContext)_localctx).Value.getText():null)); 
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << Value))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(49);
					((GenericStatementContext)_localctx).Value = match(Value);
					 _localctx.ret.addValue((((GenericStatementContext)_localctx).Value!=null?((GenericStatementContext)_localctx).Value.getText():null)); 
					}
					break;
				case 2:
					{
					setState(51);
					((GenericStatementContext)_localctx).r = regexp();
					 _localctx.ret.addValue(((GenericStatementContext)_localctx).r.ret); 
					}
					break;
				}
				}
				setState(58);
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

	public static class RegexHeaderStatementContext extends ParserRuleContext {
		public NgxParam ret;
		public Token REGEXP_PREFIXED;
		public Token Value;
		public TerminalNode REGEXP_PREFIXED() { return getToken(NginxParser.REGEXP_PREFIXED, 0); }
		public TerminalNode Value() { return getToken(NginxParser.Value, 0); }
		public RegexHeaderStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexHeaderStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterRegexHeaderStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitRegexHeaderStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitRegexHeaderStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexHeaderStatementContext regexHeaderStatement() throws RecognitionException {
		RegexHeaderStatementContext _localctx = new RegexHeaderStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_regexHeaderStatement);
		 ((RegexHeaderStatementContext)_localctx).ret =  new NgxParam(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((RegexHeaderStatementContext)_localctx).REGEXP_PREFIXED = match(REGEXP_PREFIXED);
			 _localctx.ret.addValue((((RegexHeaderStatementContext)_localctx).REGEXP_PREFIXED!=null?((RegexHeaderStatementContext)_localctx).REGEXP_PREFIXED.getText():null)); 
			setState(61);
			((RegexHeaderStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((RegexHeaderStatementContext)_localctx).Value!=null?((RegexHeaderStatementContext)_localctx).Value.getText():null)); 
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

	public static class BlockContext extends ParserRuleContext {
		public NgxBlock ret;
		public LocationBlockHeaderContext locationBlockHeader;
		public GenericBlockHeaderContext genericBlockHeader;
		public Token Comment;
		public StatementContext statement;
		public BlockContext b;
		public If_statementContext if_statement;
		public LocationBlockHeaderContext locationBlockHeader() {
			return getRuleContext(LocationBlockHeaderContext.class,0);
		}
		public GenericBlockHeaderContext genericBlockHeader() {
			return getRuleContext(GenericBlockHeaderContext.class,0);
		}
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		 ((BlockContext)_localctx).ret =  new NgxBlock(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(64);
				((BlockContext)_localctx).locationBlockHeader = locationBlockHeader();
				 _localctx.ret.getTokens().addAll(((BlockContext)_localctx).locationBlockHeader.ret); 
				}
				break;
			case Value:
				{
				setState(67);
				((BlockContext)_localctx).genericBlockHeader = genericBlockHeader();
				 _localctx.ret.getTokens().addAll(((BlockContext)_localctx).genericBlockHeader.ret); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(73);
			_la = _input.LA(1);
			if (_la==Comment) {
				{
				setState(72);
				((BlockContext)_localctx).Comment = match(Comment);
				}
			}

			setState(75);
			match(T__1);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Value) | (1L << Comment) | (1L << REGEXP_PREFIXED))) != 0)) {
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(76);
					((BlockContext)_localctx).statement = statement();
					 _localctx.ret.addEntry(((BlockContext)_localctx).statement.ret); 
					}
					break;
				case 2:
					{
					setState(79);
					((BlockContext)_localctx).b = block();
					 _localctx.ret.addEntry(((BlockContext)_localctx).b.ret); 
					}
					break;
				case 3:
					{
					setState(82);
					((BlockContext)_localctx).if_statement = if_statement();
					 _localctx.ret.addEntry(((BlockContext)_localctx).if_statement.ret); 
					}
					break;
				case 4:
					{
					setState(85);
					((BlockContext)_localctx).Comment = match(Comment);
					 _localctx.ret.addEntry(new NgxComment((((BlockContext)_localctx).Comment!=null?((BlockContext)_localctx).Comment.getText():null))); 
					}
					break;
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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

	public static class GenericBlockHeaderContext extends ParserRuleContext {
		public List<NgxToken> ret;
		public Token Value;
		public RegexpContext regexp;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public GenericBlockHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericBlockHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterGenericBlockHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitGenericBlockHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitGenericBlockHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericBlockHeaderContext genericBlockHeader() throws RecognitionException {
		GenericBlockHeaderContext _localctx = new GenericBlockHeaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericBlockHeader);
		 ((GenericBlockHeaderContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((GenericBlockHeaderContext)_localctx).Value = match(Value);
			 _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext)_localctx).Value!=null?((GenericBlockHeaderContext)_localctx).Value.getText():null))); 
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << Value))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(96);
					((GenericBlockHeaderContext)_localctx).Value = match(Value);
					 _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext)_localctx).Value!=null?((GenericBlockHeaderContext)_localctx).Value.getText():null))); 
					}
					break;
				case 2:
					{
					setState(98);
					((GenericBlockHeaderContext)_localctx).regexp = regexp();
					 _localctx.ret.add(new NgxToken(((GenericBlockHeaderContext)_localctx).regexp.ret)); 
					}
					break;
				}
				}
				setState(105);
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

	public static class If_statementContext extends ParserRuleContext {
		public NgxIfBlock ret;
		public Token id;
		public If_bodyContext if_body;
		public StatementContext statement;
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public TerminalNode Comment() { return getToken(NginxParser.Comment, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		 ((If_statementContext)_localctx).ret =  new NgxIfBlock(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((If_statementContext)_localctx).id = match(T__3);
			 _localctx.ret.addValue(new NgxToken((((If_statementContext)_localctx).id!=null?((If_statementContext)_localctx).id.getText():null))); 
			setState(108);
			((If_statementContext)_localctx).if_body = if_body();
			 _localctx.ret.getTokens().addAll(((If_statementContext)_localctx).if_body.ret); 
			setState(111);
			_la = _input.LA(1);
			if (_la==Comment) {
				{
				setState(110);
				match(Comment);
				}
			}

			setState(113);
			match(T__1);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << Value) | (1L << REGEXP_PREFIXED))) != 0)) {
				{
				{
				setState(114);
				((If_statementContext)_localctx).statement = statement();
				 _localctx.ret.addEntry(((If_statementContext)_localctx).statement.ret); 
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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

	public static class If_bodyContext extends ParserRuleContext {
		public List<NgxToken> ret;
		public Token Value;
		public RegexpContext regexp;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_body);
		 ((If_bodyContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__4);
			setState(125);
			((If_bodyContext)_localctx).Value = match(Value);
			 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(127);
				((If_bodyContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(131);
				((If_bodyContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
				}
				break;
			case 2:
				{
				setState(133);
				((If_bodyContext)_localctx).regexp = regexp();
				 _localctx.ret.add(new NgxToken(((If_bodyContext)_localctx).regexp.ret)); 
				}
				break;
			}
			setState(138);
			match(T__5);
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

	public static class RegexpContext extends ParserRuleContext {
		public String ret;
		public Token id;
		public Token Value;
		public RegexpContext r;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_regexp);
		 ((RegexpContext)_localctx).ret =  ""; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(151);
					switch (_input.LA(1)) {
					case T__6:
						{
						setState(140);
						((RegexpContext)_localctx).id = match(T__6);
						 _localctx.ret += (((RegexpContext)_localctx).id!=null?((RegexpContext)_localctx).id.getText():null); 
						}
						break;
					case T__7:
						{
						setState(142);
						((RegexpContext)_localctx).id = match(T__7);
						 _localctx.ret += (((RegexpContext)_localctx).id!=null?((RegexpContext)_localctx).id.getText():null); 
						}
						break;
					case Value:
						{
						setState(144);
						((RegexpContext)_localctx).Value = match(Value);
						 _localctx.ret += (((RegexpContext)_localctx).Value!=null?((RegexpContext)_localctx).Value.getText():null); 
						}
						break;
					case T__4:
						{
						setState(146);
						match(T__4);
						setState(147);
						((RegexpContext)_localctx).r = regexp();
						 _localctx.ret += "(".concat(((RegexpContext)_localctx).r.ret).concat(")"); 
						setState(149);
						match(T__5);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LocationBlockHeaderContext extends ParserRuleContext {
		public List<NgxToken> ret;
		public Token id;
		public Token Value;
		public RegexpContext regexp;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public LocationBlockHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationBlockHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterLocationBlockHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitLocationBlockHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitLocationBlockHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationBlockHeaderContext locationBlockHeader() throws RecognitionException {
		LocationBlockHeaderContext _localctx = new LocationBlockHeaderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_locationBlockHeader);
		 ((LocationBlockHeaderContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((LocationBlockHeaderContext)_localctx).id = match(T__8);
			 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).id!=null?((LocationBlockHeaderContext)_localctx).id.getText():null))); 
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(157);
				((LocationBlockHeaderContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).Value!=null?((LocationBlockHeaderContext)_localctx).Value.getText():null))); 
				}
				break;
			}
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(161);
				((LocationBlockHeaderContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).Value!=null?((LocationBlockHeaderContext)_localctx).Value.getText():null))); 
				}
				break;
			case 2:
				{
				setState(163);
				((LocationBlockHeaderContext)_localctx).regexp = regexp();
				 _localctx.ret.add(new NgxToken(((LocationBlockHeaderContext)_localctx).regexp.ret)); 
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

	public static class RewriteStatementContext extends ParserRuleContext {
		public NgxParam ret;
		public Token id;
		public Token Value;
		public RegexpContext regexp;
		public Token opt;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public RewriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterRewriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitRewriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitRewriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RewriteStatementContext rewriteStatement() throws RecognitionException {
		RewriteStatementContext _localctx = new RewriteStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rewriteStatement);
		 ((RewriteStatementContext)_localctx).ret =  new NgxParam(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((RewriteStatementContext)_localctx).id = match(T__9);
			 _localctx.ret.addValue((((RewriteStatementContext)_localctx).id!=null?((RewriteStatementContext)_localctx).id.getText():null)); 
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(170);
				((RewriteStatementContext)_localctx).Value = match(Value);
				 _localctx.ret.addValue((((RewriteStatementContext)_localctx).Value!=null?((RewriteStatementContext)_localctx).Value.getText():null)); 
				}
				break;
			case 2:
				{
				setState(172);
				((RewriteStatementContext)_localctx).regexp = regexp();
				 _localctx.ret.addValue(((RewriteStatementContext)_localctx).regexp.ret); 
				}
				break;
			}
			setState(177);
			((RewriteStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((RewriteStatementContext)_localctx).Value!=null?((RewriteStatementContext)_localctx).Value.getText():null)); 
			setState(181);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(179);
				((RewriteStatementContext)_localctx).opt = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
					((RewriteStatementContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				 _localctx.ret.addValue((((RewriteStatementContext)_localctx).opt!=null?((RewriteStatementContext)_localctx).opt.getText():null)); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00ba\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2!\n\2\r\2\16\2\"\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6I\n\6\3\6\5\6L\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\b\3\b\3\b\3\b\7\b"+
		"x\n\b\f\b\16\b{\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u008b\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\6\n\u009a\n\n\r\n\16\n\u009b\3\13\3\13\3\13\3\13\5\13\u00a2\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00b2\n\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\2\2\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\3\3\2\r\20\u00ca\2 \3\2\2\2\4-\3\2\2\2\6\61\3\2\2\2\b="+
		"\3\2\2\2\nH\3\2\2\2\f`\3\2\2\2\16l\3\2\2\2\20~\3\2\2\2\22\u0099\3\2\2"+
		"\2\24\u009d\3\2\2\2\26\u00aa\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32!\3"+
		"\2\2\2\33\34\5\n\6\2\34\35\b\2\1\2\35!\3\2\2\2\36\37\7\23\2\2\37!\b\2"+
		"\1\2 \30\3\2\2\2 \33\3\2\2\2 \36\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2"+
		"\2\2#\3\3\2\2\2$%\5\26\f\2%&\b\3\1\2&.\3\2\2\2\'(\5\6\4\2()\b\3\1\2)."+
		"\3\2\2\2*+\5\b\5\2+,\b\3\1\2,.\3\2\2\2-$\3\2\2\2-\'\3\2\2\2-*\3\2\2\2"+
		"./\3\2\2\2/\60\7\3\2\2\60\5\3\2\2\2\61\62\7\21\2\2\62:\b\4\1\2\63\64\7"+
		"\21\2\2\649\b\4\1\2\65\66\5\22\n\2\66\67\b\4\1\2\679\3\2\2\28\63\3\2\2"+
		"\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<:\3\2\2\2=>\7"+
		"\24\2\2>?\b\5\1\2?@\7\21\2\2@A\b\5\1\2A\t\3\2\2\2BC\5\24\13\2CD\b\6\1"+
		"\2DI\3\2\2\2EF\5\f\7\2FG\b\6\1\2GI\3\2\2\2HB\3\2\2\2HE\3\2\2\2IK\3\2\2"+
		"\2JL\7\23\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2M[\7\4\2\2NO\5\4\3\2OP\b\6"+
		"\1\2PZ\3\2\2\2QR\5\n\6\2RS\b\6\1\2SZ\3\2\2\2TU\5\16\b\2UV\b\6\1\2VZ\3"+
		"\2\2\2WX\7\23\2\2XZ\b\6\1\2YN\3\2\2\2YQ\3\2\2\2YT\3\2\2\2YW\3\2\2\2Z]"+
		"\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\5\2\2_\13\3\2\2"+
		"\2`a\7\21\2\2ai\b\7\1\2bc\7\21\2\2ch\b\7\1\2de\5\22\n\2ef\b\7\1\2fh\3"+
		"\2\2\2gb\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki"+
		"\3\2\2\2lm\7\6\2\2mn\b\b\1\2no\5\20\t\2oq\b\b\1\2pr\7\23\2\2qp\3\2\2\2"+
		"qr\3\2\2\2rs\3\2\2\2sy\7\4\2\2tu\5\4\3\2uv\b\b\1\2vx\3\2\2\2wt\3\2\2\2"+
		"x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\5\2\2}\17\3\2\2"+
		"\2~\177\7\7\2\2\177\u0080\7\21\2\2\u0080\u0083\b\t\1\2\u0081\u0082\7\21"+
		"\2\2\u0082\u0084\b\t\1\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u008a\3\2\2\2\u0085\u0086\7\21\2\2\u0086\u008b\b\t\1\2\u0087\u0088\5"+
		"\22\n\2\u0088\u0089\b\t\1\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008a"+
		"\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\b"+
		"\2\2\u008d\21\3\2\2\2\u008e\u008f\7\t\2\2\u008f\u009a\b\n\1\2\u0090\u0091"+
		"\7\n\2\2\u0091\u009a\b\n\1\2\u0092\u0093\7\21\2\2\u0093\u009a\b\n\1\2"+
		"\u0094\u0095\7\7\2\2\u0095\u0096\5\22\n\2\u0096\u0097\b\n\1\2\u0097\u0098"+
		"\7\b\2\2\u0098\u009a\3\2\2\2\u0099\u008e\3\2\2\2\u0099\u0090\3\2\2\2\u0099"+
		"\u0092\3\2\2\2\u0099\u0094\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\23\3\2\2\2\u009d\u009e\7\13\2\2\u009e\u00a1"+
		"\b\13\1\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\b\13\1\2\u00a1\u009f\3\2\2"+
		"\2\u00a1\u00a2\3\2\2\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4"+
		"\u00a9\b\13\1\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\b\13\1\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\25\3\2\2\2\u00aa"+
		"\u00ab\7\f\2\2\u00ab\u00b1\b\f\1\2\u00ac\u00ad\7\21\2\2\u00ad\u00b2\b"+
		"\f\1\2\u00ae\u00af\5\22\n\2\u00af\u00b0\b\f\1\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00ac\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\21"+
		"\2\2\u00b4\u00b7\b\f\1\2\u00b5\u00b6\t\2\2\2\u00b6\u00b8\b\f\1\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\27\3\2\2\2\27 \"-8:HKY[giqy\u0083"+
		"\u008a\u0099\u009b\u00a1\u00a8\u00b1\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}