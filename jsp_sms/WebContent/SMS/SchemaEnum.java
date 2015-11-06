// File: SchemaEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** SchemaEnum enumerated type */
public class SchemaEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adSchemaProviderSpecific */
	public static SchemaEnum adSchemaProviderSpecific = new SchemaEnum(-1);

	/** enumerated constant adSchemaAsserts */
	public static SchemaEnum adSchemaAsserts = new SchemaEnum(0);

	/** enumerated constant adSchemaCatalogs */
	public static SchemaEnum adSchemaCatalogs = new SchemaEnum(1);

	/** enumerated constant adSchemaCharacterSets */
	public static SchemaEnum adSchemaCharacterSets = new SchemaEnum(2);

	/** enumerated constant adSchemaCollations */
	public static SchemaEnum adSchemaCollations = new SchemaEnum(3);

	/** enumerated constant adSchemaColumns */
	public static SchemaEnum adSchemaColumns = new SchemaEnum(4);

	/** enumerated constant adSchemaCheckConstraints */
	public static SchemaEnum adSchemaCheckConstraints = new SchemaEnum(5);

	/** enumerated constant adSchemaConstraintColumnUsage */
	public static SchemaEnum adSchemaConstraintColumnUsage = new SchemaEnum(6);

	/** enumerated constant adSchemaConstraintTableUsage */
	public static SchemaEnum adSchemaConstraintTableUsage = new SchemaEnum(7);

	/** enumerated constant adSchemaKeyColumnUsage */
	public static SchemaEnum adSchemaKeyColumnUsage = new SchemaEnum(8);

	/** enumerated constant adSchemaReferentialContraints */
	public static SchemaEnum adSchemaReferentialContraints = new SchemaEnum(9);

	/** enumerated constant adSchemaReferentialConstraints */
	public static SchemaEnum adSchemaReferentialConstraints = new SchemaEnum(9);

	/** enumerated constant adSchemaTableConstraints */
	public static SchemaEnum adSchemaTableConstraints = new SchemaEnum(10);

	/** enumerated constant adSchemaColumnsDomainUsage */
	public static SchemaEnum adSchemaColumnsDomainUsage = new SchemaEnum(11);

	/** enumerated constant adSchemaIndexes */
	public static SchemaEnum adSchemaIndexes = new SchemaEnum(12);

	/** enumerated constant adSchemaColumnPrivileges */
	public static SchemaEnum adSchemaColumnPrivileges = new SchemaEnum(13);

	/** enumerated constant adSchemaTablePrivileges */
	public static SchemaEnum adSchemaTablePrivileges = new SchemaEnum(14);

	/** enumerated constant adSchemaUsagePrivileges */
	public static SchemaEnum adSchemaUsagePrivileges = new SchemaEnum(15);

	/** enumerated constant adSchemaProcedures */
	public static SchemaEnum adSchemaProcedures = new SchemaEnum(16);

	/** enumerated constant adSchemaSchemata */
	public static SchemaEnum adSchemaSchemata = new SchemaEnum(17);

	/** enumerated constant adSchemaSQLLanguages */
	public static SchemaEnum adSchemaSQLLanguages = new SchemaEnum(18);

	/** enumerated constant adSchemaStatistics */
	public static SchemaEnum adSchemaStatistics = new SchemaEnum(19);

	/** enumerated constant adSchemaTables */
	public static SchemaEnum adSchemaTables = new SchemaEnum(20);

	/** enumerated constant adSchemaTranslations */
	public static SchemaEnum adSchemaTranslations = new SchemaEnum(21);

	/** enumerated constant adSchemaProviderTypes */
	public static SchemaEnum adSchemaProviderTypes = new SchemaEnum(22);

	/** enumerated constant adSchemaViews */
	public static SchemaEnum adSchemaViews = new SchemaEnum(23);

	/** enumerated constant adSchemaViewColumnUsage */
	public static SchemaEnum adSchemaViewColumnUsage = new SchemaEnum(24);

	/** enumerated constant adSchemaViewTableUsage */
	public static SchemaEnum adSchemaViewTableUsage = new SchemaEnum(25);

	/** enumerated constant adSchemaProcedureParameters */
	public static SchemaEnum adSchemaProcedureParameters = new SchemaEnum(26);

	/** enumerated constant adSchemaForeignKeys */
	public static SchemaEnum adSchemaForeignKeys = new SchemaEnum(27);

	/** enumerated constant adSchemaPrimaryKeys */
	public static SchemaEnum adSchemaPrimaryKeys = new SchemaEnum(28);

	/** enumerated constant adSchemaProcedureColumns */
	public static SchemaEnum adSchemaProcedureColumns = new SchemaEnum(29);

	/** enumerated constant adSchemaDBInfoKeywords */
	public static SchemaEnum adSchemaDBInfoKeywords = new SchemaEnum(30);

	/** enumerated constant adSchemaDBInfoLiterals */
	public static SchemaEnum adSchemaDBInfoLiterals = new SchemaEnum(31);

	/** enumerated constant adSchemaCubes */
	public static SchemaEnum adSchemaCubes = new SchemaEnum(32);

	/** enumerated constant adSchemaDimensions */
	public static SchemaEnum adSchemaDimensions = new SchemaEnum(33);

	/** enumerated constant adSchemaHierarchies */
	public static SchemaEnum adSchemaHierarchies = new SchemaEnum(34);

	/** enumerated constant adSchemaLevels */
	public static SchemaEnum adSchemaLevels = new SchemaEnum(35);

	/** enumerated constant adSchemaMeasures */
	public static SchemaEnum adSchemaMeasures = new SchemaEnum(36);

	/** enumerated constant adSchemaProperties */
	public static SchemaEnum adSchemaProperties = new SchemaEnum(37);

	/** enumerated constant adSchemaMembers */
	public static SchemaEnum adSchemaMembers = new SchemaEnum(38);

	/** enumerated constant adSchemaTrustees */
	public static SchemaEnum adSchemaTrustees = new SchemaEnum(39);

	/** enumerated constant adSchemaFunctions */
	public static SchemaEnum adSchemaFunctions = new SchemaEnum(40);

	/** enumerated constant adSchemaActions */
	public static SchemaEnum adSchemaActions = new SchemaEnum(41);

	/** enumerated constant adSchemaCommands */
	public static SchemaEnum adSchemaCommands = new SchemaEnum(42);

	/** enumerated constant adSchemaSets */
	public static SchemaEnum adSchemaSets = new SchemaEnum(43);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected SchemaEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof SchemaEnum && __obj != null && ((SchemaEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static SchemaEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case -1: return adSchemaProviderSpecific;
			case 0: return adSchemaAsserts;
			case 1: return adSchemaCatalogs;
			case 2: return adSchemaCharacterSets;
			case 3: return adSchemaCollations;
			case 4: return adSchemaColumns;
			case 5: return adSchemaCheckConstraints;
			case 6: return adSchemaConstraintColumnUsage;
			case 7: return adSchemaConstraintTableUsage;
			case 8: return adSchemaKeyColumnUsage;
			case 9: return adSchemaReferentialContraints;
			// ** Duplicate ** case 9: return adSchemaReferentialConstraints;
			case 10: return adSchemaTableConstraints;
			case 11: return adSchemaColumnsDomainUsage;
			case 12: return adSchemaIndexes;
			case 13: return adSchemaColumnPrivileges;
			case 14: return adSchemaTablePrivileges;
			case 15: return adSchemaUsagePrivileges;
			case 16: return adSchemaProcedures;
			case 17: return adSchemaSchemata;
			case 18: return adSchemaSQLLanguages;
			case 19: return adSchemaStatistics;
			case 20: return adSchemaTables;
			case 21: return adSchemaTranslations;
			case 22: return adSchemaProviderTypes;
			case 23: return adSchemaViews;
			case 24: return adSchemaViewColumnUsage;
			case 25: return adSchemaViewTableUsage;
			case 26: return adSchemaProcedureParameters;
			case 27: return adSchemaForeignKeys;
			case 28: return adSchemaPrimaryKeys;
			case 29: return adSchemaProcedureColumns;
			case 30: return adSchemaDBInfoKeywords;
			case 31: return adSchemaDBInfoLiterals;
			case 32: return adSchemaCubes;
			case 33: return adSchemaDimensions;
			case 34: return adSchemaHierarchies;
			case 35: return adSchemaLevels;
			case 36: return adSchemaMeasures;
			case 37: return adSchemaProperties;
			case 38: return adSchemaMembers;
			case 39: return adSchemaTrustees;
			case 40: return adSchemaFunctions;
			case 41: return adSchemaActions;
			case 42: return adSchemaCommands;
			case 43: return adSchemaSets;
		}
		return new SchemaEnum(__n);
	}
}
