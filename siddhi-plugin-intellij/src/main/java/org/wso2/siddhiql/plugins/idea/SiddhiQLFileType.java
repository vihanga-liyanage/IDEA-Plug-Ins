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

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */
public class SiddhiQLFileType extends LanguageFileType {
  public static final SiddhiQLFileType INSTANCE = new SiddhiQLFileType();

  private SiddhiQLFileType() {
    super(SiddhiQLLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "SiddhiQL file";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "SiddhiQL language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "siddhiql";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return SiddhiQLIcons.ICON;
  }
}