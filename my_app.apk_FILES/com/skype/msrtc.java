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

public interface msrtc {
	public enum AudioUsageMode {
		Default(0),
		LongrangeSpeaker(1),
		Auditorium(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		AudioUsageMode(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<AudioUsageMode> intToTypeMap = new SparseArrayCompat< AudioUsageMode>();
		
		static {
			for (AudioUsageMode type : AudioUsageMode.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static AudioUsageMode fromInt(int i) {
			AudioUsageMode tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : AudioUsageMode.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum CallType {
		PeerToPeer(0),
		Conference(1),
		Pstn(2),
		Broadcasting(3),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		CallType(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<CallType> intToTypeMap = new SparseArrayCompat< CallType>();
		
		static {
			for (CallType type : CallType.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static CallType fromInt(int i) {
			CallType tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : CallType.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum QualityLevel {
		Unknown(0),
		Good(1),
		Poor(2),
		Bad(3),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		QualityLevel(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<QualityLevel> intToTypeMap = new SparseArrayCompat< QualityLevel>();
		
		static {
			for (QualityLevel type : QualityLevel.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static QualityLevel fromInt(int i) {
			QualityLevel tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : QualityLevel.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum RenderlessVideoSinkType {
		invalid(0),
		raw(1),
		encoded(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		RenderlessVideoSinkType(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<RenderlessVideoSinkType> intToTypeMap = new SparseArrayCompat< RenderlessVideoSinkType>();
		
		static {
			for (RenderlessVideoSinkType type : RenderlessVideoSinkType.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static RenderlessVideoSinkType fromInt(int i) {
			RenderlessVideoSinkType tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : RenderlessVideoSinkType.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum QualityEventType {
		Invalid(-1),
		NetworkSendQuality(0),
		NetworkRecvQuality(1),
		NetworkDelay(2),
		NetworkBandwidthLow(3),
		EventReserved0(4),
		NetworkPacketLoss(5),
		NetworkJitter(6),
		NetworkRateMatching(7),
		DeviceCaptureNotFunctioning(8),
		DeviceRenderNotFunctioning(9),
		DeviceRenderGlitches(10),
		DeviceLowSNR(11),
		DeviceLowSpeechLevel(12),
		DeviceClipping(13),
		DeviceEcho(14),
		PresentationAudioQuality(15),
		DeviceHalfDuplexAec(16),
		DeviceMultipleEndpoints(17),
		DeviceHowling(18),
		DeviceRenderZeroVolume(19),
		DeviceRenderMute(20),
		NetworkSendCatastrophic(21),
		NetworkRecvCatastrophic(22),
		EventReserved4(23),
		CpuInsufficient(24),
		DeviceCaptureMute(25),
		DeviceCaptureNotMuteButSilent(26),
		DeviceSpeakWhileMuted(27),
		VideoVbssRendered(28),
		EventReserved5(29),
		EventReserved6(30),
		EventReserved7(31),
		NetworkRoaming(32),
		NetworkEthernetInterfaceUsed(33),
		NetworkWlanInterfaceUsed(34),
		NetworkWwanInterfaceUsed(35),
		RelayWhiteListing(36),
		NetworkReconnect(37),
		VideoCapturerDeviceStartFailed(38),
		VideoCapturerDeviceStartTimedOut(39),
		VideoCapturerDeviceStartFailureLackSystemRes(40),
		VideoCapturerDeviceStartFailureMFResConflict(41),
		ZeroCaptureDevicesEnumerated(42),
		ZeroRenderDevicesEnumerated(43),
		NoNetwork(44),
		NetworkNotWorking(45),
		DeviceCaptureNotFunctioningAudioSrvNotRunning(46),
		DeviceRenderNotFunctioningAudioSrvNotRunning(47),
		DeviceCaptureNotFunctioningDeviceInUse(48),
		DeviceRenderNotFunctioningDeviceInUse(49),
		VideoCaptureDeviceFreeze(50),
		AudioCapturePermissionDenied(51),
		VideoCapturePermissionDenied(52),
		VideoCaptureFreezeRecovered(53),
		DeviceRenderHowling(54),
		VideoRecvNetworkFreeze(55),
		PresentationAudioLoopbackDeviceState(56),
		LowFarEndInput(57),
		RemoteNetworkConnectivityIssue(58),
		ReducedDataModeEnabled(59),
		ReducedDataModeDisabled(60),
		QualityEventCount(60),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		QualityEventType(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<QualityEventType> intToTypeMap = new SparseArrayCompat< QualityEventType>();
		
		static {
			for (QualityEventType type : QualityEventType.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static QualityEventType fromInt(int i) {
			QualityEventType tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : QualityEventType.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum RemoteUserEventType {
		VbssRendered(0),
		RemoteUserEventTypeCount(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		RemoteUserEventType(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<RemoteUserEventType> intToTypeMap = new SparseArrayCompat< RemoteUserEventType>();
		
		static {
			for (RemoteUserEventType type : RemoteUserEventType.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static RemoteUserEventType fromInt(int i) {
			RemoteUserEventType tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : RemoteUserEventType.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum RtpChannelFlag {
		Combo(1),
		ApplicationSharingVideo(2),
		RealtimeData(4),
		WebRtcChannel(4096),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		RtpChannelFlag(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<RtpChannelFlag> intToTypeMap = new SparseArrayCompat< RtpChannelFlag>();
		
		static {
			for (RtpChannelFlag type : RtpChannelFlag.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static RtpChannelFlag fromInt(int i) {
			RtpChannelFlag tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : RtpChannelFlag.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum RtpSourceProviderDeviceType {
		MainVideo(0),
		ScreenSharing(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		RtpSourceProviderDeviceType(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<RtpSourceProviderDeviceType> intToTypeMap = new SparseArrayCompat< RtpSourceProviderDeviceType>();
		
		static {
			for (RtpSourceProviderDeviceType type : RtpSourceProviderDeviceType.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static RtpSourceProviderDeviceType fromInt(int i) {
			RtpSourceProviderDeviceType tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : RtpSourceProviderDeviceType.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PiiKind {
		None(0),
		DistinguishedName(1),
		GenericData(2),
		IPv4Address(3),
		IPv6Address(4),
		MailSubject(5),
		PhoneNumber(6),
		QueryString(7),
		SipAddress(8),
		SmtpAddress(9),
		Identity(10),
		Uri(11),
		Fqdn(12),
		IPv4AddressLegacy(13),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PiiKind(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PiiKind> intToTypeMap = new SparseArrayCompat< PiiKind>();
		
		static {
			for (PiiKind type : PiiKind.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PiiKind fromInt(int i) {
			PiiKind tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PiiKind.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum ReducedDataMode {
		Never(0),
		Cellular(1),
		Always(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		ReducedDataMode(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<ReducedDataMode> intToTypeMap = new SparseArrayCompat< ReducedDataMode>();
		
		static {
			for (ReducedDataMode type : ReducedDataMode.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static ReducedDataMode fromInt(int i) {
			ReducedDataMode tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : ReducedDataMode.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum UserClientType {
		UnknownClient(0),
		Consumer(1),
		Enterprise(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		UserClientType(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<UserClientType> intToTypeMap = new SparseArrayCompat< UserClientType>();
		
		static {
			for (UserClientType type : UserClientType.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static UserClientType fromInt(int i) {
			UserClientType tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : UserClientType.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MediaDiagnosticType {
		Connectivity(0),
		Channel(1),
		Call(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MediaDiagnosticType(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MediaDiagnosticType> intToTypeMap = new SparseArrayCompat< MediaDiagnosticType>();
		
		static {
			for (MediaDiagnosticType type : MediaDiagnosticType.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MediaDiagnosticType fromInt(int i) {
			MediaDiagnosticType tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MediaDiagnosticType.WRAPPER_UNKNOWN_VALUE;
		}
	}

	
}

