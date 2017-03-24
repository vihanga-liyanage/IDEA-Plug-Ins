package com.wso2.gsoc.vihanga.datetimelan.psi;

import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class TimeNode extends ANTLRPsiNode {

    public TimeNode(@NotNull ASTNode node) {
        super(node);
    }
}
