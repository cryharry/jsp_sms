// File: StreamOpenOptionsEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** StreamOpenOptionsEnum enumerated type */
public class StreamOpenOptionsEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adOpenStreamUnspecified */
	public static StreamOpenOptionsEnum adOpenStreamUnspecified = new StreamOpenOptionsEnum(-1);

	/** enumerated constant adOpenStreamAsync */
	public static StreamOpenOptionsEnum adOpenStreamAsync = new StreamOpenOptionsEnum(1);

	/** enumerated constant adOpenStreamFromRecord */
	public static StreamOpenOptionsEnum adOpenStreamFromRecord = new StreamOpenOptionsEnum(4);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected StreamOpenOptionsEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof StreamOpenOptionsEnum && __obj != null && ((StreamOpenOptionsEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static StreamOpenOptionsEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case -1: return adOpenStreamUnspecified;
			case 1: return adOpenStreamAsync;
			case 4: return adOpenStreamFromRecord;
		}
		return new StreamOpenOptionsEnum(__n);
	}
}
