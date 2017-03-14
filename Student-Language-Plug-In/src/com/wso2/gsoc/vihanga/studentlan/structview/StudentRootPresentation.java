package com.wso2.gsoc.vihanga.studentlan.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import com.wso2.gsoc.vihanga.studentlan.StudentIcons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class StudentRootPresentation implements ItemPresentation {
	protected final PsiFile element;

	protected StudentRootPresentation(PsiFile element) {
		this.element = element;
	}

	@Nullable
	@Override
	public Icon getIcon(boolean unused) {
		return StudentIcons.FILE;
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
