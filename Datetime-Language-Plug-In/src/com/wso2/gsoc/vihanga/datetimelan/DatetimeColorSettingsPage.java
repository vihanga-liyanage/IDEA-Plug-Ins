package com.wso2.gsoc.vihanga.datetimelan;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class DatetimeColorSettingsPage implements ColorSettingsPage {
	private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
//		new AttributesDescriptor("Identifier", DatetimeSyntaxHighlighter.ID),
		new AttributesDescriptor("Keyword", DatetimeSyntaxHighlighter.KEYWORD),
//		new AttributesDescriptor("String", SampleSyntaxHighlighter.STRING),
		new AttributesDescriptor("Line comment", DatetimeSyntaxHighlighter.LINE_COMMENT),
		new AttributesDescriptor("Block comment", DatetimeSyntaxHighlighter.BLOCK_COMMENT),
	};

	@Nullable
	@Override
	public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return null;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return DatetimeIcons.FILE;
	}

	@NotNull
	@Override
	public SyntaxHighlighter getHighlighter() {
		return new DatetimeSyntaxHighlighter();
	}

	@NotNull
	@Override
	public String getDemoText() {
		return
			"/* block comment */\n"+
			"Mon, 02 Oct 99 15:00:00 +0200\n"+
			"// line comment\n" +
			"Sun, 05 Nov 23 12:34:34 GMT";
	}

	@NotNull
	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		return DESCRIPTORS;
	}

	@NotNull
	@Override
	public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "Datetime";
	}
}
