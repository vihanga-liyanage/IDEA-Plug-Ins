/**
 * generated by Xtext 2.9.2
 */
package org.wso2.vihanga.example.student.student.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wso2.vihanga.example.student.student.Address;
import org.wso2.vihanga.example.student.student.StudentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.vihanga.example.student.student.impl.AddressImpl#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link org.wso2.vihanga.example.student.student.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.wso2.vihanga.example.student.student.impl.AddressImpl#getPostalCode <em>Postal Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address
{
  /**
   * The default value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreetAddress()
   * @generated
   * @ordered
   */
  protected static final String STREET_ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreetAddress()
   * @generated
   * @ordered
   */
  protected String streetAddress = STREET_ADDRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getCity() <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCity()
   * @generated
   * @ordered
   */
  protected static final String CITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCity()
   * @generated
   * @ordered
   */
  protected String city = CITY_EDEFAULT;

  /**
   * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalCode()
   * @generated
   * @ordered
   */
  protected static final int POSTAL_CODE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalCode()
   * @generated
   * @ordered
   */
  protected int postalCode = POSTAL_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddressImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StudentPackage.Literals.ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStreetAddress()
  {
    return streetAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStreetAddress(String newStreetAddress)
  {
    String oldStreetAddress = streetAddress;
    streetAddress = newStreetAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StudentPackage.ADDRESS__STREET_ADDRESS, oldStreetAddress, streetAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCity()
  {
    return city;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCity(String newCity)
  {
    String oldCity = city;
    city = newCity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StudentPackage.ADDRESS__CITY, oldCity, city));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPostalCode()
  {
    return postalCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostalCode(int newPostalCode)
  {
    int oldPostalCode = postalCode;
    postalCode = newPostalCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StudentPackage.ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StudentPackage.ADDRESS__STREET_ADDRESS:
        return getStreetAddress();
      case StudentPackage.ADDRESS__CITY:
        return getCity();
      case StudentPackage.ADDRESS__POSTAL_CODE:
        return getPostalCode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StudentPackage.ADDRESS__STREET_ADDRESS:
        setStreetAddress((String)newValue);
        return;
      case StudentPackage.ADDRESS__CITY:
        setCity((String)newValue);
        return;
      case StudentPackage.ADDRESS__POSTAL_CODE:
        setPostalCode((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StudentPackage.ADDRESS__STREET_ADDRESS:
        setStreetAddress(STREET_ADDRESS_EDEFAULT);
        return;
      case StudentPackage.ADDRESS__CITY:
        setCity(CITY_EDEFAULT);
        return;
      case StudentPackage.ADDRESS__POSTAL_CODE:
        setPostalCode(POSTAL_CODE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StudentPackage.ADDRESS__STREET_ADDRESS:
        return STREET_ADDRESS_EDEFAULT == null ? streetAddress != null : !STREET_ADDRESS_EDEFAULT.equals(streetAddress);
      case StudentPackage.ADDRESS__CITY:
        return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
      case StudentPackage.ADDRESS__POSTAL_CODE:
        return postalCode != POSTAL_CODE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (streetAddress: ");
    result.append(streetAddress);
    result.append(", city: ");
    result.append(city);
    result.append(", postalCode: ");
    result.append(postalCode);
    result.append(')');
    return result.toString();
  }

} //AddressImpl
