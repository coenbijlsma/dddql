/*
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;

@ComposedChecks(validators = {NamesAreUniqueValidator.class})
public abstract class AbstractD3qlValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage.eINSTANCE);
		return result;
	}
	
}
