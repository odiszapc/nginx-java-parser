// Generated from Nginx.g4 by ANTLR 4.5.3

    package com.github.odiszapc.nginxparser.antlr;
    import com.github.odiszapc.nginxparser.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NginxParser}.
 */
public interface NginxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NginxParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(NginxParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(NginxParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NginxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NginxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterGenericStatement(NginxParser.GenericStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitGenericStatement(NginxParser.GenericStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#regexHeaderStatement}.
	 * @param ctx the parse tree
	 */
	void enterRegexHeaderStatement(NginxParser.RegexHeaderStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#regexHeaderStatement}.
	 * @param ctx the parse tree
	 */
	void exitRegexHeaderStatement(NginxParser.RegexHeaderStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(NginxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(NginxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#genericBlockHeader}.
	 * @param ctx the parse tree
	 */
	void enterGenericBlockHeader(NginxParser.GenericBlockHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#genericBlockHeader}.
	 * @param ctx the parse tree
	 */
	void exitGenericBlockHeader(NginxParser.GenericBlockHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(NginxParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(NginxParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(NginxParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(NginxParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(NginxParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(NginxParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#locationBlockHeader}.
	 * @param ctx the parse tree
	 */
	void enterLocationBlockHeader(NginxParser.LocationBlockHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#locationBlockHeader}.
	 * @param ctx the parse tree
	 */
	void exitLocationBlockHeader(NginxParser.LocationBlockHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	void enterRewriteStatement(NginxParser.RewriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	void exitRewriteStatement(NginxParser.RewriteStatementContext ctx);
}