// File: _Connection.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class _Connection extends ezjcom.JComObject {

	public native SMS.Properties getProperties() throws ezjcom.JComException;

	public native String getConnectionString() throws ezjcom.JComException;

	public native void setConnectionString(String arg) throws ezjcom.JComException;

	public native int getCommandTimeout() throws ezjcom.JComException;

	public native void setCommandTimeout(int arg) throws ezjcom.JComException;

	public native int getConnectionTimeout() throws ezjcom.JComException;

	public native void setConnectionTimeout(int arg) throws ezjcom.JComException;

	public native String getVersion() throws ezjcom.JComException;

	public native void Close() throws ezjcom.JComException;

	/** Execute. 
	 * <P>  Parameter <i>RecordsAffected</i> is an OUT parameter.  It requires an array of size 1.
	 */
	public native SMS._Recordset Execute(String CommandText, ezjcom.JComVariant[] RecordsAffected, 
		int Options) throws ezjcom.JComException;

	public native int BeginTrans() throws ezjcom.JComException;

	public native void CommitTrans() throws ezjcom.JComException;

	public native void RollbackTrans() throws ezjcom.JComException;

	public native void Open(String ConnectionString, String UserID, String Password, int Options) throws ezjcom.JComException;

	public native SMS.Errors getErrors() throws ezjcom.JComException;

	public native String getDefaultDatabase() throws ezjcom.JComException;

	public native void setDefaultDatabase(String arg) throws ezjcom.JComException;

	public native SMS.IsolationLevelEnum getIsolationLevel() throws ezjcom.JComException;

	public native void setIsolationLevel(SMS.IsolationLevelEnum arg) throws ezjcom.JComException;

	public native int getAttributes() throws ezjcom.JComException;

	public native void setAttributes(int arg) throws ezjcom.JComException;

	public native SMS.CursorLocationEnum getCursorLocation() throws ezjcom.JComException;

	public native void setCursorLocation(SMS.CursorLocationEnum arg) throws ezjcom.JComException;

	public native SMS.ConnectModeEnum getMode() throws ezjcom.JComException;

	public native void setMode(SMS.ConnectModeEnum arg) throws ezjcom.JComException;

	public native String getProvider() throws ezjcom.JComException;

	public native void setProvider(String arg) throws ezjcom.JComException;

	public native int getState() throws ezjcom.JComException;

	public native SMS._Recordset OpenSchema(SMS.SchemaEnum Schema) throws ezjcom.JComException;

	public native SMS._Recordset OpenSchema(SMS.SchemaEnum Schema, ezjcom.JComVariant Restrictions) throws ezjcom.JComException;

	public native SMS._Recordset OpenSchema(SMS.SchemaEnum Schema, ezjcom.JComVariant Restrictions, ezjcom.JComVariant SchemaID) throws ezjcom.JComException;

	public native void Cancel() throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private _Connection() {}
	private _Connection( java.lang.ref.Reference ref ) {}

	private _Connection( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"_Connection\"" );
	}

	/** Use this method only for creating a COM interface of type _Connection
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static _Connection _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new _Connection(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

