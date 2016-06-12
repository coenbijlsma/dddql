/*
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nl.coenbijlsma.languages.d3ql.ide.contentassist.antlr.internal.InternalD3qlParser;
import nl.coenbijlsma.languages.d3ql.services.D3qlGrammarAccess;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class D3qlParser extends AbstractContentAssistParser {

	@Inject
	private D3qlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalD3qlParser createParser() {
		InternalD3qlParser result = new InternalD3qlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSelectStatementAccess().getAlternatives_1(), "rule__SelectStatement__Alternatives_1");
					put(grammarAccess.getSelectionItemAccess().getExpressionAlternatives_0_0(), "rule__SelectionItem__ExpressionAlternatives_0_0");
					put(grammarAccess.getNamedAccess().getAlternatives(), "rule__Named__Alternatives");
					put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
					put(grammarAccess.getComparisonAccess().getAlternatives_1(), "rule__Comparison__Alternatives_1");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_1_0(), "rule__Comparison__OpAlternatives_1_0_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getFunctionArgumentAccess().getAlternatives_1(), "rule__FunctionArgument__Alternatives_1");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0(), "rule__Atomic__ValueAlternatives_2_1_0");
					put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
					put(grammarAccess.getFromStatementAccess().getGroup(), "rule__FromStatement__Group__0");
					put(grammarAccess.getFromStatementAccess().getGroup_2(), "rule__FromStatement__Group_2__0");
					put(grammarAccess.getSelectStatementAccess().getGroup(), "rule__SelectStatement__Group__0");
					put(grammarAccess.getSelectStatementAccess().getGroup_1_1(), "rule__SelectStatement__Group_1_1__0");
					put(grammarAccess.getSelectStatementAccess().getGroup_1_1_1(), "rule__SelectStatement__Group_1_1_1__0");
					put(grammarAccess.getSelectionItemAccess().getGroup(), "rule__SelectionItem__Group__0");
					put(grammarAccess.getSelectionItemAccess().getGroup_1(), "rule__SelectionItem__Group_1__0");
					put(grammarAccess.getWhereStatementAccess().getGroup(), "rule__WhereStatement__Group__0");
					put(grammarAccess.getAggregateRootAccess().getGroup(), "rule__AggregateRoot__Group__0");
					put(grammarAccess.getAggregateRootAccess().getGroup_1(), "rule__AggregateRoot__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0(), "rule__Comparison__Group_1_0__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_1(), "rule__Comparison__Group_1_1__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_2(), "rule__Comparison__Group_1_2__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_2_4(), "rule__Comparison__Group_1_2_4__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_3(), "rule__FQN__Group_3__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2(), "rule__FunctionCall__Group_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2_1(), "rule__FunctionCall__Group_2_1__0");
					put(grammarAccess.getFunctionArgumentAccess().getGroup(), "rule__FunctionArgument__Group__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
					put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
					put(grammarAccess.getAtomicAccess().getGroup_5(), "rule__Atomic__Group_5__0");
					put(grammarAccess.getQueryAccess().getFromAssignment_0(), "rule__Query__FromAssignment_0");
					put(grammarAccess.getQueryAccess().getSelectAssignment_1(), "rule__Query__SelectAssignment_1");
					put(grammarAccess.getQueryAccess().getWhereAssignment_2(), "rule__Query__WhereAssignment_2");
					put(grammarAccess.getFromStatementAccess().getAggregatesAssignment_1(), "rule__FromStatement__AggregatesAssignment_1");
					put(grammarAccess.getFromStatementAccess().getAggregatesAssignment_2_1(), "rule__FromStatement__AggregatesAssignment_2_1");
					put(grammarAccess.getSelectStatementAccess().getArteriskAssignment_1_0(), "rule__SelectStatement__ArteriskAssignment_1_0");
					put(grammarAccess.getSelectStatementAccess().getSelectionsAssignment_1_1_0(), "rule__SelectStatement__SelectionsAssignment_1_1_0");
					put(grammarAccess.getSelectStatementAccess().getSelectionsAssignment_1_1_1_1(), "rule__SelectStatement__SelectionsAssignment_1_1_1_1");
					put(grammarAccess.getSelectionItemAccess().getExpressionAssignment_0(), "rule__SelectionItem__ExpressionAssignment_0");
					put(grammarAccess.getSelectionItemAccess().getAliasAssignment_1_1(), "rule__SelectionItem__AliasAssignment_1_1");
					put(grammarAccess.getWhereStatementAccess().getExpressionsAssignment_1(), "rule__WhereStatement__ExpressionsAssignment_1");
					put(grammarAccess.getAggregateRootAccess().getNameAssignment_0(), "rule__AggregateRoot__NameAssignment_0");
					put(grammarAccess.getAggregateRootAccess().getAliasAssignment_1_1(), "rule__AggregateRoot__AliasAssignment_1_1");
					put(grammarAccess.getAliasAccess().getNameAssignment(), "rule__Alias__NameAssignment");
					put(grammarAccess.getExpressionAccess().getAliasAssignment_1_2(), "rule__Expression__AliasAssignment_1_2");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
					put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1(), "rule__Comparison__OpAssignment_1_0_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_0_2(), "rule__Comparison__RightAssignment_1_0_2");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_1_1(), "rule__Comparison__OpAssignment_1_1_1");
					put(grammarAccess.getComparisonAccess().getXAssignment_1_1_2(), "rule__Comparison__XAssignment_1_1_2");
					put(grammarAccess.getComparisonAccess().getYAssignment_1_1_4(), "rule__Comparison__YAssignment_1_1_4");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_2_1(), "rule__Comparison__OpAssignment_1_2_1");
					put(grammarAccess.getComparisonAccess().getListAssignment_1_2_3(), "rule__Comparison__ListAssignment_1_2_3");
					put(grammarAccess.getComparisonAccess().getListAssignment_1_2_4_1(), "rule__Comparison__ListAssignment_1_2_4_1");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
					put(grammarAccess.getFQNAccess().getHeadAssignment_0(), "rule__FQN__HeadAssignment_0");
					put(grammarAccess.getFQNAccess().getTailAssignment_2(), "rule__FQN__TailAssignment_2");
					put(grammarAccess.getFQNAccess().getTailAssignment_3_1(), "rule__FQN__TailAssignment_3_1");
					put(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0(), "rule__FunctionCall__FunctionAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0(), "rule__FunctionCall__ArgumentsAssignment_2_0");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1(), "rule__FunctionCall__ArgumentsAssignment_2_1_1");
					put(grammarAccess.getFunctionArgumentAccess().getReferenceAssignment_1_0(), "rule__FunctionArgument__ReferenceAssignment_1_0");
					put(grammarAccess.getFunctionArgumentAccess().getFqnAssignment_1_1(), "rule__FunctionArgument__FqnAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_4_2(), "rule__Atomic__ValueAssignment_4_2");
					put(grammarAccess.getAtomicAccess().getValueAssignment_5_1(), "rule__Atomic__ValueAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalD3qlParser typedParser = (InternalD3qlParser) parser;
			typedParser.entryRuleQuery();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public D3qlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(D3qlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
