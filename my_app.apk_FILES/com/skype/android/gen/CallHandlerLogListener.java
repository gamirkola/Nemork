/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class CallHandlerLogListener implements com.skype.CallHandler.CallHandlerIListener, com.skype.ObjectInterface.ObjectInterfaceIListener {
  public void onActiveSpeakerListChanged(  com.skype.CallHandler sender,  int callObjectId,  String[] activeSpeakers){
    android.util.Log.d("CallHandlerLogListener","onActiveSpeakerListChanged");
  }
  public void onAudioStreamStateChanged(  com.skype.CallHandler sender,  int callObjectId,  com.skype.CallHandler.MEDIA_DIRECTION direction,  com.skype.CallHandler.MEDIA_STREAM_STATE streamState){
    android.util.Log.d("CallHandlerLogListener","onAudioStreamStateChanged");
  }
  public void onCallMeBackOperationStatusChange(  com.skype.CallHandler sender,  int callObjectId,  String participantMri,  int failureReason,  int code,  int subCode,  String phrase,  String causeId){
    android.util.Log.d("CallHandlerLogListener","onCallMeBackOperationStatusChange");
  }
  public void onCallTransferCallReceived(  com.skype.CallHandler sender,  int callObjectId,  int targetCallObjectId,  String transferorMri,  String transferTargetMri){
    android.util.Log.d("CallHandlerLogListener","onCallTransferCallReceived");
  }
  public void onDominantSpeakerListChanged(  com.skype.CallHandler sender,  int callObjectId,  String[] dominantSpeakers){
    android.util.Log.d("CallHandlerLogListener","onDominantSpeakerListChanged");
  }
  public void onMediaNegotiationStatusChange(  com.skype.CallHandler sender,  int callObjectId,  com.skype.CallHandler.MODALITY_TYPE modalityType,  com.skype.CallHandler.MEDIA_NEGOTIATION_STATUS_CODE mediaNegotiationStatusCode,  String causeId){
    android.util.Log.d("CallHandlerLogListener","onMediaNegotiationStatusChange");
  }
  public void onMuteParticipantsOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  int code,  int subCode,  String phrase){
    android.util.Log.d("CallHandlerLogListener","onMuteParticipantsOperationStatusChanged");
  }
  public void onNudgeParticipantsOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String context,  int failureReason){
    android.util.Log.d("CallHandlerLogListener","onNudgeParticipantsOperationStatusChanged");
  }
  public void onOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String result){
    android.util.Log.d("CallHandlerLogListener","onOperationStatusChanged");
  }
  public void onProxiedPushNotification(  com.skype.CallHandler sender,  int eventId,  String payload){
    android.util.Log.d("CallHandlerLogListener","onProxiedPushNotification");
  }
  public void onPublishStateOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  int code,  int subCode,  String phrase,  String stateId){
    android.util.Log.d("CallHandlerLogListener","onPublishStateOperationStatusChanged");
  }
  public void onRemoteUserEventsReceived(  com.skype.CallHandler sender,  int callObjectId,  String participantId,  String events){
    android.util.Log.d("CallHandlerLogListener","onRemoteUserEventsReceived");
  }
  public void onRemoteVideosCountChanged(  com.skype.CallHandler sender,  int participantObjectId){
    android.util.Log.d("CallHandlerLogListener","onRemoteVideosCountChanged");
  }
  public void onRemoveStateOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  boolean operationSuccess,  String result){
    android.util.Log.d("CallHandlerLogListener","onRemoveStateOperationStatusChanged");
  }
  public void onUnmuteSelfOperationStatusChange(  com.skype.CallHandler sender,  int callObjectId,  com.skype.CallHandler.OPERATIONRESULTCODE operationResult,  int failureReason){
    android.util.Log.d("CallHandlerLogListener","onUnmuteSelfOperationStatusChange");
  }
  public void onUpdateMeetingRolesOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  int code,  int subCode,  String phrase){
    android.util.Log.d("CallHandlerLogListener","onUpdateMeetingRolesOperationStatusChanged");
  }
  public void onPropertyChange(  com.skype.ObjectInterface sender,  com.skype.PROPKEY propKey){
    android.util.Log.d("CallHandlerLogListener","onPropertyChange");
  }
}
