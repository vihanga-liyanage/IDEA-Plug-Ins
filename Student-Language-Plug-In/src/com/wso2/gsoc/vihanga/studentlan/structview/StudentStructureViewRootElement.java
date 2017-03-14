package com.wso2.gsoc.vihanga.studentlan.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class StudentStructureViewRootElement extends StudentStructureViewElement {
	public StudentStructureViewRootElement(PsiFile element) {
		super(element);
	}

	@NotNull
	@Override
	public ItemPresentation getPresentation() {
		return new StudentRootPresentation((PsiFile)element);
	}
}
