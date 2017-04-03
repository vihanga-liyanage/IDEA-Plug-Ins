
package com.wso2.gsoc.vihanga.datetimelan.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.DumbAware;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import com.wso2.gsoc.vihanga.datetimelan.psi.DateNode;
import com.wso2.gsoc.vihanga.datetimelan.psi.DayNode;
import org.jetbrains.annotations.NotNull;

import static com.wso2.gsoc.vihanga.datetimelan.completion.DatetimeCompletionUtil.CONTEXT_KEYWORD_PRIORITY;

public class DatetimeCompletionContributor extends CompletionContributor implements DumbAware {

    // Week days
    private static final LookupElementBuilder MON;
    private static final LookupElementBuilder TUE;
    private static final LookupElementBuilder WED;
    private static final LookupElementBuilder THU;
    private static final LookupElementBuilder FRI;
    private static final LookupElementBuilder SAT;
    private static final LookupElementBuilder SUN;

    // Months
    private static final LookupElementBuilder JAN;
    private static final LookupElementBuilder FEB;
    private static final LookupElementBuilder MAR;
    private static final LookupElementBuilder APR;
    private static final LookupElementBuilder MAY;
    private static final LookupElementBuilder JUN;
    private static final LookupElementBuilder JUL;
    private static final LookupElementBuilder AUG;
    private static final LookupElementBuilder SEP;
    private static final LookupElementBuilder OCT;
    private static final LookupElementBuilder NOV;
    private static final LookupElementBuilder DEC;

    static {
        MON = createKeywordLookupElement("Mon", true, AddSpaceInsertHandler.INSTANCE);
        TUE = createKeywordLookupElement("Tue", true, AddSpaceInsertHandler.INSTANCE);
        WED = createKeywordLookupElement("Wed", true, AddSpaceInsertHandler.INSTANCE);
        THU = createKeywordLookupElement("Thu", true, AddSpaceInsertHandler.INSTANCE);
        FRI = createKeywordLookupElement("Fri", true, AddSpaceInsertHandler.INSTANCE);
        SAT = createKeywordLookupElement("Sat", true, AddSpaceInsertHandler.INSTANCE);
        SUN = createKeywordLookupElement("Sun", true, AddSpaceInsertHandler.INSTANCE);

        JAN = createKeywordLookupElement("Jan", true, AddSpaceInsertHandler.INSTANCE);
        FEB = createKeywordLookupElement("Feb", true, AddSpaceInsertHandler.INSTANCE);
        MAR = createKeywordLookupElement("Mar", true, AddSpaceInsertHandler.INSTANCE);
        APR = createKeywordLookupElement("Apr", true, AddSpaceInsertHandler.INSTANCE);
        MAY = createKeywordLookupElement("May", true, AddSpaceInsertHandler.INSTANCE);
        JUN = createKeywordLookupElement("Jun", true, AddSpaceInsertHandler.INSTANCE);
        JUL = createKeywordLookupElement("Jul", true, AddSpaceInsertHandler.INSTANCE);
        AUG = createKeywordLookupElement("Aug", true, AddSpaceInsertHandler.INSTANCE);
        SEP = createKeywordLookupElement("Sep", true, AddSpaceInsertHandler.INSTANCE);
        OCT = createKeywordLookupElement("Oct", true, AddSpaceInsertHandler.INSTANCE);
        NOV = createKeywordLookupElement("Nov", true, AddSpaceInsertHandler.INSTANCE);
        DEC = createKeywordLookupElement("Dec", true, AddSpaceInsertHandler.INSTANCE);
    }

    private static LookupElementBuilder createLookupElement(String name, boolean withBoldness,
                                                            InsertHandler insertHandler) {
        return LookupElementBuilder.create(name).withBoldness(withBoldness).withInsertHandler(insertHandler);
    }

    private static LookupElementBuilder createKeywordLookupElement(String name, boolean withBoldness,
                                                                   InsertHandler insertHandler) {
        return createLookupElement(name, withBoldness, insertHandler).withTypeText("Keyword", true);
    }

//    private static LookupElementBuilder createSimpleTypeLookupElement(String name, boolean withBoldness,
//                                                                      InsertHandler insertHandler) {
//        return createLookupElement(name, withBoldness, insertHandler).withTypeText("Simple Type", true);
//    }
//
//    private static LookupElementBuilder createReferenceTypeLookupElement(String name, boolean withBoldness,
//                                                                         InsertHandler insertHandler) {
//        return createLookupElement(name, withBoldness, insertHandler).withTypeText("Reference Type", true);
//    }

    public DatetimeCompletionContributor() {
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
        System.out.println("parents: " + parent + " - " + parent.getParent() + " - " + parent.getParent().getParent() + " - " + parent.getParent().getParent().getParent());
        System.out.println("==============");
        if (parent instanceof DayNode) {
            System.out.printf("Day");
        }
        if (parent.getParent().getParent() instanceof DateNode) {
            addDays(resultSet, CONTEXT_KEYWORD_PRIORITY);
        } else {
            return;
        }
    }

    private void addDays(CompletionResultSet resultSet, int priority) {
        resultSet.addElement(MON);
        resultSet.addElement(TUE);
        resultSet.addElement(WED);
        resultSet.addElement(THU);
        resultSet.addElement(FRI);
        resultSet.addElement(SAT);
        resultSet.addElement(SUN);
//        resultSet.addElement(PrioritizedLookupElement.withPriority(MON, priority));
//        resultSet.addElement(PrioritizedLookupElement.withPriority(TUE, priority));
//        resultSet.addElement(PrioritizedLookupElement.withPriority(WED, priority));
//        resultSet.addElement(PrioritizedLookupElement.withPriority(THU, priority));
//        resultSet.addElement(PrioritizedLookupElement.withPriority(FRI, priority));
//        resultSet.addElement(PrioritizedLookupElement.withPriority(SAT, priority));
//        resultSet.addElement(PrioritizedLookupElement.withPriority(SUN, priority));
    }

    private void addMonths(CompletionResultSet resultSet, int priority) {
        resultSet.addElement(PrioritizedLookupElement.withPriority(JAN, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(FEB, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(MAR, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(APR, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(MAY, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(JUN, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(JUL, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(AUG, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(SEP, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(OCT, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(NOV, priority));
        resultSet.addElement(PrioritizedLookupElement.withPriority(DEC, priority));
    }

    @Override
    public boolean invokeAutoPopup(@NotNull PsiElement position, char typeChar) {
        return typeChar == ':' || typeChar == '@';
    }

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        super.fillCompletionVariants(parameters, result);
    }
}
