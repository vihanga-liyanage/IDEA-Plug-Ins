package com.wso2.gsoc.vihanga.datetimelan.structview;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.wso2.gsoc.vihanga.datetimelan.psi.DatetimePSIFileRoot;
import org.jetbrains.annotations.NotNull;

public class DatetimeStructureViewModel
	extends StructureViewModelBase
	implements StructureViewModel.ElementInfoProvider
{
	public DatetimeStructureViewModel(DatetimePSIFileRoot root) {
		super(root, new DatetimeStructureViewRootElement(root));
	}

	@NotNull
	public Sorter[] getSorters() {
		return new Sorter[] {Sorter.ALPHA_SORTER};
	}

	@Override
	public boolean isAlwaysLeaf(StructureViewTreeElement element) {
  		return !isAlwaysShowsPlus(element);
	}

	@Override
	public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
		Object value = element.getValue();
  		return value instanceof DatetimePSIFileRoot;
	}
}
