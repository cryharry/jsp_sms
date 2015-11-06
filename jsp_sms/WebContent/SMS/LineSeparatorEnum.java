// File: LineSeparatorEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** LineSeparatorEnum enumerated type */
public class LineSeparatorEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adLF */
	public static LineSeparatorEnum adLF = new LineSeparatorEnum(10);

	/** enumerated constant adCR */
	public static LineSeparatorEnum adCR = new LineSeparatorEnum(13);

	/** enumerated constant adCRLF */
	public static LineSeparatorEnum adCRLF = new LineSeparatorEnum(-1);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected LineSeparatorEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof LineSeparatorEnum && __obj != null && ((LineSeparatorEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static LineSeparatorEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 10: return adLF;
			case 13: return adCR;
			case -1: return adCRLF;
		}
		return new LineSeparatorEnum(__n);
	}
}

