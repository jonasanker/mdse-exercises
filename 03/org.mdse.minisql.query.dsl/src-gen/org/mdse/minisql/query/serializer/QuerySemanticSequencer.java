/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.query.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.SelectQuery;
import org.mdse.minisql.query.services.QueryGrammarAccess;

@SuppressWarnings("all")
public class QuerySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QueryGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == QueryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case QueryPackage.SELECT_QUERY:
				sequence_SelectQuery(context, (SelectQuery) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SelectQuery returns SelectQuery
	 *
	 * Constraint:
	 *     (what+=[Column|ID] what+=[Column|ID]* from=[Table|ID])
	 */
	protected void sequence_SelectQuery(ISerializationContext context, SelectQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
