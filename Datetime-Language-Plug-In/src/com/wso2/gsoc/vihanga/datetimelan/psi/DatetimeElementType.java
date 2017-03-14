package com.wso2.gsoc.vihanga.datetimelan.psi;

import com.intellij.psi.tree.IElementType;
import com.wso2.gsoc.vihanga.datetimelan.DatetimeLanguage;
import org.jetbrains.annotations.*;

/**
 * Created by Vihanga Liyanage on 3/13/2017.
 */

public class DatetimeElementType extends IElementType {
    public DatetimeElementType(@NotNull @NonNls String debugName) {
        super(debugName, DatetimeLanguage.INSTANCE);
    }
}