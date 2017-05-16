// Generated from Nginx.g4 by ANTLR 4.5.3

    package com.github.odiszapc.nginxparser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NginxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NginxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NginxParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(NginxParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NginxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericStatement(NginxParser.GenericStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#regexHeaderStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexHeaderStatement(NginxParser.RegexHeaderStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(NginxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#genericBlockHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericBlockHeader(NginxParser.GenericBlockHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(NginxParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_body(NginxParser.If_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(NginxParser.RegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#locationBlockHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationBlockHeader(NginxParser.LocationBlockHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#rewriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteStatement(NginxParser.RewriteStatementContext ctx);
}