package com.wso2.gsoc.vihanga.studentlan.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import com.wso2.gsoc.vihanga.studentlan.StudentLanguage;
import com.wso2.gsoc.vihanga.studentlan.grammar.StudentLexer;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.antlr.jetbrains.adaptor.psi.Trees;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StudentPSIRefNode extends LeafPsiElement implements PsiNamedElement {
	protected String name = null; // an override to input text ID if we rename via intellij

	public StudentPSIRefNode(IElementType type, CharSequence text) {
		super(type, text);
	}

	@Override
	public String getName() {
		if ( name!=null ) return name;
		return getText();
	}

	@Override
	public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
		/*
		From doc: "Creating a fully correct AST node from scratch is
		          quite difficult. Thus, surprisingly, the easiest way to
		          get the replacement node is to create a dummy file in the
		          custom language so that it would contain the necessary
		          node in its parse tree, build the parse tree and
		          extract the necessary node from it.
		 */
		System.out.println("rename "+this+" to "+name);
		List<TokenIElementType> tokenIElementTypes =
			PSIElementTypeFactory.getTokenIElementTypes(StudentLanguage.INSTANCE);
		PsiElement newNode = Trees.createLeafFromText(getProject(),
				StudentLanguage.INSTANCE,
		                                              getContext(),
		                                              name, tokenIElementTypes.get(StudentLexer.ID));
		if ( newNode!=null ) {
			this.replace(newNode);
			this.name = name;
			return this;
		}
		throw new IncorrectOperationException();
	}
}
