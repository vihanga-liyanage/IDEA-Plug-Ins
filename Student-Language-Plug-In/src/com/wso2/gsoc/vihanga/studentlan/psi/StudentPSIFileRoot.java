package com.wso2.gsoc.vihanga.studentlan.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.wso2.gsoc.vihanga.studentlan.StudentFileType;
import com.wso2.gsoc.vihanga.studentlan.StudentIcons;
import com.wso2.gsoc.vihanga.studentlan.StudentLanguage;
import org.antlr.jetbrains.adaptor.SymtabUtils;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class StudentPSIFileRoot extends PsiFileBase {
    public StudentPSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, StudentLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return StudentFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Sample Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return StudentIcons.FILE;
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@NotNull
	@Override
	public PsiElement[] getChildren() {
		return super.getChildren();
	}
}
