// File: ADCPROP_AUTORECALC_ENUM.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** ADCPROP_AUTORECALC_ENUM enumerated type */
public class ADCPROP_AUTORECALC_ENUM extends ezjcom.JComEnumeration {


	/** enumerated constant adRecalcUpFront */
	public static ADCPROP_AUTORECALC_ENUM adRecalcUpFront = new ADCPROP_AUTORECALC_ENUM(0);

	/** enumerated constant adRecalcAlways */
	public static ADCPROP_AUTORECALC_ENUM adRecalcAlways = new ADCPROP_AUTORECALC_ENUM(1);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected ADCPROP_AUTORECALC_ENUM( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof ADCPROP_AUTORECALC_ENUM && __obj != null && ((ADCPROP_AUTORECALC_ENUM)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static ADCPROP_AUTORECALC_ENUM intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 0: return adRecalcUpFront;
			case 1: return adRecalcAlways;
		}
		return new ADCPROP_AUTORECALC_ENUM(__n);
	}
}

