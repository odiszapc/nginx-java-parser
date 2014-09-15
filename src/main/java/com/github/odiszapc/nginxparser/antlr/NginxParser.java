// Generated from Nginx.g4 by ANTLR 4.3

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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, Value=15, STR_EXT=16, Comment=17, 
		QUOTED_STRING=18, SINGLE_QUOTED=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'redirect'", "'permanent'", "'^'", "'last'", "'{'", "')'", 
		"'location'", "'break'", "'('", "'if'", "'\\.'", "'}'", "';'", "'rewrite'", 
		"Value", "STR_EXT", "Comment", "QUOTED_STRING", "SINGLE_QUOTED", "WS"
	};
	public static final int
		RULE_config = 0, RULE_statement = 1, RULE_genericStatement = 2, RULE_block = 3, 
		RULE_genericBlockHeader = 4, RULE_if_statement = 5, RULE_if_body = 6, 
		RULE_regexp = 7, RULE_locationBlockHeader = 8, RULE_rewriteStatement = 9;
	public static final String[] ruleNames = {
		"config", "statement", "genericStatement", "block", "genericBlockHeader", 
		"if_statement", "if_body", "regexp", "locationBlockHeader", "rewriteStatement"
	};

	@Override
	public String getGrammarFileName() { return "Nginx.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20); ((ConfigContext)_localctx).statement = statement();
					 _localctx.ret.addEntry(((ConfigContext)_localctx).statement.ret); 
					}
					break;

				case 2:
					{
					setState(23); ((ConfigContext)_localctx).block = block();
					 _localctx.ret.addEntry(((ConfigContext)_localctx).block.ret); 
					}
					break;

				case 3:
					{
					setState(26); ((ConfigContext)_localctx).Comment = match(Comment);
					 _localctx.ret.addEntry(new NgxComment((((ConfigContext)_localctx).Comment!=null?((ConfigContext)_localctx).Comment.getText():null))); 
					}
					break;
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__0) | (1L << Value) | (1L << Comment))) != 0) );
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
		public GenericStatementContext genericStatement() {
			return getRuleContext(GenericStatementContext.class,0);
		}
		public RewriteStatementContext rewriteStatement() {
			return getRuleContext(RewriteStatementContext.class,0);
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
			setState(38);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(32); ((StatementContext)_localctx).rewriteStatement = rewriteStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).rewriteStatement.ret; 
				}
				break;
			case Value:
				{
				setState(35); ((StatementContext)_localctx).genericStatement = genericStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).genericStatement.ret; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(40); match(T__1);
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
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
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
			setState(42); ((GenericStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((GenericStatementContext)_localctx).Value!=null?((GenericStatementContext)_localctx).Value.getText():null)); 
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__5) | (1L << T__3) | (1L << Value))) != 0)) {
				{
				setState(49);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(44); ((GenericStatementContext)_localctx).Value = match(Value);
					 _localctx.ret.addValue((((GenericStatementContext)_localctx).Value!=null?((GenericStatementContext)_localctx).Value.getText():null)); 
					}
					break;

				case 2:
					{
					setState(46); ((GenericStatementContext)_localctx).r = regexp();
					 _localctx.ret.addValue(((GenericStatementContext)_localctx).r.ret); 
					}
					break;
				}
				}
				setState(53);
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

	public static class BlockContext extends ParserRuleContext {
		public NgxBlock ret;
		public LocationBlockHeaderContext locationBlockHeader;
		public GenericBlockHeaderContext genericBlockHeader;
		public Token Comment;
		public StatementContext statement;
		public BlockContext b;
		public If_statementContext if_statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public GenericBlockHeaderContext genericBlockHeader() {
			return getRuleContext(GenericBlockHeaderContext.class,0);
		}
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public LocationBlockHeaderContext locationBlockHeader() {
			return getRuleContext(LocationBlockHeaderContext.class,0);
		}
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
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
		enterRule(_localctx, 6, RULE_block);
		 ((BlockContext)_localctx).ret =  new NgxBlock(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(54); ((BlockContext)_localctx).locationBlockHeader = locationBlockHeader();
				 _localctx.ret.getTokens().addAll(((BlockContext)_localctx).locationBlockHeader.ret); 
				}
				break;
			case Value:
				{
				setState(57); ((BlockContext)_localctx).genericBlockHeader = genericBlockHeader();
				 _localctx.ret.getTokens().addAll(((BlockContext)_localctx).genericBlockHeader.ret); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
			_la = _input.LA(1);
			if (_la==Comment) {
				{
				setState(62); ((BlockContext)_localctx).Comment = match(Comment);
				}
			}

			setState(65); match(T__9);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__4) | (1L << T__0) | (1L << Value) | (1L << Comment))) != 0)) {
				{
				setState(77);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(66); ((BlockContext)_localctx).statement = statement();
					 _localctx.ret.addEntry(((BlockContext)_localctx).statement.ret); 
					}
					break;

				case 2:
					{
					setState(69); ((BlockContext)_localctx).b = block();
					 _localctx.ret.addEntry(((BlockContext)_localctx).b.ret); 
					}
					break;

				case 3:
					{
					setState(72); ((BlockContext)_localctx).if_statement = if_statement();
					 _localctx.ret.addEntry(((BlockContext)_localctx).if_statement.ret); 
					}
					break;

				case 4:
					{
					setState(75); ((BlockContext)_localctx).Comment = match(Comment);
					 _localctx.ret.addEntry(new NgxComment((((BlockContext)_localctx).Comment!=null?((BlockContext)_localctx).Comment.getText():null))); 
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82); match(T__2);
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
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
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
		enterRule(_localctx, 8, RULE_genericBlockHeader);
		 ((GenericBlockHeaderContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); ((GenericBlockHeaderContext)_localctx).Value = match(Value);
			 _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext)_localctx).Value!=null?((GenericBlockHeaderContext)_localctx).Value.getText():null))); 
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__5) | (1L << T__3) | (1L << Value))) != 0)) {
				{
				setState(91);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(86); ((GenericBlockHeaderContext)_localctx).Value = match(Value);
					 _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext)_localctx).Value!=null?((GenericBlockHeaderContext)_localctx).Value.getText():null))); 
					}
					break;

				case 2:
					{
					setState(88); ((GenericBlockHeaderContext)_localctx).regexp = regexp();
					 _localctx.ret.add(new NgxToken(((GenericBlockHeaderContext)_localctx).regexp.ret)); 
					}
					break;
				}
				}
				setState(95);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public TerminalNode Comment() { return getToken(NginxParser.Comment, 0); }
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
		enterRule(_localctx, 10, RULE_if_statement);
		 ((If_statementContext)_localctx).ret =  new NgxIfBlock(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); ((If_statementContext)_localctx).id = match(T__4);
			 _localctx.ret.addValue(new NgxToken((((If_statementContext)_localctx).id!=null?((If_statementContext)_localctx).id.getText():null))); 
			setState(98); ((If_statementContext)_localctx).if_body = if_body();
			 _localctx.ret.getTokens().addAll(((If_statementContext)_localctx).if_body.ret); 
			setState(101);
			_la = _input.LA(1);
			if (_la==Comment) {
				{
				setState(100); match(Comment);
				}
			}

			setState(103); match(T__9);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Value) {
				{
				{
				setState(104); ((If_statementContext)_localctx).statement = statement();
				 _localctx.ret.addEntry(((If_statementContext)_localctx).statement.ret); 
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112); match(T__2);
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
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
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
		enterRule(_localctx, 12, RULE_if_body);
		 ((If_bodyContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(T__5);
			setState(115); ((If_bodyContext)_localctx).Value = match(Value);
			 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(117); ((If_bodyContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
				}
				break;
			}
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(121); ((If_bodyContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
				}
				break;

			case 2:
				{
				setState(123); ((If_bodyContext)_localctx).regexp = regexp();
				 _localctx.ret.add(new NgxToken(((If_bodyContext)_localctx).regexp.ret)); 
				}
				break;
			}
			setState(128); match(T__8);
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
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
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
		enterRule(_localctx, 14, RULE_regexp);
		 ((RegexpContext)_localctx).ret =  ""; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(141);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(130); ((RegexpContext)_localctx).id = match(T__3);
						 _localctx.ret += (((RegexpContext)_localctx).id!=null?((RegexpContext)_localctx).id.getText():null); 
						}
						break;
					case T__11:
						{
						setState(132); ((RegexpContext)_localctx).id = match(T__11);
						 _localctx.ret += (((RegexpContext)_localctx).id!=null?((RegexpContext)_localctx).id.getText():null); 
						}
						break;
					case Value:
						{
						setState(134); ((RegexpContext)_localctx).Value = match(Value);
						 _localctx.ret += (((RegexpContext)_localctx).Value!=null?((RegexpContext)_localctx).Value.getText():null); 
						}
						break;
					case T__5:
						{
						setState(136); match(T__5);
						setState(137); ((RegexpContext)_localctx).r = regexp();
						 _localctx.ret += "(".concat(((RegexpContext)_localctx).r.ret).concat(")"); 
						setState(139); match(T__8);
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
				setState(143); 
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
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
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
		enterRule(_localctx, 16, RULE_locationBlockHeader);
		 ((LocationBlockHeaderContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); ((LocationBlockHeaderContext)_localctx).id = match(T__7);
			 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).id!=null?((LocationBlockHeaderContext)_localctx).id.getText():null))); 
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(147); ((LocationBlockHeaderContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).Value!=null?((LocationBlockHeaderContext)_localctx).Value.getText():null))); 
				}
				break;
			}
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(151); ((LocationBlockHeaderContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).Value!=null?((LocationBlockHeaderContext)_localctx).Value.getText():null))); 
				}
				break;

			case 2:
				{
				setState(153); ((LocationBlockHeaderContext)_localctx).regexp = regexp();
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
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
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
		enterRule(_localctx, 18, RULE_rewriteStatement);
		 ((RewriteStatementContext)_localctx).ret =  new NgxParam(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); ((RewriteStatementContext)_localctx).id = match(T__0);
			 _localctx.ret.addValue((((RewriteStatementContext)_localctx).id!=null?((RewriteStatementContext)_localctx).id.getText():null)); 
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(160); ((RewriteStatementContext)_localctx).Value = match(Value);
				 _localctx.ret.addValue((((RewriteStatementContext)_localctx).Value!=null?((RewriteStatementContext)_localctx).Value.getText():null)); 
				}
				break;

			case 2:
				{
				setState(162); ((RewriteStatementContext)_localctx).regexp = regexp();
				 _localctx.ret.addValue(((RewriteStatementContext)_localctx).regexp.ret); 
				}
				break;
			}
			setState(167); ((RewriteStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((RewriteStatementContext)_localctx).Value!=null?((RewriteStatementContext)_localctx).Value.getText():null)); 
			setState(171);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__6))) != 0)) {
				{
				setState(169);
				((RewriteStatementContext)_localctx).opt = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__6))) != 0)) ) {
					((RewriteStatementContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
				}
				consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3)\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4\f"+
		"\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\5\5B\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\bz\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0090\n\t\r\t\16\t\u0091\3"+
		"\n\3\n\3\n\3\n\5\n\u0098\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00ae\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\5\2\3\4\6\6\n\n\u00c0"+
		"\2\36\3\2\2\2\4(\3\2\2\2\6,\3\2\2\2\b>\3\2\2\2\nV\3\2\2\2\fb\3\2\2\2\16"+
		"t\3\2\2\2\20\u008f\3\2\2\2\22\u0093\3\2\2\2\24\u00a0\3\2\2\2\26\27\5\4"+
		"\3\2\27\30\b\2\1\2\30\37\3\2\2\2\31\32\5\b\5\2\32\33\b\2\1\2\33\37\3\2"+
		"\2\2\34\35\7\23\2\2\35\37\b\2\1\2\36\26\3\2\2\2\36\31\3\2\2\2\36\34\3"+
		"\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\"#\5\24\13\2#$\b\3"+
		"\1\2$)\3\2\2\2%&\5\6\4\2&\'\b\3\1\2\')\3\2\2\2(\"\3\2\2\2(%\3\2\2\2)*"+
		"\3\2\2\2*+\7\17\2\2+\5\3\2\2\2,-\7\21\2\2-\65\b\4\1\2./\7\21\2\2/\64\b"+
		"\4\1\2\60\61\5\20\t\2\61\62\b\4\1\2\62\64\3\2\2\2\63.\3\2\2\2\63\60\3"+
		"\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65\3"+
		"\2\2\289\5\22\n\29:\b\5\1\2:?\3\2\2\2;<\5\n\6\2<=\b\5\1\2=?\3\2\2\2>8"+
		"\3\2\2\2>;\3\2\2\2?A\3\2\2\2@B\7\23\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2"+
		"CQ\7\7\2\2DE\5\4\3\2EF\b\5\1\2FP\3\2\2\2GH\5\b\5\2HI\b\5\1\2IP\3\2\2\2"+
		"JK\5\f\7\2KL\b\5\1\2LP\3\2\2\2MN\7\23\2\2NP\b\5\1\2OD\3\2\2\2OG\3\2\2"+
		"\2OJ\3\2\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2"+
		"\2TU\7\16\2\2U\t\3\2\2\2VW\7\21\2\2W_\b\6\1\2XY\7\21\2\2Y^\b\6\1\2Z[\5"+
		"\20\t\2[\\\b\6\1\2\\^\3\2\2\2]X\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2"+
		"_`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2bc\7\f\2\2cd\b\7\1\2de\5\16\b\2eg\b\7"+
		"\1\2fh\7\23\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2io\7\7\2\2jk\5\4\3\2kl\b"+
		"\7\1\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3"+
		"\2\2\2rs\7\16\2\2s\r\3\2\2\2tu\7\13\2\2uv\7\21\2\2vy\b\b\1\2wx\7\21\2"+
		"\2xz\b\b\1\2yw\3\2\2\2yz\3\2\2\2z\u0080\3\2\2\2{|\7\21\2\2|\u0081\b\b"+
		"\1\2}~\5\20\t\2~\177\b\b\1\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0080}\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\b\2\2\u0083"+
		"\17\3\2\2\2\u0084\u0085\7\r\2\2\u0085\u0090\b\t\1\2\u0086\u0087\7\5\2"+
		"\2\u0087\u0090\b\t\1\2\u0088\u0089\7\21\2\2\u0089\u0090\b\t\1\2\u008a"+
		"\u008b\7\13\2\2\u008b\u008c\5\20\t\2\u008c\u008d\b\t\1\2\u008d\u008e\7"+
		"\b\2\2\u008e\u0090\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u0086\3\2\2\2\u008f"+
		"\u0088\3\2\2\2\u008f\u008a\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094\7\t\2\2\u0094\u0097"+
		"\b\n\1\2\u0095\u0096\7\21\2\2\u0096\u0098\b\n\1\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009e\3\2\2\2\u0099\u009a\7\21\2\2\u009a\u009f"+
		"\b\n\1\2\u009b\u009c\5\20\t\2\u009c\u009d\b\n\1\2\u009d\u009f\3\2\2\2"+
		"\u009e\u0099\3\2\2\2\u009e\u009b\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1"+
		"\7\20\2\2\u00a1\u00a7\b\13\1\2\u00a2\u00a3\7\21\2\2\u00a3\u00a8\b\13\1"+
		"\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\b\13\1\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\21"+
		"\2\2\u00aa\u00ad\b\13\1\2\u00ab\u00ac\t\2\2\2\u00ac\u00ae\b\13\1\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\25\3\2\2\2\27\36 (\63\65>AOQ"+
		"]_goy\u0080\u008f\u0091\u0097\u009e\u00a7\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}