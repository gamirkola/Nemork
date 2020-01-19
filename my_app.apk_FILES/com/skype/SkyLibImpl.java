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

import com.skype.SkyLib;

public class SkyLibImpl extends GIImpl implements SkyLib, NativeListenable {
	public SkyLibImpl(String uiVersionString, boolean isMemOnlyMode, boolean useEventPolling) {
		this(SkypeFactory.getInstance() , uiVersionString, isMemOnlyMode, useEventPolling);
	}

	public SkyLibImpl(ObjectInterfaceFactory factory, String uiVersionString, boolean isMemOnlyMode, boolean useEventPolling) {
		super(factory,factory.createSkyLib(uiVersionString, isMemOnlyMode, useEventPolling));
		factory.initializeListener(this);
	}

	public SkyLibImpl(String uiVersionString) {
		this(uiVersionString, false, false);
	}

	public SkyLibImpl(String uiVersionString, boolean isMemOnlyMode) {
		this(uiVersionString, isMemOnlyMode, false);
	}

	public SkyLibImpl(String uiVersionString, String dbPath, boolean isRemovableDbPath, boolean useEventPolling) {
		this(SkypeFactory.getInstance() , uiVersionString, dbPath, isRemovableDbPath, useEventPolling);
	}

	public SkyLibImpl(ObjectInterfaceFactory factory, String uiVersionString, String dbPath, boolean isRemovableDbPath, boolean useEventPolling) {
		super(factory,factory.createSkyLib(uiVersionString, dbPath, isRemovableDbPath, useEventPolling));
		factory.initializeListener(this);
	}

	public SkyLibImpl(String uiVersionString, String dbPath, boolean isRemovableDbPath) {
		this(uiVersionString, dbPath, isRemovableDbPath, false);
	}

	static class SkyLibWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		SkyLibWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroySkyLib(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new SkyLibWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<SkyLibIListener> m_listeners = new HashSet<SkyLibIListener>();

	@Override
	public void addListener(SkyLibIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(SkyLibIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onAvailableDeviceListChange() {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onAvailableDeviceListChange(this);
			}
		}
	}

	public void onAvailableVideoDeviceListChange() {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onAvailableVideoDeviceListChange(this);
			}
		}
	}

	public void onE911InfoChanged(byte[] json) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onE911InfoChanged(this, NativeStringConvert.ConvertFromNativeBytes(json));
			}
		}
	}

	public void onEcsEvent(SkyLib.ECS_CALLBACK_EVENT_TYPE eventType) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onEcsEvent(this, eventType);
			}
		}
	}

	public void onLoggingEvent(byte[] message, byte[] auxiliaryPayload) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onLoggingEvent(this, NativeStringConvert.ConvertFromNativeBytes(message), NativeStringConvert.ConvertFromNativeBytes(auxiliaryPayload));
			}
		}
	}

	public void onMediaStatusChanged(SkyLib.MEDIASTATUS newStatus) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onMediaStatusChanged(this, newStatus);
			}
		}
	}

	public void onObjectDelete(SkyLib.OBJECTTYPE objectType, int objectID) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onObjectDelete(this, objectType, objectID);
			}
		}
	}

	public void onObjectPropertyChangeWithValue(int objectID, PROPKEY propKey, Metatag property) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onObjectPropertyChangeWithValue(this, objectID, propKey, property);
			}
		}
	}

	public void onOperationModeChanged(int level) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onOperationModeChanged(this, level);
			}
		}
	}

	public void onProbeDevicesStatusChanged(boolean ready) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onProbeDevicesStatusChanged(this, ready);
			}
		}
	}

	public void onProxiedPushNotification(int eventId, byte[] payload) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onProxiedPushNotification(this, eventId, NativeStringConvert.ConvertFromNativeBytes(payload));
			}
		}
	}

	public void onPushHandlingComplete(int token, SkyLib.PUSHHANDLINGRESULT result) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onPushHandlingComplete(this, token, result);
			}
		}
	}

	public void onQualityChanged(int objectId, msrtc.QualityEventType type, msrtc.QualityLevel level, SkyLib.QUALITY_MEDIATYPE mediaType) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onQualityChanged(this, objectId, type, level, mediaType);
			}
		}
	}

	public void onRegisterContextsComplete(SkyLib.PNM_REGISTER_CONTEXTS_RESULT success, int requestId) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onRegisterContextsComplete(this, success, requestId);
			}
		}
	}

	public void onSkypeTokenRequired(byte[] invalidToken) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onSkypeTokenRequired(this, NativeStringConvert.ConvertFromNativeBytes(invalidToken));
			}
		}
	}

	public void onTrouterCheckConnectionComplete(boolean isConnected) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onTrouterCheckConnectionComplete(this, isConnected);
			}
		}
	}

	public void onTrouterConnectionStateChanged(SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE eventType) {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onTrouterConnectionStateChanged(this, eventType);
			}
		}
	}

	public void onTrouterSuspendComplete() {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onTrouterSuspendComplete(this);
			}
		}
	}

	public void onTrouterSuspendReady() {
		synchronized (m_listeners) {
			for (SkyLibIListener listener : m_listeners) {
				listener.onTrouterSuspendReady(this);
			}
		}
	}

	@Override
	public native void changeOperationMode(int level);

	@Override
	public native boolean createExampleObject(ExampleInMemoryObject exampleInMemoryObject);

	@Override
	public native long createHrtfAudioProcessor(int VoiceChannel);

	@Override
	public int createLocalVideo(Video.MEDIATYPE type, String name, String path, String label) {
		return createLocalVideo(type, NativeStringConvert.ConvertToNativeBytes(name), NativeStringConvert.ConvertToNativeBytes(path), NativeStringConvert.ConvertToNativeBytes(label));
	}

	private native int createLocalVideo(Video.MEDIATYPE type, byte[] name, byte[] path, byte[] label);
	@Override
	public int createLocalVideo(Video.MEDIATYPE type) {
		return createLocalVideo(type, "", "", "");
	}
	@Override
	public int createLocalVideo(Video.MEDIATYPE type, String name) {
		return createLocalVideo(type, name, "", "");
	}
	@Override
	public int createLocalVideo(Video.MEDIATYPE type, String name, String path) {
		return createLocalVideo(type, name, path, "");
	}
	@Override
	public int createPreviewVideo(Video.MEDIATYPE type, String deviceName, String devicePath) {
		return createPreviewVideo(type, NativeStringConvert.ConvertToNativeBytes(deviceName), NativeStringConvert.ConvertToNativeBytes(devicePath));
	}

	private native int createPreviewVideo(Video.MEDIATYPE type, byte[] deviceName, byte[] devicePath);
	@Override
	public int createPreviewVideo(Video.MEDIATYPE type) {
		return createPreviewVideo(type, "", "");
	}
	@Override
	public int createPreviewVideo(Video.MEDIATYPE type, String deviceName) {
		return createPreviewVideo(type, deviceName, "");
	}
	@Override
	public native DecryptPayload_Result decryptPayload(byte[] payload);

	@Override
	public native boolean deleteHrtfAudioProcessor(long apHandle);

	@Override
	public void ecsAddQueryParameter(String key, String value) {
		ecsAddQueryParameter(NativeStringConvert.ConvertToNativeBytes(key), NativeStringConvert.ConvertToNativeBytes(value));
	}

	private native void ecsAddQueryParameter(byte[] key, byte[] value);
	@Override
	public String ecsGetETag() {
		return NativeStringConvert.ConvertFromNativeBytes(ecsGetETagNativeString());
	}

	private native byte[] ecsGetETagNativeString();
	@Override
	public boolean ecsGetSettingsAsBool(String agent, String path, boolean defaultValue) {
		return ecsGetSettingsAsBool(NativeStringConvert.ConvertToNativeBytes(agent), NativeStringConvert.ConvertToNativeBytes(path), defaultValue);
	}

	private native boolean ecsGetSettingsAsBool(byte[] agent, byte[] path, boolean defaultValue);
	@Override
	public int ecsGetSettingsAsInt(String agent, String path, int defaultValue) {
		return ecsGetSettingsAsInt(NativeStringConvert.ConvertToNativeBytes(agent), NativeStringConvert.ConvertToNativeBytes(path), defaultValue);
	}

	private native int ecsGetSettingsAsInt(byte[] agent, byte[] path, int defaultValue);
	@Override
	public String ecsGetSettingsAsString(String agent, String path, String defaultValue) {
		return NativeStringConvert.ConvertFromNativeBytes(ecsGetSettingsAsStringNativeString(NativeStringConvert.ConvertToNativeBytes(agent), NativeStringConvert.ConvertToNativeBytes(path), NativeStringConvert.ConvertToNativeBytes(defaultValue)));
	}

	private native byte[] ecsGetSettingsAsStringNativeString(byte[] agent, byte[] path, byte[] defaultValue);
	@Override
	public void ecsRemoveQueryParameter(String key) {
		ecsRemoveQueryParameter(NativeStringConvert.ConvertToNativeBytes(key));
	}

	private native void ecsRemoveQueryParameter(byte[] key);
	@Override
	public native boolean enableHrtfAudioProcessor(long apHandle, boolean bEnable);

	@Override
	public native FindObjects_Result findObjects(SkyLib.OBJECTTYPE objectType);

	@Override
	public void fireIntent(SkyLib.INTENT intent, String arguments, int objectID, String accountIdentity) {
		fireIntent(intent, NativeStringConvert.ConvertToNativeBytes(arguments), objectID, NativeStringConvert.ConvertToNativeBytes(accountIdentity));
	}

	private native void fireIntent(SkyLib.INTENT intent, byte[] arguments, int objectID, byte[] accountIdentity);
	@Override
	public void fireIntent(SkyLib.INTENT intent) {
		fireIntent(intent, "", 0, "");
	}
	@Override
	public void fireIntent(SkyLib.INTENT intent, String arguments) {
		fireIntent(intent, arguments, 0, "");
	}
	@Override
	public void fireIntent(SkyLib.INTENT intent, String arguments, int objectID) {
		fireIntent(intent, arguments, objectID, "");
	}
	@Override
	public native boolean getAccount(int objectID, Account account);

	@Override
	public boolean getAccount(String identity, Account account) {
		return getAccount(NativeStringConvert.ConvertToNativeBytes(identity), account);
	}

	private native boolean getAccount(byte[] identity, Account account);
	@Override
	public GetAudioDeviceCapabilities_Result getAudioDeviceCapabilities(String deviceHandle) {
		return getAudioDeviceCapabilities(NativeStringConvert.ConvertToNativeBytes(deviceHandle));
	}

	private native GetAudioDeviceCapabilities_Result getAudioDeviceCapabilities(byte[] deviceHandle);
	@Override
	public native GetAvailableCompositeAudioDevices_Result getAvailableCompositeAudioDevices();

	@Override
	public native GetAvailableOutputDevices_Result getAvailableOutputDevices();

	@Override
	public native GetAvailableRecordingDevices_Result getAvailableRecordingDevices();

	@Override
	public native GetAvailableVideoDevices_Result getAvailableVideoDevices();

	@Override
	public String getBuildName() {
		return NativeStringConvert.ConvertFromNativeBytes(getBuildNameNativeString());
	}

	private native byte[] getBuildNameNativeString();
	@Override
	public String getBuildVersion() {
		return NativeStringConvert.ConvertFromNativeBytes(getBuildVersionNativeString());
	}

	private native byte[] getBuildVersionNativeString();
	@Override
	public native boolean getCall(int objectID, Call call);

	@Override
	public native boolean getCallHandler(int objectID, int accountObjectID, CallHandler callHandler);

	@Override
	public native boolean getCallHandler(int objectID, CallHandler callHandler);

	@Override
	public native GetCoexistenceCredentials_Result getCoexistenceCredentials();

	@Override
	public native boolean getContentSharing(int objectID, ContentSharing contentSharing);

	@Override
	public native boolean getDataChannel(int objectID, DataChannel dataChannel);

	@Override
	public native GetDefaultAccountOldCredentials_Result getDefaultAccountOldCredentials();

	@Override
	public String getDefaultDBPath(boolean createDir) {
		return NativeStringConvert.ConvertFromNativeBytes(getDefaultDBPathNativeString(createDir));
	}

	private native byte[] getDefaultDBPathNativeString(boolean createDir);
	@Override
	public String getDefaultDBPath() {
		return getDefaultDBPath(true);
	}
	@Override
	public String getE911Info() {
		return NativeStringConvert.ConvertFromNativeBytes(getE911InfoNativeString());
	}

	private native byte[] getE911InfoNativeString();
	@Override
	public String getEcsQueryParameters() {
		return NativeStringConvert.ConvertFromNativeBytes(getEcsQueryParametersNativeString());
	}

	private native byte[] getEcsQueryParametersNativeString();
	@Override
	public native boolean getExampleObject(int inMemObjId, ExampleInMemoryObject exampleInMemoryObject);

	@Override
	public native int getIntegerProperty(int objectId, PROPKEY propKey);

	@Override
	public native SkyLib.MEDIASTATUS getMediaStatus();

	@Override
	public native int getMicVolume();

	@Override
	public int getNrgLevelsForDeviceTuner(String microphone) {
		return getNrgLevelsForDeviceTuner(NativeStringConvert.ConvertToNativeBytes(microphone));
	}

	private native int getNrgLevelsForDeviceTuner(byte[] microphone);
	@Override
	public native boolean getObjectInterface(int objectID, ObjectInterface _object);

	@Override
	public native SkyLib.OBJECTTYPE getObjectType(int objectID);

	@Override
	public String getRegistrationId(String accountIdentity) {
		return NativeStringConvert.ConvertFromNativeBytes(getRegistrationIdNativeString(NativeStringConvert.ConvertToNativeBytes(accountIdentity)));
	}

	private native byte[] getRegistrationIdNativeString(byte[] accountIdentity);
	@Override
	public String getRegistrationId() {
		return getRegistrationId("");
	}
	@Override
	public native int getSpeakerSystemVolume();

	@Override
	public native int getSpeakerVolume();

	@Override
	public String getStringProperty(int objectId, PROPKEY propKey) {
		return NativeStringConvert.ConvertFromNativeBytes(getStringPropertyNativeString(objectId, propKey));
	}

	private native byte[] getStringPropertyNativeString(int objectId, PROPKEY propKey);
	@Override
	public native boolean getVideo(int objectID, Video video);

	@Override
	public GetVideoDeviceCompositeId_Result getVideoDeviceCompositeId(String deviceName, String devicePath) {
		return getVideoDeviceCompositeId(NativeStringConvert.ConvertToNativeBytes(deviceName), NativeStringConvert.ConvertToNativeBytes(devicePath));
	}

	private native GetVideoDeviceCompositeId_Result getVideoDeviceCompositeId(byte[] deviceName, byte[] devicePath);
	@Override
	public SkyLib.VIDEO_DEVICE_FACING getVideoDeviceFacing(String deviceName, String devicePath) {
		return getVideoDeviceFacing(NativeStringConvert.ConvertToNativeBytes(deviceName), NativeStringConvert.ConvertToNativeBytes(devicePath));
	}

	private native SkyLib.VIDEO_DEVICE_FACING getVideoDeviceFacing(byte[] deviceName, byte[] devicePath);
	@Override
	public SkyLib.VIDEO_DEVICE_TYPE getVideoDeviceType(String deviceName, String devicePath) {
		return getVideoDeviceType(NativeStringConvert.ConvertToNativeBytes(deviceName), NativeStringConvert.ConvertToNativeBytes(devicePath));
	}

	private native SkyLib.VIDEO_DEVICE_TYPE getVideoDeviceType(byte[] deviceName, byte[] devicePath);
	@Override
	public GetVideoDeviceVendorProductIds_Result getVideoDeviceVendorProductIds(String deviceName, String devicePath) {
		return getVideoDeviceVendorProductIds(NativeStringConvert.ConvertToNativeBytes(deviceName), NativeStringConvert.ConvertToNativeBytes(devicePath));
	}

	private native GetVideoDeviceVendorProductIds_Result getVideoDeviceVendorProductIds(byte[] deviceName, byte[] devicePath);
	@Override
	public void handleLoggingEvent(String message, String auxiliaryPayload) {
		handleLoggingEvent(NativeStringConvert.ConvertToNativeBytes(message), NativeStringConvert.ConvertToNativeBytes(auxiliaryPayload));
	}

	private native void handleLoggingEvent(byte[] message, byte[] auxiliaryPayload);
	@Override
	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey, int connectionType, String accountIdentity, String mediaConfigurationJson) {
		return handlePushNotification(eventType, nodeSpecificNotificationPayload, genericNotificationPayload, NativeStringConvert.ConvertToNativeBytes(servicePayload), NativeStringConvert.ConvertToNativeBytes(correlationIdsJson), NativeStringConvert.ConvertToNativeBytes(callKey), connectionType, NativeStringConvert.ConvertToNativeBytes(accountIdentity), NativeStringConvert.ConvertToNativeBytes(mediaConfigurationJson));
	}

	private native int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, byte[] servicePayload, byte[] correlationIdsJson, byte[] callKey, int connectionType, byte[] accountIdentity, byte[] mediaConfigurationJson);
	@Override
	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload) {
		return handlePushNotification(eventType, nodeSpecificNotificationPayload, genericNotificationPayload, "", "", "", 0, "", "");
	}
	@Override
	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload) {
		return handlePushNotification(eventType, nodeSpecificNotificationPayload, genericNotificationPayload, servicePayload, "", "", 0, "", "");
	}
	@Override
	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson) {
		return handlePushNotification(eventType, nodeSpecificNotificationPayload, genericNotificationPayload, servicePayload, correlationIdsJson, "", 0, "", "");
	}
	@Override
	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey) {
		return handlePushNotification(eventType, nodeSpecificNotificationPayload, genericNotificationPayload, servicePayload, correlationIdsJson, callKey, 0, "", "");
	}
	@Override
	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey, int connectionType) {
		return handlePushNotification(eventType, nodeSpecificNotificationPayload, genericNotificationPayload, servicePayload, correlationIdsJson, callKey, connectionType, "", "");
	}
	@Override
	public int handlePushNotification(int eventType, byte[] nodeSpecificNotificationPayload, byte[] genericNotificationPayload, String servicePayload, String correlationIdsJson, String callKey, int connectionType, String accountIdentity) {
		return handlePushNotification(eventType, nodeSpecificNotificationPayload, genericNotificationPayload, servicePayload, correlationIdsJson, callKey, connectionType, accountIdentity, "");
	}
	@Override
	public int insertRegistrationTransports(SkyLib.SERVICE_TYPE[] serviceTypes, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String activityId, String reason) {
		return insertRegistrationTransports(serviceTypes, NativeStringConvert.ConvertArrToNativeByteArr(contexts), NativeStringConvert.ConvertArrToNativeByteArr(registrationTokens), registrationTTLs, NativeStringConvert.ConvertToNativeBytes(activityId), NativeStringConvert.ConvertToNativeBytes(reason));
	}

	private native int insertRegistrationTransports(SkyLib.SERVICE_TYPE[] serviceTypes, byte[][] contexts, byte[][] registrationTokens, int[] registrationTTLs, byte[] activityId, byte[] reason);
	@Override
	public native IsMicrophoneMuted_Result isMicrophoneMuted();

	@Override
	public native IsSpeakerMuted_Result isSpeakerMuted();

	@Override
	public native boolean muteMicrophone(boolean mute);

	@Override
	public native boolean muteSpeakers(boolean mute);

	@Override
	public int registerContextsEx2(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String activityId, String reason, String app, String xuid) {
		return registerContextsEx2(serviceTypes, NativeStringConvert.ConvertToNativeBytes(platform), NativeStringConvert.ConvertToNativeBytes(templateKey), NativeStringConvert.ConvertArrToNativeByteArr(contexts), NativeStringConvert.ConvertArrToNativeByteArr(registrationTokens), registrationTTLs, NativeStringConvert.ConvertToNativeBytes(activityId), NativeStringConvert.ConvertToNativeBytes(reason), NativeStringConvert.ConvertToNativeBytes(app), NativeStringConvert.ConvertToNativeBytes(xuid));
	}

	private native int registerContextsEx2(SkyLib.SERVICE_TYPE[] serviceTypes, byte[] platform, byte[] templateKey, byte[][] contexts, byte[][] registrationTokens, int[] registrationTTLs, byte[] activityId, byte[] reason, byte[] app, byte[] xuid);
	@Override
	public int registerContextsEx2(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String activityId, String reason, String app) {
		return registerContextsEx2(serviceTypes, platform, templateKey, contexts, registrationTokens, registrationTTLs, activityId, reason, app, "");
	}
	@Override
	public int registerContextsEx(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String app, String xuid) {
		return registerContextsEx(serviceTypes, NativeStringConvert.ConvertToNativeBytes(platform), NativeStringConvert.ConvertToNativeBytes(templateKey), NativeStringConvert.ConvertArrToNativeByteArr(contexts), NativeStringConvert.ConvertArrToNativeByteArr(registrationTokens), registrationTTLs, NativeStringConvert.ConvertToNativeBytes(app), NativeStringConvert.ConvertToNativeBytes(xuid));
	}

	private native int registerContextsEx(SkyLib.SERVICE_TYPE[] serviceTypes, byte[] platform, byte[] templateKey, byte[][] contexts, byte[][] registrationTokens, int[] registrationTTLs, byte[] app, byte[] xuid);
	@Override
	public int registerContextsEx(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs) {
		return registerContextsEx(serviceTypes, platform, templateKey, contexts, registrationTokens, registrationTTLs, "", "");
	}
	@Override
	public int registerContextsEx(SkyLib.SERVICE_TYPE[] serviceTypes, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs, String app) {
		return registerContextsEx(serviceTypes, platform, templateKey, contexts, registrationTokens, registrationTTLs, app, "");
	}
	@Override
	public int registerContexts(SkyLib.SERVICE_TYPE serviceType, String platform, String templateKey, String[] contexts, String[] registrationTokens, int[] registrationTTLs) {
		return registerContexts(serviceType, NativeStringConvert.ConvertToNativeBytes(platform), NativeStringConvert.ConvertToNativeBytes(templateKey), NativeStringConvert.ConvertArrToNativeByteArr(contexts), NativeStringConvert.ConvertArrToNativeByteArr(registrationTokens), registrationTTLs);
	}

	private native int registerContexts(SkyLib.SERVICE_TYPE serviceType, byte[] platform, byte[] templateKey, byte[][] contexts, byte[][] registrationTokens, int[] registrationTTLs);
	@Override
	public native int reregisterContexts();

	@Override
	public int reregisterContextsEx2(String activityId, String reason) {
		return reregisterContextsEx2(NativeStringConvert.ConvertToNativeBytes(activityId), NativeStringConvert.ConvertToNativeBytes(reason));
	}

	private native int reregisterContextsEx2(byte[] activityId, byte[] reason);
	@Override
	public void selectSoundDevices(String callInDevice, String callOutDevice, String waveOutDevice) {
		selectSoundDevices(NativeStringConvert.ConvertToNativeBytes(callInDevice), NativeStringConvert.ConvertToNativeBytes(callOutDevice), NativeStringConvert.ConvertToNativeBytes(waveOutDevice));
	}

	private native void selectSoundDevices(byte[] callInDevice, byte[] callOutDevice, byte[] waveOutDevice);
	@Override
	public void setAndroidId(String androidId) {
		setAndroidId(NativeStringConvert.ConvertToNativeBytes(androidId));
	}

	private native void setAndroidId(byte[] androidId);
	@Override
	public int setClientDescription(String app, String platform, String templateKey, String activityId, String reason, String xuid) {
		return setClientDescription(NativeStringConvert.ConvertToNativeBytes(app), NativeStringConvert.ConvertToNativeBytes(platform), NativeStringConvert.ConvertToNativeBytes(templateKey), NativeStringConvert.ConvertToNativeBytes(activityId), NativeStringConvert.ConvertToNativeBytes(reason), NativeStringConvert.ConvertToNativeBytes(xuid));
	}

	private native int setClientDescription(byte[] app, byte[] platform, byte[] templateKey, byte[] activityId, byte[] reason, byte[] xuid);
	@Override
	public int setClientDescription(String app, String platform, String templateKey, String activityId, String reason) {
		return setClientDescription(app, platform, templateKey, activityId, reason, "");
	}
	@Override
	public native void setDeviceOrientation(int orientationAngle);

	@Override
	public void setEcsConfig(String ecsBlob, String userIdentity, String etag, boolean isCached) {
		setEcsConfig(NativeStringConvert.ConvertToNativeBytes(ecsBlob), NativeStringConvert.ConvertToNativeBytes(userIdentity), NativeStringConvert.ConvertToNativeBytes(etag), isCached);
	}

	private native void setEcsConfig(byte[] ecsBlob, byte[] userIdentity, byte[] etag, boolean isCached);
	@Override
	public void setEcsConfig(String ecsBlob, String userIdentity, String etag) {
		setEcsConfig(ecsBlob, userIdentity, etag, false);
	}
	@Override
	public void setIMEI(String imei) {
		setIMEI(NativeStringConvert.ConvertToNativeBytes(imei));
	}

	private native void setIMEI(byte[] imei);
	@Override
	public void setMediaConfig(String configurationJson) {
		setMediaConfig(NativeStringConvert.ConvertToNativeBytes(configurationJson));
	}

	private native void setMediaConfig(byte[] configurationJson);
	@Override
	public native void setMicVolume(int volume);

	@Override
	public boolean setRegistrationId(String endpointId) {
		return setRegistrationId(NativeStringConvert.ConvertToNativeBytes(endpointId));
	}

	private native boolean setRegistrationId(byte[] endpointId);
	@Override
	public native void setSpeakerSystemVolume(int volume);

	@Override
	public native void setSpeakerVolume(int volume);

	@Override
	public boolean shouldTriggerCQF(String username, String callId, SkyLib.CALL_TYPE callType) {
		return shouldTriggerCQF(NativeStringConvert.ConvertToNativeBytes(username), NativeStringConvert.ConvertToNativeBytes(callId), callType);
	}

	private native boolean shouldTriggerCQF(byte[] username, byte[] callId, SkyLib.CALL_TYPE callType);
	@Override
	public native boolean start(boolean block);

	@Override
	public boolean start() {
		return start(true);
	}
	@Override
	public native void stop(boolean block);

	@Override
	public void stop() {
		stop(true);
	}
	@Override
	public boolean trouterCheckConnection(String socketId) {
		return trouterCheckConnection(NativeStringConvert.ConvertToNativeBytes(socketId));
	}

	private native boolean trouterCheckConnection(byte[] socketId);
	@Override
	public boolean trouterCheckConnection() {
		return trouterCheckConnection("");
	}
	@Override
	public native boolean trouterConnect();

	@Override
	public boolean trouterReceiveData(String socketId) {
		return trouterReceiveData(NativeStringConvert.ConvertToNativeBytes(socketId));
	}

	private native boolean trouterReceiveData(byte[] socketId);
	@Override
	public boolean trouterReceiveData() {
		return trouterReceiveData("");
	}
	@Override
	public native boolean trouterSuspend();

	@Override
	public native void unmuteMicrophone();

	@Override
	public native void unmuteSpeaker();

	@Override
	public int unregisterAllContexts(String activityId, String reason) {
		return unregisterAllContexts(NativeStringConvert.ConvertToNativeBytes(activityId), NativeStringConvert.ConvertToNativeBytes(reason));
	}

	private native int unregisterAllContexts(byte[] activityId, byte[] reason);
	@Override
	public int unregisterContextsEx2(String[] contexts, String activityId, String reason) {
		return unregisterContextsEx2(NativeStringConvert.ConvertArrToNativeByteArr(contexts), NativeStringConvert.ConvertToNativeBytes(activityId), NativeStringConvert.ConvertToNativeBytes(reason));
	}

	private native int unregisterContextsEx2(byte[][] contexts, byte[] activityId, byte[] reason);
	@Override
	public int unregisterContexts(String[] contexts) {
		return unregisterContexts(NativeStringConvert.ConvertArrToNativeByteArr(contexts));
	}

	private native int unregisterContexts(byte[][] contexts);
	@Override
	public native boolean updateHrtf3DSourcePosition(long apHandle, int x, int y, int z, int scale);

	@Override
	public native long getAriaLogManager();
	@Override
	public native long getDefaultHttpStack();
	@Override
	public native long getEcsClientInstance();
	@Override
	public native long getMediaExtension(int type);
	@Override
	public native Object getTrouterInstance();
	@Override
	public native long getBttTrouterInstance();
}

