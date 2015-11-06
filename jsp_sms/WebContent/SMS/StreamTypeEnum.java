// File: StreamTypeEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** StreamTypeEnum enumerated type */
public class StreamTypeEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adTypeBinary */
	public static StreamTypeEnum adTypeBinary = new StreamTypeEnum(1);

	/** enumerated constant adTypeText */
	public static StreamTypeEnum adTypeText = new StreamTypeEnum(2);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected StreamTypeEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof StreamTypeEnum && __obj != null && ((StreamTypeEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static StreamTypeEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 1: return adTypeBinary;
			case 2: return adTypeText;
		}
		return new StreamTypeEnum(__n);
	}
}

