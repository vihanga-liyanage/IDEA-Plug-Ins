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

package org.wso2.siddhiql.plugins.idea.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import org.wso2.siddhiql.plugins.idea.SiddhiQLLanguage;
import org.wso2.siddhiql.plugins.idea.SiddhiQLParserDefinition;
import org.wso2.siddhiql.plugins.idea.grammar.SiddhiQLLexer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */
public class SiddhiQLSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static {
        fillMap(ATTRIBUTES, SiddhiQLParserDefinition.COMMENTS, SiddhiQLSyntaxHighlightingColors.LINE_COMMENT);
        fillMap(ATTRIBUTES, SiddhiQLParserDefinition.KEYWORDS, SiddhiQLSyntaxHighlightingColors.KEYWORD);
        fillMap(ATTRIBUTES, SiddhiQLParserDefinition.STRING, SiddhiQLSyntaxHighlightingColors.STRING);
        fillMap(ATTRIBUTES, SiddhiQLParserDefinition.NUMBER, SiddhiQLSyntaxHighlightingColors.NUMBER);
    }

    @NotNull
    public Lexer getHighlightingLexer() {
        SiddhiQLLexer lexer = new SiddhiQLLexer(null);
        return new ANTLRLexerAdaptor(SiddhiQLLanguage.INSTANCE, lexer);
    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (!(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;
        TokenIElementType myType = (TokenIElementType) tokenType;
        return pack(ATTRIBUTES.get(myType));
    }
}
