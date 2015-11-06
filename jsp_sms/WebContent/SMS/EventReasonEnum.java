// File: EventReasonEnum.java
// Generated: Thu Oct 22 12:17:11 2015

// This Java source file has been automatically
// generated by EZ-JCom.

package SMS;

/** EventReasonEnum enumerated type */
public class EventReasonEnum extends ezjcom.JComEnumeration {


	/** enumerated constant adRsnAddNew */
	public static EventReasonEnum adRsnAddNew = new EventReasonEnum(1);

	/** enumerated constant adRsnDelete */
	public static EventReasonEnum adRsnDelete = new EventReasonEnum(2);

	/** enumerated constant adRsnUpdate */
	public static EventReasonEnum adRsnUpdate = new EventReasonEnum(3);

	/** enumerated constant adRsnUndoUpdate */
	public static EventReasonEnum adRsnUndoUpdate = new EventReasonEnum(4);

	/** enumerated constant adRsnUndoAddNew */
	public static EventReasonEnum adRsnUndoAddNew = new EventReasonEnum(5);

	/** enumerated constant adRsnUndoDelete */
	public static EventReasonEnum adRsnUndoDelete = new EventReasonEnum(6);

	/** enumerated constant adRsnRequery */
	public static EventReasonEnum adRsnRequery = new EventReasonEnum(7);

	/** enumerated constant adRsnResynch */
	public static EventReasonEnum adRsnResynch = new EventReasonEnum(8);

	/** enumerated constant adRsnClose */
	public static EventReasonEnum adRsnClose = new EventReasonEnum(9);

	/** enumerated constant adRsnMove */
	public static EventReasonEnum adRsnMove = new EventReasonEnum(10);

	/** enumerated constant adRsnFirstChange */
	public static EventReasonEnum adRsnFirstChange = new EventReasonEnum(11);

	/** enumerated constant adRsnMoveFirst */
	public static EventReasonEnum adRsnMoveFirst = new EventReasonEnum(12);

	/** enumerated constant adRsnMoveNext */
	public static EventReasonEnum adRsnMoveNext = new EventReasonEnum(13);

	/** enumerated constant adRsnMovePrevious */
	public static EventReasonEnum adRsnMovePrevious = new EventReasonEnum(14);

	/** enumerated constant adRsnMoveLast */
	public static EventReasonEnum adRsnMoveLast = new EventReasonEnum(15);


	/** Default constructor (protected; use intToEnumeratedValue to obtain enumerated values from integers.) */
	protected EventReasonEnum( int __n ) { __Ezj_value = __n; }

	/** Compare two enumerated values for being equal */
	public boolean equals( Object __obj ) { return __obj instanceof EventReasonEnum && __obj != null && ((EventReasonEnum)__obj).getEnumeratedIntValue() == __Ezj_value; }

	/** Returns an enumerated value corresponding to a given integer. */
	public static EventReasonEnum intToEnumeratedValue( int __n ) {
		switch ( __n  ) {
			case 1: return adRsnAddNew;
			case 2: return adRsnDelete;
			case 3: return adRsnUpdate;
			case 4: return adRsnUndoUpdate;
			case 5: return adRsnUndoAddNew;
			case 6: return adRsnUndoDelete;
			case 7: return adRsnRequery;
			case 8: return adRsnResynch;
			case 9: return adRsnClose;
			case 10: return adRsnMove;
			case 11: return adRsnFirstChange;
			case 12: return adRsnMoveFirst;
			case 13: return adRsnMoveNext;
			case 14: return adRsnMovePrevious;
			case 15: return adRsnMoveLast;
		}
		return new EventReasonEnum(__n);
	}
}
