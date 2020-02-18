package org.mdse.minisql.schema.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.schema.services.MSQLSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLSchemaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TABLE'", "'{'", "','", "'}'"
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


        public InternalMSQLSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSQLSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSQLSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSQLSchema.g"; }



     	private MSQLSchemaGrammarAccess grammarAccess;

        public InternalMSQLSchemaParser(TokenStream input, MSQLSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Table";
       	}

       	@Override
       	protected MSQLSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTable"
    // InternalMSQLSchema.g:64:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMSQLSchema.g:64:46: (iv_ruleTable= ruleTable EOF )
            // InternalMSQLSchema.g:65:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMSQLSchema.g:71:1: ruleTable returns [EObject current=null] : (otherlv_0= 'TABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_column_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_column_5_0= ruleColumn ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_column_3_0 = null;

        EObject lv_column_5_0 = null;



        	enterRule();

        try {
            // InternalMSQLSchema.g:77:2: ( (otherlv_0= 'TABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_column_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_column_5_0= ruleColumn ) ) )* otherlv_6= '}' ) )
            // InternalMSQLSchema.g:78:2: (otherlv_0= 'TABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_column_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_column_5_0= ruleColumn ) ) )* otherlv_6= '}' )
            {
            // InternalMSQLSchema.g:78:2: (otherlv_0= 'TABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_column_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_column_5_0= ruleColumn ) ) )* otherlv_6= '}' )
            // InternalMSQLSchema.g:79:3: otherlv_0= 'TABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_column_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_column_5_0= ruleColumn ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTABLEKeyword_0());
            		
            // InternalMSQLSchema.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMSQLSchema.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMSQLSchema.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMSQLSchema.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSQLSchema.g:105:3: ( (lv_column_3_0= ruleColumn ) )
            // InternalMSQLSchema.g:106:4: (lv_column_3_0= ruleColumn )
            {
            // InternalMSQLSchema.g:106:4: (lv_column_3_0= ruleColumn )
            // InternalMSQLSchema.g:107:5: lv_column_3_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_column_3_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"column",
            						lv_column_3_0,
            						"org.mdse.minisql.schema.MSQLSchema.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLSchema.g:124:3: (otherlv_4= ',' ( (lv_column_5_0= ruleColumn ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSQLSchema.g:125:4: otherlv_4= ',' ( (lv_column_5_0= ruleColumn ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMSQLSchema.g:129:4: ( (lv_column_5_0= ruleColumn ) )
            	    // InternalMSQLSchema.g:130:5: (lv_column_5_0= ruleColumn )
            	    {
            	    // InternalMSQLSchema.g:130:5: (lv_column_5_0= ruleColumn )
            	    // InternalMSQLSchema.g:131:6: lv_column_5_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_column_5_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"column",
            	    							lv_column_5_0,
            	    							"org.mdse.minisql.schema.MSQLSchema.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMSQLSchema.g:157:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMSQLSchema.g:157:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMSQLSchema.g:158:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMSQLSchema.g:164:1: ruleColumn returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMSQLSchema.g:170:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMSQLSchema.g:171:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMSQLSchema.g:171:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMSQLSchema.g:172:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMSQLSchema.g:172:3: (lv_name_0_0= RULE_ID )
            // InternalMSQLSchema.g:173:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColumnRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


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
    // $ANTLR end "ruleColumn"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});

}