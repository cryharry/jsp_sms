// File: SearchDirection.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** SearchDirection enumerated type */
public class SearchDirection extends ezjcom.JComEnumeration {


	/** enumerated constant adSearchForward */
	public static SearchDirection adSearchForward = new SearchDirection(1);

	/** enumerated constant adSearchBackward */
	public static SearchDirection adSearchBackward = new SearchDirection(-1);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected SearchDirection( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof SearchDirection && __obj != null && ((SearchDirection)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static SearchDirection intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 1: return adSearchForward;
			case -1: return adSearchBackward;
		}
		return new SearchDirection(__n);
	}
}

