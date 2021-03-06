/*
 * generated by Xtext 2.9.2
 */
package org.wso2.vihanga.example.student.idea.lang;

import com.intellij.psi.tree.IFileElementType;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.psi.stubs.XtextFileElementType;
import org.eclipse.xtext.psi.stubs.XtextFileStub;
import org.eclipse.xtext.psi.tree.IGrammarAwareElementType;
import org.wso2.vihanga.example.student.idea.lang.psi.impl.StudentFileImpl;
import org.wso2.vihanga.example.student.services.StudentGrammarAccess;

public class StudentElementTypeProvider implements IElementTypeProvider {

	public static final IFileElementType FILE_TYPE = new XtextFileElementType<XtextFileStub<StudentFileImpl>>(StudentLanguage.INSTANCE);

	private static final Map<EObject, IGrammarAwareElementType> GRAMMAR_ELEMENT_TYPE = new HashMap<EObject, IGrammarAwareElementType>();

	private static IGrammarAwareElementType associate(IGrammarAwareElementType grammarAwareElementType) {
		GRAMMAR_ELEMENT_TYPE.put(grammarAwareElementType.getGrammarElement(), grammarAwareElementType);
		return grammarAwareElementType;
	}

	private static final StudentGrammarAccess GRAMMAR_ACCESS = StudentLanguage.INSTANCE.getInstance(StudentGrammarAccess.class);

	private static class ModelFactory {
		public static IGrammarAwareElementType createModelElementType() {
			return new IGrammarAwareElementType("Model_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getModelRule());
		}
		public static IGrammarAwareElementType createModel_StudentsAssignmentElementType() {
			return new IGrammarAwareElementType("Model_StudentsAssignment_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getStudentsAssignment());
		}
		public static IGrammarAwareElementType createModel_StudentsStudentParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Model_StudentsStudentParserRuleCall_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getStudentsStudentParserRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType Model_ELEMENT_TYPE = associate(ModelFactory.createModelElementType());

	public static final IGrammarAwareElementType Model_StudentsAssignment_ELEMENT_TYPE = associate(ModelFactory.createModel_StudentsAssignmentElementType());

	public static final IGrammarAwareElementType Model_StudentsStudentParserRuleCall_0_ELEMENT_TYPE = associate(ModelFactory.createModel_StudentsStudentParserRuleCall_0ElementType());

	private static class StudentFactory {
		public static IGrammarAwareElementType createStudentElementType() {
			return new IGrammarAwareElementType("Student_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentRule());
		}
		public static IGrammarAwareElementType createStudent_GroupElementType() {
			return new IGrammarAwareElementType("Student_Group_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getGroup());
		}
		public static IGrammarAwareElementType createStudent_StudentKeyword_0ElementType() {
			return new IGrammarAwareElementType("Student_StudentKeyword_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getStudentKeyword_0());
		}
		public static IGrammarAwareElementType createStudent_IdAssignment_1ElementType() {
			return new IGrammarAwareElementType("Student_IdAssignment_1_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getIdAssignment_1());
		}
		public static IGrammarAwareElementType createStudent_IdIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Student_IdIDTerminalRuleCall_1_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getIdIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createStudent_NameAssignment_2ElementType() {
			return new IGrammarAwareElementType("Student_NameAssignment_2_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getNameAssignment_2());
		}
		public static IGrammarAwareElementType createStudent_NameSTRINGTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("Student_NameSTRINGTerminalRuleCall_2_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getNameSTRINGTerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createStudent_AgeAssignment_3ElementType() {
			return new IGrammarAwareElementType("Student_AgeAssignment_3_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getAgeAssignment_3());
		}
		public static IGrammarAwareElementType createStudent_AgeINTTerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("Student_AgeINTTerminalRuleCall_3_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getAgeINTTerminalRuleCall_3_0());
		}
		public static IGrammarAwareElementType createStudent_AddressAssignment_4ElementType() {
			return new IGrammarAwareElementType("Student_AddressAssignment_4_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getAddressAssignment_4());
		}
		public static IGrammarAwareElementType createStudent_AddressAddressParserRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("Student_AddressAddressParserRuleCall_4_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getAddressAddressParserRuleCall_4_0());
		}
		public static IGrammarAwareElementType createStudent_SemicolonKeyword_5ElementType() {
			return new IGrammarAwareElementType("Student_SemicolonKeyword_5_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getStudentAccess().getSemicolonKeyword_5());
		}
	}

	public static final IGrammarAwareElementType Student_ELEMENT_TYPE = associate(StudentFactory.createStudentElementType());

	public static final IGrammarAwareElementType Student_Group_ELEMENT_TYPE = associate(StudentFactory.createStudent_GroupElementType());

	public static final IGrammarAwareElementType Student_StudentKeyword_0_ELEMENT_TYPE = associate(StudentFactory.createStudent_StudentKeyword_0ElementType());

	public static final IGrammarAwareElementType Student_IdAssignment_1_ELEMENT_TYPE = associate(StudentFactory.createStudent_IdAssignment_1ElementType());

	public static final IGrammarAwareElementType Student_IdIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(StudentFactory.createStudent_IdIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType Student_NameAssignment_2_ELEMENT_TYPE = associate(StudentFactory.createStudent_NameAssignment_2ElementType());

	public static final IGrammarAwareElementType Student_NameSTRINGTerminalRuleCall_2_0_ELEMENT_TYPE = associate(StudentFactory.createStudent_NameSTRINGTerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType Student_AgeAssignment_3_ELEMENT_TYPE = associate(StudentFactory.createStudent_AgeAssignment_3ElementType());

	public static final IGrammarAwareElementType Student_AgeINTTerminalRuleCall_3_0_ELEMENT_TYPE = associate(StudentFactory.createStudent_AgeINTTerminalRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType Student_AddressAssignment_4_ELEMENT_TYPE = associate(StudentFactory.createStudent_AddressAssignment_4ElementType());

	public static final IGrammarAwareElementType Student_AddressAddressParserRuleCall_4_0_ELEMENT_TYPE = associate(StudentFactory.createStudent_AddressAddressParserRuleCall_4_0ElementType());

	public static final IGrammarAwareElementType Student_SemicolonKeyword_5_ELEMENT_TYPE = associate(StudentFactory.createStudent_SemicolonKeyword_5ElementType());

	private static class AddressFactory {
		public static IGrammarAwareElementType createAddressElementType() {
			return new IGrammarAwareElementType("Address_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressRule());
		}
		public static IGrammarAwareElementType createAddress_GroupElementType() {
			return new IGrammarAwareElementType("Address_Group_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getGroup());
		}
		public static IGrammarAwareElementType createAddress_AddressKeyword_0ElementType() {
			return new IGrammarAwareElementType("Address_AddressKeyword_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getAddressKeyword_0());
		}
		public static IGrammarAwareElementType createAddress_LeftCurlyBracketKeyword_1ElementType() {
			return new IGrammarAwareElementType("Address_LeftCurlyBracketKeyword_1_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getLeftCurlyBracketKeyword_1());
		}
		public static IGrammarAwareElementType createAddress_StreetAddressKeyword_2ElementType() {
			return new IGrammarAwareElementType("Address_StreetAddressKeyword_2_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getStreetAddressKeyword_2());
		}
		public static IGrammarAwareElementType createAddress_StreetAddressAssignment_3ElementType() {
			return new IGrammarAwareElementType("Address_StreetAddressAssignment_3_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getStreetAddressAssignment_3());
		}
		public static IGrammarAwareElementType createAddress_StreetAddressSTRINGTerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("Address_StreetAddressSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getStreetAddressSTRINGTerminalRuleCall_3_0());
		}
		public static IGrammarAwareElementType createAddress_CommaKeyword_4ElementType() {
			return new IGrammarAwareElementType("Address_CommaKeyword_4_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getCommaKeyword_4());
		}
		public static IGrammarAwareElementType createAddress_CityKeyword_5ElementType() {
			return new IGrammarAwareElementType("Address_CityKeyword_5_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getCityKeyword_5());
		}
		public static IGrammarAwareElementType createAddress_CityAssignment_6ElementType() {
			return new IGrammarAwareElementType("Address_CityAssignment_6_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getCityAssignment_6());
		}
		public static IGrammarAwareElementType createAddress_CitySTRINGTerminalRuleCall_6_0ElementType() {
			return new IGrammarAwareElementType("Address_CitySTRINGTerminalRuleCall_6_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getCitySTRINGTerminalRuleCall_6_0());
		}
		public static IGrammarAwareElementType createAddress_CommaKeyword_7ElementType() {
			return new IGrammarAwareElementType("Address_CommaKeyword_7_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getCommaKeyword_7());
		}
		public static IGrammarAwareElementType createAddress_PostalCodeKeyword_8ElementType() {
			return new IGrammarAwareElementType("Address_PostalCodeKeyword_8_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getPostalCodeKeyword_8());
		}
		public static IGrammarAwareElementType createAddress_PostalCodeAssignment_9ElementType() {
			return new IGrammarAwareElementType("Address_PostalCodeAssignment_9_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getPostalCodeAssignment_9());
		}
		public static IGrammarAwareElementType createAddress_PostalCodeINTTerminalRuleCall_9_0ElementType() {
			return new IGrammarAwareElementType("Address_PostalCodeINTTerminalRuleCall_9_0_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getPostalCodeINTTerminalRuleCall_9_0());
		}
		public static IGrammarAwareElementType createAddress_RightCurlyBracketKeyword_10ElementType() {
			return new IGrammarAwareElementType("Address_RightCurlyBracketKeyword_10_ELEMENT_TYPE", StudentLanguage.INSTANCE, GRAMMAR_ACCESS.getAddressAccess().getRightCurlyBracketKeyword_10());
		}
	}

	public static final IGrammarAwareElementType Address_ELEMENT_TYPE = associate(AddressFactory.createAddressElementType());

	public static final IGrammarAwareElementType Address_Group_ELEMENT_TYPE = associate(AddressFactory.createAddress_GroupElementType());

	public static final IGrammarAwareElementType Address_AddressKeyword_0_ELEMENT_TYPE = associate(AddressFactory.createAddress_AddressKeyword_0ElementType());

	public static final IGrammarAwareElementType Address_LeftCurlyBracketKeyword_1_ELEMENT_TYPE = associate(AddressFactory.createAddress_LeftCurlyBracketKeyword_1ElementType());

	public static final IGrammarAwareElementType Address_StreetAddressKeyword_2_ELEMENT_TYPE = associate(AddressFactory.createAddress_StreetAddressKeyword_2ElementType());

	public static final IGrammarAwareElementType Address_StreetAddressAssignment_3_ELEMENT_TYPE = associate(AddressFactory.createAddress_StreetAddressAssignment_3ElementType());

	public static final IGrammarAwareElementType Address_StreetAddressSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE = associate(AddressFactory.createAddress_StreetAddressSTRINGTerminalRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType Address_CommaKeyword_4_ELEMENT_TYPE = associate(AddressFactory.createAddress_CommaKeyword_4ElementType());

	public static final IGrammarAwareElementType Address_CityKeyword_5_ELEMENT_TYPE = associate(AddressFactory.createAddress_CityKeyword_5ElementType());

	public static final IGrammarAwareElementType Address_CityAssignment_6_ELEMENT_TYPE = associate(AddressFactory.createAddress_CityAssignment_6ElementType());

	public static final IGrammarAwareElementType Address_CitySTRINGTerminalRuleCall_6_0_ELEMENT_TYPE = associate(AddressFactory.createAddress_CitySTRINGTerminalRuleCall_6_0ElementType());

	public static final IGrammarAwareElementType Address_CommaKeyword_7_ELEMENT_TYPE = associate(AddressFactory.createAddress_CommaKeyword_7ElementType());

	public static final IGrammarAwareElementType Address_PostalCodeKeyword_8_ELEMENT_TYPE = associate(AddressFactory.createAddress_PostalCodeKeyword_8ElementType());

	public static final IGrammarAwareElementType Address_PostalCodeAssignment_9_ELEMENT_TYPE = associate(AddressFactory.createAddress_PostalCodeAssignment_9ElementType());

	public static final IGrammarAwareElementType Address_PostalCodeINTTerminalRuleCall_9_0_ELEMENT_TYPE = associate(AddressFactory.createAddress_PostalCodeINTTerminalRuleCall_9_0ElementType());

	public static final IGrammarAwareElementType Address_RightCurlyBracketKeyword_10_ELEMENT_TYPE = associate(AddressFactory.createAddress_RightCurlyBracketKeyword_10ElementType());

	@Override
	public IFileElementType getFileType() {
		return FILE_TYPE;
	}

	@Override
	public IGrammarAwareElementType findElementType(EObject grammarElement) {
		return GRAMMAR_ELEMENT_TYPE.get(grammarElement);
	}
	
	public IGrammarAwareElementType getModelElementType() {
		return Model_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_StudentsAssignmentElementType() {
		return Model_StudentsAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_StudentsStudentParserRuleCall_0ElementType() {
		return Model_StudentsStudentParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudentElementType() {
		return Student_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_GroupElementType() {
		return Student_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_StudentKeyword_0ElementType() {
		return Student_StudentKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_IdAssignment_1ElementType() {
		return Student_IdAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_IdIDTerminalRuleCall_1_0ElementType() {
		return Student_IdIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_NameAssignment_2ElementType() {
		return Student_NameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_NameSTRINGTerminalRuleCall_2_0ElementType() {
		return Student_NameSTRINGTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_AgeAssignment_3ElementType() {
		return Student_AgeAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_AgeINTTerminalRuleCall_3_0ElementType() {
		return Student_AgeINTTerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_AddressAssignment_4ElementType() {
		return Student_AddressAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_AddressAddressParserRuleCall_4_0ElementType() {
		return Student_AddressAddressParserRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStudent_SemicolonKeyword_5ElementType() {
		return Student_SemicolonKeyword_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddressElementType() {
		return Address_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_GroupElementType() {
		return Address_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_AddressKeyword_0ElementType() {
		return Address_AddressKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_LeftCurlyBracketKeyword_1ElementType() {
		return Address_LeftCurlyBracketKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_StreetAddressKeyword_2ElementType() {
		return Address_StreetAddressKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_StreetAddressAssignment_3ElementType() {
		return Address_StreetAddressAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_StreetAddressSTRINGTerminalRuleCall_3_0ElementType() {
		return Address_StreetAddressSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_CommaKeyword_4ElementType() {
		return Address_CommaKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_CityKeyword_5ElementType() {
		return Address_CityKeyword_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_CityAssignment_6ElementType() {
		return Address_CityAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_CitySTRINGTerminalRuleCall_6_0ElementType() {
		return Address_CitySTRINGTerminalRuleCall_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_CommaKeyword_7ElementType() {
		return Address_CommaKeyword_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_PostalCodeKeyword_8ElementType() {
		return Address_PostalCodeKeyword_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_PostalCodeAssignment_9ElementType() {
		return Address_PostalCodeAssignment_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_PostalCodeINTTerminalRuleCall_9_0ElementType() {
		return Address_PostalCodeINTTerminalRuleCall_9_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAddress_RightCurlyBracketKeyword_10ElementType() {
		return Address_RightCurlyBracketKeyword_10_ELEMENT_TYPE;
	}

}
