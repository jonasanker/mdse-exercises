package org.mdse.genealogy.validation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.genealogy.GenealogyPackage;
import org.mdse.genealogy.Person;

public class GenealogyValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(GenealogyPackage.eINSTANCE, new GenealogyValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		if (GenealogyPackage.eINSTANCE.getPerson().equals(eClass)) {
			Person person = (Person) eObject;
			
			modelIsValid &= validatePerson(person);
		}
		
		return modelIsValid;
	}
	
	protected boolean validatePerson(Person person) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateNoNegativeAgeConstraint(person);
		modelIsValid &= validateNotOwnParentConstraint(person);
		modelIsValid &= validateParentMustBeOlderThanChildIfAliveConstraint(person);
		modelIsValid &= validateNotOwnAncestorConstraint(person);
		
		return modelIsValid;
	}
	
	protected boolean validateNoNegativeAgeConstraint(Person person) {
		//TODO: Write Java constraint
		boolean constraintViolated = false;
		
		if (constraintViolated) {
			return constraintViolated(person, person.getName() + " must not have a negative age.");
		}
		
		return true;
	}
	
	protected boolean validateNotOwnParentConstraint(Person person) {
		//TODO: Write Java constraint
		boolean constraintViolated = false;
		
		if (constraintViolated) {
			return constraintViolated(person, person.getName() + " must not be his/her own parent.");
		}
		
		return true;
	}
	
	protected boolean validateParentMustBeOlderThanChildIfAliveConstraint(Person person) {
		//TODO: Write Java constraint
		boolean constraintViolated = false;
		
		if (constraintViolated) {
			return constraintViolated(person, person.getName() + " must not be older than his/her parent (unless they are dead).");				
		}
		
		return true;
	}
	
	protected boolean validateNotOwnAncestorConstraint(Person person) {
		//TODO: Write Java constraint
		boolean constraintViolated = false;
		
		if (constraintViolated) {
			return constraintViolated(person, person.getName() + " must not be his/her own ancestor.");
		}
		
		return true;
	}
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
