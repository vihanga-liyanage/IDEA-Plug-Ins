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

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import org.jetbrains.annotations.NotNull;
import org.wso2.siddhiql.plugins.idea.psi.SiddhiQLFile;

/**
 * Created by Vihanga Liyanage on 4/3/2017.
 */
public class SiddhiQLStructureViewModel extends StructureViewModelBase
        implements StructureViewModel.ElementInfoProvider {

    public SiddhiQLStructureViewModel(SiddhiQLFile root) {
        super(root, new SiddhiQLStructureViewRootElement(root));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return !isAlwaysShowsPlus(element);
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        Object value = element.getValue();
        return value instanceof SiddhiQLFile;
    }

    @NotNull
    @Override
    protected Class[] getSuitableClasses() {

        //Todo - add all suitable classes
        //        return new Class[] {FileRoot.class,
        //                LexerRuleSpecNode.class,
        //                ParserRuleSpecNode.class};
        return super.getSuitableClasses();
    }
}
