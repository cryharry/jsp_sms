// File: ConnectPromptEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** ConnectPromptEnum enumerated type */
public class ConnectPromptEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adPromptAlways */
	public static ConnectPromptEnum adPromptAlways = new ConnectPromptEnum(1);

	/** enumerated constant adPromptComplete */
	public static ConnectPromptEnum adPromptComplete = new ConnectPromptEnum(2);

	/** enumerated constant adPromptCompleteRequired */
	public static ConnectPromptEnum adPromptCompleteRequired = new ConnectPromptEnum(3);

	/** enumerated constant adPromptNever */
	public static ConnectPromptEnum adPromptNever = new ConnectPromptEnum(4);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected ConnectPromptEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof ConnectPromptEnum && __obj != null && ((ConnectPromptEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static ConnectPromptEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 1: return adPromptAlways;
			case 2: return adPromptComplete;
			case 3: return adPromptCompleteRequired;
			case 4: return adPromptNever;
		}
		return new ConnectPromptEnum(__n);
	}
}

