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

public interface CallHandler extends ObjectInterface {
	public enum DTMF {
		DTMF_0(0),
		DTMF_1(1),
		DTMF_2(2),
		DTMF_3(3),
		DTMF_4(4),
		DTMF_5(5),
		DTMF_6(6),
		DTMF_7(7),
		DTMF_8(8),
		DTMF_9(9),
		DTMF_STAR(10),
		DTMF_POUND(11),
		DTMF_A(12),
		DTMF_B(13),
		DTMF_C(14),
		DTMF_D(15),
		DTMF_FLASH(16),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		DTMF(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<DTMF> intToTypeMap = new SparseArrayCompat< DTMF>();
		
		static {
			for (DTMF type : DTMF.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static DTMF fromInt(int i) {
			DTMF tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : DTMF.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MODALITY_TYPE {
		AUDIO(0),
		VIDEO(1),
		SCREENSHARE(2),
		DATACHANNEL(3),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MODALITY_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MODALITY_TYPE> intToTypeMap = new SparseArrayCompat< MODALITY_TYPE>();
		
		static {
			for (MODALITY_TYPE type : MODALITY_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MODALITY_TYPE fromInt(int i) {
			MODALITY_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MODALITY_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MEDIA_DIRECTION {
		DISABLED(0),
		INACTIVE(1),
		SENDTOPEER(2),
		RECEIVEFROMPEER(3),
		BIDIRECTIONAL(4),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MEDIA_DIRECTION(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MEDIA_DIRECTION> intToTypeMap = new SparseArrayCompat< MEDIA_DIRECTION>();
		
		static {
			for (MEDIA_DIRECTION type : MEDIA_DIRECTION.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MEDIA_DIRECTION fromInt(int i) {
			MEDIA_DIRECTION tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MEDIA_DIRECTION.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MEDIA_STREAM_STATE {
		STREAM_CREATED(0),
		STREAM_REMOVED(1),
		STREAM_STARTED(2),
		STREAM_INACTIVE(3),
		STREAM_ACTIVE(4),
		STREAM_STOPPED(5),
		STREAM_FAIL(6),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MEDIA_STREAM_STATE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MEDIA_STREAM_STATE> intToTypeMap = new SparseArrayCompat< MEDIA_STREAM_STATE>();
		
		static {
			for (MEDIA_STREAM_STATE type : MEDIA_STREAM_STATE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MEDIA_STREAM_STATE fromInt(int i) {
			MEDIA_STREAM_STATE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MEDIA_STREAM_STATE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MUTE_FLAGS {
		MUTE_MICROPHONE(1),
		MUTE_SPEAKER(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MUTE_FLAGS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MUTE_FLAGS> intToTypeMap = new SparseArrayCompat< MUTE_FLAGS>();
		
		static {
			for (MUTE_FLAGS type : MUTE_FLAGS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MUTE_FLAGS fromInt(int i) {
			MUTE_FLAGS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MUTE_FLAGS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PREHEAT_FLAGS {
		IS_PREHEAT_ONLY(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PREHEAT_FLAGS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PREHEAT_FLAGS> intToTypeMap = new SparseArrayCompat< PREHEAT_FLAGS>();
		
		static {
			for (PREHEAT_FLAGS type : PREHEAT_FLAGS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PREHEAT_FLAGS fromInt(int i) {
			PREHEAT_FLAGS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PREHEAT_FLAGS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MEDIA_NEGOTIATION_STATUS_CODE {
		SUCCEEDED(0),
		ERRORLOCALINTERNAL(1),
		ERRORREMOTEINTERNAL(2),
		OFFERNOTACCEPTABLE(3),
		OFFERDECLINED(4),
		LOCALCANCEL(5),
		REMOTECANCEL(6),
		FAILEDNORETRY(7),
		TERMINATED(8),
		GENERALFAILURE(9),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MEDIA_NEGOTIATION_STATUS_CODE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MEDIA_NEGOTIATION_STATUS_CODE> intToTypeMap = new SparseArrayCompat< MEDIA_NEGOTIATION_STATUS_CODE>();
		
		static {
			for (MEDIA_NEGOTIATION_STATUS_CODE type : MEDIA_NEGOTIATION_STATUS_CODE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MEDIA_NEGOTIATION_STATUS_CODE fromInt(int i) {
			MEDIA_NEGOTIATION_STATUS_CODE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MEDIA_NEGOTIATION_STATUS_CODE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum ANSWER_MEDIA_TYPE {
		ANSWER_WITH_AUDIO_ONLY(0),
		ANSWER_WITH_AUDIO_VIDEO(1),
		ANSWER_WITH_SCREENSHARE_ONLY(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		ANSWER_MEDIA_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<ANSWER_MEDIA_TYPE> intToTypeMap = new SparseArrayCompat< ANSWER_MEDIA_TYPE>();
		
		static {
			for (ANSWER_MEDIA_TYPE type : ANSWER_MEDIA_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static ANSWER_MEDIA_TYPE fromInt(int i) {
			ANSWER_MEDIA_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : ANSWER_MEDIA_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum CAPABILITY {
		CAPABILITY_NONE(0),
		CAN_CONFERENCE(1),
		CAN_SHARE_SCREEN(2),
		CAN_MERGE(4),
		CAPABILITY_ALL(-1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		CAPABILITY(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<CAPABILITY> intToTypeMap = new SparseArrayCompat< CAPABILITY>();
		
		static {
			for (CAPABILITY type : CAPABILITY.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static CAPABILITY fromInt(int i) {
			CAPABILITY tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : CAPABILITY.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum SELF_CAPABILITY {
		SELF_CAPABILITY_NONE(0),
		MAY_UNMUTE_SELF(1),
		MAY_MUTE_OTHERS(2),
		SELF_CAPABILITY_ALL(-1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		SELF_CAPABILITY(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<SELF_CAPABILITY> intToTypeMap = new SparseArrayCompat< SELF_CAPABILITY>();
		
		static {
			for (SELF_CAPABILITY type : SELF_CAPABILITY.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static SELF_CAPABILITY fromInt(int i) {
			SELF_CAPABILITY tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : SELF_CAPABILITY.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum ENDPOINT_TYPE {
		DEFAULT(0),
		LYNC(1),
		VOICEMAIL(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		ENDPOINT_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<ENDPOINT_TYPE> intToTypeMap = new SparseArrayCompat< ENDPOINT_TYPE>();
		
		static {
			for (ENDPOINT_TYPE type : ENDPOINT_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static ENDPOINT_TYPE fromInt(int i) {
			ENDPOINT_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : ENDPOINT_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MUTE_SCOPE {
		ALL(1),
		SPECIFIED(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MUTE_SCOPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MUTE_SCOPE> intToTypeMap = new SparseArrayCompat< MUTE_SCOPE>();
		
		static {
			for (MUTE_SCOPE type : MUTE_SCOPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MUTE_SCOPE fromInt(int i) {
			MUTE_SCOPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MUTE_SCOPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum REMOVE_ENDPOINT_SCOPE {
		REMOVE_ENDPOINT_SCOPE_NONE(0),
		REMOVE_ENDPOINT_SCOPE_OTHER(1),
		REMOVE_ENDPOINT_SCOPE_SPECIFIED(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		REMOVE_ENDPOINT_SCOPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<REMOVE_ENDPOINT_SCOPE> intToTypeMap = new SparseArrayCompat< REMOVE_ENDPOINT_SCOPE>();
		
		static {
			for (REMOVE_ENDPOINT_SCOPE type : REMOVE_ENDPOINT_SCOPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static REMOVE_ENDPOINT_SCOPE fromInt(int i) {
			REMOVE_ENDPOINT_SCOPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : REMOVE_ENDPOINT_SCOPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MEDIA_PEER_TYPE {
		CONSUMER_TWOPARTY(1),
		CONSUMER_PSTN(2),
		CONSUMER_MULTIPARTY(3),
		ENTERPRISE_TWOPARTY_ONLINE_ONLY(4),
		ENTERPRISE_TWOPARTY_HYBRID(5),
		ENTERPRISE_MULTIPARTY(6),
		ENTERPRISE_PSTN_ONLINE_ONLY(7),
		ENTERPRISE_PSTN_HYBRID(8),
		ENTERPRISE_TWOPARTY_FEDERATED(9),
		ENTERPRISE_UNKNOWN(10),
		ENTERPRISE_MULTIPARTY_BROADCASTING(11),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MEDIA_PEER_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MEDIA_PEER_TYPE> intToTypeMap = new SparseArrayCompat< MEDIA_PEER_TYPE>();
		
		static {
			for (MEDIA_PEER_TYPE type : MEDIA_PEER_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MEDIA_PEER_TYPE fromInt(int i) {
			MEDIA_PEER_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MEDIA_PEER_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum QUALITYRATING {
		VERY_BAD(0),
		BAD(1),
		AVERAGE(2),
		GOOD(3),
		VERY_GOOD(4),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		QUALITYRATING(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<QUALITYRATING> intToTypeMap = new SparseArrayCompat< QUALITYRATING>();
		
		static {
			for (QUALITYRATING type : QUALITYRATING.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static QUALITYRATING fromInt(int i) {
			QUALITYRATING tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : QUALITYRATING.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum AUDIO_USAGE_MODE {
		AUM_DEFAULT(0),
		AUM_LONGRANGE_SPEAKER(1),
		AUM_AUDITORIUM(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		AUDIO_USAGE_MODE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<AUDIO_USAGE_MODE> intToTypeMap = new SparseArrayCompat< AUDIO_USAGE_MODE>();
		
		static {
			for (AUDIO_USAGE_MODE type : AUDIO_USAGE_MODE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static AUDIO_USAGE_MODE fromInt(int i) {
			AUDIO_USAGE_MODE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : AUDIO_USAGE_MODE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum OPERATIONRESULTCODE {
		OPERATIONRESULTNONE(0),
		OPERATIONRESULTFAILURE(1),
		OPERATIONRESULTSUCCESS(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		OPERATIONRESULTCODE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<OPERATIONRESULTCODE> intToTypeMap = new SparseArrayCompat< OPERATIONRESULTCODE>();
		
		static {
			for (OPERATIONRESULTCODE type : OPERATIONRESULTCODE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static OPERATIONRESULTCODE fromInt(int i) {
			OPERATIONRESULTCODE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : OPERATIONRESULTCODE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum CONNECTION_TYPE {
		ALL_SUPPORTED(0),
		NO_DIRECT_CONNECTION(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		CONNECTION_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<CONNECTION_TYPE> intToTypeMap = new SparseArrayCompat< CONNECTION_TYPE>();
		
		static {
			for (CONNECTION_TYPE type : CONNECTION_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static CONNECTION_TYPE fromInt(int i) {
			CONNECTION_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : CONNECTION_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum INVITATION_TYPE {
		NONE(0),
		NUDGE(1),
		DIALOUT(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		INVITATION_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<INVITATION_TYPE> intToTypeMap = new SparseArrayCompat< INVITATION_TYPE>();
		
		static {
			for (INVITATION_TYPE type : INVITATION_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static INVITATION_TYPE fromInt(int i) {
			INVITATION_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : INVITATION_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PARK_CONTEXT {
		INVALID(0),
		TEAM(1),
		SHAREDLINE(2),
		SERVERHOLD(3),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PARK_CONTEXT(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PARK_CONTEXT> intToTypeMap = new SparseArrayCompat< PARK_CONTEXT>();
		
		static {
			for (PARK_CONTEXT type : PARK_CONTEXT.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PARK_CONTEXT fromInt(int i) {
			PARK_CONTEXT tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PARK_CONTEXT.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum TRANSFER_TYPE {
		TRANSFER_STANDARD(0),
		TRANSFER_TO_VOICEMAIL(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		TRANSFER_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<TRANSFER_TYPE> intToTypeMap = new SparseArrayCompat< TRANSFER_TYPE>();
		
		static {
			for (TRANSFER_TYPE type : TRANSFER_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static TRANSFER_TYPE fromInt(int i) {
			TRANSFER_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : TRANSFER_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum LOCATION_INFO_TYPE {
		NO_LOCATION_INFO(0),
		LOCATION_CONTENT(1),
		NETWORK_CONTENT(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		LOCATION_INFO_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<LOCATION_INFO_TYPE> intToTypeMap = new SparseArrayCompat< LOCATION_INFO_TYPE>();
		
		static {
			for (LOCATION_INFO_TYPE type : LOCATION_INFO_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static LOCATION_INFO_TYPE fromInt(int i) {
			LOCATION_INFO_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : LOCATION_INFO_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PUBLISH_STATE_LEVEL {
		PUBLISH_STATE_USER(0),
		PUBLISH_STATE_ENDPOINT(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PUBLISH_STATE_LEVEL(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PUBLISH_STATE_LEVEL> intToTypeMap = new SparseArrayCompat< PUBLISH_STATE_LEVEL>();
		
		static {
			for (PUBLISH_STATE_LEVEL type : PUBLISH_STATE_LEVEL.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PUBLISH_STATE_LEVEL fromInt(int i) {
			PUBLISH_STATE_LEVEL tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PUBLISH_STATE_LEVEL.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public interface CallHandlerIListener {
		void onActiveSpeakerListChanged(CallHandler sender, int callObjectId, String[] activeSpeakers);
		void onAudioStreamStateChanged(CallHandler sender, int callObjectId, CallHandler.MEDIA_DIRECTION direction, CallHandler.MEDIA_STREAM_STATE streamState);
		void onCallMeBackOperationStatusChange(CallHandler sender, int callObjectId, String participantMri, int failureReason, int code, int subCode, String phrase, String causeId);
		void onCallTransferCallReceived(CallHandler sender, int callObjectId, int targetCallObjectId, String transferorMri, String transferTargetMri);
		void onDominantSpeakerListChanged(CallHandler sender, int callObjectId, String[] dominantSpeakers);
		void onMediaNegotiationStatusChange(CallHandler sender, int callObjectId, CallHandler.MODALITY_TYPE modalityType, CallHandler.MEDIA_NEGOTIATION_STATUS_CODE mediaNegotiationStatusCode, String causeId);
		void onMuteParticipantsOperationStatusChanged(CallHandler sender, int callObjectId, String causeId, int code, int subCode, String phrase);
		void onNudgeParticipantsOperationStatusChanged(CallHandler sender, int callObjectId, String context, int failureReason);
		void onOperationStatusChanged(CallHandler sender, int callObjectId, String result);
		void onProxiedPushNotification(CallHandler sender, int eventId, String payload);
		void onPublishStateOperationStatusChanged(CallHandler sender, int callObjectId, String causeId, int code, int subCode, String phrase, String stateId);
		void onRemoteUserEventsReceived(CallHandler sender, int callObjectId, String participantId, String events);
		void onRemoteVideosCountChanged(CallHandler sender, int participantObjectId);
		void onRemoveStateOperationStatusChanged(CallHandler sender, int callObjectId, String causeId, boolean operationSuccess, String result);
		void onUnmuteSelfOperationStatusChange(CallHandler sender, int callObjectId, CallHandler.OPERATIONRESULTCODE operationResult, int failureReason);
		void onUpdateMeetingRolesOperationStatusChanged(CallHandler sender, int callObjectId, String causeId, int code, int subCode, String phrase);
	}

	public void addListener(CallHandlerIListener listener);

	public void removeListener(CallHandlerIListener listener);

	
	public boolean addGroupModality(int callObjectId, int additionalParametersObjectId);

	public int addParticipant(int callObjectId, String participant, String threadId, String messageId, String additionalData);

	public int addParticipant(int callObjectId, String participant);

	public int addParticipant(int callObjectId, String participant, String threadId);

	public int addParticipant(int callObjectId, String participant, String threadId, String messageId);

	public int addParticipantToCall(int callObjectId, String participant, int additionalParametersObjectId);

	public class AddParticipantsToCall_Result {
		public int[] m_participantObjectIds;
		public void init(int[] participantObjectIds) {
			m_participantObjectIds = participantObjectIds;
		}

	}

	public AddParticipantsToCall_Result addParticipantsToCall(int callObjectId, String[] participantList, int additionalParametersObjectId);

	public void admitParticipants(int callObjectId, String[] participantList);

	public boolean answer(int callObjectId, int answerParametersObjectId);

	public boolean answerCall(int callObjectId, boolean isVideoEnabled);

	public boolean answerCall(int callObjectId);

	public boolean callAnswer(int callObjectId, CallHandler.ANSWER_MEDIA_TYPE answerType);

	public boolean callAssimilate(int callObjectId1, int callObjectId2, String threadId, String messageId);

	public boolean callAssimilate(int callObjectId1, int callObjectId2);

	public boolean callAssimilate(int callObjectId1, int callObjectId2, String threadId);

	public boolean callAttachSendVideo(int callObjectId, int videoObjectId);

	public class CallGetParticipantVideos_Result {
		public int[] m_participantVideosObjectId;
		public void init(int[] participantVideosObjectId) {
			m_participantVideosObjectId = participantVideosObjectId;
		}

	}

	public CallGetParticipantVideos_Result callGetParticipantVideos(int callParticipantObjectId);

	public class CallGetParticipants_Result {
		public int[] m_callParticipantObjectIds;
		public void init(int[] callParticipantObjectIds) {
			m_callParticipantObjectIds = callParticipantObjectIds;
		}

	}

	public CallGetParticipants_Result callGetParticipants(int callObjectId);

	public class CallGetSendVideos_Result {
		public int[] m_sendVideoObjectIds;
		public void init(int[] sendVideoObjectIds) {
			m_sendVideoObjectIds = sendVideoObjectIds;
		}

	}

	public CallGetSendVideos_Result callGetSendVideos(int callObjectId);

	public String callGetTechnicalInformationJson(int callObjectId);

	public boolean callHold(int callObjectId, boolean hold, String negotiationTag);

	public boolean callHold(int callObjectId, boolean hold);

	public boolean callMeBack(int callObjectId, String participantMri, String assertedId, String causeId);

	public boolean callMeBack(int callObjectId, String participantMri, String assertedId);

	public boolean callMerge(int callObjectId1, int callObjectId2, String threadId, String messageId, String causeId);

	public boolean callMerge(int callObjectId1, int callObjectId2);

	public boolean callMerge(int callObjectId1, int callObjectId2, String threadId);

	public boolean callMerge(int callObjectId1, int callObjectId2, String threadId, String messageId);

	public boolean callMute(int callObjectId, boolean mute);

	public void callMuteParticipants(int callObjectId, CallHandler.MUTE_SCOPE muteScope, String[] participantList, String causeId);

	public void callMuteParticipants(int callObjectId, CallHandler.MUTE_SCOPE muteScope, String[] participantList);

	public boolean callMuteSpeaker(int callObjectId, boolean mute);

	public int callParticipantGetCallObject(int callParticipantObjectId);

	public boolean callSendDtmf(int callObjectId, CallHandler.DTMF dtmfTone);

	public boolean callSetAudioUsageMode(int callObjectId, CallHandler.AUDIO_USAGE_MODE audioUsageMode);

	public boolean callSetMaxVideoChannels(int callObjectId, int maxVideoChannels, String negotiationTag, String causeId);

	public boolean callSetMaxVideoChannels(int callObjectId, int maxVideoChannels, String negotiationTag);

	public boolean callShareSystemSound(int callObjectId, boolean enable);

	public boolean callStartAudio(int callObjectId, String negotiationTag);

	public boolean callStartAudio(int callObjectId);

	public boolean callStopAudio(int callObjectId, String negotiationTag);

	public boolean callStopAudio(int callObjectId);

	public boolean callUpdateEndpointMetaData(int callObjectId, String endpointMetaData);

	public boolean callUpdateEndpointMetaData(int callObjectId);

	public void consultativeTransferWithOptions(int transfereeCallObjectId, int transferParametersObjectId);

	public boolean createAddGroupModalityParameters(AddGroupModalityParameters addGroupModalityParameters);

	public boolean createAddParticipantParameters(AddParticipantParameters addParticipantParameters);

	public boolean createAnswerParameters(AnswerParameters createAnswerParameters);

	public int createContentSharing(int callObjectId, String contentSharingGuid, String contentSharingIdentity, String subject, String initialContentSharingSessionState);

	public int createContentSharing(int callObjectId, String contentSharingGuid, String contentSharingIdentity);

	public int createContentSharing(int callObjectId, String contentSharingGuid, String contentSharingIdentity, String subject);

	public boolean createMediaStateConfiguration(MediaStateConfiguration mediaStateConfiguration);

	public boolean createMeetingSettingsParameters(MeetingSettingsParameters meetingSettingsParameters);

	public boolean createMergeParameters(MergeParameters mergeParameters);

	public boolean createSessionParameters(SessionParameters sessionParameters);

	public boolean createTransferParameters(TransferParameters transferParameters);

	public boolean endCallForAll(int callObjectId);

	public class GetActiveCalls_Result {
		public int[] m_callObjectIds;
		public void init(int[] callObjectIds) {
			m_callObjectIds = callObjectIds;
		}

	}

	public GetActiveCalls_Result getActiveCalls();

	public boolean getAddGroupModalityParameters(int inMemObjId, AddGroupModalityParameters addGroupModalityParameters);

	public boolean getAddParticipantParameters(int inMemObjId, AddParticipantParameters addParticipantParameters);

	public boolean getAnswerParameters(int inMemObjId, AnswerParameters answerParameters);

	public String getCallEndDiagnosticCode(int callObjectId);

	public class GetContentSharingSessions_Result {
		public int[] m_contentSharingObjectIds;
		public void init(int[] contentSharingObjectIds) {
			m_contentSharingObjectIds = contentSharingObjectIds;
		}

	}

	public GetContentSharingSessions_Result getContentSharingSessions(int callObjectId);

	public String getDebugInformation(String command);

	public int getIntegerProperty(int objectId, PROPKEY propKey);

	public boolean getMediaStateConfiguration(int inMemObjId, MediaStateConfiguration mediaStateConfiguration);

	public boolean getMeetingSettingsParameters(int inMemObjId, MeetingSettingsParameters meetingSettingsParameters);

	public boolean getMergeParameters(int inMemObjId, MergeParameters mergeParameters);

	public boolean getSessionParameters(int inMemObjId, SessionParameters sessionParameters);

	public String getStringProperty(int objectId, PROPKEY propKey);

	public boolean getTransferParameters(int inMemObjId, TransferParameters transferParameters);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting, String broadcastContext);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf);

	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting);

	public boolean joinPreheatedCall(int callObjectId, String causeId, int muteFlags);

	public boolean joinPreheatedCall(int callObjectId);

	public boolean joinPreheatedCall(int callObjectId, String causeId);

	public int joinSignalingSession(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId);

	public void leaveCall(int callObjectId);

	public void mergeCall(int callObjectId, int mergeParametersObjectId);

	public boolean nudgeParticipants(int callObjectId, int additionalParametersObjectId, String[] participantList, String context);

	public boolean nudgeParticipants(int callObjectId, int additionalParametersObjectId);

	public boolean nudgeParticipants(int callObjectId, int additionalParametersObjectId, String[] participantList);

	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant, String threadId, String voicemailResourcePath, String voicemailItemId);

	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType);

	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant);

	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant, String threadId);

	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant, String threadId, String voicemailResourcePath);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting, String emergencyContent, String broadcastContext);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting);

	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting, String emergencyContent);

	public void provideCallQualityFeedback(String callId, String participantId, String questionaryId, String trackingReason, CallHandler.QUALITYRATING rating, String problemTokens);

	public boolean publishState(int callObjectId, String type, CallHandler.PUBLISH_STATE_LEVEL level, String content, String causeId);

	public void rejectLocally(int callObjectId);

	public void removeParticipant(int participantObjectId, CallHandler.REMOVE_ENDPOINT_SCOPE removeEndpointScope);

	public void removeParticipant(int participantObjectId);

	public void removeParticipantByMri(int callObjectId, String participantMri, String endpoint, CallHandler.REMOVE_ENDPOINT_SCOPE removeEndpointScope);

	public void removeParticipantByMri(int callObjectId, String participantMri);

	public void removeParticipantByMri(int callObjectId, String participantMri, String endpoint);

	public boolean removeState(int callObjectId, String[] stateIds, String causeId);

	public boolean removeStatesForEveryone(int callObjectId, String type, String causeId);

	public void setLocationInfo(CallHandler.LOCATION_INFO_TYPE infoType, String contentJson);

	public void setLocationInfo(CallHandler.LOCATION_INFO_TYPE infoType);

	public boolean startCallPark(int callObjectId, CallHandler.PARK_CONTEXT parkContext);

	public boolean startCallTransfer(int callObjectId, String participantId, CallHandler.TRANSFER_TYPE transferType);

	public boolean startCallTransfer(int callObjectId, String participantId);

	public int startCallUnpark(String callGuid, int sessionParametersObjectId, CallHandler.PARK_CONTEXT parkContext, String pickupCode);

	public boolean startConsultativeCallTransfer(int consultativeCallObjectId, int transfereeCallObjectId);

	public boolean startMultichannelAudioDevice(int callObjectId, String deviceId, int recipientId);

	public int startSignalingSession(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId, String[] participantList);

	public int startSignalingSession(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId);

	public boolean startTransferTargetCall(int callObjectId, boolean isVideoEnabled, String threadId, String messageId);

	public boolean startTransferTargetCall(int callObjectId);

	public boolean startTransferTargetCall(int callObjectId, boolean isVideoEnabled);

	public boolean startTransferTargetCall(int callObjectId, boolean isVideoEnabled, String threadId);

	public boolean stopMultichannelAudioDevice(int callObjectId);

	public int subscribeToSignalingSession(String joinContext, int sessionParametersObjectId);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting);

	public int subscribe(String joinContext);

	public int subscribe(String joinContext, boolean isVideoEnabled);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData);

	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf);

	public void unsubscribe(int callObjectId);

	public boolean updateMeetingRoles(int callObjectId, String[] participantList, String meetingRole, String causeId);

	public boolean updateMeetingRoles(int callObjectId, String[] participantList, String meetingRole);

	public boolean updateMeetingSettings(int callObjectId, int meetingSettingsParametersObjectId);

}

