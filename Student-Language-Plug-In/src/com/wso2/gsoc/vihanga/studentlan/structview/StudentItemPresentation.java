package com.wso2.gsoc.vihanga.studentlan.structview;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.wso2.gsoc.vihanga.studentlan.StudentIcons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class StudentItemPresentation implements ItemPresentation {
	protected final PsiElement element;

	protected StudentItemPresentation(PsiElement element) {
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
		ASTNode node = element.getNode();
		return node.getText();
	}

	@Nullable
	@Override
	public String getLocationString() {
		return null;
	}
}
