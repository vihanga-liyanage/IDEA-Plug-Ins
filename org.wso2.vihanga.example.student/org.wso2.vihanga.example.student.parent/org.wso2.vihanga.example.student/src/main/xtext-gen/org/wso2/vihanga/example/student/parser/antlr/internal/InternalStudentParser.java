package org.wso2.vihanga.example.student.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.wso2.vihanga.example.student.services.StudentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStudentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Student'", "';'", "'Address'", "'{'", "'StreetAddress'", "','", "'City'", "'PostalCode'", "'}'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalStudentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStudentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStudentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStudent.g"; }



     	private StudentGrammarAccess grammarAccess;

        public InternalStudentParser(TokenStream input, StudentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected StudentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalStudent.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalStudent.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalStudent.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalStudent.g:71:1: ruleModel returns [EObject current=null] : ( (lv_students_0_0= ruleStudent ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_students_0_0 = null;



        	enterRule();

        try {
            // InternalStudent.g:77:2: ( ( (lv_students_0_0= ruleStudent ) )* )
            // InternalStudent.g:78:2: ( (lv_students_0_0= ruleStudent ) )*
            {
            // InternalStudent.g:78:2: ( (lv_students_0_0= ruleStudent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStudent.g:79:3: (lv_students_0_0= ruleStudent )
            	    {
            	    // InternalStudent.g:79:3: (lv_students_0_0= ruleStudent )
            	    // InternalStudent.g:80:4: lv_students_0_0= ruleStudent
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStudentsStudentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_students_0_0=ruleStudent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"students",
            	    					lv_students_0_0,
            	    					"org.wso2.vihanga.example.student.Student.Student");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStudent"
    // InternalStudent.g:100:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalStudent.g:100:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalStudent.g:101:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalStudent.g:107:1: ruleStudent returns [EObject current=null] : (otherlv_0= 'Student' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_age_3_0= RULE_INT ) ) ( (lv_address_4_0= ruleAddress ) ) otherlv_5= ';' ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_name_2_0=null;
        Token lv_age_3_0=null;
        Token otherlv_5=null;
        EObject lv_address_4_0 = null;



        	enterRule();

        try {
            // InternalStudent.g:113:2: ( (otherlv_0= 'Student' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_age_3_0= RULE_INT ) ) ( (lv_address_4_0= ruleAddress ) ) otherlv_5= ';' ) )
            // InternalStudent.g:114:2: (otherlv_0= 'Student' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_age_3_0= RULE_INT ) ) ( (lv_address_4_0= ruleAddress ) ) otherlv_5= ';' )
            {
            // InternalStudent.g:114:2: (otherlv_0= 'Student' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_age_3_0= RULE_INT ) ) ( (lv_address_4_0= ruleAddress ) ) otherlv_5= ';' )
            // InternalStudent.g:115:3: otherlv_0= 'Student' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_age_3_0= RULE_INT ) ) ( (lv_address_4_0= ruleAddress ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
            		
            // InternalStudent.g:119:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalStudent.g:120:4: (lv_id_1_0= RULE_ID )
            {
            // InternalStudent.g:120:4: (lv_id_1_0= RULE_ID )
            // InternalStudent.g:121:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getStudentAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStudent.g:137:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalStudent.g:138:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalStudent.g:138:4: (lv_name_2_0= RULE_STRING )
            // InternalStudent.g:139:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStudent.g:155:3: ( (lv_age_3_0= RULE_INT ) )
            // InternalStudent.g:156:4: (lv_age_3_0= RULE_INT )
            {
            // InternalStudent.g:156:4: (lv_age_3_0= RULE_INT )
            // InternalStudent.g:157:5: lv_age_3_0= RULE_INT
            {
            lv_age_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_age_3_0, grammarAccess.getStudentAccess().getAgeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"age",
            						lv_age_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalStudent.g:173:3: ( (lv_address_4_0= ruleAddress ) )
            // InternalStudent.g:174:4: (lv_address_4_0= ruleAddress )
            {
            // InternalStudent.g:174:4: (lv_address_4_0= ruleAddress )
            // InternalStudent.g:175:5: lv_address_4_0= ruleAddress
            {

            					newCompositeNode(grammarAccess.getStudentAccess().getAddressAddressParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_address_4_0=ruleAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStudentRule());
            					}
            					set(
            						current,
            						"address",
            						lv_address_4_0,
            						"org.wso2.vihanga.example.student.Student.Address");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleAddress"
    // InternalStudent.g:200:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalStudent.g:200:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalStudent.g:201:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalStudent.g:207:1: ruleAddress returns [EObject current=null] : (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'StreetAddress' ( (lv_streetAddress_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'City' ( (lv_city_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'PostalCode' ( (lv_postalCode_9_0= RULE_INT ) ) otherlv_10= '}' ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_streetAddress_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_city_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_postalCode_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalStudent.g:213:2: ( (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'StreetAddress' ( (lv_streetAddress_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'City' ( (lv_city_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'PostalCode' ( (lv_postalCode_9_0= RULE_INT ) ) otherlv_10= '}' ) )
            // InternalStudent.g:214:2: (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'StreetAddress' ( (lv_streetAddress_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'City' ( (lv_city_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'PostalCode' ( (lv_postalCode_9_0= RULE_INT ) ) otherlv_10= '}' )
            {
            // InternalStudent.g:214:2: (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'StreetAddress' ( (lv_streetAddress_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'City' ( (lv_city_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'PostalCode' ( (lv_postalCode_9_0= RULE_INT ) ) otherlv_10= '}' )
            // InternalStudent.g:215:3: otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'StreetAddress' ( (lv_streetAddress_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'City' ( (lv_city_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'PostalCode' ( (lv_postalCode_9_0= RULE_INT ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getAddressKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getStreetAddressKeyword_2());
            		
            // InternalStudent.g:227:3: ( (lv_streetAddress_3_0= RULE_STRING ) )
            // InternalStudent.g:228:4: (lv_streetAddress_3_0= RULE_STRING )
            {
            // InternalStudent.g:228:4: (lv_streetAddress_3_0= RULE_STRING )
            // InternalStudent.g:229:5: lv_streetAddress_3_0= RULE_STRING
            {
            lv_streetAddress_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_streetAddress_3_0, grammarAccess.getAddressAccess().getStreetAddressSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"streetAddress",
            						lv_streetAddress_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getAddressAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getCityKeyword_5());
            		
            // InternalStudent.g:253:3: ( (lv_city_6_0= RULE_STRING ) )
            // InternalStudent.g:254:4: (lv_city_6_0= RULE_STRING )
            {
            // InternalStudent.g:254:4: (lv_city_6_0= RULE_STRING )
            // InternalStudent.g:255:5: lv_city_6_0= RULE_STRING
            {
            lv_city_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_city_6_0, grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"city",
            						lv_city_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getAddressAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getAddressAccess().getPostalCodeKeyword_8());
            		
            // InternalStudent.g:279:3: ( (lv_postalCode_9_0= RULE_INT ) )
            // InternalStudent.g:280:4: (lv_postalCode_9_0= RULE_INT )
            {
            // InternalStudent.g:280:4: (lv_postalCode_9_0= RULE_INT )
            // InternalStudent.g:281:5: lv_postalCode_9_0= RULE_INT
            {
            lv_postalCode_9_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_postalCode_9_0, grammarAccess.getAddressAccess().getPostalCodeINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"postalCode",
            						lv_postalCode_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAddress"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});

}