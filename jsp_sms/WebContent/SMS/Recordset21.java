// File: Recordset21.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** This class corresponds to a COM interface.
  * Objects of this class are not created directly,
  * but are obtained by calling methods of other COM objects.
 */
public class Recordset21 extends ezjcom.JComObject {

	public native SMS.Properties getProperties() throws ezjcom.JComException;

	public native SMS.PositionEnum_Param getAbsolutePosition() throws ezjcom.JComException;

	public native void setAbsolutePosition(SMS.PositionEnum_Param arg) throws ezjcom.JComException;

	public native void setActiveConnection(ezjcom.JComObject arg) throws ezjcom.JComException;

	public native void setActiveConnection_(ezjcom.JComVariant arg) throws ezjcom.JComException;

	public native ezjcom.JComVariant getActiveConnection() throws ezjcom.JComException;

	public native boolean getBOF() throws ezjcom.JComException;

	public native ezjcom.JComVariant getBookmark() throws ezjcom.JComException;

	public native void setBookmark(ezjcom.JComVariant arg) throws ezjcom.JComException;

	public native int getCacheSize() throws ezjcom.JComException;

	public native void setCacheSize(int arg) throws ezjcom.JComException;

	public native SMS.CursorTypeEnum getCursorType() throws ezjcom.JComException;

	public native void setCursorType(SMS.CursorTypeEnum arg) throws ezjcom.JComException;

	public native boolean getEOF() throws ezjcom.JComException;

	public native SMS.Fields getFields() throws ezjcom.JComException;

	public native SMS.LockTypeEnum getLockType() throws ezjcom.JComException;

	public native void setLockType(SMS.LockTypeEnum arg) throws ezjcom.JComException;

	public native int getMaxRecords() throws ezjcom.JComException;

	public native void setMaxRecords(int arg) throws ezjcom.JComException;

	public native int getRecordCount() throws ezjcom.JComException;

	public native void setSource(ezjcom.JComObject arg) throws ezjcom.JComException;

	public native void setSource_(String arg) throws ezjcom.JComException;

	public native ezjcom.JComVariant getSource() throws ezjcom.JComException;

	public native void AddNew() throws ezjcom.JComException;

	public native void AddNew(ezjcom.JComVariant FieldList) throws ezjcom.JComException;

	public native void AddNew(ezjcom.JComVariant FieldList, ezjcom.JComVariant Values) throws ezjcom.JComException;

	public native void CancelUpdate() throws ezjcom.JComException;

	public native void Close() throws ezjcom.JComException;

	public native void Delete(SMS.AffectEnum AffectRecords) throws ezjcom.JComException;

	public native ezjcom.JComVariant GetRows(int Rows) throws ezjcom.JComException;

	public native ezjcom.JComVariant GetRows(int Rows, ezjcom.JComVariant Start) throws ezjcom.JComException;

	public native ezjcom.JComVariant GetRows(int Rows, ezjcom.JComVariant Start, ezjcom.JComVariant Fields) throws ezjcom.JComException;

	public native void Move(int NumRecords) throws ezjcom.JComException;

	public native void Move(int NumRecords, ezjcom.JComVariant Start) throws ezjcom.JComException;

	public native void MoveNext() throws ezjcom.JComException;

	public native void MovePrevious() throws ezjcom.JComException;

	public native void MoveFirst() throws ezjcom.JComException;

	public native void MoveLast() throws ezjcom.JComException;

	public native void Open(ezjcom.JComVariant Source, ezjcom.JComVariant ActiveConnection, SMS.CursorTypeEnum CursorType, SMS.LockTypeEnum LockType, int Options) throws ezjcom.JComException;

	public native void Requery(int Options) throws ezjcom.JComException;

	public native void _xResync(SMS.AffectEnum AffectRecords) throws ezjcom.JComException;

	public native void Update() throws ezjcom.JComException;

	public native void Update(ezjcom.JComVariant Fields) throws ezjcom.JComException;

	public native void Update(ezjcom.JComVariant Fields, ezjcom.JComVariant Values) throws ezjcom.JComException;

	public native SMS.PositionEnum_Param getAbsolutePage() throws ezjcom.JComException;

	public native void setAbsolutePage(SMS.PositionEnum_Param arg) throws ezjcom.JComException;

	public native SMS.EditModeEnum getEditMode() throws ezjcom.JComException;

	public native ezjcom.JComVariant getFilter() throws ezjcom.JComException;

	public native void setFilter(ezjcom.JComVariant arg) throws ezjcom.JComException;

	public native int getPageCount() throws ezjcom.JComException;

	public native int getPageSize() throws ezjcom.JComException;

	public native void setPageSize(int arg) throws ezjcom.JComException;

	public native String getSort() throws ezjcom.JComException;

	public native void setSort(String arg) throws ezjcom.JComException;

	public native int getStatus() throws ezjcom.JComException;

	public native int getState() throws ezjcom.JComException;

	public native SMS._Recordset _xClone() throws ezjcom.JComException;

	public native void UpdateBatch(SMS.AffectEnum AffectRecords) throws ezjcom.JComException;

	public native void CancelBatch(SMS.AffectEnum AffectRecords) throws ezjcom.JComException;

	public native SMS.CursorLocationEnum getCursorLocation() throws ezjcom.JComException;

	public native void setCursorLocation(SMS.CursorLocationEnum arg) throws ezjcom.JComException;

	public native SMS._Recordset NextRecordset() throws ezjcom.JComException;

	/** NextRecordset. 
	 * <P>  Parameter <i>RecordsAffected</i> is an OUT parameter.  It requires an array of size 1.
	 */
	public native SMS._Recordset NextRecordset(ezjcom.JComVariant[] RecordsAffected) throws ezjcom.JComException;

	public native boolean Supports(SMS.CursorOptionEnum CursorOptions) throws ezjcom.JComException;

	public native ezjcom.JComVariant getCollect(ezjcom.JComVariant Index) throws ezjcom.JComException;

	public native void setCollect(ezjcom.JComVariant Index, ezjcom.JComVariant arg) throws ezjcom.JComException;

	public native SMS.MarshalOptionsEnum getMarshalOptions() throws ezjcom.JComException;

	public native void setMarshalOptions(SMS.MarshalOptionsEnum arg) throws ezjcom.JComException;

	public native void Find(String Criteria, int SkipRecords, SMS.SearchDirection SearchDirection) throws ezjcom.JComException;

	public native void Find(String Criteria, int SkipRecords, SMS.SearchDirection SearchDirection, ezjcom.JComVariant Start) throws ezjcom.JComException;

	public native void Cancel() throws ezjcom.JComException;

	public native ezjcom.JComObject getDataSource() throws ezjcom.JComException;

	public native void setDataSource(ezjcom.JComObject arg) throws ezjcom.JComException;

	public native void _xSave(String FileName, SMS.PersistFormatEnum PersistFormat) throws ezjcom.JComException;

	public native ezjcom.JComObject getActiveCommand() throws ezjcom.JComException;

	public native void setStayInSync(boolean arg) throws ezjcom.JComException;

	public native boolean getStayInSync() throws ezjcom.JComException;

	public native String GetString(SMS.StringFormatEnum StringFormat, int NumRows, String ColumnDelimeter, String RowDelimeter, String NullExpr) throws ezjcom.JComException;

	public native String getDataMember() throws ezjcom.JComException;

	public native void setDataMember(String arg) throws ezjcom.JComException;

	public native SMS.CompareEnum CompareBookmarks(ezjcom.JComVariant Bookmark1, ezjcom.JComVariant Bookmark2) throws ezjcom.JComException;

	public native SMS._Recordset Clone(SMS.LockTypeEnum LockType) throws ezjcom.JComException;

	public native void Resync(SMS.AffectEnum AffectRecords, SMS.ResyncEnum ResyncValues) throws ezjcom.JComException;

	public native void Seek(ezjcom.JComVariant KeyValues, SMS.SeekEnum SeekOption) throws ezjcom.JComException;

	public native void setIndex(String arg) throws ezjcom.JComException;

	public native String getIndex() throws ezjcom.JComException;



	// Implementation
	//

	/** Constructors for internal EZ JCom Usage only
	  * DO NOT attempt to construct this object!  It is retrieved from other objects.
	  */
	private Recordset21() {}
	private Recordset21( java.lang.ref.Reference ref ) {}

	private Recordset21( ezjcom.JComObject obj ) throws ezjcom.JComException
	{
		if ( ! __JComLoad( obj, false ))
			throw new ClassCastException( "Object/interface passed does not support \"Recordset21\"" );
	}

	/** Use this method only for creating a COM interface of type Recordset21
	  * from another existing COM interface, when you know that it is possible.
	  */
	public static Recordset21 _ezjcomCoerceObject(ezjcom.JComObject obj) throws ezjcom.JComException { return new Recordset21(obj);}

	/** JNI function used internally by EZ-JCom */
	native boolean __JComLoad( ezjcom.JComObject obj, boolean initial ) throws ezjcom.JComException;
	static {
		System.loadLibrary( "JKCMSMS" );
	}

}

