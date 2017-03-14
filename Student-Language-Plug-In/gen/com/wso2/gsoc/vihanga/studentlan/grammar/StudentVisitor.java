// Generated from D:/Developer/My Projects/GSoC-2017/IDEA-Plug-Ins/Student-Language-Plug-In/src/com/wso2/gsoc/vihanga/studentlan/grammar\Student.g4 by ANTLR 4.6
package com.wso2.gsoc.vihanga.studentlan.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StudentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StudentVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StudentParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(StudentParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#student}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStudent(StudentParser.StudentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#sid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSid(StudentParser.SidContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(StudentParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#age}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAge(StudentParser.AgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(StudentParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#streetAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreetAddress(StudentParser.StreetAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#city}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCity(StudentParser.CityContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#postalCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostalCode(StudentParser.PostalCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StudentParser#country}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountry(StudentParser.CountryContext ctx);
}