/*
 * generated by Xtext 2.9.2
 */
package org.wso2.vihanga.example.student.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractStudentValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.wso2.vihanga.example.student.student.StudentPackage.eINSTANCE);
		return result;
	}
	
}
