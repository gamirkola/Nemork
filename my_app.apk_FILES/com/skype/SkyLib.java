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

public interface SkyLib extends GI {
	public enum OBJECTTYPE {
		VIDEO(11),
		CONTENTSHARING(29),
		DATACHANNEL(30),
		CALLMEMBER(13),
		CALL(4),
		ACCOUNT(5),
		CALLHANDLER(26),
		RESERVED(31),
		NROF_OBJECTTYPES(32),
		FORMERLY_SEARCH(1),
		FORMERLY_CONTACT(2),
		FORMERLY_LEGACYMESSAGE(3),
		FORMERLY_TRANSFER(6),
		FORMERLY_VOICEMAIL(7),
		FORMERLY_CHAT(8),
		FORMERLY_MESSAGE(9),
		FORMERLY_CONTACTGROUP(10),
		FORMERLY_SMS(12),
		FORMERLY_LIGHTWEIGHTMEETING(14),
		FORMERLY_CHATMEMBER(15),
		FORMERLY_ALERT(16),
		FORMERLY_PRICEQUOTE(17),
		FORMERLY_CONVERSATION(18),
		FORMERLY_PARTICIPANT(19),
		FORMERLY_ACCESS(20),
		FORMERLY_VIDEOMESSAGE(21),
		FORMERLY_MEDIADOCUMENT(22),
		FORMERLY_TRANSLATOR(23),
		FORMERLY_MESSAGEANNOTATION(24),
		FORMERLY_CONTENTSEARCHDOCUMENT(25),
		FORMERLY_CONTENTSEARCH(27),
		FORMERLY_CONVERSATIONVIEW(28),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		OBJECTTYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<OBJECTTYPE> intToTypeMap = new SparseArrayCompat< OBJECTTYPE>();
		
		static {
			for (OBJECTTYPE type : OBJECTTYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static OBJECTTYPE fromInt(int i) {
			OBJECTTYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : OBJECTTYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum IN_MEMORY_OBJECTTYPE {
		INVALID(0),
		EXAMPLEINMEMORYOBJECT(1),
		SESSIONPARAMETERS(2),
		ADDPARTICIPANTPARAMETERS(3),
		ADDGROUPMODALITYPARAMETERS(4),
		MERGEPARAMETERS(5),
		ANSWERPARAMETERS(6),
		MEDIASTATECONFIGURATION(7),
		TRANSFERPARAMETERS(8),
		MEETINGSETTINGSPARAMETERS(9),
		NROF_IN_MEMORY_OBJECTTYPES(10),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		IN_MEMORY_OBJECTTYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<IN_MEMORY_OBJECTTYPE> intToTypeMap = new SparseArrayCompat< IN_MEMORY_OBJECTTYPE>();
		
		static {
			for (IN_MEMORY_OBJECTTYPE type : IN_MEMORY_OBJECTTYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static IN_MEMORY_OBJECTTYPE fromInt(int i) {
			IN_MEMORY_OBJECTTYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : IN_MEMORY_OBJECTTYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum CALL_TYPE {
		CALL_TYPE_GROUP(0),
		CALL_TYPE_S2S(1),
		CALL_TYPE_PSTN(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		CALL_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<CALL_TYPE> intToTypeMap = new SparseArrayCompat< CALL_TYPE>();
		
		static {
			for (CALL_TYPE type : CALL_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static CALL_TYPE fromInt(int i) {
			CALL_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : CALL_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum VIDEO_DEVICE_TYPE {
		VIDEO_DEVICE_USB_CAMERA(0),
		VIDEO_DEVICE_CAPTURE_ADAPTER(1),
		VIDEO_DEVICE_VIRTUAL(2),
		VIDEO_DEVICE_SR_AUGMENTED(5),
		VIDEO_DEVICE_VIRTUAL_REALITY(6),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		VIDEO_DEVICE_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<VIDEO_DEVICE_TYPE> intToTypeMap = new SparseArrayCompat< VIDEO_DEVICE_TYPE>();
		
		static {
			for (VIDEO_DEVICE_TYPE type : VIDEO_DEVICE_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static VIDEO_DEVICE_TYPE fromInt(int i) {
			VIDEO_DEVICE_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : VIDEO_DEVICE_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum VIDEO_DEVICE_FACING {
		VIDEO_DEVICE_FACING_UNKNOWN(0),
		VIDEO_DEVICE_FACING_EXTERNAL(1),
		VIDEO_DEVICE_FACING_FRONT(2),
		VIDEO_DEVICE_FACING_BACK(3),
		VIDEO_DEVICE_FACING_PANORAMIC(4),
		VIDEO_DEVICE_FACING_LEFT_FRONT(5),
		VIDEO_DEVICE_FACING_RIGHT_FRONT(6),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		VIDEO_DEVICE_FACING(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<VIDEO_DEVICE_FACING> intToTypeMap = new SparseArrayCompat< VIDEO_DEVICE_FACING>();
		
		static {
			for (VIDEO_DEVICE_FACING type : VIDEO_DEVICE_FACING.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static VIDEO_DEVICE_FACING fromInt(int i) {
			VIDEO_DEVICE_FACING tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : VIDEO_DEVICE_FACING.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum IDENTITYTYPE {
		UNRECOGNIZED(0),
		SKYPE(1),
		SKYPE_MYSELF(2),
		SKYPE_UNDISCLOSED(3),
		PSTN(4),
		PSTN_EMERGENCY(5),
		PSTN_FREE(6),
		PSTN_UNDISCLOSED(7),
		CONFERENCE(8),
		EXTERNAL(9),
		XMPP(10),
		PASSPORT(11),
		LYNC(12),
		BOT(13),
		LOCAL_SMS(14),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		IDENTITYTYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<IDENTITYTYPE> intToTypeMap = new SparseArrayCompat< IDENTITYTYPE>();
		
		static {
			for (IDENTITYTYPE type : IDENTITYTYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static IDENTITYTYPE fromInt(int i) {
			IDENTITYTYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : IDENTITYTYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum COMPOSITE_AUDIO_DEVICE_TYPE {
		ADT_SPEAKERS(0),
		ADT_HEADPHONES(1),
		ADT_HEADSET(2),
		ADT_HANDSET(3),
		ADT_SPEAKERPHONE(4),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		COMPOSITE_AUDIO_DEVICE_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<COMPOSITE_AUDIO_DEVICE_TYPE> intToTypeMap = new SparseArrayCompat< COMPOSITE_AUDIO_DEVICE_TYPE>();
		
		static {
			for (COMPOSITE_AUDIO_DEVICE_TYPE type : COMPOSITE_AUDIO_DEVICE_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static COMPOSITE_AUDIO_DEVICE_TYPE fromInt(int i) {
			COMPOSITE_AUDIO_DEVICE_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : COMPOSITE_AUDIO_DEVICE_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum QUALITY_MEDIATYPE {
		AUDIO(0),
		CAMERA(1),
		PANORAMICCAMERA(2),
		APPSHARING(3),
		DATA(4),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		QUALITY_MEDIATYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<QUALITY_MEDIATYPE> intToTypeMap = new SparseArrayCompat< QUALITY_MEDIATYPE>();
		
		static {
			for (QUALITY_MEDIATYPE type : QUALITY_MEDIATYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static QUALITY_MEDIATYPE fromInt(int i) {
			QUALITY_MEDIATYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : QUALITY_MEDIATYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum INTENT {
		I_REGULAR(0),
		I_CALL_PUSH(2),
		I_CALL_USER(3),
		I_UNKNOWN(4),
		I_CALL_PREHEAT(5),
		I_MEDIA_INIT(6),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		INTENT(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<INTENT> intToTypeMap = new SparseArrayCompat< INTENT>();
		
		static {
			for (INTENT type : INTENT.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static INTENT fromInt(int i) {
			INTENT tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : INTENT.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum SERVICE_TYPE {
		TESTING(0),
		MICROSOFT_WNS(1),
		MICROSOFT_WP7NS(2),
		APPLE_APN(3),
		GOOGLE_AGCM(4),
		HOTMAIL(5),
		GOOGLE_AC2DM(6),
		TROUTER(7),
		GRIFFIN(8),
		ADM(9),
		NNA(10),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		SERVICE_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<SERVICE_TYPE> intToTypeMap = new SparseArrayCompat< SERVICE_TYPE>();
		
		static {
			for (SERVICE_TYPE type : SERVICE_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static SERVICE_TYPE fromInt(int i) {
			SERVICE_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : SERVICE_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PUSHHANDLINGRESULT {
		BAD_NOTIFICATION_PAYLOAD(0),
		CALL_SETUP_SUCCEEDED(1),
		CALL_SETUP_FAILED(2),
		BAD_NOTIFICATION_EVENT_TYPE(5),
		CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS(6),
		CALL_SETUP_FAILED_CANNOT_CONNECT(7),
		CALL_SETUP_FAILED_NO_SIGNALING(8),
		CALL_SETUP_FAILED_NO_PERMISSION(9),
		CALL_SETUP_FAILED_NO_COMMON_CODEC(10),
		CALL_SETUP_FAILED_CONFLICT(11),
		CALL_SETUP_FAILED_PUSH_IGNORED(12),
		CALL_SETUP_FAILED_ANSWERED_ELSEWHERE(13),
		CALL_SETUP_FAILED_CALL_ALREADY_ENDED(14),
		CALL_SETUP_PROGRESS(17),
		LOG_UPLOAD_EVENT_HANDLED(24),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PUSHHANDLINGRESULT(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PUSHHANDLINGRESULT> intToTypeMap = new SparseArrayCompat< PUSHHANDLINGRESULT>();
		
		static {
			for (PUSHHANDLINGRESULT type : PUSHHANDLINGRESULT.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PUSHHANDLINGRESULT fromInt(int i) {
			PUSHHANDLINGRESULT tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PUSHHANDLINGRESULT.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PNM_REGISTER_CONTEXTS_RESULT {
		REGISTER_CONTEXTS_SUCCEEDED(0),
		REGISTER_CONTEXTS_FAILED(1),
		REGISTER_CONTEXTS_FAILED_REQUEST(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PNM_REGISTER_CONTEXTS_RESULT(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PNM_REGISTER_CONTEXTS_RESULT> intToTypeMap = new SparseArrayCompat< PNM_REGISTER_CONTEXTS_RESULT>();
		
		static {
			for (PNM_REGISTER_CONTEXTS_RESULT type : PNM_REGISTER_CONTEXTS_RESULT.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PNM_REGISTER_CONTEXTS_RESULT fromInt(int i) {
			PNM_REGISTER_CONTEXTS_RESULT tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PNM_REGISTER_CONTEXTS_RESULT.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PNM_REGISTER_MODULE {
		PNM_REGISTER_EDF(0),
		PNM_REGISTER_INTERNAL(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PNM_REGISTER_MODULE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PNM_REGISTER_MODULE> intToTypeMap = new SparseArrayCompat< PNM_REGISTER_MODULE>();
		
		static {
			for (PNM_REGISTER_MODULE type : PNM_REGISTER_MODULE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PNM_REGISTER_MODULE fromInt(int i) {
			PNM_REGISTER_MODULE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PNM_REGISTER_MODULE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum ECS_CALLBACK_EVENT_TYPE {
		CONFIG_UPDATED(0),
		TOKEN_IS_INVALID(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		ECS_CALLBACK_EVENT_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<ECS_CALLBACK_EVENT_TYPE> intToTypeMap = new SparseArrayCompat< ECS_CALLBACK_EVENT_TYPE>();
		
		static {
			for (ECS_CALLBACK_EVENT_TYPE type : ECS_CALLBACK_EVENT_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static ECS_CALLBACK_EVENT_TYPE fromInt(int i) {
			ECS_CALLBACK_EVENT_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : ECS_CALLBACK_EVENT_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE {
		TROUTER_CONNECTED(0),
		TROUTER_DISCONNECTED(1),
		TROUTER_CONNECT_FAILED(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE> intToTypeMap = new SparseArrayCompat< TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE>();
		
		static {
			for (TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE type : TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE fromInt(int i) {
			TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum MEDIASTATUS {
		MEDIA_STATUS_NOT_AVAILABLE(0),
		MEDIA_STATUS_INITIALIZED(1),
		MEDIA_STATUS_FAILED(2),
		MEDIA_STATUS_UNINITIALIZED(3),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MEDIASTATUS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MEDIASTATUS> intToTypeMap = new SparseArrayCompat< MEDIASTATUS>();
		
		static {
			for (MEDIASTATUS type : MEDIASTATUS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MEDIASTATUS fromInt(int i) {
			MEDIASTATUS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MEDIASTATUS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	long getAriaLogManager();
	long getEcsClientInstance();
	long getDefaultHttpStack();
	long getMediaExtension(int type);
	Object getTrouterInstance();
	long getBttTrouterInstance();
	public interface SkyLibIListener {
		void onAvailableDeviceListChange(SkyLib sender);
		void onAvailableVideoDeviceListChange(SkyLib sender);
		void onE911InfoChanged(SkyLib sender, String json);
		void onEcsEvent(SkyLib sender, SkyLib.ECS_CALLBACK_EVENT_TYPE eventType);
		void onLoggingEvent(SkyLib sender, String message, String auxiliaryPayload);
		void onMediaStatusChanged(SkyLib sender, SkyLib.MEDIASTATUS newStatus);
		void onObjectDelete(SkyLib sender, SkyLib.OBJECTTYPE objectType, int objectID);
		void onObjectPropertyChangeWithValue(SkyLib sender, int objectID, PROPKEY propKey, Metatag property);
		void onOperationModeChanged(SkyLib sender, int level);
		void onProbeDevicesStatusChanged(SkyLib sender, boolean ready);
		void onProxiedPushNotification(SkyLib sender, int eventId, String payload);
		void onPushHandlingComplete(SkyLib sender, int token, SkyLib.PUSHHANDLINGRESULT result);
		void onQualityChanged(SkyLib sender, int objectId, msrtc.QualityEventType type, msrtc.QualityLevel level, SkyLib.QUALITY_MEDIATYPE mediaType);
		void onRegisterContextsComplete(SkyLib sender, SkyLib.PNM_REGISTER_CONTEXTS_RESULT success, int requestId);
		void onSkypeTokenRequired(SkyLib sender, String invalidToken);
		void onTrouterCheckConnectionComplete(SkyLib sender, boolean isConnected);
		void onTrouterConnectionStateChanged(SkyLib sender, SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE eventType);
		void onTrouterSuspendComplete(SkyLib sender);
		void onTrouterSuspendReady(SkyLib sender);
	}

	public void addListener(SkyLibIListener listener);

	public void removeListener(SkyLibIListener listener);

	
	public void changeOperationMode(int level);

	public boolean createExampleObject(ExampleInMemoryObject exampleInMemoryObject);

	public long createHrtfAudioProcessor(int VoiceChannel);

	public int createLocalVideo(Video.MEDIATYPE type, String name, String path, String label);

	public int createLocalVideo(Video.MEDIATYPE type);

	public int createLocalVideo(Video.MEDIATYPE type, String name);

	public int createLocalVideo(Video.MEDIATYPE type, String name, String path);

	public int createPreviewVideo(Video.MEDIATYPE type, String deviceName, String devicePath);

	public int createPreviewVideo(Video.MEDIATYPE type);

	public int createPreviewVideo(Video.MEDIATYPE type, String deviceName);

	public class DecryptPayload_Result {
		public boolean m_return;
		public byte[] m_message;
		public void init(byte[] message, boolean funcRet) {
			m_message = message;
			m_return = funcRet;
		}

	}

	public DecryptPayload_Result decryptPayload(byte[] payload);

	public boolean deleteHrtfAudioProcessor(long apHandle);

	public void ecsAddQueryParameter(String key, String value);

	public String ecsGetETag();

	public boolean ecsGetSettingsAsBool(String agent, String path, boolean defaultValue);

	public int ecsGetSettingsAsInt(String agent, String path, int defaultValue);

	public String ecsGetSettingsAsString(String agent, String path, String defaultValue);

	public void ecsRemoveQueryParameter(String key);

	public boolean enableHrtfAudioProcessor(long apHandle, boolean bEnable);

	public class FindObjects_Result {
		public boolean m_return;
		public int[] m_objectIDList;
		public void init(int[] objectIDList, boolean funcRet) {
			m_objectIDList = objectIDList;
			m_return = funcRet;
		}

	}

	public FindObjects_Result findObjects(SkyLib.OBJECTTYPE objectType);

	public void fireIntent(SkyLib.INTENT intent, String arguments, int objectID, String accountIdentity);

	public void fireIntent(SkyLib.INTENT intent);

	public void fireIntent(SkyLib.INTENT intent, String arguments);

	public void fireIntent(SkyLib.INTENT intent, String arguments, int objectID);

	public boolean getAccount(int objectID, Account account);

	public boolean getAccount(String identity, Account account);

	public class GetAudioDeviceCapabilities_Result {
		public int m_return;
		public String m_interfaceString;
		public void init(byte[] interfaceString, int funcRet) {
			m_interfaceString = NativeStringConvert.ConvertFromNativeBytes(interfaceString);
			m_return = funcRet;
		}

	}

	public GetAudioDeviceCapabilities_Result getAudioDeviceCapabilities(String deviceHandle);

	public class GetAvailableCompositeAudioDevices_Result {
		public boolean m_return;
		public String[] m_nameList;
		public SkyLib.COMPOSITE_AUDIO_DEVICE_TYPE[] m_deviceTyeList;
		public String[] m_micHandleList;
		public String[] m_micProductIdList;
		public String[] m_spkHandleList;
		public String[] m_spkProductIdList;
		public boolean[] m_isPcInternalDeviceFlagList;
		public void init(byte[][] nameList, SkyLib.COMPOSITE_AUDIO_DEVICE_TYPE[] deviceTyeList, byte[][] micHandleList, byte[][] micProductIdList, byte[][] spkHandleList, byte[][] spkProductIdList, boolean[] isPcInternalDeviceFlagList, boolean funcRet) {
			m_nameList = NativeStringConvert.ConvertFromNativeStringArray(nameList);
			m_deviceTyeList = deviceTyeList;
			m_micHandleList = NativeStringConvert.ConvertFromNativeStringArray(micHandleList);
			m_micProductIdList = NativeStringConvert.ConvertFromNativeStringArray(micProductIdList);
			m_spkHandleList = NativeStringConvert.ConvertFromNativeStringArray(spkHandleList);
			m_spkProductIdList = NativeStringConvert.ConvertFromNativeStringArray(spkProductIdList);
			m_isPcInternalDeviceFlagList = isPcInternalDeviceFlagList;
			m_return = funcRet;
		}

	}

	public GetAvailableCompositeAudioDevices_Result getAvailableCompositeAudioDevices();

	public class GetAvailableOutputDevices_Result {
		public boolean m_return;
		public String[] m_handleList;
		public String[] m_nameList;
		public String[] m_productIdList;
		public String[] m_vendorIdList;
		public boolean[] m_isDefaultDeviceFlagList;
		public void init(byte[][] handleList, byte[][] nameList, byte[][] productIdList, byte[][] vendorIdList, boolean[] isDefaultDeviceFlagList, boolean funcRet) {
			m_handleList = NativeStringConvert.ConvertFromNativeStringArray(handleList);
			m_nameList = NativeStringConvert.ConvertFromNativeStringArray(nameList);
			m_productIdList = NativeStringConvert.ConvertFromNativeStringArray(productIdList);
			m_vendorIdList = NativeStringConvert.ConvertFromNativeStringArray(vendorIdList);
			m_isDefaultDeviceFlagList = isDefaultDeviceFlagList;
			m_return = funcRet;
		}

	}

	public GetAvailableOutputDevices_Result getAvailableOutputDevices();

	public class GetAvailableRecordingDevices_Result {
		public boolean m_return;
		public String[] m_handleList;
		public String[] m_nameList;
		public String[] m_productIdList;
		public String[] m_vendorIdList;
		public boolean[] m_isDefaultDeviceFlagList;
		public void init(byte[][] handleList, byte[][] nameList, byte[][] productIdList, byte[][] vendorIdList, boolean[] isDefaultDeviceFlagList, boolean funcRet) {
			m_handleList = NativeStringConvert.ConvertFromNativeStringArray(handleList);
			m_nameList = NativeStringConvert.ConvertFromNativeStringArray(nameList);
			m_productIdList = NativeStringConvert.ConvertFromNativeStringArray(productIdList);
			m_vendorIdList = NativeStringConvert.ConvertFromNativeStringArray(vendorIdList);
			m_isDefaultDeviceFlagList = isDefaultDeviceFlagList;
			m_return = funcRet;
		}

	}

	public GetAvailableRecordingDevices_Result getAvailableRecordingDevices();

	public class GetAvailableVideoDevices_Result {
		public int m_return;
		public String[] m_deviceNames;
		public String[] m_devicePaths;
		public void init(byte[][] deviceNames, byte[][] devicePaths, int funcRet) {
			m_deviceNames = NativeStringConvert.ConvertFromNativeStringArray(deviceNames);
			m_devicePaths = NativeStringConvert.ConvertFromNativeStringArray(devicePaths);
			m_return = funcRet;
		}

	}

	public GetAvailableVideoDevices_Result getAvailableVideoDevices();

	public String getBuildName();

	public String getBuildVersion();

	public boolean getCall(int objectID, Call call);

	public boolean getCallHandler(int objectID, int accountObjectID, CallHandler callHandler);

	public boolean getCallHandler(int objectID, CallHandler callHandler);

	public class GetCoexistenceCredentials_Result {
		public boolean m_return;
		public String m_accountName;
		public String m_passwordHash;
		public String m_refreshToken;
		public int m_refreshTokenExpiration;
		public String m_skypeToken;
		public int m_skypeTokenExpiration;
		public long m_partnerId;
		public void init(byte[] accountName, byte[] passwordHash, byte[] refreshToken, int refreshTokenExpiration, byte[] skypeToken, int skypeTokenExpiration, long partnerId, boolean funcRet) {
			m_accountName = NativeStringConvert.ConvertFromNativeBytes(accountName);
			m_passwordHash = NativeStringConvert.ConvertFromNativeBytes(passwordHash);
			m_refreshToken = NativeStringConvert.ConvertFromNativeBytes(refreshToken);
			m_refreshTokenExpiration = refreshTokenExpiration;
			m_skypeToken = NativeStringConvert.ConvertFromNativeBytes(skypeToken);
			m_skypeTokenExpiration = skypeTokenExpiration;
			m_partnerId = partnerId;
			m_return = funcRet;
		}

	}

	public GetCoexistenceCredentials_Result getCoexistenceCredentials();

	public boolean getContentSharing(int objectID, ContentSharing contentSharing);

	public boolean getDataChannel(int objectID, DataChannel dataChannel);

	public class GetDefaultAccountOldCredentials_Result {
		public boolean m_return;
		public String m_accountName;
		public String m_passwordHash;
		public String m_refreshToken;
		public int m_refreshTokenExpiration;
		public String m_skypeToken;
		public int m_skypeTokenExpiration;
		public long m_partnerId;
		public void init(byte[] accountName, byte[] passwordHash, byte[] refreshToken, int refreshTokenExpiration, byte[] skypeToken, int skypeTokenExpiration, long partnerId, boolean funcRet) {
			m_accountName = NativeStringConvert.ConvertFromNativeBytes(accountName);
			m_passwordHash = NativeStringConvert.ConvertFromNativeBytes(passwordHash);
			m_refreshToken = NativeStringConvert.ConvertFromNativeBytes(refreshToken);
			m_refreshTokenExpiration = refreshTokenExpiration;
			m_skypeToken = NativeStringConvert.ConvertFromNativeBytes(skypeToken);
			m_skypeTokenExpiration = skypeTokenExpiration;
			m_partnerId = partnerId;
			m_return = funcRet;
		}

	}

	public GetDefaultAccountOldCredentials_Result getDefaultAccountOldCredentials();

	public String getDefaultDBPath(boolean createDir);

	public String getDefaultDBPath();

	public String getE911Info();

	public String getEcsQueryParameters();

	public boolean getExampleObject(int inMemObjId, ExampleInMemoryObject exampleInMemoryObject);

	public int getIntegerProperty(int objectId, PROPKEY propKey);

	public SkyLib.MEDIASTATUS getMediaStatus();

	public int getMicVolume();

	public int getNrgLevelsForDeviceTuner(String microphone);

	public boolean getObjectInterface(int objectID, ObjectInterface _object);

	public SkyLib.OBJECTTYPE getObjectType(int objectID);

	public String getRegistrationId(String accountIdentity);

	public String getRegistrationId();

	public int getSpeakerSystemVolume();

	public int getSpeakerVolume();

	public String getStringProperty(int objectId, PROPKEY propKey);

	public boolean getVideo(int objectID, Video video);

	public class GetVideoDeviceCompositeId_Result {
		public int m_compositeId;
		public void init(int compositeId) {
			m_compositeId = compositeId;
		}

	}

	public GetVideoDeviceCompositeId_Result getVideoDeviceCompositeId(String deviceName, String devicePath);

	public SkyLib.VIDEO_DEVICE_FACING getVideoDeviceFacing(String deviceName, String devicePath);

	public SkyLib.VIDEO_DEVICE_TYPE getVideoDeviceType(String deviceName, String devicePath);

	public class GetVideoDeviceVendorProductIds_Result {
		public int m_vendorId;
		public int m_productId;
		public void init(int vendorId, int productId) {
			m_vendorId = vendorId;
			m_productId = productId;
		}

	}

	public GetVideoDeviceVendorProductIds_Result getVideoDeviceVendorProductIds(String deviceName, String devicePath);

	public void handleLoggingEvent(String message, String auxiliaryPayload);

	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey, int connectionType, String accountIdentity, String mediaConfigurationJson);

	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload);

	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload);

	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson);

	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey);

	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey, int connectionType);

	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey, int connectionType, String accountIdentity);

	public int insertRegistrationTransports(SkyLib.SERVICE_TYPE[] serviceTypes, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String activityId, String reason);

	public class IsMicrophoneMuted_Result {
		public boolean m_return;
		public boolean m_muted;
		public void init(boolean muted, boolean funcRet) {
			m_muted = muted;
			m_return = funcRet;
		}

	}

	public IsMicrophoneMuted_Result isMicrophoneMuted();

	public class IsSpeakerMuted_Result {
		public boolean m_return;
		public boolean m_muted;
		public void init(boolean muted, boolean funcRet) {
			m_muted = muted;
			m_return = funcRet;
		}

	}

	public IsSpeakerMuted_Result isSpeakerMuted();

	public boolean muteMicrophone(boolean mute);

	public boolean muteSpeakers(boolean mute);

	public int registerContextsEx2(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String activityId, String reason, String app, String xuid);

	public int registerContextsEx2(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String activityId, String reason, String app);

	public int registerContextsEx(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String app, String xuid);

	public int registerContextsEx(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs);

	public int registerContextsEx(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String app);

	public int registerContexts(SkyLib.SERVICE_TYPE serviceType, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs);

	public int reregisterContexts();

	public int reregisterContextsEx2(String activityId, String reason);

	public void selectSoundDevices(String callInDevice, String callOutDevice, String waveOutDevice);

	public void setAndroidId(String androidId);

	public int setClientDescription(String app, String platform, String templateKey, String activityId, String reason, String xuid);

	public int setClientDescription(String app, String platform, String templateKey, String activityId, String reason);

	public void setDeviceOrientation(int orientationAngle);

	public void setEcsConfig(String ecsBlob, String userIdentity, String etag, boolean isCached);

	public void setEcsConfig(String ecsBlob, String userIdentity, String etag);

	public void setIMEI(String imei);

	public void setMediaConfig(String configurationJson);

	public void setMicVolume(int volume);

	public boolean setRegistrationId(String endpointId);

	public void setSpeakerSystemVolume(int volume);

	public void setSpeakerVolume(int volume);

	public boolean shouldTriggerCQF(String username, String callId, SkyLib.CALL_TYPE callType);

	public boolean start(boolean block);

	public boolean start();

	public void stop(boolean block);

	public void stop();

	public boolean trouterCheckConnection(String socketId);

	public boolean trouterCheckConnection();

	public boolean trouterConnect();

	public boolean trouterReceiveData(String socketId);

	public boolean trouterReceiveData();

	public boolean trouterSuspend();

	public void unmuteMicrophone();

	public void unmuteSpeaker();

	public int unregisterAllContexts(String activityId, String reason);

	public int unregisterContextsEx2(String[] contexts, String activityId, String reason);

	public int unregisterContexts(String[] contexts);

	public boolean updateHrtf3DSourcePosition(long apHandle, int x, int y, int z, int scale);

}

