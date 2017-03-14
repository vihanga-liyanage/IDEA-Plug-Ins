// Generated from D:/Developer/My Projects/GSoC-2017/IDEA-Plug-Ins/Datetime-Language-Plug-In/src/com/wso2/gsoc/vihanga/datetimelan/grammar\Datetime.g4 by ANTLR 4.6
package com.wso2.gsoc.vihanga.datetimelan.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatetimeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatetimeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time(DatetimeParser.Date_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(DatetimeParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(DatetimeParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(DatetimeParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(DatetimeParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(DatetimeParser.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone(DatetimeParser.ZoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#two_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwo_digit(DatetimeParser.Two_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#four_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFour_digit(DatetimeParser.Four_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(DatetimeParser.AlphanumericContext ctx);
}