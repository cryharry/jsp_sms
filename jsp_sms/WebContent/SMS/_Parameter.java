// File: _Parameter.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class _Parameter extends ezjcom.JComObject {

	public native SMS.Properties getProperties() throws ezjcom.JComException;

	public native String getName() throws ezjcom.JComException;

	public native void setName(String arg) throws ezjcom.JComException;

	public native ezjcom.JComVariant getValue() throws ezjcom.JComException;

	public native void setValue(ezjcom.JComVariant arg) throws ezjcom.JComException;

	public native SMS.DataTypeEnum getType() throws ezjcom.JComException;

	public native void setType(SMS.DataTypeEnum arg) throws ezjcom.JComException;

	public native void setDirection(SMS.ParameterDirectionEnum arg) throws ezjcom.JComException;

	public native SMS.ParameterDirectionEnum getDirection() throws ezjcom.JComException;

	public native void setPrecision(byte arg) throws ezjcom.JComException;

	public native byte getPrecision() throws ezjcom.JComException;

	public native void setNumericScale(byte arg) throws ezjcom.JComException;

	public native byte getNumericScale() throws ezjcom.JComException;

	public native void setSize(int arg) throws ezjcom.JComException;

	public native int getSize() throws ezjcom.JComException;

	public native void AppendChunk(ezjcom.JComVariant Val) throws ezjcom.JComException;

	public native int getAttributes() throws ezjcom.JComException;

	public native void setAttributes(int arg) throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private _Parameter() {}
	private _Parameter( java.lang.ref.Reference ref ) {}

	private _Parameter( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"_Parameter\"" );
	}

	/** Use this method only for creating a COM interface of type _Parameter
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static _Parameter _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new _Parameter(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

