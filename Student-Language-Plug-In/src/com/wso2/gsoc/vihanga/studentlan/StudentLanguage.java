package com.wso2.gsoc.vihanga.studentlan;

/**
 * Created by vihanga on 3/9/17.
 */

import com.intellij.lang.Language;

public class StudentLanguage extends Language{
    public static final StudentLanguage INSTANCE = new StudentLanguage();

    private StudentLanguage() {
        super("Student");
    }
}
