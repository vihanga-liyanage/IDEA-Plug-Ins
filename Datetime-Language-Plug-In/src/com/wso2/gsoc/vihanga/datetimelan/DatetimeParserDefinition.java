package com.wso2.gsoc.vihanga.datetimelan;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.wso2.gsoc.vihanga.datetimelan.grammar.DatetimeLexer;
import com.wso2.gsoc.vihanga.datetimelan.grammar.DatetimeParser;
import com.wso2.gsoc.vihanga.datetimelan.psi.DatetimeFile;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.antlr.jetbrains.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.*;

import java.util.List;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */
public class DatetimeParserDefinition implements ParserDefinition {
//    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
//    public static final TokenSet COMMENTS = PSIElementTypeFactory.createTokenSet(
//            DatetimeLanguage.INSTANCE,
//            DatetimeLexer.COMMENT,
//            DatetimeLexer.LINE_COMMENT);

    public static final IFileElementType FILE = new IFileElementType(DatetimeLanguage.INSTANCE);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(DatetimeLanguage.INSTANCE,
                DatetimeParser.tokenNames,
                DatetimeParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes =
                PSIElementTypeFactory.getTokenIElementTypes(DatetimeLanguage.INSTANCE);
//        ID = tokenIElementTypes.get(DatetimeLexer.ID);
    }

    public static final TokenSet COMMENTS =
            PSIElementTypeFactory.createTokenSet(
                    DatetimeLanguage.INSTANCE,
                    DatetimeLexer.COMMENT,
                    DatetimeLexer.LINE_COMMENT);

    public static final TokenSet WHITESPACE =
            PSIElementTypeFactory.createTokenSet(
                    DatetimeLanguage.INSTANCE,
                    DatetimeLexer.WS);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        DatetimeLexer lexer = new DatetimeLexer(null);
        return new ANTLRLexerAdaptor(DatetimeLanguage.INSTANCE, lexer);
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITESPACE;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        DatetimeParser parser = new DatetimeParser(null);
        return new ANTLRParserAdaptor(DatetimeLanguage.INSTANCE, parser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                return ((DatetimeParser) parser).date_time();
            }
        };
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new DatetimeFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return new ANTLRPsiNode(node);
    }
}