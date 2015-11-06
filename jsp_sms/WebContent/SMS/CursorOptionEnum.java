// File: CursorOptionEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** CursorOptionEnum enumerated type */
public class CursorOptionEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adHoldRecords */
	public static CursorOptionEnum adHoldRecords = new CursorOptionEnum(256);

	/** enumerated constant adMovePrevious */
	public static CursorOptionEnum adMovePrevious = new CursorOptionEnum(512);

	/** enumerated constant adAddNew */
	public static CursorOptionEnum adAddNew = new CursorOptionEnum(16778240);

	/** enumerated constant adDelete */
	public static CursorOptionEnum adDelete = new CursorOptionEnum(16779264);

	/** enumerated constant adUpdate */
	public static CursorOptionEnum adUpdate = new CursorOptionEnum(16809984);

	/** enumerated constant adBookmark */
	public static CursorOptionEnum adBookmark = new CursorOptionEnum(8192);

	/** enumerated constant adApproxPosition */
	public static CursorOptionEnum adApproxPosition = new CursorOptionEnum(16384);

	/** enumerated constant adUpdateBatch */
	public static CursorOptionEnum adUpdateBatch = new CursorOptionEnum(65536);

	/** enumerated constant adResync */
	public static CursorOptionEnum adResync = new CursorOptionEnum(131072);

	/** enumerated constant adNotify */
	public static CursorOptionEnum adNotify = new CursorOptionEnum(262144);

	/** enumerated constant adFind */
	public static CursorOptionEnum adFind = new CursorOptionEnum(524288);

	/** enumerated constant adSeek */
	public static CursorOptionEnum adSeek = new CursorOptionEnum(4194304);

	/** enumerated constant adIndex */
	public static CursorOptionEnum adIndex = new CursorOptionEnum(8388608);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected CursorOptionEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof CursorOptionEnum && __obj != null && ((CursorOptionEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static CursorOptionEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 256: return adHoldRecords;
			case 512: return adMovePrevious;
			case 16778240: return adAddNew;
			case 16779264: return adDelete;
			case 16809984: return adUpdate;
			case 8192: return adBookmark;
			case 16384: return adApproxPosition;
			case 65536: return adUpdateBatch;
			case 131072: return adResync;
			case 262144: return adNotify;
			case 524288: return adFind;
			case 4194304: return adSeek;
			case 8388608: return adIndex;
		}
		return new CursorOptionEnum(__n);
	}
}
