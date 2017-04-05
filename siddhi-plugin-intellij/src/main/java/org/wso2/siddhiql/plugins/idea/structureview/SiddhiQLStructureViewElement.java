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

package org.wso2.siddhiql.plugins.idea.structureview;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.jetbrains.adaptor.xpath.XPath;
import org.jetbrains.annotations.NotNull;
import org.wso2.siddhiql.plugins.idea.SiddhiQLLanguage;
import org.wso2.siddhiql.plugins.idea.psi.SiddhiQLFile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Vihanga Liyanage on 4/3/2017.
 */
public class SiddhiQLStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
    protected final PsiElement element;

    public SiddhiQLStructureViewElement(PsiElement element) {
        this.element = element;
    }

    @Override
    public Object getValue() {
        return element;
    }

    @Override
    public void navigate(boolean requestFocus) {
        if (element instanceof NavigationItem) {
            ((NavigationItem) element).navigate(requestFocus);
        }
    }

    @Override
    public boolean canNavigate() {
        return element instanceof NavigationItem && ((NavigationItem) element).canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element instanceof NavigationItem && ((NavigationItem) element).canNavigateToSource();
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        String s = element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null;
        if (s == null) {
            return "unknown key";
        }
        return s;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new SiddhiQLItemPresentation(element);
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        //Todo - Add more children types
        if (element instanceof SiddhiQLFile) {
            List<TreeElement> treeElements = new ArrayList<>();

            Collection<? extends PsiElement> services = XPath.findAll(SiddhiQLLanguage.INSTANCE, element,
                    "/compilationUnit/serviceDefinition/Identifier");
            for (PsiElement el : services) {
                treeElements.add(new SiddhiQLStructureViewElement(el));
            }

            Collection<? extends PsiElement> functions = XPath.findAll(SiddhiQLLanguage.INSTANCE, element,
                    "/compilationUnit/functionDefinition/Identifier");
            for (PsiElement el : functions) {
                treeElements.add(new SiddhiQLStructureViewElement(el));
            }

            Collection<? extends PsiElement> nativeFunctions = XPath.findAll(SiddhiQLLanguage.INSTANCE, element,
                    "/compilationUnit/nativeFunctionDefinition/Identifier");
            for (PsiElement el : nativeFunctions) {
                treeElements.add(new SiddhiQLStructureViewElement(el));
            }

            Collection<? extends PsiElement> connectors = XPath.findAll(SiddhiQLLanguage.INSTANCE, element,
                    "/compilationUnit/connectorDefinition/Identifier");
            for (PsiElement el : connectors) {
                treeElements.add(new SiddhiQLStructureViewElement(el));
            }

            Collection<? extends PsiElement> typeConverters = XPath.findAll(SiddhiQLLanguage.INSTANCE, element,
                    "/compilationUnit/typeConvertorDefinition/Identifier");
            for (PsiElement el : typeConverters) {
                treeElements.add(new SiddhiQLStructureViewElement(el));
            }

            return treeElements.toArray(new TreeElement[functions.size()]);
        }
        return new TreeElement[0];
    }
}
