/*
 * generated by Xtext 2.9.2
 */
package org.wso2.vihanga.example.student.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class StudentFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(StudentFileType.INSTANCE, AbstractStudentFileType.DEFAULT_EXTENSION);
	}

}
