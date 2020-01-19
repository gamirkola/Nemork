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

import com.skype.SessionParameters;

public class SessionParametersImpl extends InMemoryObjectImpl implements SessionParameters, NativeListenable {
	public SessionParametersImpl() {
		this(SkypeFactory.getInstance() );
	}

	public SessionParametersImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createSessionParameters());
		factory.initializeListener(this);
	}

	static class SessionParametersWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		SessionParametersWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroySessionParameters(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new SessionParametersWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<SessionParametersIListener> m_listeners = new HashSet<SessionParametersIListener>();

	@Override
	public void addListener(SessionParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(SessionParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	@Override
	public native int getObjectID();

	@Override
	public native void setAllowHostless(boolean isHostless);

	@Override
	public void setBroadcastContext(String broadcastContext) {
		setBroadcastContext(NativeStringConvert.ConvertToNativeBytes(broadcastContext));
	}

	private native void setBroadcastContext(byte[] broadcastContext);
	@Override
	public void setCallKey(String callKey) {
		setCallKey(NativeStringConvert.ConvertToNativeBytes(callKey));
	}

	private native void setCallKey(byte[] callKey);
	@Override
	public native void setConnectionType(int connectionType);

	@Override
	public void setConversationType(String conversationType) {
		setConversationType(NativeStringConvert.ConvertToNativeBytes(conversationType));
	}

	private native void setConversationType(byte[] conversationType);
	@Override
	public void setDebugInfo(String debugInfo) {
		setDebugInfo(NativeStringConvert.ConvertToNativeBytes(debugInfo));
	}

	private native void setDebugInfo(byte[] debugInfo);
	@Override
	public void setEmergencyContent(String emergencyContent) {
		setEmergencyContent(NativeStringConvert.ConvertToNativeBytes(emergencyContent));
	}

	private native void setEmergencyContent(byte[] emergencyContent);
	@Override
	public native void setEnableGroupCallMeetupGeneration(boolean enableGroupCallMeetupGeneration);

	@Override
	public native void setEnableLightWeightMeeting(boolean enableLightWeightMeeting);

	@Override
	public void setEncryptedKey(String encryptedKey) {
		setEncryptedKey(NativeStringConvert.ConvertToNativeBytes(encryptedKey));
	}

	private native void setEncryptedKey(byte[] encryptedKey);
	@Override
	public void setEndpointMetadata(String endpointMetadata) {
		setEndpointMetadata(NativeStringConvert.ConvertToNativeBytes(endpointMetadata));
	}

	private native void setEndpointMetadata(byte[] endpointMetadata);
	@Override
	public native void setInvitationType(int invitationType);

	@Override
	public native void setIsGoLive(boolean isGoLive);

	@Override
	public native void setIsVideoEnabled(boolean isVideoEnabled);

	@Override
	public native void setMaxVideoChannels(int maxVideoChannels);

	@Override
	public void setMediaConfigurationJson(String mediaConfigurationJson) {
		setMediaConfigurationJson(NativeStringConvert.ConvertToNativeBytes(mediaConfigurationJson));
	}

	private native void setMediaConfigurationJson(byte[] mediaConfigurationJson);
	@Override
	public native void setMediaPeerType(int mediaPeerType);

	@Override
	public void setMediaStateConfigurationJson(String mediaStateConfigurationJson) {
		setMediaStateConfigurationJson(NativeStringConvert.ConvertToNativeBytes(mediaStateConfigurationJson));
	}

	private native void setMediaStateConfigurationJson(byte[] mediaStateConfigurationJson);
	@Override
	public void setMeetingInfo(String meetingInfo) {
		setMeetingInfo(NativeStringConvert.ConvertToNativeBytes(meetingInfo));
	}

	private native void setMeetingInfo(byte[] meetingInfo);
	@Override
	public void setMessageId(String messageId) {
		setMessageId(NativeStringConvert.ConvertToNativeBytes(messageId));
	}

	private native void setMessageId(byte[] messageId);
	@Override
	public native void setModalityDirection(int modalityType, int mediaDirection);

	@Override
	public native void setMuteFlags(int muteFlags);

	@Override
	public void setNegotiationTag(String negotiationTag) {
		setNegotiationTag(NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native void setNegotiationTag(byte[] negotiationTag);
	@Override
	public void setOnBehalfOf(String onBehalfOf) {
		setOnBehalfOf(NativeStringConvert.ConvertToNativeBytes(onBehalfOf));
	}

	private native void setOnBehalfOf(byte[] onBehalfOf);
	@Override
	public void setParticipantLegId(String participantLegId) {
		setParticipantLegId(NativeStringConvert.ConvertToNativeBytes(participantLegId));
	}

	private native void setParticipantLegId(byte[] participantLegId);
	@Override
	public native void setPreheatFlags(int preheatFlags);

	@Override
	public void setRoutingFlags(String[] routingFlags) {
		setRoutingFlags(NativeStringConvert.ConvertArrToNativeByteArr(routingFlags));
	}

	private native void setRoutingFlags(byte[][] routingFlags);
	@Override
	public void setScenario(String scenario) {
		setScenario(NativeStringConvert.ConvertToNativeBytes(scenario));
	}

	private native void setScenario(byte[] scenario);
	@Override
	public void setSubject(String subject) {
		setSubject(NativeStringConvert.ConvertToNativeBytes(subject));
	}

	private native void setSubject(byte[] subject);
	@Override
	public void setThreadId(String threadId) {
		setThreadId(NativeStringConvert.ConvertToNativeBytes(threadId));
	}

	private native void setThreadId(byte[] threadId);
}

