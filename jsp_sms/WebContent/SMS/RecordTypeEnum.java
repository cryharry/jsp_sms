// File: RecordTypeEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** RecordTypeEnum enumerated type */
public class RecordTypeEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adSimpleRecord */
	public static RecordTypeEnum adSimpleRecord = new RecordTypeEnum(0);

	/** enumerated constant adCollectionRecord */
	public static RecordTypeEnum adCollectionRecord = new RecordTypeEnum(1);

	/** enumerated constant adStructDoc */
	public static RecordTypeEnum adStructDoc = new RecordTypeEnum(2);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected RecordTypeEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof RecordTypeEnum && __obj != null && ((RecordTypeEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static RecordTypeEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 0: return adSimpleRecord;
			case 1: return adCollectionRecord;
			case 2: return adStructDoc;
		}
		return new RecordTypeEnum(__n);
	}
}

