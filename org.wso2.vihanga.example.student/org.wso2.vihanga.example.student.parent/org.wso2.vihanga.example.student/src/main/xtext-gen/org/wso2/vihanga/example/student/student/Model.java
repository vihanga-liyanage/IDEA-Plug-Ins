/**
 * generated by Xtext 2.9.2
 */
package org.wso2.vihanga.example.student.student;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.vihanga.example.student.student.Model#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see org.wso2.vihanga.example.student.student.StudentPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Students</b></em>' containment reference list.
   * The list contents are of type {@link org.wso2.vihanga.example.student.student.Student}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Students</em>' containment reference list.
   * @see org.wso2.vihanga.example.student.student.StudentPackage#getModel_Students()
   * @model containment="true"
   * @generated
   */
  EList<Student> getStudents();

} // Model
