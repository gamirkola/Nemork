/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:11 PM
 */
package com.skype.android.gen;
public class CallHandlerListener implements com.skype.CallHandler.CallHandlerIListener, com.skype.ObjectInterface.ObjectInterfaceIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnActiveSpeakerListChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String[] _activeSpeakers;
    public OnActiveSpeakerListChanged(    com.skype.CallHandler sender,    int callObjectId,    String[] activeSpeakers){
      _sender=sender;
      _callObjectId=callObjectId;
      _activeSpeakers=activeSpeakers;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String[] getActiveSpeakers(){
      return _activeSpeakers;
    }
  }
  public void onActiveSpeakerListChanged(  com.skype.CallHandler sender,  int callObjectId,  String[] activeSpeakers){
    try {
      OnActiveSpeakerListChanged event=new OnActiveSpeakerListChanged(sender,callObjectId,activeSpeakers);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnAudioStreamStateChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private com.skype.CallHandler.MEDIA_DIRECTION _direction;
    private com.skype.CallHandler.MEDIA_STREAM_STATE _streamState;
    public OnAudioStreamStateChanged(    com.skype.CallHandler sender,    int callObjectId,    com.skype.CallHandler.MEDIA_DIRECTION direction,    com.skype.CallHandler.MEDIA_STREAM_STATE streamState){
      _sender=sender;
      _callObjectId=callObjectId;
      _direction=direction;
      _streamState=streamState;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public com.skype.CallHandler.MEDIA_DIRECTION getDirection(){
      return _direction;
    }
    public com.skype.CallHandler.MEDIA_STREAM_STATE getStreamState(){
      return _streamState;
    }
  }
  public void onAudioStreamStateChanged(  com.skype.CallHandler sender,  int callObjectId,  com.skype.CallHandler.MEDIA_DIRECTION direction,  com.skype.CallHandler.MEDIA_STREAM_STATE streamState){
    try {
      OnAudioStreamStateChanged event=new OnAudioStreamStateChanged(sender,callObjectId,direction,streamState);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnCallMeBackOperationStatusChange {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _participantMri;
    private int _failureReason;
    private int _code;
    private int _subCode;
    private String _phrase;
    private String _causeId;
    public OnCallMeBackOperationStatusChange(    com.skype.CallHandler sender,    int callObjectId,    String participantMri,    int failureReason,    int code,    int subCode,    String phrase,    String causeId){
      _sender=sender;
      _callObjectId=callObjectId;
      _participantMri=participantMri;
      _failureReason=failureReason;
      _code=code;
      _subCode=subCode;
      _phrase=phrase;
      _causeId=causeId;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getParticipantMri(){
      return _participantMri;
    }
    public int getFailureReason(){
      return _failureReason;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
    public String getPhrase(){
      return _phrase;
    }
    public String getCauseId(){
      return _causeId;
    }
  }
  public void onCallMeBackOperationStatusChange(  com.skype.CallHandler sender,  int callObjectId,  String participantMri,  int failureReason,  int code,  int subCode,  String phrase,  String causeId){
    try {
      OnCallMeBackOperationStatusChange event=new OnCallMeBackOperationStatusChange(sender,callObjectId,participantMri,failureReason,code,subCode,phrase,causeId);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnCallTransferCallReceived {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private int _targetCallObjectId;
    private String _transferorMri;
    private String _transferTargetMri;
    public OnCallTransferCallReceived(    com.skype.CallHandler sender,    int callObjectId,    int targetCallObjectId,    String transferorMri,    String transferTargetMri){
      _sender=sender;
      _callObjectId=callObjectId;
      _targetCallObjectId=targetCallObjectId;
      _transferorMri=transferorMri;
      _transferTargetMri=transferTargetMri;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public int getTargetCallObjectId(){
      return _targetCallObjectId;
    }
    public String getTransferorMri(){
      return _transferorMri;
    }
    public String getTransferTargetMri(){
      return _transferTargetMri;
    }
  }
  public void onCallTransferCallReceived(  com.skype.CallHandler sender,  int callObjectId,  int targetCallObjectId,  String transferorMri,  String transferTargetMri){
    try {
      OnCallTransferCallReceived event=new OnCallTransferCallReceived(sender,callObjectId,targetCallObjectId,transferorMri,transferTargetMri);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnDominantSpeakerListChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String[] _dominantSpeakers;
    public OnDominantSpeakerListChanged(    com.skype.CallHandler sender,    int callObjectId,    String[] dominantSpeakers){
      _sender=sender;
      _callObjectId=callObjectId;
      _dominantSpeakers=dominantSpeakers;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String[] getDominantSpeakers(){
      return _dominantSpeakers;
    }
  }
  public void onDominantSpeakerListChanged(  com.skype.CallHandler sender,  int callObjectId,  String[] dominantSpeakers){
    try {
      OnDominantSpeakerListChanged event=new OnDominantSpeakerListChanged(sender,callObjectId,dominantSpeakers);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnMediaNegotiationStatusChange {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private com.skype.CallHandler.MODALITY_TYPE _modalityType;
    private com.skype.CallHandler.MEDIA_NEGOTIATION_STATUS_CODE _mediaNegotiationStatusCode;
    private String _causeId;
    public OnMediaNegotiationStatusChange(    com.skype.CallHandler sender,    int callObjectId,    com.skype.CallHandler.MODALITY_TYPE modalityType,    com.skype.CallHandler.MEDIA_NEGOTIATION_STATUS_CODE mediaNegotiationStatusCode,    String causeId){
      _sender=sender;
      _callObjectId=callObjectId;
      _modalityType=modalityType;
      _mediaNegotiationStatusCode=mediaNegotiationStatusCode;
      _causeId=causeId;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public com.skype.CallHandler.MODALITY_TYPE getModalityType(){
      return _modalityType;
    }
    public com.skype.CallHandler.MEDIA_NEGOTIATION_STATUS_CODE getMediaNegotiationStatusCode(){
      return _mediaNegotiationStatusCode;
    }
    public String getCauseId(){
      return _causeId;
    }
  }
  public void onMediaNegotiationStatusChange(  com.skype.CallHandler sender,  int callObjectId,  com.skype.CallHandler.MODALITY_TYPE modalityType,  com.skype.CallHandler.MEDIA_NEGOTIATION_STATUS_CODE mediaNegotiationStatusCode,  String causeId){
    try {
      OnMediaNegotiationStatusChange event=new OnMediaNegotiationStatusChange(sender,callObjectId,modalityType,mediaNegotiationStatusCode,causeId);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnMuteParticipantsOperationStatusChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _causeId;
    private int _code;
    private int _subCode;
    private String _phrase;
    public OnMuteParticipantsOperationStatusChanged(    com.skype.CallHandler sender,    int callObjectId,    String causeId,    int code,    int subCode,    String phrase){
      _sender=sender;
      _callObjectId=callObjectId;
      _causeId=causeId;
      _code=code;
      _subCode=subCode;
      _phrase=phrase;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getCauseId(){
      return _causeId;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
    public String getPhrase(){
      return _phrase;
    }
  }
  public void onMuteParticipantsOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  int code,  int subCode,  String phrase){
    try {
      OnMuteParticipantsOperationStatusChanged event=new OnMuteParticipantsOperationStatusChanged(sender,callObjectId,causeId,code,subCode,phrase);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnNudgeParticipantsOperationStatusChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _context;
    private int _failureReason;
    public OnNudgeParticipantsOperationStatusChanged(    com.skype.CallHandler sender,    int callObjectId,    String context,    int failureReason){
      _sender=sender;
      _callObjectId=callObjectId;
      _context=context;
      _failureReason=failureReason;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getContext(){
      return _context;
    }
    public int getFailureReason(){
      return _failureReason;
    }
  }
  public void onNudgeParticipantsOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String context,  int failureReason){
    try {
      OnNudgeParticipantsOperationStatusChanged event=new OnNudgeParticipantsOperationStatusChanged(sender,callObjectId,context,failureReason);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnOperationStatusChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _result;
    public OnOperationStatusChanged(    com.skype.CallHandler sender,    int callObjectId,    String result){
      _sender=sender;
      _callObjectId=callObjectId;
      _result=result;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getResult(){
      return _result;
    }
  }
  public void onOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String result){
    try {
      OnOperationStatusChanged event=new OnOperationStatusChanged(sender,callObjectId,result);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnProxiedPushNotification {
    private com.skype.CallHandler _sender;
    private int _eventId;
    private String _payload;
    public OnProxiedPushNotification(    com.skype.CallHandler sender,    int eventId,    String payload){
      _sender=sender;
      _eventId=eventId;
      _payload=payload;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getEventId(){
      return _eventId;
    }
    public String getPayload(){
      return _payload;
    }
  }
  public void onProxiedPushNotification(  com.skype.CallHandler sender,  int eventId,  String payload){
    try {
      OnProxiedPushNotification event=new OnProxiedPushNotification(sender,eventId,payload);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnPublishStateOperationStatusChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _causeId;
    private int _code;
    private int _subCode;
    private String _phrase;
    private String _stateId;
    public OnPublishStateOperationStatusChanged(    com.skype.CallHandler sender,    int callObjectId,    String causeId,    int code,    int subCode,    String phrase,    String stateId){
      _sender=sender;
      _callObjectId=callObjectId;
      _causeId=causeId;
      _code=code;
      _subCode=subCode;
      _phrase=phrase;
      _stateId=stateId;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getCauseId(){
      return _causeId;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
    public String getPhrase(){
      return _phrase;
    }
    public String getStateId(){
      return _stateId;
    }
  }
  public void onPublishStateOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  int code,  int subCode,  String phrase,  String stateId){
    try {
      OnPublishStateOperationStatusChanged event=new OnPublishStateOperationStatusChanged(sender,callObjectId,causeId,code,subCode,phrase,stateId);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnRemoteUserEventsReceived {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _participantId;
    private String _events;
    public OnRemoteUserEventsReceived(    com.skype.CallHandler sender,    int callObjectId,    String participantId,    String events){
      _sender=sender;
      _callObjectId=callObjectId;
      _participantId=participantId;
      _events=events;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getParticipantId(){
      return _participantId;
    }
    public String getEvents(){
      return _events;
    }
  }
  public void onRemoteUserEventsReceived(  com.skype.CallHandler sender,  int callObjectId,  String participantId,  String events){
    try {
      OnRemoteUserEventsReceived event=new OnRemoteUserEventsReceived(sender,callObjectId,participantId,events);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnRemoteVideosCountChanged {
    private com.skype.CallHandler _sender;
    private int _participantObjectId;
    public OnRemoteVideosCountChanged(    com.skype.CallHandler sender,    int participantObjectId){
      _sender=sender;
      _participantObjectId=participantObjectId;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getParticipantObjectId(){
      return _participantObjectId;
    }
  }
  public void onRemoteVideosCountChanged(  com.skype.CallHandler sender,  int participantObjectId){
    try {
      OnRemoteVideosCountChanged event=new OnRemoteVideosCountChanged(sender,participantObjectId);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnRemoveStateOperationStatusChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _causeId;
    private boolean _operationSuccess;
    private String _result;
    public OnRemoveStateOperationStatusChanged(    com.skype.CallHandler sender,    int callObjectId,    String causeId,    boolean operationSuccess,    String result){
      _sender=sender;
      _callObjectId=callObjectId;
      _causeId=causeId;
      _operationSuccess=operationSuccess;
      _result=result;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getCauseId(){
      return _causeId;
    }
    public boolean getOperationSuccess(){
      return _operationSuccess;
    }
    public String getResult(){
      return _result;
    }
  }
  public void onRemoveStateOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  boolean operationSuccess,  String result){
    try {
      OnRemoveStateOperationStatusChanged event=new OnRemoveStateOperationStatusChanged(sender,callObjectId,causeId,operationSuccess,result);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnUnmuteSelfOperationStatusChange {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private com.skype.CallHandler.OPERATIONRESULTCODE _operationResult;
    private int _failureReason;
    public OnUnmuteSelfOperationStatusChange(    com.skype.CallHandler sender,    int callObjectId,    com.skype.CallHandler.OPERATIONRESULTCODE operationResult,    int failureReason){
      _sender=sender;
      _callObjectId=callObjectId;
      _operationResult=operationResult;
      _failureReason=failureReason;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public com.skype.CallHandler.OPERATIONRESULTCODE getOperationResult(){
      return _operationResult;
    }
    public int getFailureReason(){
      return _failureReason;
    }
  }
  public void onUnmuteSelfOperationStatusChange(  com.skype.CallHandler sender,  int callObjectId,  com.skype.CallHandler.OPERATIONRESULTCODE operationResult,  int failureReason){
    try {
      OnUnmuteSelfOperationStatusChange event=new OnUnmuteSelfOperationStatusChange(sender,callObjectId,operationResult,failureReason);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnUpdateMeetingRolesOperationStatusChanged {
    private com.skype.CallHandler _sender;
    private int _callObjectId;
    private String _causeId;
    private int _code;
    private int _subCode;
    private String _phrase;
    public OnUpdateMeetingRolesOperationStatusChanged(    com.skype.CallHandler sender,    int callObjectId,    String causeId,    int code,    int subCode,    String phrase){
      _sender=sender;
      _callObjectId=callObjectId;
      _causeId=causeId;
      _code=code;
      _subCode=subCode;
      _phrase=phrase;
    }
    public com.skype.CallHandler getSender(){
      return _sender;
    }
    public int getCallObjectId(){
      return _callObjectId;
    }
    public String getCauseId(){
      return _causeId;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
    public String getPhrase(){
      return _phrase;
    }
  }
  public void onUpdateMeetingRolesOperationStatusChanged(  com.skype.CallHandler sender,  int callObjectId,  String causeId,  int code,  int subCode,  String phrase){
    try {
      OnUpdateMeetingRolesOperationStatusChanged event=new OnUpdateMeetingRolesOperationStatusChanged(sender,callObjectId,causeId,code,subCode,phrase);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnPropertyChange {
    private com.skype.ObjectInterface _sender;
    private com.skype.PROPKEY _propKey;
    public OnPropertyChange(    com.skype.ObjectInterface sender,    com.skype.PROPKEY propKey){
      _sender=sender;
      _propKey=propKey;
    }
    public com.skype.ObjectInterface getSender(){
      return _sender;
    }
    public com.skype.PROPKEY getPropKey(){
      return _propKey;
    }
  }
  public void onPropertyChange(  com.skype.ObjectInterface sender,  com.skype.PROPKEY propKey){
    try {
      OnPropertyChange event=new OnPropertyChange(sender,propKey);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(propKey,t));
    }
  }
}
