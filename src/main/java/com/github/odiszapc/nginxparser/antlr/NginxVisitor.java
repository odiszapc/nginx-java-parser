// Generated from Nginx.g4 by ANTLR 4.3

    package com.github.odiszapc.nginxparser.antlr;
    import com.github.odiszapc.nginxparser.*;

import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link NginxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull NginxParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_body(@NotNull NginxParser.If_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#genericBlockHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericBlockHeader(@NotNull NginxParser.GenericBlockHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull NginxParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull NginxParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(@NotNull NginxParser.ConfigContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#rewriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteStatement(@NotNull NginxParser.RewriteStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#genericStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericStatement(@NotNull NginxParser.GenericStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(@NotNull NginxParser.RegexpContext ctx);

	/**
	 * Visit a parse tree produced by {@link NginxParser#locationBlockHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationBlockHeader(@NotNull NginxParser.LocationBlockHeaderContext ctx);
}