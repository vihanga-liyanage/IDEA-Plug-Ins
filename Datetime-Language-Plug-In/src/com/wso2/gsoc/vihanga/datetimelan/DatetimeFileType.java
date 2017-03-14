package com.wso2.gsoc.vihanga.datetimelan;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DatetimeFileType extends LanguageFileType {
  public static final DatetimeFileType INSTANCE = new DatetimeFileType();

  private DatetimeFileType() {
    super(DatetimeLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Datetime file";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Datetime language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "datetime";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return DatetimeIcons.FILE;
  }
}