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

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */
public class SiddhiQLSyntaxHighlightingColors {

    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("BALLERINA_LINE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("BALLERINA_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = createTextAttributesKey("BALLERINA_STRING",
            DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("BALLERINA_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("BALLERINA_OPERATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("BALLERINA_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("BALLERINA_BAD_TOKEN",
            HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey ANNOTATION = createTextAttributesKey("BALLERINA_ANNOTATION",
            DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey CONSTANT = createTextAttributesKey("BALLERINA_CONSTANT",
            DefaultLanguageHighlighterColors.CONSTANT);

    private SiddhiQLSyntaxHighlightingColors() {
    }
}
