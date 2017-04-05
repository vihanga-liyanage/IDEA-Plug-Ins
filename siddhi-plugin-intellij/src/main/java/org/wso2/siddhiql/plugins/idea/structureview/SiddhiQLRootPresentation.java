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

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;
import org.wso2.siddhiql.plugins.idea.SiddhiQLIcons;

import javax.swing.*;

/**
 * Created by Vihanga Liyanage on 4/3/2017.
 */
public class SiddhiQLRootPresentation implements ItemPresentation {

    protected final PsiFile element;

    protected SiddhiQLRootPresentation(PsiFile element) {
        this.element = element;
    }

    @Nullable
    @Override
    public Icon getIcon(boolean unused) {
        return SiddhiQLIcons.ICON;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        return element.getVirtualFile().getNameWithoutExtension();
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;
    }
}
