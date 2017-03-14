// Generated from D:/Developer/My Projects/GSoC-2017/IDEA-Plug-Ins/Student-Language-Plug-In/src/com/wso2/gsoc/vihanga/studentlan/grammar\Student.g4 by ANTLR 4.6
package com.wso2.gsoc.vihanga.studentlan.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StudentParser}.
 */
public interface StudentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StudentParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(StudentParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(StudentParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#student}.
	 * @param ctx the parse tree
	 */
	void enterStudent(StudentParser.StudentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#student}.
	 * @param ctx the parse tree
	 */
	void exitStudent(StudentParser.StudentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#sid}.
	 * @param ctx the parse tree
	 */
	void enterSid(StudentParser.SidContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#sid}.
	 * @param ctx the parse tree
	 */
	void exitSid(StudentParser.SidContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(StudentParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(StudentParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#age}.
	 * @param ctx the parse tree
	 */
	void enterAge(StudentParser.AgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#age}.
	 * @param ctx the parse tree
	 */
	void exitAge(StudentParser.AgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(StudentParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(StudentParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#streetAddress}.
	 * @param ctx the parse tree
	 */
	void enterStreetAddress(StudentParser.StreetAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#streetAddress}.
	 * @param ctx the parse tree
	 */
	void exitStreetAddress(StudentParser.StreetAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#city}.
	 * @param ctx the parse tree
	 */
	void enterCity(StudentParser.CityContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#city}.
	 * @param ctx the parse tree
	 */
	void exitCity(StudentParser.CityContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#postalCode}.
	 * @param ctx the parse tree
	 */
	void enterPostalCode(StudentParser.PostalCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#postalCode}.
	 * @param ctx the parse tree
	 */
	void exitPostalCode(StudentParser.PostalCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StudentParser#country}.
	 * @param ctx the parse tree
	 */
	void enterCountry(StudentParser.CountryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StudentParser#country}.
	 * @param ctx the parse tree
	 */
	void exitCountry(StudentParser.CountryContext ctx);
}