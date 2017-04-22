/*
 *  Copyright (c) 2017;
private static final LookupElementBuilder WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License;
private static final LookupElementBuilder Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing;
private static final LookupElementBuilder software
 *  distributed under the License is distributed on an "AS IS" BASIS;
private static final LookupElementBuilder
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND;
private static final LookupElementBuilder either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.siddhiql.plugins.idea.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.DumbAware;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import org.wso2.siddhiql.plugins.idea.psi.KeywordNode;

/**
 * Created by Vihanga Liyanage on 4/22/2017.
 */
public class SiddhiQLCompletionContributor  extends CompletionContributor implements DumbAware {

    //keywords
    private static final LookupElementBuilder STREAM;
    private static final LookupElementBuilder DEFINE;
    private static final LookupElementBuilder TABLE;
    private static final LookupElementBuilder FROM;
    private static final LookupElementBuilder PARTITION;
    private static final LookupElementBuilder WINDOW;
    private static final LookupElementBuilder SELECT;
    private static final LookupElementBuilder GROUP;
    private static final LookupElementBuilder BY;
    private static final LookupElementBuilder HAVING;
    private static final LookupElementBuilder INSERT;
    private static final LookupElementBuilder OVERWRITE;
    private static final LookupElementBuilder DELETE;
    private static final LookupElementBuilder UPDATE;
    private static final LookupElementBuilder RETURN;
    private static final LookupElementBuilder EVENTS;
    private static final LookupElementBuilder INTO;
    private static final LookupElementBuilder OUTPUT;
    private static final LookupElementBuilder EXPIRED;
    private static final LookupElementBuilder CURRENT;
    private static final LookupElementBuilder SNAPSHOT;
    private static final LookupElementBuilder FOR;
    private static final LookupElementBuilder RAW;
    private static final LookupElementBuilder OF;
    private static final LookupElementBuilder AS;
    private static final LookupElementBuilder OR;
    private static final LookupElementBuilder AND;
    private static final LookupElementBuilder ON;
    private static final LookupElementBuilder IS;
    private static final LookupElementBuilder NOT;
    private static final LookupElementBuilder WITHIN;
    private static final LookupElementBuilder WITH;
    private static final LookupElementBuilder BEGIN;
    private static final LookupElementBuilder END;
    private static final LookupElementBuilder NULL;
    private static final LookupElementBuilder EVERY;
    private static final LookupElementBuilder LAST;
    private static final LookupElementBuilder ALL;
    private static final LookupElementBuilder FIRST;
    private static final LookupElementBuilder JOIN;
    private static final LookupElementBuilder INNER;
    private static final LookupElementBuilder OUTER;
    private static final LookupElementBuilder RIGHT;
    private static final LookupElementBuilder LEFT;
    private static final LookupElementBuilder FULL;
    private static final LookupElementBuilder UNIDIRECTIONAL;
    private static final LookupElementBuilder YEARS;
    private static final LookupElementBuilder MONTHS;
    private static final LookupElementBuilder WEEKS;
    private static final LookupElementBuilder DAYS;
    private static final LookupElementBuilder HOURS;
    private static final LookupElementBuilder MINUTES;
    private static final LookupElementBuilder SECONDS;
    private static final LookupElementBuilder MILLISECONDS;
    private static final LookupElementBuilder FALSE;
    private static final LookupElementBuilder TRUE;

    //simple types
    private static final LookupElementBuilder INT;
    private static final LookupElementBuilder LONG;
    private static final LookupElementBuilder FLOAT;
    private static final LookupElementBuilder DOUBLE;
    private static final LookupElementBuilder BOOL;
    private static final LookupElementBuilder OBJECT;

    static {
        STREAM = createKeywordLookupElement("stream", true, AddSpaceInsertHandler.INSTANCE);
        DEFINE = createKeywordLookupElement("define", true, AddSpaceInsertHandler.INSTANCE);
        TABLE = createKeywordLookupElement("table", true, AddSpaceInsertHandler.INSTANCE);
        FROM = createKeywordLookupElement("from", true, AddSpaceInsertHandler.INSTANCE);
        PARTITION = createKeywordLookupElement("partition", true, AddSpaceInsertHandler.INSTANCE);
        WINDOW = createKeywordLookupElement("window", true, AddSpaceInsertHandler.INSTANCE);
        SELECT = createKeywordLookupElement("select", true, AddSpaceInsertHandler.INSTANCE);
        GROUP = createKeywordLookupElement("group", true, AddSpaceInsertHandler.INSTANCE);
        BY = createKeywordLookupElement("by", true, AddSpaceInsertHandler.INSTANCE);
        HAVING = createKeywordLookupElement("having", true, AddSpaceInsertHandler.INSTANCE);
        INSERT = createKeywordLookupElement("insert", true, AddSpaceInsertHandler.INSTANCE);
        OVERWRITE = createKeywordLookupElement("overwrite", true, AddSpaceInsertHandler.INSTANCE);
        DELETE = createKeywordLookupElement("delete", true, AddSpaceInsertHandler.INSTANCE);
        UPDATE = createKeywordLookupElement("update", true, AddSpaceInsertHandler.INSTANCE);
        RETURN = createKeywordLookupElement("return", true, AddSpaceInsertHandler.INSTANCE);
        EVENTS = createKeywordLookupElement("events", true, AddSpaceInsertHandler.INSTANCE);
        INTO = createKeywordLookupElement("into", true, AddSpaceInsertHandler.INSTANCE);
        OUTPUT = createKeywordLookupElement("output", true, AddSpaceInsertHandler.INSTANCE);
        EXPIRED = createKeywordLookupElement("expired", true, AddSpaceInsertHandler.INSTANCE);
        CURRENT = createKeywordLookupElement("current", true, AddSpaceInsertHandler.INSTANCE);
        SNAPSHOT = createKeywordLookupElement("snapshot", true, AddSpaceInsertHandler.INSTANCE);
        FOR = createKeywordLookupElement("for", true, AddSpaceInsertHandler.INSTANCE);
        RAW = createKeywordLookupElement("raw", true, AddSpaceInsertHandler.INSTANCE);
        OF = createKeywordLookupElement("of", true, AddSpaceInsertHandler.INSTANCE);
        AS = createKeywordLookupElement("as", true, AddSpaceInsertHandler.INSTANCE);
        OR = createKeywordLookupElement("or", true, AddSpaceInsertHandler.INSTANCE);
        AND = createKeywordLookupElement("and", true, AddSpaceInsertHandler.INSTANCE);
        ON = createKeywordLookupElement("on", true, AddSpaceInsertHandler.INSTANCE);
        IS = createKeywordLookupElement("is", true, AddSpaceInsertHandler.INSTANCE);
        NOT = createKeywordLookupElement("not", true, AddSpaceInsertHandler.INSTANCE);
        WITHIN = createKeywordLookupElement("within", true, AddSpaceInsertHandler.INSTANCE);
        WITH = createKeywordLookupElement("with", true, AddSpaceInsertHandler.INSTANCE);
        BEGIN = createKeywordLookupElement("begin", true, AddSpaceInsertHandler.INSTANCE);
        END = createKeywordLookupElement("end", true, AddSpaceInsertHandler.INSTANCE);
        NULL = createKeywordLookupElement("null", true, AddSpaceInsertHandler.INSTANCE);
        EVERY = createKeywordLookupElement("every", true, AddSpaceInsertHandler.INSTANCE);
        LAST = createKeywordLookupElement("last", true, AddSpaceInsertHandler.INSTANCE);
        ALL = createKeywordLookupElement("all", true, AddSpaceInsertHandler.INSTANCE);
        FIRST = createKeywordLookupElement("first", true, AddSpaceInsertHandler.INSTANCE);
        JOIN = createKeywordLookupElement("join", true, AddSpaceInsertHandler.INSTANCE);
        INNER = createKeywordLookupElement("inner", true, AddSpaceInsertHandler.INSTANCE);
        OUTER = createKeywordLookupElement("outer", true, AddSpaceInsertHandler.INSTANCE);
        RIGHT = createKeywordLookupElement("right", true, AddSpaceInsertHandler.INSTANCE);
        LEFT = createKeywordLookupElement("left", true, AddSpaceInsertHandler.INSTANCE);
        FULL = createKeywordLookupElement("full", true, AddSpaceInsertHandler.INSTANCE);
        UNIDIRECTIONAL = createKeywordLookupElement("unidirectional", true, AddSpaceInsertHandler.INSTANCE);
        YEARS = createKeywordLookupElement("years", true, AddSpaceInsertHandler.INSTANCE);
        MONTHS = createKeywordLookupElement("months", true, AddSpaceInsertHandler.INSTANCE);
        WEEKS = createKeywordLookupElement("weeks", true, AddSpaceInsertHandler.INSTANCE);
        DAYS = createKeywordLookupElement("days", true, AddSpaceInsertHandler.INSTANCE);
        HOURS = createKeywordLookupElement("hours", true, AddSpaceInsertHandler.INSTANCE);
        MINUTES = createKeywordLookupElement("minutes", true, AddSpaceInsertHandler.INSTANCE);
        SECONDS = createKeywordLookupElement("seconds", true, AddSpaceInsertHandler.INSTANCE);
        MILLISECONDS = createKeywordLookupElement("miliseconds", true, AddSpaceInsertHandler.INSTANCE);
        FALSE = createKeywordLookupElement("false", true, AddSpaceInsertHandler.INSTANCE);
        TRUE = createKeywordLookupElement("true", true, AddSpaceInsertHandler.INSTANCE);

        INT = createSimpleTypeLookupElement("int", true, AddSpaceInsertHandler.INSTANCE);
        LONG = createSimpleTypeLookupElement("long", true, AddSpaceInsertHandler.INSTANCE);
        FLOAT = createSimpleTypeLookupElement("float", true, AddSpaceInsertHandler.INSTANCE);
        DOUBLE = createSimpleTypeLookupElement("double", true, AddSpaceInsertHandler.INSTANCE);
        BOOL = createSimpleTypeLookupElement("bool", true, AddSpaceInsertHandler.INSTANCE);
        OBJECT = createSimpleTypeLookupElement("object", true, AddSpaceInsertHandler.INSTANCE);
    }

    private static LookupElementBuilder createLookupElement(String name, boolean withBoldness,
                                                            InsertHandler insertHandler) {
        return LookupElementBuilder.create(name).withBoldness(withBoldness).withInsertHandler(insertHandler);
    }

    private static LookupElementBuilder createKeywordLookupElement(String name, boolean withBoldness,
                                                                   InsertHandler insertHandler) {
        return createLookupElement(name, withBoldness, insertHandler).withTypeText("Keyword", true);
    }

    private static LookupElementBuilder createSimpleTypeLookupElement(String name, boolean withBoldness,
                                                                      InsertHandler insertHandler) {
        return createLookupElement(name, withBoldness, insertHandler).withTypeText("Simple Type", true);
    }

    public SiddhiQLCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        // The file will be loaded to memory and and will be edited. parameters.getOriginalFile()
                        // contains the original file. parameters.getPosition().getContainingFile() will return null
                        // because it only exists in the memory. So use parameters.getOriginalFile().getContainingFile()
                        // if you want to get the details like containing directory, etc.
                        addSuggestions(parameters, resultSet, parameters.getOriginalFile());
                    }
                }
        );
    }

    private void addSuggestions(CompletionParameters parameters, CompletionResultSet resultSet, PsiFile originalFile) {

        PsiElement element = parameters.getPosition();
        PsiElement parent = element.getParent();
        PsiElement parentPrevSibling = parent.getPrevSibling();
        PsiElement prevSibling = element.getPrevSibling();

//        System.out.println("addSuggestions");
//        System.out.println("parent: " + parent);

        // if the parent is a literal value node, no need to add lookup elements.
        if (parent instanceof PsiElement) {
            addAllKeywords(resultSet, 25);
        } else {
            return;
        }
    }

    private void addAllKeywords(CompletionResultSet resultSet, int priority) {
        resultSet.addElement(PrioritizedLookupElement.withPriority(STREAM, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(DEFINE, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(TABLE, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(FROM, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(PARTITION, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(WINDOW, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(SELECT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(GROUP, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(BY, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(HAVING, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(INSERT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(OVERWRITE, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(DELETE, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(UPDATE, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(RETURN, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(EVENTS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(INTO, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(OUTPUT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(EXPIRED, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(CURRENT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(SNAPSHOT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(FOR, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(RAW, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(OF, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(AS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(OR, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(AND, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(ON, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(IS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(NOT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(WITHIN, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(WITH, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(BEGIN, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(END, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(NULL, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(EVERY, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(LAST, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(ALL, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(FIRST, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(JOIN, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(INNER, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(OUTER, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(RIGHT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(LEFT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(FULL, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(UNIDIRECTIONAL, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(YEARS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(MONTHS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(WEEKS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(DAYS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(HOURS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(MINUTES, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(SECONDS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(MILLISECONDS, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(FALSE, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(TRUE, priority));
    }
}
