// File: _ADO.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class _ADO extends ezjcom.JComObject {

	public native SMS.Properties getProperties() throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private _ADO() {}
	private _ADO( java.lang.ref.Reference ref ) {}

	private _ADO( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"_ADO\"" );
	}

	/** Use this method only for creating a COM interface of type _ADO
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static _ADO _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new _ADO(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

