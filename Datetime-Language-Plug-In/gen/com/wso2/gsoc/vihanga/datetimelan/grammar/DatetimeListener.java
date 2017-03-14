// Generated from D:/Developer/My Projects/GSoC-2017/IDEA-Plug-Ins/Datetime-Language-Plug-In/src/com/wso2/gsoc/vihanga/datetimelan/grammar\Datetime.g4 by ANTLR 4.6
package com.wso2.gsoc.vihanga.datetimelan.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatetimeParser}.
 */
public interface DatetimeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_time(DatetimeParser.Date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_time(DatetimeParser.Date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(DatetimeParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(DatetimeParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(DatetimeParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(DatetimeParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(DatetimeParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(DatetimeParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(DatetimeParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(DatetimeParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(DatetimeParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(DatetimeParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#zone}.
	 * @param ctx the parse tree
	 */
	void enterZone(DatetimeParser.ZoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#zone}.
	 * @param ctx the parse tree
	 */
	void exitZone(DatetimeParser.ZoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	void enterTwo_digit(DatetimeParser.Two_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	void exitTwo_digit(DatetimeParser.Two_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	void enterFour_digit(DatetimeParser.Four_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	void exitFour_digit(DatetimeParser.Four_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(DatetimeParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(DatetimeParser.AlphanumericContext ctx);
}