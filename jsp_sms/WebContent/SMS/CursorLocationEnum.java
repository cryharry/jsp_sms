// File: CursorLocationEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** CursorLocationEnum enumerated type */
public class CursorLocationEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adUseNone */
	public static CursorLocationEnum adUseNone = new CursorLocationEnum(1);

	/** enumerated constant adUseServer */
	public static CursorLocationEnum adUseServer = new CursorLocationEnum(2);

	/** enumerated constant adUseClient */
	public static CursorLocationEnum adUseClient = new CursorLocationEnum(3);

	/** enumerated constant adUseClientBatch */
	public static CursorLocationEnum adUseClientBatch = new CursorLocationEnum(3);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected CursorLocationEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof CursorLocationEnum && __obj != null && ((CursorLocationEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static CursorLocationEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 1: return adUseNone;
			case 2: return adUseServer;
			case 3: return adUseClient;
			// ** Duplicate ** case 3: return adUseClientBatch;
		}
		return new CursorLocationEnum(__n);
	}
}
