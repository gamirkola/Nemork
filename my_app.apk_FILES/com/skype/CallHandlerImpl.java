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

import com.skype.CallHandler;

public class CallHandlerImpl extends ObjectInterfaceImpl implements CallHandler, ObjectInterface, NativeListenable {
	public CallHandlerImpl() {
		this(SkypeFactory.getInstance() );
	}

	public CallHandlerImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createCallHandler());
		factory.initializeListener(this);
	}

	static class CallHandlerWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		CallHandlerWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyCallHandler(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new CallHandlerWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<CallHandlerIListener> m_listeners = new HashSet<CallHandlerIListener>();

	@Override
	public void addListener(CallHandlerIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(CallHandlerIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onActiveSpeakerListChanged(int callObjectId, byte[][] activeSpeakers) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onActiveSpeakerListChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeStringArray(activeSpeakers));
			}
		}
	}

	public void onAudioStreamStateChanged(int callObjectId, CallHandler.MEDIA_DIRECTION direction, CallHandler.MEDIA_STREAM_STATE streamState) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onAudioStreamStateChanged(this, callObjectId, direction, streamState);
			}
		}
	}

	public void onCallMeBackOperationStatusChange(int callObjectId, byte[] participantMri, int failureReason, int code, int subCode, byte[] phrase, byte[] causeId) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onCallMeBackOperationStatusChange(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(participantMri), failureReason, code, subCode, NativeStringConvert.ConvertFromNativeBytes(phrase), NativeStringConvert.ConvertFromNativeBytes(causeId));
			}
		}
	}

	public void onCallTransferCallReceived(int callObjectId, int targetCallObjectId, byte[] transferorMri, byte[] transferTargetMri) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onCallTransferCallReceived(this, callObjectId, targetCallObjectId, NativeStringConvert.ConvertFromNativeBytes(transferorMri), NativeStringConvert.ConvertFromNativeBytes(transferTargetMri));
			}
		}
	}

	public void onDominantSpeakerListChanged(int callObjectId, byte[][] dominantSpeakers) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onDominantSpeakerListChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeStringArray(dominantSpeakers));
			}
		}
	}

	public void onMediaNegotiationStatusChange(int callObjectId, CallHandler.MODALITY_TYPE modalityType, CallHandler.MEDIA_NEGOTIATION_STATUS_CODE mediaNegotiationStatusCode, byte[] causeId) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onMediaNegotiationStatusChange(this, callObjectId, modalityType, mediaNegotiationStatusCode, NativeStringConvert.ConvertFromNativeBytes(causeId));
			}
		}
	}

	public void onMuteParticipantsOperationStatusChanged(int callObjectId, byte[] causeId, int code, int subCode, byte[] phrase) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onMuteParticipantsOperationStatusChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(causeId), code, subCode, NativeStringConvert.ConvertFromNativeBytes(phrase));
			}
		}
	}

	public void onNudgeParticipantsOperationStatusChanged(int callObjectId, byte[] context, int failureReason) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onNudgeParticipantsOperationStatusChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(context), failureReason);
			}
		}
	}

	public void onOperationStatusChanged(int callObjectId, byte[] result) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onOperationStatusChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(result));
			}
		}
	}

	public void onProxiedPushNotification(int eventId, byte[] payload) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onProxiedPushNotification(this, eventId, NativeStringConvert.ConvertFromNativeBytes(payload));
			}
		}
	}

	public void onPublishStateOperationStatusChanged(int callObjectId, byte[] causeId, int code, int subCode, byte[] phrase, byte[] stateId) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onPublishStateOperationStatusChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(causeId), code, subCode, NativeStringConvert.ConvertFromNativeBytes(phrase), NativeStringConvert.ConvertFromNativeBytes(stateId));
			}
		}
	}

	public void onRemoteUserEventsReceived(int callObjectId, byte[] participantId, byte[] events) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onRemoteUserEventsReceived(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(participantId), NativeStringConvert.ConvertFromNativeBytes(events));
			}
		}
	}

	public void onRemoteVideosCountChanged(int participantObjectId) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onRemoteVideosCountChanged(this, participantObjectId);
			}
		}
	}

	public void onRemoveStateOperationStatusChanged(int callObjectId, byte[] causeId, boolean operationSuccess, byte[] result) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onRemoveStateOperationStatusChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(causeId), operationSuccess, NativeStringConvert.ConvertFromNativeBytes(result));
			}
		}
	}

	public void onUnmuteSelfOperationStatusChange(int callObjectId, CallHandler.OPERATIONRESULTCODE operationResult, int failureReason) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onUnmuteSelfOperationStatusChange(this, callObjectId, operationResult, failureReason);
			}
		}
	}

	public void onUpdateMeetingRolesOperationStatusChanged(int callObjectId, byte[] causeId, int code, int subCode, byte[] phrase) {
		synchronized (m_listeners) {
			for (CallHandlerIListener listener : m_listeners) {
				listener.onUpdateMeetingRolesOperationStatusChanged(this, callObjectId, NativeStringConvert.ConvertFromNativeBytes(causeId), code, subCode, NativeStringConvert.ConvertFromNativeBytes(phrase));
			}
		}
	}

	@Override
	public native boolean addGroupModality(int callObjectId, int additionalParametersObjectId);

	@Override
	public int addParticipant(int callObjectId, String participant, String threadId, String messageId, String additionalData) {
		return addParticipant(callObjectId, NativeStringConvert.ConvertToNativeBytes(participant), NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(messageId), NativeStringConvert.ConvertToNativeBytes(additionalData));
	}

	private native int addParticipant(int callObjectId, byte[] participant, byte[] threadId, byte[] messageId, byte[] additionalData);
	@Override
	public int addParticipant(int callObjectId, String participant) {
		return addParticipant(callObjectId, participant, "", "", "");
	}
	@Override
	public int addParticipant(int callObjectId, String participant, String threadId) {
		return addParticipant(callObjectId, participant, threadId, "", "");
	}
	@Override
	public int addParticipant(int callObjectId, String participant, String threadId, String messageId) {
		return addParticipant(callObjectId, participant, threadId, messageId, "");
	}
	@Override
	public int addParticipantToCall(int callObjectId, String participant, int additionalParametersObjectId) {
		return addParticipantToCall(callObjectId, NativeStringConvert.ConvertToNativeBytes(participant), additionalParametersObjectId);
	}

	private native int addParticipantToCall(int callObjectId, byte[] participant, int additionalParametersObjectId);
	@Override
	public AddParticipantsToCall_Result addParticipantsToCall(int callObjectId, String[] participantList, int additionalParametersObjectId) {
		return addParticipantsToCall(callObjectId, NativeStringConvert.ConvertArrToNativeByteArr(participantList), additionalParametersObjectId);
	}

	private native AddParticipantsToCall_Result addParticipantsToCall(int callObjectId, byte[][] participantList, int additionalParametersObjectId);
	@Override
	public void admitParticipants(int callObjectId, String[] participantList) {
		admitParticipants(callObjectId, NativeStringConvert.ConvertArrToNativeByteArr(participantList));
	}

	private native void admitParticipants(int callObjectId, byte[][] participantList);
	@Override
	public native boolean answer(int callObjectId, int answerParametersObjectId);

	@Override
	public native boolean answerCall(int callObjectId, boolean isVideoEnabled);

	@Override
	public boolean answerCall(int callObjectId) {
		return answerCall(callObjectId, false);
	}
	@Override
	public native boolean callAnswer(int callObjectId, CallHandler.ANSWER_MEDIA_TYPE answerType);

	@Override
	public boolean callAssimilate(int callObjectId1, int callObjectId2, String threadId, String messageId) {
		return callAssimilate(callObjectId1, callObjectId2, NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(messageId));
	}

	private native boolean callAssimilate(int callObjectId1, int callObjectId2, byte[] threadId, byte[] messageId);
	@Override
	public boolean callAssimilate(int callObjectId1, int callObjectId2) {
		return callAssimilate(callObjectId1, callObjectId2, "", "");
	}
	@Override
	public boolean callAssimilate(int callObjectId1, int callObjectId2, String threadId) {
		return callAssimilate(callObjectId1, callObjectId2, threadId, "");
	}
	@Override
	public native boolean callAttachSendVideo(int callObjectId, int videoObjectId);

	@Override
	public native CallGetParticipantVideos_Result callGetParticipantVideos(int callParticipantObjectId);

	@Override
	public native CallGetParticipants_Result callGetParticipants(int callObjectId);

	@Override
	public native CallGetSendVideos_Result callGetSendVideos(int callObjectId);

	@Override
	public String callGetTechnicalInformationJson(int callObjectId) {
		return NativeStringConvert.ConvertFromNativeBytes(callGetTechnicalInformationJsonNativeString(callObjectId));
	}

	private native byte[] callGetTechnicalInformationJsonNativeString(int callObjectId);
	@Override
	public boolean callHold(int callObjectId, boolean hold, String negotiationTag) {
		return callHold(callObjectId, hold, NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native boolean callHold(int callObjectId, boolean hold, byte[] negotiationTag);
	@Override
	public boolean callHold(int callObjectId, boolean hold) {
		return callHold(callObjectId, hold, "");
	}
	@Override
	public boolean callMeBack(int callObjectId, String participantMri, String assertedId, String causeId) {
		return callMeBack(callObjectId, NativeStringConvert.ConvertToNativeBytes(participantMri), NativeStringConvert.ConvertToNativeBytes(assertedId), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native boolean callMeBack(int callObjectId, byte[] participantMri, byte[] assertedId, byte[] causeId);
	@Override
	public boolean callMeBack(int callObjectId, String participantMri, String assertedId) {
		return callMeBack(callObjectId, participantMri, assertedId, "");
	}
	@Override
	public boolean callMerge(int callObjectId1, int callObjectId2, String threadId, String messageId, String causeId) {
		return callMerge(callObjectId1, callObjectId2, NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(messageId), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native boolean callMerge(int callObjectId1, int callObjectId2, byte[] threadId, byte[] messageId, byte[] causeId);
	@Override
	public boolean callMerge(int callObjectId1, int callObjectId2) {
		return callMerge(callObjectId1, callObjectId2, "", "", "");
	}
	@Override
	public boolean callMerge(int callObjectId1, int callObjectId2, String threadId) {
		return callMerge(callObjectId1, callObjectId2, threadId, "", "");
	}
	@Override
	public boolean callMerge(int callObjectId1, int callObjectId2, String threadId, String messageId) {
		return callMerge(callObjectId1, callObjectId2, threadId, messageId, "");
	}
	@Override
	public native boolean callMute(int callObjectId, boolean mute);

	@Override
	public void callMuteParticipants(int callObjectId, CallHandler.MUTE_SCOPE muteScope, String[] participantList, String causeId) {
		callMuteParticipants(callObjectId, muteScope, NativeStringConvert.ConvertArrToNativeByteArr(participantList), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native void callMuteParticipants(int callObjectId, CallHandler.MUTE_SCOPE muteScope, byte[][] participantList, byte[] causeId);
	@Override
	public void callMuteParticipants(int callObjectId, CallHandler.MUTE_SCOPE muteScope, String[] participantList) {
		callMuteParticipants(callObjectId, muteScope, participantList, "");
	}
	@Override
	public native boolean callMuteSpeaker(int callObjectId, boolean mute);

	@Override
	public native int callParticipantGetCallObject(int callParticipantObjectId);

	@Override
	public native boolean callSendDtmf(int callObjectId, CallHandler.DTMF dtmfTone);

	@Override
	public native boolean callSetAudioUsageMode(int callObjectId, CallHandler.AUDIO_USAGE_MODE audioUsageMode);

	@Override
	public boolean callSetMaxVideoChannels(int callObjectId, int maxVideoChannels, String negotiationTag, String causeId) {
		return callSetMaxVideoChannels(callObjectId, maxVideoChannels, NativeStringConvert.ConvertToNativeBytes(negotiationTag), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native boolean callSetMaxVideoChannels(int callObjectId, int maxVideoChannels, byte[] negotiationTag, byte[] causeId);
	@Override
	public boolean callSetMaxVideoChannels(int callObjectId, int maxVideoChannels, String negotiationTag) {
		return callSetMaxVideoChannels(callObjectId, maxVideoChannels, negotiationTag, "");
	}
	@Override
	public native boolean callShareSystemSound(int callObjectId, boolean enable);

	@Override
	public boolean callStartAudio(int callObjectId, String negotiationTag) {
		return callStartAudio(callObjectId, NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native boolean callStartAudio(int callObjectId, byte[] negotiationTag);
	@Override
	public boolean callStartAudio(int callObjectId) {
		return callStartAudio(callObjectId, "");
	}
	@Override
	public boolean callStopAudio(int callObjectId, String negotiationTag) {
		return callStopAudio(callObjectId, NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native boolean callStopAudio(int callObjectId, byte[] negotiationTag);
	@Override
	public boolean callStopAudio(int callObjectId) {
		return callStopAudio(callObjectId, "");
	}
	@Override
	public boolean callUpdateEndpointMetaData(int callObjectId, String endpointMetaData) {
		return callUpdateEndpointMetaData(callObjectId, NativeStringConvert.ConvertToNativeBytes(endpointMetaData));
	}

	private native boolean callUpdateEndpointMetaData(int callObjectId, byte[] endpointMetaData);
	@Override
	public boolean callUpdateEndpointMetaData(int callObjectId) {
		return callUpdateEndpointMetaData(callObjectId, "");
	}
	@Override
	public native void consultativeTransferWithOptions(int transfereeCallObjectId, int transferParametersObjectId);

	@Override
	public native boolean createAddGroupModalityParameters(AddGroupModalityParameters addGroupModalityParameters);

	@Override
	public native boolean createAddParticipantParameters(AddParticipantParameters addParticipantParameters);

	@Override
	public native boolean createAnswerParameters(AnswerParameters createAnswerParameters);

	@Override
	public int createContentSharing(int callObjectId, String contentSharingGuid, String contentSharingIdentity, String subject, String initialContentSharingSessionState) {
		return createContentSharing(callObjectId, NativeStringConvert.ConvertToNativeBytes(contentSharingGuid), NativeStringConvert.ConvertToNativeBytes(contentSharingIdentity), NativeStringConvert.ConvertToNativeBytes(subject), NativeStringConvert.ConvertToNativeBytes(initialContentSharingSessionState));
	}

	private native int createContentSharing(int callObjectId, byte[] contentSharingGuid, byte[] contentSharingIdentity, byte[] subject, byte[] initialContentSharingSessionState);
	@Override
	public int createContentSharing(int callObjectId, String contentSharingGuid, String contentSharingIdentity) {
		return createContentSharing(callObjectId, contentSharingGuid, contentSharingIdentity, "", "");
	}
	@Override
	public int createContentSharing(int callObjectId, String contentSharingGuid, String contentSharingIdentity, String subject) {
		return createContentSharing(callObjectId, contentSharingGuid, contentSharingIdentity, subject, "");
	}
	@Override
	public native boolean createMediaStateConfiguration(MediaStateConfiguration mediaStateConfiguration);

	@Override
	public native boolean createMeetingSettingsParameters(MeetingSettingsParameters meetingSettingsParameters);

	@Override
	public native boolean createMergeParameters(MergeParameters mergeParameters);

	@Override
	public native boolean createSessionParameters(SessionParameters sessionParameters);

	@Override
	public native boolean createTransferParameters(TransferParameters transferParameters);

	@Override
	public native boolean endCallForAll(int callObjectId);

	@Override
	public native GetActiveCalls_Result getActiveCalls();

	@Override
	public native boolean getAddGroupModalityParameters(int inMemObjId, AddGroupModalityParameters addGroupModalityParameters);

	@Override
	public native boolean getAddParticipantParameters(int inMemObjId, AddParticipantParameters addParticipantParameters);

	@Override
	public native boolean getAnswerParameters(int inMemObjId, AnswerParameters answerParameters);

	@Override
	public String getCallEndDiagnosticCode(int callObjectId) {
		return NativeStringConvert.ConvertFromNativeBytes(getCallEndDiagnosticCodeNativeString(callObjectId));
	}

	private native byte[] getCallEndDiagnosticCodeNativeString(int callObjectId);
	@Override
	public native GetContentSharingSessions_Result getContentSharingSessions(int callObjectId);

	@Override
	public String getDebugInformation(String command) {
		return NativeStringConvert.ConvertFromNativeBytes(getDebugInformationNativeString(NativeStringConvert.ConvertToNativeBytes(command)));
	}

	private native byte[] getDebugInformationNativeString(byte[] command);
	@Override
	public native int getIntegerProperty(int objectId, PROPKEY propKey);

	@Override
	public native boolean getMediaStateConfiguration(int inMemObjId, MediaStateConfiguration mediaStateConfiguration);

	@Override
	public native boolean getMeetingSettingsParameters(int inMemObjId, MeetingSettingsParameters meetingSettingsParameters);

	@Override
	public native boolean getMergeParameters(int inMemObjId, MergeParameters mergeParameters);

	@Override
	public native boolean getSessionParameters(int inMemObjId, SessionParameters sessionParameters);

	@Override
	public String getStringProperty(int objectId, PROPKEY propKey) {
		return NativeStringConvert.ConvertFromNativeBytes(getStringPropertyNativeString(objectId, propKey));
	}

	private native byte[] getStringPropertyNativeString(int objectId, PROPKEY propKey);
	@Override
	public native boolean getTransferParameters(int inMemObjId, TransferParameters transferParameters);

	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting, String broadcastContext) {
		return joinCall(NativeStringConvert.ConvertToNativeBytes(joinContext), mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(messageId), NativeStringConvert.ConvertToNativeBytes(subject), NativeStringConvert.ConvertToNativeBytes(conversationType), NativeStringConvert.ConvertToNativeBytes(meetingInfo), NativeStringConvert.ConvertToNativeBytes(endpointMetaData), NativeStringConvert.ConvertToNativeBytes(onBehalfOf), enableLightWeightMeeting, NativeStringConvert.ConvertToNativeBytes(broadcastContext));
	}

	private native int joinCall(byte[] joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, byte[] threadId, byte[] messageId, byte[] subject, byte[] conversationType, byte[] meetingInfo, byte[] endpointMetaData, byte[] onBehalfOf, boolean enableLightWeightMeeting, byte[] broadcastContext);
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType) {
		return joinCall(joinContext, mediaPeerType, false, false, true, false, "", "", "", "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, false, true, false, "", "", "", "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, true, false, "", "", "", "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, false, "", "", "", "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, "", "", "", "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, "", "", "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, "", "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, "", "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, "", "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, "", "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, "", false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, onBehalfOf, false, "");
	}
	@Override
	public int joinCall(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting) {
		return joinCall(joinContext, mediaPeerType, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, onBehalfOf, enableLightWeightMeeting, "");
	}
	@Override
	public boolean joinPreheatedCall(int callObjectId, String causeId, int muteFlags) {
		return joinPreheatedCall(callObjectId, NativeStringConvert.ConvertToNativeBytes(causeId), muteFlags);
	}

	private native boolean joinPreheatedCall(int callObjectId, byte[] causeId, int muteFlags);
	@Override
	public boolean joinPreheatedCall(int callObjectId) {
		return joinPreheatedCall(callObjectId, "", 0);
	}
	@Override
	public boolean joinPreheatedCall(int callObjectId, String causeId) {
		return joinPreheatedCall(callObjectId, causeId, 0);
	}
	@Override
	public int joinSignalingSession(String joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId) {
		return joinSignalingSession(NativeStringConvert.ConvertToNativeBytes(joinContext), mediaPeerType, sessionParametersObjectId);
	}

	private native int joinSignalingSession(byte[] joinContext, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId);
	@Override
	public native void leaveCall(int callObjectId);

	@Override
	public native void mergeCall(int callObjectId, int mergeParametersObjectId);

	@Override
	public boolean nudgeParticipants(int callObjectId, int additionalParametersObjectId, String[] participantList, String context) {
		return nudgeParticipants(callObjectId, additionalParametersObjectId, NativeStringConvert.ConvertArrToNativeByteArr(participantList), NativeStringConvert.ConvertToNativeBytes(context));
	}

	private native boolean nudgeParticipants(int callObjectId, int additionalParametersObjectId, byte[][] participantList, byte[] context);
	@Override
	public boolean nudgeParticipants(int callObjectId, int additionalParametersObjectId) {
		return nudgeParticipants(callObjectId, additionalParametersObjectId, null, "");
	}
	@Override
	public boolean nudgeParticipants(int callObjectId, int additionalParametersObjectId, String[] participantList) {
		return nudgeParticipants(callObjectId, additionalParametersObjectId, participantList, "");
	}
	@Override
	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant, String threadId, String voicemailResourcePath, String voicemailItemId) {
		return placeCallToVoicemail(NativeStringConvert.ConvertToNativeBytes(callGuid), mediaPeerType, NativeStringConvert.ConvertToNativeBytes(participant), NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(voicemailResourcePath), NativeStringConvert.ConvertToNativeBytes(voicemailItemId));
	}

	private native int placeCallToVoicemail(byte[] callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, byte[] participant, byte[] threadId, byte[] voicemailResourcePath, byte[] voicemailItemId);
	@Override
	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType) {
		return placeCallToVoicemail(callGuid, mediaPeerType, "", "", "", "");
	}
	@Override
	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant) {
		return placeCallToVoicemail(callGuid, mediaPeerType, participant, "", "", "");
	}
	@Override
	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant, String threadId) {
		return placeCallToVoicemail(callGuid, mediaPeerType, participant, threadId, "", "");
	}
	@Override
	public int placeCallToVoicemail(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String participant, String threadId, String voicemailResourcePath) {
		return placeCallToVoicemail(callGuid, mediaPeerType, participant, threadId, voicemailResourcePath, "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting, String emergencyContent, String broadcastContext) {
		return placeCall(NativeStringConvert.ConvertToNativeBytes(callGuid), mediaPeerType, NativeStringConvert.ConvertArrToNativeByteArr(participantList), isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(messageId), NativeStringConvert.ConvertToNativeBytes(subject), NativeStringConvert.ConvertToNativeBytes(conversationType), NativeStringConvert.ConvertToNativeBytes(meetingInfo), NativeStringConvert.ConvertToNativeBytes(endpointMetaData), NativeStringConvert.ConvertToNativeBytes(onBehalfOf), enableLightWeightMeeting, NativeStringConvert.ConvertToNativeBytes(emergencyContent), NativeStringConvert.ConvertToNativeBytes(broadcastContext));
	}

	private native int placeCall(byte[] callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, byte[][] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, byte[] threadId, byte[] messageId, byte[] subject, byte[] conversationType, byte[] meetingInfo, byte[] endpointMetaData, byte[] onBehalfOf, boolean enableLightWeightMeeting, byte[] emergencyContent, byte[] broadcastContext);
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType) {
		return placeCall(callGuid, mediaPeerType, null, false, false, true, false, "", "", "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList) {
		return placeCall(callGuid, mediaPeerType, participantList, false, false, true, false, "", "", "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, false, true, false, "", "", "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, true, false, "", "", "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, false, "", "", "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, "", "", "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, "", "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, "", "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, "", "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, "", "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, "", "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, "", false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, onBehalfOf, false, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, onBehalfOf, enableLightWeightMeeting, "", "");
	}
	@Override
	public int placeCall(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, String[] participantList, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting, String emergencyContent) {
		return placeCall(callGuid, mediaPeerType, participantList, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, onBehalfOf, enableLightWeightMeeting, emergencyContent, "");
	}
	@Override
	public void provideCallQualityFeedback(String callId, String participantId, String questionaryId, String trackingReason, CallHandler.QUALITYRATING rating, String problemTokens) {
		provideCallQualityFeedback(NativeStringConvert.ConvertToNativeBytes(callId), NativeStringConvert.ConvertToNativeBytes(participantId), NativeStringConvert.ConvertToNativeBytes(questionaryId), NativeStringConvert.ConvertToNativeBytes(trackingReason), rating, NativeStringConvert.ConvertToNativeBytes(problemTokens));
	}

	private native void provideCallQualityFeedback(byte[] callId, byte[] participantId, byte[] questionaryId, byte[] trackingReason, CallHandler.QUALITYRATING rating, byte[] problemTokens);
	@Override
	public boolean publishState(int callObjectId, String type, CallHandler.PUBLISH_STATE_LEVEL level, String content, String causeId) {
		return publishState(callObjectId, NativeStringConvert.ConvertToNativeBytes(type), level, NativeStringConvert.ConvertToNativeBytes(content), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native boolean publishState(int callObjectId, byte[] type, CallHandler.PUBLISH_STATE_LEVEL level, byte[] content, byte[] causeId);
	@Override
	public native void rejectLocally(int callObjectId);

	@Override
	public native void removeParticipant(int participantObjectId, CallHandler.REMOVE_ENDPOINT_SCOPE removeEndpointScope);

	@Override
	public void removeParticipant(int participantObjectId) {
		removeParticipant(participantObjectId, CallHandler.REMOVE_ENDPOINT_SCOPE.REMOVE_ENDPOINT_SCOPE_NONE);
	}
	@Override
	public void removeParticipantByMri(int callObjectId, String participantMri, String endpoint, CallHandler.REMOVE_ENDPOINT_SCOPE removeEndpointScope) {
		removeParticipantByMri(callObjectId, NativeStringConvert.ConvertToNativeBytes(participantMri), NativeStringConvert.ConvertToNativeBytes(endpoint), removeEndpointScope);
	}

	private native void removeParticipantByMri(int callObjectId, byte[] participantMri, byte[] endpoint, CallHandler.REMOVE_ENDPOINT_SCOPE removeEndpointScope);
	@Override
	public void removeParticipantByMri(int callObjectId, String participantMri) {
		removeParticipantByMri(callObjectId, participantMri, "", CallHandler.REMOVE_ENDPOINT_SCOPE.REMOVE_ENDPOINT_SCOPE_NONE);
	}
	@Override
	public void removeParticipantByMri(int callObjectId, String participantMri, String endpoint) {
		removeParticipantByMri(callObjectId, participantMri, endpoint, CallHandler.REMOVE_ENDPOINT_SCOPE.REMOVE_ENDPOINT_SCOPE_NONE);
	}
	@Override
	public boolean removeState(int callObjectId, String[] stateIds, String causeId) {
		return removeState(callObjectId, NativeStringConvert.ConvertArrToNativeByteArr(stateIds), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native boolean removeState(int callObjectId, byte[][] stateIds, byte[] causeId);
	@Override
	public boolean removeStatesForEveryone(int callObjectId, String type, String causeId) {
		return removeStatesForEveryone(callObjectId, NativeStringConvert.ConvertToNativeBytes(type), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native boolean removeStatesForEveryone(int callObjectId, byte[] type, byte[] causeId);
	@Override
	public void setLocationInfo(CallHandler.LOCATION_INFO_TYPE infoType, String contentJson) {
		setLocationInfo(infoType, NativeStringConvert.ConvertToNativeBytes(contentJson));
	}

	private native void setLocationInfo(CallHandler.LOCATION_INFO_TYPE infoType, byte[] contentJson);
	@Override
	public void setLocationInfo(CallHandler.LOCATION_INFO_TYPE infoType) {
		setLocationInfo(infoType, "");
	}
	@Override
	public native boolean startCallPark(int callObjectId, CallHandler.PARK_CONTEXT parkContext);

	@Override
	public boolean startCallTransfer(int callObjectId, String participantId, CallHandler.TRANSFER_TYPE transferType) {
		return startCallTransfer(callObjectId, NativeStringConvert.ConvertToNativeBytes(participantId), transferType);
	}

	private native boolean startCallTransfer(int callObjectId, byte[] participantId, CallHandler.TRANSFER_TYPE transferType);
	@Override
	public boolean startCallTransfer(int callObjectId, String participantId) {
		return startCallTransfer(callObjectId, participantId, CallHandler.TRANSFER_TYPE.TRANSFER_STANDARD);
	}
	@Override
	public int startCallUnpark(String callGuid, int sessionParametersObjectId, CallHandler.PARK_CONTEXT parkContext, String pickupCode) {
		return startCallUnpark(NativeStringConvert.ConvertToNativeBytes(callGuid), sessionParametersObjectId, parkContext, NativeStringConvert.ConvertToNativeBytes(pickupCode));
	}

	private native int startCallUnpark(byte[] callGuid, int sessionParametersObjectId, CallHandler.PARK_CONTEXT parkContext, byte[] pickupCode);
	@Override
	public native boolean startConsultativeCallTransfer(int consultativeCallObjectId, int transfereeCallObjectId);

	@Override
	public boolean startMultichannelAudioDevice(int callObjectId, String deviceId, int recipientId) {
		return startMultichannelAudioDevice(callObjectId, NativeStringConvert.ConvertToNativeBytes(deviceId), recipientId);
	}

	private native boolean startMultichannelAudioDevice(int callObjectId, byte[] deviceId, int recipientId);
	@Override
	public int startSignalingSession(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId, String[] participantList) {
		return startSignalingSession(NativeStringConvert.ConvertToNativeBytes(callGuid), mediaPeerType, sessionParametersObjectId, NativeStringConvert.ConvertArrToNativeByteArr(participantList));
	}

	private native int startSignalingSession(byte[] callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId, byte[][] participantList);
	@Override
	public int startSignalingSession(String callGuid, CallHandler.MEDIA_PEER_TYPE mediaPeerType, int sessionParametersObjectId) {
		return startSignalingSession(callGuid, mediaPeerType, sessionParametersObjectId, null);
	}
	@Override
	public boolean startTransferTargetCall(int callObjectId, boolean isVideoEnabled, String threadId, String messageId) {
		return startTransferTargetCall(callObjectId, isVideoEnabled, NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(messageId));
	}

	private native boolean startTransferTargetCall(int callObjectId, boolean isVideoEnabled, byte[] threadId, byte[] messageId);
	@Override
	public boolean startTransferTargetCall(int callObjectId) {
		return startTransferTargetCall(callObjectId, false, "", "");
	}
	@Override
	public boolean startTransferTargetCall(int callObjectId, boolean isVideoEnabled) {
		return startTransferTargetCall(callObjectId, isVideoEnabled, "", "");
	}
	@Override
	public boolean startTransferTargetCall(int callObjectId, boolean isVideoEnabled, String threadId) {
		return startTransferTargetCall(callObjectId, isVideoEnabled, threadId, "");
	}
	@Override
	public native boolean stopMultichannelAudioDevice(int callObjectId);

	@Override
	public int subscribeToSignalingSession(String joinContext, int sessionParametersObjectId) {
		return subscribeToSignalingSession(NativeStringConvert.ConvertToNativeBytes(joinContext), sessionParametersObjectId);
	}

	private native int subscribeToSignalingSession(byte[] joinContext, int sessionParametersObjectId);
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf, boolean enableLightWeightMeeting) {
		return subscribe(NativeStringConvert.ConvertToNativeBytes(joinContext), isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, NativeStringConvert.ConvertToNativeBytes(threadId), NativeStringConvert.ConvertToNativeBytes(messageId), NativeStringConvert.ConvertToNativeBytes(subject), NativeStringConvert.ConvertToNativeBytes(conversationType), NativeStringConvert.ConvertToNativeBytes(meetingInfo), NativeStringConvert.ConvertToNativeBytes(endpointMetaData), NativeStringConvert.ConvertToNativeBytes(onBehalfOf), enableLightWeightMeeting);
	}

	private native int subscribe(byte[] joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, byte[] threadId, byte[] messageId, byte[] subject, byte[] conversationType, byte[] meetingInfo, byte[] endpointMetaData, byte[] onBehalfOf, boolean enableLightWeightMeeting);
	@Override
	public int subscribe(String joinContext) {
		return subscribe(joinContext, false, false, true, false, "", "", "", "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled) {
		return subscribe(joinContext, isVideoEnabled, false, true, false, "", "", "", "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, true, false, "", "", "", "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, false, "", "", "", "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, "", "", "", "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, "", "", "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, "", "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, "", "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, "", "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, "", "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, "", false);
	}
	@Override
	public int subscribe(String joinContext, boolean isVideoEnabled, boolean isGoLive, boolean allowHostless, boolean enableGroupCallMeetupGeneration, String threadId, String messageId, String subject, String conversationType, String meetingInfo, String endpointMetaData, String onBehalfOf) {
		return subscribe(joinContext, isVideoEnabled, isGoLive, allowHostless, enableGroupCallMeetupGeneration, threadId, messageId, subject, conversationType, meetingInfo, endpointMetaData, onBehalfOf, false);
	}
	@Override
	public native void unsubscribe(int callObjectId);

	@Override
	public boolean updateMeetingRoles(int callObjectId, String[] participantList, String meetingRole, String causeId) {
		return updateMeetingRoles(callObjectId, NativeStringConvert.ConvertArrToNativeByteArr(participantList), NativeStringConvert.ConvertToNativeBytes(meetingRole), NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native boolean updateMeetingRoles(int callObjectId, byte[][] participantList, byte[] meetingRole, byte[] causeId);
	@Override
	public boolean updateMeetingRoles(int callObjectId, String[] participantList, String meetingRole) {
		return updateMeetingRoles(callObjectId, participantList, meetingRole, "");
	}
	@Override
	public native boolean updateMeetingSettings(int callObjectId, int meetingSettingsParametersObjectId);

}

