// Generated from Nginx.g4 by ANTLR 4.3

    package com.github.odiszapc.nginxparser.antlr;
    import com.github.odiszapc.nginxparser.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NginxParser}.
 */
public interface NginxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NginxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull NginxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull NginxParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(@NotNull NginxParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(@NotNull NginxParser.If_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#genericBlockHeader}.
	 * @param ctx the parse tree
	 */
	void enterGenericBlockHeader(@NotNull NginxParser.GenericBlockHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#genericBlockHeader}.
	 * @param ctx the parse tree
	 */
	void exitGenericBlockHeader(@NotNull NginxParser.GenericBlockHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull NginxParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull NginxParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull NginxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull NginxParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(@NotNull NginxParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(@NotNull NginxParser.ConfigContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	void enterRewriteStatement(@NotNull NginxParser.RewriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	void exitRewriteStatement(@NotNull NginxParser.RewriteStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void enterGenericStatement(@NotNull NginxParser.GenericStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#genericStatement}.
	 * @param ctx the parse tree
	 */
	void exitGenericStatement(@NotNull NginxParser.GenericStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(@NotNull NginxParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(@NotNull NginxParser.RegexpContext ctx);

	/**
	 * Enter a parse tree produced by {@link NginxParser#locationBlockHeader}.
	 * @param ctx the parse tree
	 */
	void enterLocationBlockHeader(@NotNull NginxParser.LocationBlockHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#locationBlockHeader}.
	 * @param ctx the parse tree
	 */
	void exitLocationBlockHeader(@NotNull NginxParser.LocationBlockHeaderContext ctx);
}