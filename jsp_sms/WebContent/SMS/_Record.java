// File: _Record.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class _Record extends ezjcom.JComObject {

	public native SMS.Properties getProperties() throws ezjcom.JComException;

	public native ezjcom.JComVariant getActiveConnection() throws ezjcom.JComException;

	public native void setActiveConnection(String arg) throws ezjcom.JComException;

	public native void setActiveConnection_(SMS._Connection arg) throws ezjcom.JComException;

	public native SMS.ObjectStateEnum getState() throws ezjcom.JComException;

	public native ezjcom.JComVariant getSource() throws ezjcom.JComException;

	public native void setSource(String arg) throws ezjcom.JComException;

	public native void setSource_(ezjcom.JComObject arg) throws ezjcom.JComException;

	public native SMS.ConnectModeEnum getMode() throws ezjcom.JComException;

	public native void setMode(SMS.ConnectModeEnum arg) throws ezjcom.JComException;

	public native String getParentURL() throws ezjcom.JComException;

	public native String MoveRecord(String Source, String Destination, String UserName, String Password, SMS.MoveRecordOptionsEnum Options, boolean Async) throws ezjcom.JComException;

	public native String CopyRecord(String Source, String Destination, String UserName, String Password, SMS.CopyRecordOptionsEnum Options, boolean Async) throws ezjcom.JComException;

	public native void DeleteRecord(String Source, boolean Async) throws ezjcom.JComException;

	public native void Open(ezjcom.JComVariant Source, ezjcom.JComVariant ActiveConnection, SMS.ConnectModeEnum Mode, SMS.RecordCreateOptionsEnum CreateOptions, SMS.RecordOpenOptionsEnum Options, String UserName, String Password) throws ezjcom.JComException;

	public native void Close() throws ezjcom.JComException;

	public native SMS.Fields getFields() throws ezjcom.JComException;

	public native SMS.RecordTypeEnum getRecordType() throws ezjcom.JComException;

	public native SMS._Recordset GetChildren() throws ezjcom.JComException;

	public native void Cancel() throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private _Record() {}
	private _Record( java.lang.ref.Reference ref ) {}

	private _Record( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"_Record\"" );
	}

	/** Use this method only for creating a COM interface of type _Record
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static _Record _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new _Record(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

