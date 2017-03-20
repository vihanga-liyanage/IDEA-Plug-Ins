package com.wso2.gsoc.vihanga.datetimelan.structview;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeIcons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DatetimeItemPresentation implements ItemPresentation {
	protected final PsiElement element;

	protected DatetimeItemPresentation(PsiElement element) {
		this.element = element;
	}

	@Nullable
	@Override
	public Icon getIcon(boolean unused) {
		return DatetimeIcons.FILE;
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
