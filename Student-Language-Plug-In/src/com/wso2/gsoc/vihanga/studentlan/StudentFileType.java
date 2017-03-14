package com.wso2.gsoc.vihanga.studentlan;

/**
 * Created by vihanga on 3/9/17.
 */

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class StudentFileType extends LanguageFileType {
    public static final StudentFileType INSTANCE = new StudentFileType();

    private StudentFileType() {
        super(StudentLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Student file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Student language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "Student";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return StudentIcons.FILE;
    }
}