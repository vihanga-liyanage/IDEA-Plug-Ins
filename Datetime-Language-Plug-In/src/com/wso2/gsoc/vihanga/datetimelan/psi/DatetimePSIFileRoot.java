package com.wso2.gsoc.vihanga.datetimelan.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeFileType;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeIcons;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeLanguage;
import org.antlr.jetbrains.adaptor.SymtabUtils;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DatetimePSIFileRoot extends PsiFileBase implements ScopeNode {
    public DatetimePSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DatetimeLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DatetimeFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Datetime Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return DatetimeIcons.FILE;
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}

	@Nullable
	@Override
	public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");
//		if ( element.getParent() instanceof CallSubtree ) {
//			return SymtabUtils.resolve(this, SampleLanguage.INSTANCE,
//			                           element, "/script/function/ID");
//		}
//		return SymtabUtils.resolve(this, SampleLanguage.INSTANCE,
//		                           element, "/script/vardef/ID");
		return null;
	}
}
