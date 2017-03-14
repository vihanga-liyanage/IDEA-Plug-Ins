package com.wso2.gsoc.vihanga.datetimelan.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeFileType;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DatetimeFile extends PsiFileBase {
  public DatetimeFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, DatetimeLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return DatetimeFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "Simple File";
  }

  @Override
  public Icon getIcon(int flags) {
    return super.getIcon(flags);
  }
}