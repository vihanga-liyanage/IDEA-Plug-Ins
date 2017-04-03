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

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.wso2.siddhiql.plugins.idea.SiddhiQLIcons;

import javax.swing.*;
import java.util.Map;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */
public class SiddhiQLColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            //todo: add more attributes
            new AttributesDescriptor("Keywords", SiddhiQLSyntaxHighlightingColors.KEYWORD),
            new AttributesDescriptor("Strings", SiddhiQLSyntaxHighlightingColors.STRING),
            new AttributesDescriptor("Numbers", SiddhiQLSyntaxHighlightingColors.NUMBER),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return SiddhiQLIcons.ICON;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SiddhiQLSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "--This is a single line comment\n" +
                "from TempStream\n" +
                "select roomNo, temp * 9/5 + 32 as temp, 'F' as scale, roomNo >= 100 and roomNo < 110 as isServerRoom\n" +
                "insert into RoomTempStream;\n" +
                "/* This is a block comment\n" +
                "line 2\n" +
                "line 3\n" +
                "*/\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "SiddhiQL";
    }
}
