package com.wso2.gsoc.vihanga.datetimelan.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeIcons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DatetimeRootPresentation implements ItemPresentation {
	protected final PsiFile element;

	protected DatetimeRootPresentation(PsiFile element) {
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
		return element.getVirtualFile().getNameWithoutExtension();
	}

	@Nullable
	@Override
	public String getLocationString() {
		return null;
	}
}
