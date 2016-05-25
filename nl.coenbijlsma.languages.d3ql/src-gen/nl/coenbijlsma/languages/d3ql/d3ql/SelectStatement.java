/**
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.d3ql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.coenbijlsma.languages.d3ql.d3ql.SelectStatement#getArterisk <em>Arterisk</em>}</li>
 *   <li>{@link nl.coenbijlsma.languages.d3ql.d3ql.SelectStatement#getSelections <em>Selections</em>}</li>
 * </ul>
 *
 * @see nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Arterisk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arterisk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arterisk</em>' attribute.
   * @see #setArterisk(String)
   * @see nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage#getSelectStatement_Arterisk()
   * @model
   * @generated
   */
  String getArterisk();

  /**
   * Sets the value of the '{@link nl.coenbijlsma.languages.d3ql.d3ql.SelectStatement#getArterisk <em>Arterisk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arterisk</em>' attribute.
   * @see #getArterisk()
   * @generated
   */
  void setArterisk(String value);

  /**
   * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
   * The list contents are of type {@link nl.coenbijlsma.languages.d3ql.d3ql.SelectionItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selections</em>' containment reference list.
   * @see nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage#getSelectStatement_Selections()
   * @model containment="true"
   * @generated
   */
  EList<SelectionItem> getSelections();

} // SelectStatement
