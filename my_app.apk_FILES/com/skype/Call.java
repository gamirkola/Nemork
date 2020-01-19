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

public interface Call extends ObjectInterface {
	public enum ORIGIN_TYPE {
		UNSPECIFIED(0),
		TRANSFER(1),
		PARK(2),
		TRANSFER_TO_VOICEMAIL(3),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		ORIGIN_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<ORIGIN_TYPE> intToTypeMap = new SparseArrayCompat< ORIGIN_TYPE>();
		
		static {
			for (ORIGIN_TYPE type : ORIGIN_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static ORIGIN_TYPE fromInt(int i) {
			ORIGIN_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : ORIGIN_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public int getBeginTimestampProp();

	public String getTopicProp();

	public boolean getIsMutedProp();

	public boolean getIsServerMutedProp();

	public boolean getIsMutedSpeakerProp();

	public boolean getIsUnseenMissedProp();

	public String getHostIdentityProp();

	public boolean getIsHostlessProp();

	public int getMikeStatusProp();

	public int getDurationProp();

	public int getSoundlevelProp();

	public String getAccessTokenProp();

	public int getActiveMembersProp();

	public boolean getIsActiveProp();

	public String getNameProp();

	public boolean getVideoDisabledProp();

	public boolean getJoinedExistingProp();

	public String getServerIdentityProp();

	public int getVaaInputStatusProp();

	public boolean getIsIncomingProp();

	public int getIsConferenceProp();

	public boolean getIsOnHoldProp();

	public int getStartTimestampProp();

	public String getQualityProblemsProp();

	public String getCurrentVideoAudienceProp();

	public int getPremiumVideoStatusProp();

	public boolean getPremiumVideoIsGracePeriodProp();

	public boolean getIsPremiumVideoSponsorProp();

	public String getPremiumVideoSponsorListProp();

	public int getMaxVideoconfcallParticipantsProp();

	public int getOptimalRemoteVideosInConferenceProp();

	public String getMessageIdProp();

	public int getStatusProp();

	public String getThreadIdProp();

	public String getLegIdProp();

	public String getConversationTypeProp();

	public int getDatachannelObjectIdProp();

	public String getEndpointDetailsProp();

	public String getCallerMriIdentityProp();

	public boolean getMemberCountChangedProp();

	public int getTransferStatusProp();

	public int getTransferFailureReasonProp();

	public String getForwardingDestinationTypeProp();

	public String getIncomingTypeProp();

	public String getOnbehalfofMriProp();

	public String getTransferorMriProp();

	public boolean getIsIncomingOneOnOneVideoCallProp();

	public String getQueueInfoProp();

	public String getTransferorTypeProp();

	public String getTransferorDisplaynameProp();

	public String getInvitationDataProp();

	public String getPublishedStatesProp();

	public String getMeetingDetailsProp();

	public String getRoleProp();

	public String getTenantIdProp();

	public String getBroadcastMetadataProp();

	public boolean getContentSharingSessionCountChangedProp();

	public int getFailureReasonProp();

	public String getMeetingRoleProp();

	public String getProgressStatusProp();

	public String getConsultativeTransferCallIdProp();

	public int getParkStatusProp();

	public int getParkFailureReasonProp();

	public String getParkPickupCodeProp();

	public int getOriginProp();

	public String getEndDiagnosticsCodeProp();

	public String getTransferDiagnosticsCodeProp();

	public String getServerHoldLocationProp();

	public String getAccountIdentityProp();

	public int getCapabilitiesProp();

	public int getActiveVideoChannelCountProp();

	public String getAcceptedElsewhereByMriIdentityProp();

	public String getAcceptedElsewhereByDisplaynameProp();

	public interface CallIListener {
	}

	public void addListener(CallIListener listener);

	public void removeListener(CallIListener listener);

	
}

