package com.wso2.gsoc.vihanga.datetimelan;

import com.intellij.lang.Language;

public class DatetimeLanguage extends Language {
  public static final DatetimeLanguage INSTANCE = new DatetimeLanguage();

  private DatetimeLanguage() {
    super("Datetime");
  }
}