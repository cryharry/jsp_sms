// File: ADOConnectionConstruction15.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class ADOConnectionConstruction15 extends ezjcom.JComObject {

	public native ezjcom.JComObject getDSO() throws ezjcom.JComException;

	public native ezjcom.JComObject getSession() throws ezjcom.JComException;

	public native void WrapDSOandSession(ezjcom.JComObject pDSO, ezjcom.JComObject pSession) throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private ADOConnectionConstruction15() {}
	private ADOConnectionConstruction15( java.lang.ref.Reference ref ) {}

	private ADOConnectionConstruction15( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"ADOConnectionConstruction15\"" );
	}

	/** Use this method only for creating a COM interface of type ADOConnectionConstruction15
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static ADOConnectionConstruction15 _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new ADOConnectionConstruction15(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

