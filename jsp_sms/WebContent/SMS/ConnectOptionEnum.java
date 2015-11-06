// File: ConnectOptionEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** ConnectOptionEnum enumerated type */
public class ConnectOptionEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adConnectUnspecified */
	public static ConnectOptionEnum adConnectUnspecified = new ConnectOptionEnum(-1);

	/** enumerated constant adAsyncConnect */
	public static ConnectOptionEnum adAsyncConnect = new ConnectOptionEnum(16);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected ConnectOptionEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof ConnectOptionEnum && __obj != null && ((ConnectOptionEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static ConnectOptionEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case -1: return adConnectUnspecified;
			case 16: return adAsyncConnect;
		}
		return new ConnectOptionEnum(__n);
	}
}
