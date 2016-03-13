/**
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.d3ql.impl;

import nl.coenbijlsma.languages.d3ql.d3ql.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class D3qlFactoryImpl extends EFactoryImpl implements D3qlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static D3qlFactory init()
  {
    try
    {
      D3qlFactory theD3qlFactory = (D3qlFactory)EPackage.Registry.INSTANCE.getEFactory(D3qlPackage.eNS_URI);
      if (theD3qlFactory != null)
      {
        return theD3qlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new D3qlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public D3qlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case D3qlPackage.QUERY: return createQuery();
      case D3qlPackage.FROM_STATEMENT: return createFromStatement();
      case D3qlPackage.NAMED: return createNamed();
      case D3qlPackage.AGGREGATE_ROOT: return createAggregateRoot();
      case D3qlPackage.ALIAS: return createAlias();
      case D3qlPackage.SELECT_STATEMENT: return createSelectStatement();
      case D3qlPackage.PATH_EXPRESSION: return createPathExpression();
      case D3qlPackage.PATH_ELEMENT: return createPathElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromStatement createFromStatement()
  {
    FromStatementImpl fromStatement = new FromStatementImpl();
    return fromStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named createNamed()
  {
    NamedImpl named = new NamedImpl();
    return named;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregateRoot createAggregateRoot()
  {
    AggregateRootImpl aggregateRoot = new AggregateRootImpl();
    return aggregateRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias createAlias()
  {
    AliasImpl alias = new AliasImpl();
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpression createPathExpression()
  {
    PathExpressionImpl pathExpression = new PathExpressionImpl();
    return pathExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathElement createPathElement()
  {
    PathElementImpl pathElement = new PathElementImpl();
    return pathElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public D3qlPackage getD3qlPackage()
  {
    return (D3qlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static D3qlPackage getPackage()
  {
    return D3qlPackage.eINSTANCE;
  }

} //D3qlFactoryImpl