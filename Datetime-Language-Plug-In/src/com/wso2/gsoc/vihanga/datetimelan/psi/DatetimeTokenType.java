package com.wso2.gsoc.vihanga.datetimelan.psi;

import com.intellij.psi.tree.IElementType;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeLanguage;
import org.jetbrains.annotations.*;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */

public class DatetimeTokenType extends IElementType {
    public DatetimeTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DatetimeLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "DatetimeTokenType." + super.toString();
    }
}