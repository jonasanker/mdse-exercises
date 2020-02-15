package org.mdse.minisql.query.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.query.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "','", "'FROM'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuery.g"; }



     	private QueryGrammarAccess grammarAccess;

        public InternalQueryParser(TokenStream input, QueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SelectQuery";
       	}

       	@Override
       	protected QueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSelectQuery"
    // InternalQuery.g:64:1: entryRuleSelectQuery returns [EObject current=null] : iv_ruleSelectQuery= ruleSelectQuery EOF ;
    public final EObject entryRuleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectQuery = null;


        try {
            // InternalQuery.g:64:52: (iv_ruleSelectQuery= ruleSelectQuery EOF )
            // InternalQuery.g:65:2: iv_ruleSelectQuery= ruleSelectQuery EOF
            {
             newCompositeNode(grammarAccess.getSelectQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectQuery=ruleSelectQuery();

            state._fsp--;

             current =iv_ruleSelectQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectQuery"


    // $ANTLR start "ruleSelectQuery"
    // InternalQuery.g:71:1: ruleSelectQuery returns [EObject current=null] : (otherlv_0= 'SELECT' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'FROM' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleSelectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalQuery.g:77:2: ( (otherlv_0= 'SELECT' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'FROM' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) )
            // InternalQuery.g:78:2: (otherlv_0= 'SELECT' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'FROM' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            {
            // InternalQuery.g:78:2: (otherlv_0= 'SELECT' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'FROM' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            // InternalQuery.g:79:3: otherlv_0= 'SELECT' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'FROM' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectQueryAccess().getSELECTKeyword_0());
            		
            // InternalQuery.g:83:3: ( (otherlv_1= RULE_ID ) )
            // InternalQuery.g:84:4: (otherlv_1= RULE_ID )
            {
            // InternalQuery.g:84:4: (otherlv_1= RULE_ID )
            // InternalQuery.g:85:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectQueryRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_1_0());
            				

            }


            }

            // InternalQuery.g:96:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuery.g:97:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectQueryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalQuery.g:101:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalQuery.g:102:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalQuery.g:102:5: (otherlv_3= RULE_ID )
            	    // InternalQuery.g:103:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectQueryRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    						newLeafNode(otherlv_3, grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectQueryAccess().getFROMKeyword_3());
            		
            // InternalQuery.g:119:3: ( (otherlv_5= RULE_ID ) )
            // InternalQuery.g:120:4: (otherlv_5= RULE_ID )
            {
            // InternalQuery.g:120:4: (otherlv_5= RULE_ID )
            // InternalQuery.g:121:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectQueryRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_5, grammarAccess.getSelectQueryAccess().getFromTableCrossReference_4_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectQuery"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});

}