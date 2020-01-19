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

public interface SessionParameters {
	public interface SessionParametersIListener {
	}

	public void addListener(SessionParametersIListener listener);

	public void removeListener(SessionParametersIListener listener);

	
	public SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	public int getObjectID();

	public void setAllowHostless(boolean isHostless);

	public void setBroadcastContext(String broadcastContext);

	public void setCallKey(String callKey);

	public void setConnectionType(int connectionType);

	public void setConversationType(String conversationType);

	public void setDebugInfo(String debugInfo);

	public void setEmergencyContent(String emergencyContent);

	public void setEnableGroupCallMeetupGeneration(boolean enableGroupCallMeetupGeneration);

	public void setEnableLightWeightMeeting(boolean enableLightWeightMeeting);

	public void setEncryptedKey(String encryptedKey);

	public void setEndpointMetadata(String endpointMetadata);

	public void setInvitationType(int invitationType);

	public void setIsGoLive(boolean isGoLive);

	public void setIsVideoEnabled(boolean isVideoEnabled);

	public void setMaxVideoChannels(int maxVideoChannels);

	public void setMediaConfigurationJson(String mediaConfigurationJson);

	public void setMediaPeerType(int mediaPeerType);

	public void setMediaStateConfigurationJson(String mediaStateConfigurationJson);

	public void setMeetingInfo(String meetingInfo);

	public void setMessageId(String messageId);

	public void setModalityDirection(int modalityType, int mediaDirection);

	public void setMuteFlags(int muteFlags);

	public void setNegotiationTag(String negotiationTag);

	public void setOnBehalfOf(String onBehalfOf);

	public void setParticipantLegId(String participantLegId);

	public void setPreheatFlags(int preheatFlags);

	public void setRoutingFlags(String[] routingFlags);

	public void setScenario(String scenario);

	public void setSubject(String subject);

	public void setThreadId(String threadId);

}

