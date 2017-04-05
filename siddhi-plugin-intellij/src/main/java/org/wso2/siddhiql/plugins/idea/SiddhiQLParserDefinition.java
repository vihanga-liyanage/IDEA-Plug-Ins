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
import org.wso2.siddhiql.plugins.idea.psi.*;

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

        switch (ruleElType.getRuleIndex()) {
            case SiddhiQLParser.RULE_error:
                return new ErrorNode(node);
            case SiddhiQLParser.RULE_execution_plan:
                return new ExecutionPlanNode(node);
            case SiddhiQLParser.RULE_execution_element:
                return new ExecutionElementNode(node);
            case SiddhiQLParser.RULE_definition_stream_final:
                return new DefinitionStreamFinalNode(node);
            case SiddhiQLParser.RULE_definition_stream:
                return new DefinitionStreamNode(node);
            case SiddhiQLParser.RULE_definition_table_final:
                return new DefinitionTableFinalNode(node);
            case SiddhiQLParser.RULE_definition_table:
                return new DefinitionTableNode(node);
            case SiddhiQLParser.RULE_definition_window_final:
                return new DefinitionWindowFinalNode(node);
            case SiddhiQLParser.RULE_definition_window:
                return new DefinitionWindowNode(node);
            case SiddhiQLParser.RULE_definition_function_final:
                return new DefinitionFunctionFinalNode(node);
            case SiddhiQLParser.RULE_definition_function:
                return new DefinitionFunctionNode(node);
            case SiddhiQLParser.RULE_function_name:
                return new FunctionNameNode(node);
            case SiddhiQLParser.RULE_language_name:
                return new LanguageNameNode(node);
            case SiddhiQLParser.RULE_function_body:
                return new FunctionBodyNode(node);
            case SiddhiQLParser.RULE_definition_trigger_final:
                return new DefinitionTriggerFinalNode(node);
            case SiddhiQLParser.RULE_definition_trigger:
                return new DefinitionTriggerNode(node);
            case SiddhiQLParser.RULE_trigger_name:
                return new TriggerNameNode(node);
            case SiddhiQLParser.RULE_annotation:
                return new AnnotationNode(node);
            case SiddhiQLParser.RULE_plan_annotation:
                return new PlanAnnotationNode(node);
            case SiddhiQLParser.RULE_annotation_element:
                return new AnnotationElementNode(node);
            case SiddhiQLParser.RULE_partition:
                return new PartitionNode(node);
            case SiddhiQLParser.RULE_partition_final:
                return new PartitionFinalNode(node);
            case SiddhiQLParser.RULE_partition_with_stream:
                return new PartitionWithStreamNode(node);
            case SiddhiQLParser.RULE_condition_ranges:
                return new ConditionRangesNode(node);
            case SiddhiQLParser.RULE_condition_range:
                return new ConditionRangeNode(node);
            case SiddhiQLParser.RULE_query_final:
                return new QueryFinalNode(node);
            case SiddhiQLParser.RULE_query:
                return new QueryNode(node);
            case SiddhiQLParser.RULE_query_input:
                return new QueryInputNode(node);
            case SiddhiQLParser.RULE_standard_stream:
                return new StandardStreamNode(node);
            case SiddhiQLParser.RULE_join_stream:
                return new JoinStreamNode(node);
            case SiddhiQLParser.RULE_join_source:
                return new JoinSourceNode(node);
            case SiddhiQLParser.RULE_pattern_stream:
                return new PatternStreamNode(node);
            case SiddhiQLParser.RULE_every_pattern_source_chain:
                return new  EveryPatternSourceChainNode(node);
            case SiddhiQLParser.RULE_pattern_source_chain:
                return new PatternSourceChainNode(node);
            case SiddhiQLParser.RULE_pattern_source:
                return new PatternSourceNode(node);
            case SiddhiQLParser.RULE_logical_stateful_source:
                return new LogicalStatefulSourceNode(node);
            case SiddhiQLParser.RULE_pattern_collection_stateful_source:
                return new PatternCollectionStatefulSourceNode(node);
            case SiddhiQLParser.RULE_standard_stateful_source:
                return new StandardStatefulSourceNode(node);
            case SiddhiQLParser.RULE_basic_source:
                return new BasicSourceNode(node);
            case SiddhiQLParser.RULE_basic_source_stream_handlers:
                return new  BasicSourceStreamHandlersNode(node);
            case SiddhiQLParser.RULE_basic_source_stream_handler:
                return new BasicSourceStreamHandlerNode(node);
            case SiddhiQLParser.RULE_sequence_stream:
                return new SequenceStreamNode(node);
            case SiddhiQLParser.RULE_sequence_source_chain:
                return new SequenceSourceChainNode(node);
            case SiddhiQLParser.RULE_sequence_source:
                return new SequenceSourceNode(node);
            case SiddhiQLParser.RULE_sequence_collection_stateful_source:
                return new SequenceCollectionStatefulSourceNode(node);
            case SiddhiQLParser.RULE_anonymous_stream:
                return new AnonymousStreamNode(node);
            case SiddhiQLParser.RULE_filter:
                return new FilterNode(node);
            case SiddhiQLParser.RULE_stream_function:
                return new StreamFunctionNode(node);
            case SiddhiQLParser.RULE_window:
                return new WindowNode(node);
            case SiddhiQLParser.RULE_query_section:
                return new QuerySectionNode(node);
            case SiddhiQLParser.RULE_group_by:
                return new GroupByNode(node);
            case SiddhiQLParser.RULE_having:
                return new HavingNode(node);
            case SiddhiQLParser.RULE_query_output:
                return new QueryOutputNode(node);
            case SiddhiQLParser.RULE_output_event_type:
                return new OutputEventTypeNode(node);
            case SiddhiQLParser.RULE_output_rate:
                return new OutputRateNode(node);
            case SiddhiQLParser.RULE_output_rate_type:
                return new OutputRateTypeNode(node);
            case SiddhiQLParser.RULE_within_time:
                return new WithinTimeNode(node);
            case SiddhiQLParser.RULE_output_attribute:
                return new OutputAttributeNode(node);
            case SiddhiQLParser.RULE_attribute:
                return new AttributeNode(node);
            case SiddhiQLParser.RULE_expression:
                return new ExpressionNode(node);
            case SiddhiQLParser.RULE_math_operation:
                return new MathOperationNode(node);
            case SiddhiQLParser.RULE_function_operation:
                return new FunctionOperationNode(node);
            case SiddhiQLParser.RULE_attribute_list:
                return new AttributeListNode(node);
            case SiddhiQLParser.RULE_null_check:
                return new NullCheckNode(node);
            case SiddhiQLParser.RULE_stream_reference:
                return new StreamReferenceNode(node);
            case SiddhiQLParser.RULE_attribute_reference:
                return new AttributeReferenceNode(node);
            case SiddhiQLParser.RULE_attribute_index:
                return new AttributeIndexNode(node);
            case SiddhiQLParser.RULE_function_id:
                return new FunctionIdNode(node);
            case SiddhiQLParser.RULE_function_namespace:
                return new FunctionNamespaceNode(node);
            case SiddhiQLParser.RULE_stream_id:
                return new StreamIdNode(node);
            case SiddhiQLParser.RULE_stream_alias:
                return new StreamAliasNode(node);
            case SiddhiQLParser.RULE_property_name:
                return new PropertyNameNode(node);
            case SiddhiQLParser.RULE_attribute_name:
                return new AttributeNameNode(node);
            case SiddhiQLParser.RULE_type:
                return new TypeNode(node);
            case SiddhiQLParser.RULE_property_value:
                return new PropertyValueNode(node);
            case SiddhiQLParser.RULE_property_separator:
                return new PropertySeparatorNode(node);
            case SiddhiQLParser.RULE_source:
                return new SourceNode(node);
            case SiddhiQLParser.RULE_target:
                return new TargetNode(node);
            case SiddhiQLParser.RULE_event:
                return new EventNode(node);
            case SiddhiQLParser.RULE_name:
                return new NameNode(node);
            case SiddhiQLParser.RULE_collect:
                return new CollectNode(node);
            case SiddhiQLParser.RULE_attribute_type:
                return new AttributeTypeNode(node);
            case SiddhiQLParser.RULE_join:
                return new JoinNode(node);
            case SiddhiQLParser.RULE_constant_value:
                return new ConstantValueNode(node);
            case SiddhiQLParser.RULE_id:
                return new IdNode(node);
            case SiddhiQLParser.RULE_keyword:
                return new KeywordNode(node);
            case SiddhiQLParser.RULE_time_value:
                return new TimeValueNode(node);
            case SiddhiQLParser.RULE_year_value:
                return new YearValueNode(node);
            case SiddhiQLParser.RULE_month_value:
                return new MonthValueNode(node);
            case SiddhiQLParser.RULE_week_value:
                return new WeekValueNode(node);
            case SiddhiQLParser.RULE_day_value:
                return new DayValueNode(node);
            case SiddhiQLParser.RULE_hour_value:
                return new HourValueNode(node);
            case SiddhiQLParser.RULE_minute_value:
                return new MinuteValueNode(node);
            case SiddhiQLParser.RULE_second_value:
                return new SecondValueNode(node);
            case SiddhiQLParser.RULE_millisecond_value:
                return new MillisecondValueNode(node);
            case SiddhiQLParser.RULE_signed_double_value:
                return new SignedDoubleValueNode(node);
            case SiddhiQLParser.RULE_signed_long_value:
                return new SsignedLongValueNode(node);
            case SiddhiQLParser.RULE_signed_float_value:
                return new SignedFloatValueNode(node);
            case SiddhiQLParser.RULE_signed_int_value:
                return new SignedIntValueNode(node);
            case SiddhiQLParser.RULE_bool_value:
                return new BoolValueNode(node);
            case SiddhiQLParser.RULE_string_value:
                return new StringValueNode(node);
            default:
                return new ANTLRPsiNode(node);
        }
    }
}