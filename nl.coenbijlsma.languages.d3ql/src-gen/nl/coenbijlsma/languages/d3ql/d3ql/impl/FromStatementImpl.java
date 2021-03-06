/**
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.d3ql.impl;

import java.util.Collection;

import nl.coenbijlsma.languages.d3ql.d3ql.AggregateRoot;
import nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage;
import nl.coenbijlsma.languages.d3ql.d3ql.FromStatement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.coenbijlsma.languages.d3ql.d3ql.impl.FromStatementImpl#getAggregates <em>Aggregates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FromStatementImpl extends MinimalEObjectImpl.Container implements FromStatement
{
  /**
   * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregates()
   * @generated
   * @ordered
   */
  protected EList<AggregateRoot> aggregates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FromStatementImpl()
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
    return D3qlPackage.Literals.FROM_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AggregateRoot> getAggregates()
  {
    if (aggregates == null)
    {
      aggregates = new EObjectContainmentEList<AggregateRoot>(AggregateRoot.class, this, D3qlPackage.FROM_STATEMENT__AGGREGATES);
    }
    return aggregates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case D3qlPackage.FROM_STATEMENT__AGGREGATES:
        return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case D3qlPackage.FROM_STATEMENT__AGGREGATES:
        return getAggregates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case D3qlPackage.FROM_STATEMENT__AGGREGATES:
        getAggregates().clear();
        getAggregates().addAll((Collection<? extends AggregateRoot>)newValue);
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
      case D3qlPackage.FROM_STATEMENT__AGGREGATES:
        getAggregates().clear();
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
      case D3qlPackage.FROM_STATEMENT__AGGREGATES:
        return aggregates != null && !aggregates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FromStatementImpl
