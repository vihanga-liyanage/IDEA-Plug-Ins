package com.wso2.gsoc.vihanga.datetimelan.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class DatetimeStructureViewRootElement extends DatetimeStructureViewElement {
	public DatetimeStructureViewRootElement(PsiFile element) {
		super(element);
	}

	@NotNull
	@Override
	public ItemPresentation getPresentation() {
		return new DatetimeRootPresentation((PsiFile)element);
	}
}
