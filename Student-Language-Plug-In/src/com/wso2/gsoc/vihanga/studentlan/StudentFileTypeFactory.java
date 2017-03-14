package com.wso2.gsoc.vihanga.studentlan;

/**
 * Created by vihanga on 3/9/17.
 */

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class StudentFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(StudentFileType.INSTANCE, "student");
    }
}
