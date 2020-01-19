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

import com.skype.Call;

public class CallImpl extends ObjectInterfaceImpl implements Call, ObjectInterface, NativeListenable {
	public CallImpl() {
		this(SkypeFactory.getInstance() );
	}

	public CallImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createCall());
		factory.initializeListener(this);
	}

	static class CallWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		CallWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyCall(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new CallWeakRef(factory, this, queue, m_nativeObject);
	}

	@Override
	public int getBeginTimestampProp() {
		return getIntProperty(PROPKEY.CALL_BEGIN_TIMESTAMP);
	}

	@Override
	public String getTopicProp() {
		return getStrProperty(PROPKEY.CALL_TOPIC);
	}

	@Override
	public boolean getIsMutedProp() {
		return getIntProperty(PROPKEY.CALL_IS_MUTED) != 0;
	}

	@Override
	public boolean getIsServerMutedProp() {
		return getIntProperty(PROPKEY.CALL_IS_SERVER_MUTED) != 0;
	}

	@Override
	public boolean getIsMutedSpeakerProp() {
		return getIntProperty(PROPKEY.CALL_IS_MUTED_SPEAKER) != 0;
	}

	@Override
	public boolean getIsUnseenMissedProp() {
		return getIntProperty(PROPKEY.CALL_IS_UNSEEN_MISSED) != 0;
	}

	@Override
	public String getHostIdentityProp() {
		return getStrProperty(PROPKEY.CALL_HOST_IDENTITY);
	}

	@Override
	public boolean getIsHostlessProp() {
		return getIntProperty(PROPKEY.CALL_IS_HOSTLESS) != 0;
	}

	@Override
	public int getMikeStatusProp() {
		return getIntProperty(PROPKEY.CALL_MIKE_STATUS);
	}

	@Override
	public int getDurationProp() {
		return getIntProperty(PROPKEY.CALL_DURATION);
	}

	@Override
	public int getSoundlevelProp() {
		return getIntProperty(PROPKEY.CALL_SOUNDLEVEL);
	}

	@Override
	public String getAccessTokenProp() {
		return getStrProperty(PROPKEY.CALL_ACCESS_TOKEN);
	}

	@Override
	public int getActiveMembersProp() {
		return getIntProperty(PROPKEY.CALL_ACTIVE_MEMBERS);
	}

	@Override
	public boolean getIsActiveProp() {
		return getIntProperty(PROPKEY.CALL_IS_ACTIVE) != 0;
	}

	@Override
	public String getNameProp() {
		return getStrProperty(PROPKEY.CALL_NAME);
	}

	@Override
	public boolean getVideoDisabledProp() {
		return getIntProperty(PROPKEY.CALL_VIDEO_DISABLED) != 0;
	}

	@Override
	public boolean getJoinedExistingProp() {
		return getIntProperty(PROPKEY.CALL_JOINED_EXISTING) != 0;
	}

	@Override
	public String getServerIdentityProp() {
		return getStrProperty(PROPKEY.CALL_SERVER_IDENTITY);
	}

	@Override
	public int getVaaInputStatusProp() {
		return getIntProperty(PROPKEY.CALL_VAA_INPUT_STATUS);
	}

	@Override
	public boolean getIsIncomingProp() {
		return getIntProperty(PROPKEY.CALL_IS_INCOMING) != 0;
	}

	@Override
	public int getIsConferenceProp() {
		return getIntProperty(PROPKEY.CALL_IS_CONFERENCE);
	}

	@Override
	public boolean getIsOnHoldProp() {
		return getIntProperty(PROPKEY.CALL_IS_ON_HOLD) != 0;
	}

	@Override
	public int getStartTimestampProp() {
		return getIntProperty(PROPKEY.CALL_START_TIMESTAMP);
	}

	@Override
	public String getQualityProblemsProp() {
		return getStrProperty(PROPKEY.CALL_QUALITY_PROBLEMS);
	}

	@Override
	public String getCurrentVideoAudienceProp() {
		return getStrProperty(PROPKEY.CALL_CURRENT_VIDEO_AUDIENCE);
	}

	@Override
	public int getPremiumVideoStatusProp() {
		return getIntProperty(PROPKEY.CALL_PREMIUM_VIDEO_STATUS);
	}

	@Override
	public boolean getPremiumVideoIsGracePeriodProp() {
		return getIntProperty(PROPKEY.CALL_PREMIUM_VIDEO_IS_GRACE_PERIOD) != 0;
	}

	@Override
	public boolean getIsPremiumVideoSponsorProp() {
		return getIntProperty(PROPKEY.CALL_IS_PREMIUM_VIDEO_SPONSOR) != 0;
	}

	@Override
	public String getPremiumVideoSponsorListProp() {
		return getStrProperty(PROPKEY.CALL_PREMIUM_VIDEO_SPONSOR_LIST);
	}

	@Override
	public int getMaxVideoconfcallParticipantsProp() {
		return getIntProperty(PROPKEY.CALL_MAX_VIDEOCONFCALL_PARTICIPANTS);
	}

	@Override
	public int getOptimalRemoteVideosInConferenceProp() {
		return getIntProperty(PROPKEY.CALL_OPTIMAL_REMOTE_VIDEOS_IN_CONFERENCE);
	}

	@Override
	public String getMessageIdProp() {
		return getStrProperty(PROPKEY.CALL_MESSAGE_ID);
	}

	@Override
	public int getStatusProp() {
		return getIntProperty(PROPKEY.CALL_STATUS);
	}

	@Override
	public String getThreadIdProp() {
		return getStrProperty(PROPKEY.CALL_THREAD_ID);
	}

	@Override
	public String getLegIdProp() {
		return getStrProperty(PROPKEY.CALL_LEG_ID);
	}

	@Override
	public String getConversationTypeProp() {
		return getStrProperty(PROPKEY.CALL_CONVERSATION_TYPE);
	}

	@Override
	public int getDatachannelObjectIdProp() {
		return getIntProperty(PROPKEY.CALL_DATACHANNEL_OBJECT_ID);
	}

	@Override
	public String getEndpointDetailsProp() {
		return getStrProperty(PROPKEY.CALL_ENDPOINT_DETAILS);
	}

	@Override
	public String getCallerMriIdentityProp() {
		return getStrProperty(PROPKEY.CALL_CALLER_MRI_IDENTITY);
	}

	@Override
	public boolean getMemberCountChangedProp() {
		return getIntProperty(PROPKEY.CALL_MEMBER_COUNT_CHANGED) != 0;
	}

	@Override
	public int getTransferStatusProp() {
		return getIntProperty(PROPKEY.CALL_TRANSFER_STATUS);
	}

	@Override
	public int getTransferFailureReasonProp() {
		return getIntProperty(PROPKEY.CALL_TRANSFER_FAILURE_REASON);
	}

	@Override
	public String getForwardingDestinationTypeProp() {
		return getStrProperty(PROPKEY.CALL_FORWARDING_DESTINATION_TYPE);
	}

	@Override
	public String getIncomingTypeProp() {
		return getStrProperty(PROPKEY.CALL_INCOMING_TYPE);
	}

	@Override
	public String getOnbehalfofMriProp() {
		return getStrProperty(PROPKEY.CALL_ONBEHALFOF_MRI);
	}

	@Override
	public String getTransferorMriProp() {
		return getStrProperty(PROPKEY.CALL_TRANSFEROR_MRI);
	}

	@Override
	public boolean getIsIncomingOneOnOneVideoCallProp() {
		return getIntProperty(PROPKEY.CALL_IS_INCOMING_ONE_ON_ONE_VIDEO_CALL) != 0;
	}

	@Override
	public String getQueueInfoProp() {
		return getStrProperty(PROPKEY.CALL_QUEUE_INFO);
	}

	@Override
	public String getTransferorTypeProp() {
		return getStrProperty(PROPKEY.CALL_TRANSFEROR_TYPE);
	}

	@Override
	public String getTransferorDisplaynameProp() {
		return getStrProperty(PROPKEY.CALL_TRANSFEROR_DISPLAYNAME);
	}

	@Override
	public String getInvitationDataProp() {
		return getStrProperty(PROPKEY.CALL_INVITATION_DATA);
	}

	@Override
	public String getPublishedStatesProp() {
		return getStrProperty(PROPKEY.CALL_PUBLISHED_STATES);
	}

	@Override
	public String getMeetingDetailsProp() {
		return getStrProperty(PROPKEY.CALL_MEETING_DETAILS);
	}

	@Override
	public String getRoleProp() {
		return getStrProperty(PROPKEY.CALL_ROLE);
	}

	@Override
	public String getTenantIdProp() {
		return getStrProperty(PROPKEY.CALL_TENANT_ID);
	}

	@Override
	public String getBroadcastMetadataProp() {
		return getStrProperty(PROPKEY.CALL_BROADCAST_METADATA);
	}

	@Override
	public boolean getContentSharingSessionCountChangedProp() {
		return getIntProperty(PROPKEY.CALL_CONTENT_SHARING_SESSION_COUNT_CHANGED) != 0;
	}

	@Override
	public int getFailureReasonProp() {
		return getIntProperty(PROPKEY.CALL_FAILURE_REASON);
	}

	@Override
	public String getMeetingRoleProp() {
		return getStrProperty(PROPKEY.CALL_MEETING_ROLE);
	}

	@Override
	public String getProgressStatusProp() {
		return getStrProperty(PROPKEY.CALL_PROGRESS_STATUS);
	}

	@Override
	public String getConsultativeTransferCallIdProp() {
		return getStrProperty(PROPKEY.CALL_CONSULTATIVE_TRANSFER_CALL_ID);
	}

	@Override
	public int getParkStatusProp() {
		return getIntProperty(PROPKEY.CALL_PARK_STATUS);
	}

	@Override
	public int getParkFailureReasonProp() {
		return getIntProperty(PROPKEY.CALL_PARK_FAILURE_REASON);
	}

	@Override
	public String getParkPickupCodeProp() {
		return getStrProperty(PROPKEY.CALL_PARK_PICKUP_CODE);
	}

	@Override
	public int getOriginProp() {
		return getIntProperty(PROPKEY.CALL_ORIGIN);
	}

	@Override
	public String getEndDiagnosticsCodeProp() {
		return getStrProperty(PROPKEY.CALL_END_DIAGNOSTICS_CODE);
	}

	@Override
	public String getTransferDiagnosticsCodeProp() {
		return getStrProperty(PROPKEY.CALL_TRANSFER_DIAGNOSTICS_CODE);
	}

	@Override
	public String getServerHoldLocationProp() {
		return getStrProperty(PROPKEY.CALL_SERVER_HOLD_LOCATION);
	}

	@Override
	public String getAccountIdentityProp() {
		return getStrProperty(PROPKEY.CALL_ACCOUNT_IDENTITY);
	}

	@Override
	public int getCapabilitiesProp() {
		return getIntProperty(PROPKEY.CALL_CAPABILITIES);
	}

	@Override
	public int getActiveVideoChannelCountProp() {
		return getIntProperty(PROPKEY.CALL_ACTIVE_VIDEO_CHANNEL_COUNT);
	}

	@Override
	public String getAcceptedElsewhereByMriIdentityProp() {
		return getStrProperty(PROPKEY.CALL_ACCEPTED_ELSEWHERE_BY_MRI_IDENTITY);
	}

	@Override
	public String getAcceptedElsewhereByDisplaynameProp() {
		return getStrProperty(PROPKEY.CALL_ACCEPTED_ELSEWHERE_BY_DISPLAYNAME);
	}

	public native void initializeListener();
	
	private final Set<CallIListener> m_listeners = new HashSet<CallIListener>();

	@Override
	public void addListener(CallIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(CallIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

}

