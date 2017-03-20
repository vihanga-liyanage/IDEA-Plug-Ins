package com.wso2.gsoc.vihanga.datetimelan;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.wso2.gsoc.vihanga.datetimelan.grammar.DatetimeLexer;
import com.wso2.gsoc.vihanga.datetimelan.grammar.DatetimeParser;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/** A highlighter is really just a mapping from token type to
 *  some text attributes using {@link #getTokenHighlights(IElementType)}.
 *  The reason that it returns an array, TextAttributesKey[], is
 *  that you might want to mix the attributes of a few known highlighters.
 *  A {@link TextAttributesKey} is just a name for that a theme
 *  or IDE skin can set. For example, {@link DefaultLanguageHighlighterColors#KEYWORD}
 *  is the key that maps to what identifiers look like in the editor.
 *  To change it, see dialog: Editor > Colors & Fonts > Language Defaults.
 *
 *  From <a href="http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/syntax_highlighting_and_error_highlighting.html">doc</a>:
 *  "The mapping of the TextAttributesKey to specific attributes used
 *  in an editor is defined by the EditorColorsScheme class, and can
 *  be configured by the user if the plugin provides an appropriate
 *  configuration interface.
 *  ...
 *  The syntax highlighter returns the {@link TextAttributesKey}
 * instances for each token type which needs special highlighting.
 * For highlighting lexer errors, the standard TextAttributesKey
 * for bad characters HighlighterColors.BAD_CHARACTER can be used."
 */
public class DatetimeSyntaxHighlighter extends SyntaxHighlighterBase {
	private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
//	public static final TextAttributesKey ID =
//		createTextAttributesKey("SAMPLE_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
	public static final TextAttributesKey KEYWORD =
		createTextAttributesKey("SAMPLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
//	public static final TextAttributesKey STRING =
//		createTextAttributesKey("SAMPLE_STRING", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey LINE_COMMENT =
		createTextAttributesKey("SAMPLE_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BLOCK_COMMENT =
		createTextAttributesKey("SAMPLE_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(DatetimeLanguage.INSTANCE,
				DatetimeParser.tokenNames,
				DatetimeParser.ruleNames);
	}

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		DatetimeLexer lexer = new DatetimeLexer(null);
		return new ANTLRLexerAdaptor(DatetimeLanguage.INSTANCE, lexer);
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if ( !(tokenType instanceof TokenIElementType) ) return EMPTY_KEYS;
		TokenIElementType myType = (TokenIElementType)tokenType;
		int ttype = myType.getANTLRTokenType();
		TextAttributesKey attrKey;
		switch ( ttype ) {
//			case SampleLanguageLexer.ID :
//				attrKey = ID;
//				break;
			case DatetimeLexer.MON :
			case DatetimeLexer.TUE :
			case DatetimeLexer.WED :
			case DatetimeLexer.THU :
			case DatetimeLexer.FRI :
			case DatetimeLexer.SAT :
			case DatetimeLexer.SUN :
			case DatetimeLexer.JAN :
			case DatetimeLexer.FEB:
			case DatetimeLexer.MAR :
			case DatetimeLexer.APR :
			case DatetimeLexer.MAY :
			case DatetimeLexer.JUN :
			case DatetimeLexer.JUL :
			case DatetimeLexer.AUG :
			case DatetimeLexer.SEP :
			case DatetimeLexer.OCT :
			case DatetimeLexer.NOV :
			case DatetimeLexer.DEC :
				attrKey = KEYWORD;
				break;
//			case SampleLanguageLexer.STRING :
//				attrKey = STRING;
//				break;
			case DatetimeLexer.COMMENT :
				attrKey = LINE_COMMENT;
				break;
			case DatetimeLexer.LINE_COMMENT :
				attrKey = BLOCK_COMMENT;
				break;
			default :
				return EMPTY_KEYS;
		}
		return new TextAttributesKey[] {attrKey};
	}
}
