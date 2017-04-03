/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.siddhiql.plugins.idea;

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
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.antlr.jetbrains.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import org.wso2.siddhiql.plugins.idea.grammar.SiddhiQLLexer;
import org.wso2.siddhiql.plugins.idea.grammar.SiddhiQLParser;
import org.wso2.siddhiql.plugins.idea.psi.SiddhiQLFile;

import java.util.List;

import static org.wso2.siddhiql.plugins.idea.grammar.SiddhiQLLexer.*;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */
public class SiddhiQLParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE =
            new IFileElementType(SiddhiQLLanguage.INSTANCE);

    public static TokenIElementType ID;

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(SiddhiQLLanguage.INSTANCE,
                SiddhiQLParser.tokenNames,
                SiddhiQLParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes =
                PSIElementTypeFactory.getTokenIElementTypes(SiddhiQLLanguage.INSTANCE);
        ID = tokenIElementTypes.get(SiddhiQLLexer.ID);
    }

    public static final TokenSet COMMENTS =
            PSIElementTypeFactory.createTokenSet(
                    SiddhiQLLanguage.INSTANCE,
                    MULTILINE_COMMENT,
                    SINGLE_LINE_COMMENT);

    public static final TokenSet WHITESPACE =
            PSIElementTypeFactory.createTokenSet(
                    SiddhiQLLanguage.INSTANCE,
                    SPACES);

    public static final TokenSet STRING =
            PSIElementTypeFactory.createTokenSet(
                    SiddhiQLLanguage.INSTANCE,
                    STRING_LITERAL);

    public static final TokenSet NUMBER = PSIElementTypeFactory.createTokenSet(SiddhiQLLanguage.INSTANCE,
            INT_LITERAL, LONG_LITERAL, FLOAT_LITERAL, DOUBLE_LITERAL);

    public static final TokenSet KEYWORDS = PSIElementTypeFactory.createTokenSet(
            SiddhiQLLanguage.INSTANCE, STREAM, DEFINE, TABLE, FROM, PARTITION, WINDOW, SELECT, GROUP, BY, HAVING,
            INSERT, OVERWRITE, DELETE, UPDATE, RETURN, EVENTS, INTO, OUTPUT, EXPIRED, CURRENT, SNAPSHOT, FOR, RAW,
            OF, AS, OR, AND, ON, IS, NOT, WITHIN, WITH, BEGIN, END, NULL, EVERY, LAST, ALL, FIRST, JOIN, INNER, OUTER,
            RIGHT, LEFT, FULL, UNIDIRECTIONAL, YEARS, MONTHS, WEEKS, DAYS, HOURS, MINUTES, SECONDS, MILLISECONDS, FALSE,
            TRUE, INT, LONG, FLOAT, DOUBLE, BOOL, OBJECT, SiddhiQLParser.STRING);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        SiddhiQLLexer lexer = new SiddhiQLLexer(null);
        return new ANTLRLexerAdaptor(SiddhiQLLanguage.INSTANCE, lexer);
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        SiddhiQLParser parser = new SiddhiQLParser(null);
        return new ANTLRParserAdaptor(SiddhiQLLanguage.INSTANCE, parser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                return ((SiddhiQLParser) parser).parse();
            }
        };
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
        return STRING;
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new SiddhiQLFile(viewProvider);
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        System.out.println("Text: " + node.getText());
        IElementType elementType = node.getElementType();
        if (elementType instanceof TokenIElementType) {
            return new ANTLRPsiNode(node);
        }
        if (!(elementType instanceof RuleIElementType)) {
            return new ANTLRPsiNode(node);
        }

        RuleIElementType ruleElType = (RuleIElementType) elementType;

//        switch (ruleElType.getRuleIndex()) {
//            case SiddhiQLParser.RULE_day:
//                return new DayNode(node);
//            case SiddhiQLParser.RULE_date:
//                return new DateNode(node);
//            case SiddhiQLParser.RULE_month:
//                return new MonthNode(node);
//            case SiddhiQLParser.RULE_time:
//                return new TimeNode(node);
//            default:
//                return new ANTLRPsiNode(node);
//        }
        return new ANTLRPsiNode(node);
    }
}