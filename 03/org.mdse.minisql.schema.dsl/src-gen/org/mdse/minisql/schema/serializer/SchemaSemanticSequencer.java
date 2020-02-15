/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.schema.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.mdse.minisql.schema.Column;
import org.mdse.minisql.schema.SchemaPackage;
import org.mdse.minisql.schema.Table;
import org.mdse.minisql.schema.services.SchemaGrammarAccess;

@SuppressWarnings("all")
public class SchemaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SchemaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SchemaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SchemaPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case SchemaPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Column returns Column
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SchemaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchemaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=ID columns+=Column columns+=Column*)
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
