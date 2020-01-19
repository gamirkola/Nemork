/* =============================================================================
 *                      GENERATED FILE - DO NOT MODIFY
 * =============================================================================
 * Copyright (c) 2016 Microsoft. All rights reserved.
 * 
 */
package com.skype;
import android.support.v4.util.SparseArrayCompat;
import java.util.Set;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import com.skype.NativeStringConvert;

public interface ContentSharing extends ObjectInterface {
	public enum STATUS {
		INITIAL(0),
		ROUTING(1),
		RINGING(2),
		PRESENTING(3),
		CONNECTED(4),
		VIEWING(5),
		FINISHING(6),
		DONE(7),
		SHARING_FAILED(8),
		TIMED_OUT(9),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		STATUS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<STATUS> intToTypeMap = new SparseArrayCompat< STATUS>();
		
		static {
			for (STATUS type : STATUS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static STATUS fromInt(int i) {
			STATUS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : STATUS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum FAILUREREASON {
		NOFAILURE(0),
		FAILURE(1),
		SESSION_NOT_FOUND(2),
		SESSION_TIMED_OUT(3),
		NETWORK_ERROR(4),
		NETWORK_CANNOT_CONNECT_ERROR(5),
		AUTH_FAILURE(6),
		SERVICE_FAILURE(7),
		REQUEST_TIMED_OUT(8),
		ACTION_NOT_ALLOWED(9),
		FORBIDDEN(10),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		FAILUREREASON(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<FAILUREREASON> intToTypeMap = new SparseArrayCompat< FAILUREREASON>();
		
		static {
			for (FAILUREREASON type : FAILUREREASON.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static FAILUREREASON fromInt(int i) {
			FAILUREREASON tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : FAILUREREASON.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum CONTENTROLE {
		NONE(0),
		ATTENDEE(1),
		PRESENTER(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		CONTENTROLE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<CONTENTROLE> intToTypeMap = new SparseArrayCompat< CONTENTROLE>();
		
		static {
			for (CONTENTROLE type : CONTENTROLE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static CONTENTROLE fromInt(int i) {
			CONTENTROLE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : CONTENTROLE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public int getCallIdProp();

	public String getIdentityProp();

	public int getStatusProp();

	public String getSharingIdProp();

	public String getStateProp();

	public int getFailureReasonProp();

	public int getFailurecodeProp();

	public int getFailuresubcodeProp();

	public interface ContentSharingIListener {
		void onJoinContentSharingResult(ContentSharing sender, ContentSharing.FAILUREREASON failureReason, int code, int subCode);
		void onTakeContentSharingControlResult(ContentSharing sender, ContentSharing.FAILUREREASON failureReason, int code, int subCode);
		void onUpdateContentSharingParticipantStateResult(ContentSharing sender, ContentSharing.FAILUREREASON failureReason, int code, int subCode);
		void onUpdateContentSharingSessionStateResult(ContentSharing sender, String id, ContentSharing.FAILUREREASON failureReason, int code, int subCode);
	}

	public void addListener(ContentSharingIListener listener);

	public void removeListener(ContentSharingIListener listener);

	
	public boolean startContentSharing();

	public void stopContentSharing();

	public boolean takeContentSharingControl();

	public boolean updateContentSharingParticipantState();

	public boolean updateContentSharingSessionState(String id, String sessionState);

}

