package com.wso2.gsoc.vihanga.datetimelan;

import com.intellij.lang.ASTNode;
import com.intellij.lang.FileASTNode;
import com.intellij.lang.Language;
import com.intellij.psi.PsiElement;
import com.intellij.testFramework.ParsingTestCase;
import org.antlr.jetbrains.adaptor.xpath.XPath;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by Vihanga Liyanage on 3/23/2017.
 */
public class DatetimeTest extends ParsingTestCase{
    public DatetimeTest() {
        super("", "Datetime", new DatetimeParserDefinition());
    }

    public void testSingleVarDef() throws Exception {
//        String code = "Mon, 12 Sep 17 12:55 GMT";
//        String output = code;
//        String xpath = "/script/statement";
//        checkXPathResults(code, xpath, output);
    }


    // S U P P O R T

    protected void checkXPathResults(String code, String xpath, String allNodesText) throws IOException {
        checkXPathResults(DatetimeLanguage.INSTANCE, code, xpath, allNodesText);
    }

    protected void checkXPathResults(Language language, String code, String xpath, String allNodesText) throws IOException {
        myFile = createPsiFile("a", code);
        ensureParsed(myFile);
        assertEquals(code, myFile.getText());
        ASTNode node = myFile.getNode().getFirstChildNode().getFirstChildNode();
//        node.

        Collection<? extends PsiElement> nodes = XPath.findAll(language, myFile, xpath);
        System.out.println(nodes);
        StringBuilder buf = new StringBuilder();
        for (PsiElement t : nodes) {
            buf.append(t.getText());
            buf.append("\n");
        }
//        assertEquals(allNodesText.trim(), buf.toString().trim());
    }
}
