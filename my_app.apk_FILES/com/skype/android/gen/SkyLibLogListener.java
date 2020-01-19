/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class SkyLibLogListener implements com.skype.SkyLib.SkyLibIListener {
  public void onAvailableDeviceListChange(  com.skype.SkyLib sender){
    android.util.Log.d("SkyLibLogListener","onAvailableDeviceListChange");
  }
  public void onAvailableVideoDeviceListChange(  com.skype.SkyLib sender){
    android.util.Log.d("SkyLibLogListener","onAvailableVideoDeviceListChange");
  }
  public void onE911InfoChanged(  com.skype.SkyLib sender,  String json){
    android.util.Log.d("SkyLibLogListener","onE911InfoChanged");
  }
  public void onEcsEvent(  com.skype.SkyLib sender,  com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE eventType){
    android.util.Log.d("SkyLibLogListener","onEcsEvent");
  }
  public void onLoggingEvent(  com.skype.SkyLib sender,  String message,  String auxiliaryPayload){
    android.util.Log.d("SkyLibLogListener","onLoggingEvent");
  }
  public void onMediaStatusChanged(  com.skype.SkyLib sender,  com.skype.SkyLib.MEDIASTATUS newStatus){
    android.util.Log.d("SkyLibLogListener","onMediaStatusChanged");
  }
  public void onObjectDelete(  com.skype.SkyLib sender,  com.skype.SkyLib.OBJECTTYPE objectType,  int objectID){
    android.util.Log.d("SkyLibLogListener","onObjectDelete");
  }
  public void onObjectPropertyChangeWithValue(  com.skype.SkyLib sender,  int objectID,  com.skype.PROPKEY propKey,  com.skype.Metatag property){
    android.util.Log.d("SkyLibLogListener","onObjectPropertyChangeWithValue");
  }
  public void onOperationModeChanged(  com.skype.SkyLib sender,  int level){
    android.util.Log.d("SkyLibLogListener","onOperationModeChanged");
  }
  public void onProbeDevicesStatusChanged(  com.skype.SkyLib sender,  boolean ready){
    android.util.Log.d("SkyLibLogListener","onProbeDevicesStatusChanged");
  }
  public void onProxiedPushNotification(  com.skype.SkyLib sender,  int eventId,  String payload){
    android.util.Log.d("SkyLibLogListener","onProxiedPushNotification");
  }
  public void onPushHandlingComplete(  com.skype.SkyLib sender,  int token,  com.skype.SkyLib.PUSHHANDLINGRESULT result){
    android.util.Log.d("SkyLibLogListener","onPushHandlingComplete");
  }
  public void onQualityChanged(  com.skype.SkyLib sender,  int objectId,  com.skype.msrtc.QualityEventType type,  com.skype.msrtc.QualityLevel level,  com.skype.SkyLib.QUALITY_MEDIATYPE mediaType){
    android.util.Log.d("SkyLibLogListener","onQualityChanged");
  }
  public void onRegisterContextsComplete(  com.skype.SkyLib sender,  com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT success,  int requestId){
    android.util.Log.d("SkyLibLogListener","onRegisterContextsComplete");
  }
  public void onSkypeTokenRequired(  com.skype.SkyLib sender,  String invalidToken){
    android.util.Log.d("SkyLibLogListener","onSkypeTokenRequired");
  }
  public void onTrouterCheckConnectionComplete(  com.skype.SkyLib sender,  boolean isConnected){
    android.util.Log.d("SkyLibLogListener","onTrouterCheckConnectionComplete");
  }
  public void onTrouterConnectionStateChanged(  com.skype.SkyLib sender,  com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE eventType){
    android.util.Log.d("SkyLibLogListener","onTrouterConnectionStateChanged");
  }
  public void onTrouterSuspendComplete(  com.skype.SkyLib sender){
    android.util.Log.d("SkyLibLogListener","onTrouterSuspendComplete");
  }
  public void onTrouterSuspendReady(  com.skype.SkyLib sender){
    android.util.Log.d("SkyLibLogListener","onTrouterSuspendReady");
  }
}
