/**
 * generated by Xtext 2.9.2
 */
package org.wso2.vihanga.example.student.student;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wso2.vihanga.example.student.student.StudentFactory
 * @model kind="package"
 * @generated
 */
public interface StudentPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "student";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.wso2.org/vihanga/example/student/Student";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "student";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StudentPackage eINSTANCE = org.wso2.vihanga.example.student.student.impl.StudentPackageImpl.init();

  /**
   * The meta object id for the '{@link org.wso2.vihanga.example.student.student.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.wso2.vihanga.example.student.student.impl.ModelImpl
   * @see org.wso2.vihanga.example.student.student.impl.StudentPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Students</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STUDENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.wso2.vihanga.example.student.student.impl.StudentImpl <em>Student</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.wso2.vihanga.example.student.student.impl.StudentImpl
   * @see org.wso2.vihanga.example.student.student.impl.StudentPackageImpl#getStudent()
   * @generated
   */
  int STUDENT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__AGE = 2;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__ADDRESS = 3;

  /**
   * The number of structural features of the '<em>Student</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.wso2.vihanga.example.student.student.impl.AddressImpl <em>Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.wso2.vihanga.example.student.student.impl.AddressImpl
   * @see org.wso2.vihanga.example.student.student.impl.StudentPackageImpl#getAddress()
   * @generated
   */
  int ADDRESS = 2;

  /**
   * The feature id for the '<em><b>Street Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__STREET_ADDRESS = 0;

  /**
   * The feature id for the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__CITY = 1;

  /**
   * The feature id for the '<em><b>Postal Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__POSTAL_CODE = 2;

  /**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.wso2.vihanga.example.student.student.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.wso2.vihanga.example.student.student.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.wso2.vihanga.example.student.student.Model#getStudents <em>Students</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Students</em>'.
   * @see org.wso2.vihanga.example.student.student.Model#getStudents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Students();

  /**
   * Returns the meta object for class '{@link org.wso2.vihanga.example.student.student.Student <em>Student</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Student</em>'.
   * @see org.wso2.vihanga.example.student.student.Student
   * @generated
   */
  EClass getStudent();

  /**
   * Returns the meta object for the attribute '{@link org.wso2.vihanga.example.student.student.Student#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.wso2.vihanga.example.student.student.Student#getId()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Id();

  /**
   * Returns the meta object for the attribute '{@link org.wso2.vihanga.example.student.student.Student#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.wso2.vihanga.example.student.student.Student#getName()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.wso2.vihanga.example.student.student.Student#getAge <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age</em>'.
   * @see org.wso2.vihanga.example.student.student.Student#getAge()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Age();

  /**
   * Returns the meta object for the containment reference '{@link org.wso2.vihanga.example.student.student.Student#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see org.wso2.vihanga.example.student.student.Student#getAddress()
   * @see #getStudent()
   * @generated
   */
  EReference getStudent_Address();

  /**
   * Returns the meta object for class '{@link org.wso2.vihanga.example.student.student.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see org.wso2.vihanga.example.student.student.Address
   * @generated
   */
  EClass getAddress();

  /**
   * Returns the meta object for the attribute '{@link org.wso2.vihanga.example.student.student.Address#getStreetAddress <em>Street Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Street Address</em>'.
   * @see org.wso2.vihanga.example.student.student.Address#getStreetAddress()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_StreetAddress();

  /**
   * Returns the meta object for the attribute '{@link org.wso2.vihanga.example.student.student.Address#getCity <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>City</em>'.
   * @see org.wso2.vihanga.example.student.student.Address#getCity()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_City();

  /**
   * Returns the meta object for the attribute '{@link org.wso2.vihanga.example.student.student.Address#getPostalCode <em>Postal Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postal Code</em>'.
   * @see org.wso2.vihanga.example.student.student.Address#getPostalCode()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_PostalCode();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StudentFactory getStudentFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.wso2.vihanga.example.student.student.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.wso2.vihanga.example.student.student.impl.ModelImpl
     * @see org.wso2.vihanga.example.student.student.impl.StudentPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STUDENTS = eINSTANCE.getModel_Students();

    /**
     * The meta object literal for the '{@link org.wso2.vihanga.example.student.student.impl.StudentImpl <em>Student</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.wso2.vihanga.example.student.student.impl.StudentImpl
     * @see org.wso2.vihanga.example.student.student.impl.StudentPackageImpl#getStudent()
     * @generated
     */
    EClass STUDENT = eINSTANCE.getStudent();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__ID = eINSTANCE.getStudent_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

    /**
     * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__AGE = eINSTANCE.getStudent_Age();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STUDENT__ADDRESS = eINSTANCE.getStudent_Address();

    /**
     * The meta object literal for the '{@link org.wso2.vihanga.example.student.student.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.wso2.vihanga.example.student.student.impl.AddressImpl
     * @see org.wso2.vihanga.example.student.student.impl.StudentPackageImpl#getAddress()
     * @generated
     */
    EClass ADDRESS = eINSTANCE.getAddress();

    /**
     * The meta object literal for the '<em><b>Street Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__STREET_ADDRESS = eINSTANCE.getAddress_StreetAddress();

    /**
     * The meta object literal for the '<em><b>City</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

    /**
     * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

  }

} //StudentPackage
