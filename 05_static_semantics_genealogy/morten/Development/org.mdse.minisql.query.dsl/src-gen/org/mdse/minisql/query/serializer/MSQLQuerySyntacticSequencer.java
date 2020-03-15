/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.query.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.mdse.minisql.query.services.MSQLQueryGrammarAccess;

@SuppressWarnings("all")
public class MSQLQuerySyntacticSequencer extends AbstractSyntacticSequencer {

	protected MSQLQueryGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MSQLQueryGrammarAccess) access;
		match_AtomicExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_AtomicExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AtomicExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AtomicExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) column=[Column|ID]
	 *     (rule start) (ambiguity) operator=NotOperator
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) value?='FALSE'
	 *     (rule start) (ambiguity) value?='TRUE'
	 *     (rule start) (ambiguity) {ArithmeticExpression.expression1=}
	 *     (rule start) (ambiguity) {BinaryLogicalExpression.expression1=}
	 *     (rule start) (ambiguity) {ComparativeExpression.expression1=}
	 */
	protected void emit_AtomicExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) operator=NotOperator
	 *     (rule start) (ambiguity) {ArithmeticExpression.expression1=}
	 *     (rule start) (ambiguity) {BinaryLogicalExpression.expression1=}
	 *     (rule start) (ambiguity) {ComparativeExpression.expression1=}
	 */
	protected void emit_AtomicExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
