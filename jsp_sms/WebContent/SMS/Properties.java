// File: Properties.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class Properties extends ezjcom.JComObject {

	public native int getCount() throws ezjcom.JComException;

	public native void Refresh() throws ezjcom.JComException;

	public native SMS.Property getItem(ezjcom.JComVariant Index) throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private Properties() {}
	private Properties( java.lang.ref.Reference ref ) {}

	private Properties( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"Properties\"" );
	}

	/** Use this method only for creating a COM interface of type Properties
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static Properties _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new Properties(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

