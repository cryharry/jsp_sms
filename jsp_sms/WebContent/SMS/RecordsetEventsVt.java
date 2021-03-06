// File: RecordsetEventsVt.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class RecordsetEventsVt extends ezjcom.JComObject {

	/** WillChangeField. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void WillChangeField(int cFields, ezjcom.JComVariant Fields, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** FieldChangeComplete. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void FieldChangeComplete(int cFields, ezjcom.JComVariant Fields, SMS.Error pError, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** WillChangeRecord. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void WillChangeRecord(SMS.EventReasonEnum adReason, int cRecords, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** RecordChangeComplete. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void RecordChangeComplete(SMS.EventReasonEnum adReason, int cRecords, SMS.Error pError, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** WillChangeRecordset. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void WillChangeRecordset(SMS.EventReasonEnum adReason, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** RecordsetChangeComplete. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void RecordsetChangeComplete(SMS.EventReasonEnum adReason, SMS.Error pError, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** WillMove. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void WillMove(SMS.EventReasonEnum adReason, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** MoveComplete. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void MoveComplete(SMS.EventReasonEnum adReason, SMS.Error pError, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** EndOfRecordset. 
	 * <P>  Parameter <i>fMoreData</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 * <BR> Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void EndOfRecordset(boolean[] fMoreData, 
		SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** FetchProgress. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void FetchProgress(int Progress, int MaxProgress, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;

	/** FetchComplete. 
	 * <P>  Parameter <i>adStatus</i> is an IN/OUT parameter.  It requires an initialized array of size 1.
	 */
	public native void FetchComplete(SMS.Error pError, SMS.EventStatusEnum[] adStatus, 
		SMS._Recordset pRecordset) throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private RecordsetEventsVt() {}
	private RecordsetEventsVt( java.lang.ref.Reference ref ) {}

	private RecordsetEventsVt( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"RecordsetEventsVt\"" );
	}

	/** Use this method only for creating a COM interface of type RecordsetEventsVt
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static RecordsetEventsVt _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new RecordsetEventsVt(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

