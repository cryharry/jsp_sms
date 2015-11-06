// File: Field15.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class Field15 extends ezjcom.JComObject {

	public native SMS.Properties getProperties() throws ezjcom.JComException;

	public native int getActualSize() throws ezjcom.JComException;

	public native int getAttributes() throws ezjcom.JComException;

	public native int getDefinedSize() throws ezjcom.JComException;

	public native String getName() throws ezjcom.JComException;

	public native SMS.DataTypeEnum getType() throws ezjcom.JComException;

	public native ezjcom.JComVariant getValue() throws ezjcom.JComException;

	public native void setValue(ezjcom.JComVariant arg) throws ezjcom.JComException;

	public native byte getPrecision() throws ezjcom.JComException;

	public native byte getNumericScale() throws ezjcom.JComException;

	public native void AppendChunk(ezjcom.JComVariant Data) throws ezjcom.JComException;

	public native ezjcom.JComVariant GetChunk(int Length) throws ezjcom.JComException;

	public native ezjcom.JComVariant getOriginalValue() throws ezjcom.JComException;

	public native ezjcom.JComVariant getUnderlyingValue() throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private Field15() {}
	private Field15( java.lang.ref.Reference ref ) {}

	private Field15( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"Field15\"" );
	}

	/** Use this method only for creating a COM interface of type Field15
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static Field15 _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new Field15(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

