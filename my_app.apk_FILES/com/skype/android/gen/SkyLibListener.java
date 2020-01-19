/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:11 PM
 */
package com.skype.android.gen;
public class SkyLibListener implements com.skype.SkyLib.SkyLibIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnAvailableDeviceListChange {
    private com.skype.SkyLib _sender;
    public OnAvailableDeviceListChange(    com.skype.SkyLib sender){
      _sender=sender;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
  }
  public void onAvailableDeviceListChange(  com.skype.SkyLib sender){
    try {
      OnAvailableDeviceListChange event=new OnAvailableDeviceListChange(sender);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnAvailableVideoDeviceListChange {
    private com.skype.SkyLib _sender;
    public OnAvailableVideoDeviceListChange(    com.skype.SkyLib sender){
      _sender=sender;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
  }
  public void onAvailableVideoDeviceListChange(  com.skype.SkyLib sender){
    try {
      OnAvailableVideoDeviceListChange event=new OnAvailableVideoDeviceListChange(sender);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnE911InfoChanged {
    private com.skype.SkyLib _sender;
    private String _json;
    public OnE911InfoChanged(    com.skype.SkyLib sender,    String json){
      _sender=sender;
      _json=json;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public String getJson(){
      return _json;
    }
  }
  public void onE911InfoChanged(  com.skype.SkyLib sender,  String json){
    try {
      OnE911InfoChanged event=new OnE911InfoChanged(sender,json);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnEcsEvent {
    private com.skype.SkyLib _sender;
    private com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE _eventType;
    public OnEcsEvent(    com.skype.SkyLib sender,    com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE eventType){
      _sender=sender;
      _eventType=eventType;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE getEventType(){
      return _eventType;
    }
  }
  public void onEcsEvent(  com.skype.SkyLib sender,  com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE eventType){
    try {
      OnEcsEvent event=new OnEcsEvent(sender,eventType);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnLoggingEvent {
    private com.skype.SkyLib _sender;
    private String _message;
    private String _auxiliaryPayload;
    public OnLoggingEvent(    com.skype.SkyLib sender,    String message,    String auxiliaryPayload){
      _sender=sender;
      _message=message;
      _auxiliaryPayload=auxiliaryPayload;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public String getMessage(){
      return _message;
    }
    public String getAuxiliaryPayload(){
      return _auxiliaryPayload;
    }
  }
  public void onLoggingEvent(  com.skype.SkyLib sender,  String message,  String auxiliaryPayload){
    try {
      OnLoggingEvent event=new OnLoggingEvent(sender,message,auxiliaryPayload);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnMediaStatusChanged {
    private com.skype.SkyLib _sender;
    private com.skype.SkyLib.MEDIASTATUS _newStatus;
    public OnMediaStatusChanged(    com.skype.SkyLib sender,    com.skype.SkyLib.MEDIASTATUS newStatus){
      _sender=sender;
      _newStatus=newStatus;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public com.skype.SkyLib.MEDIASTATUS getNewStatus(){
      return _newStatus;
    }
  }
  public void onMediaStatusChanged(  com.skype.SkyLib sender,  com.skype.SkyLib.MEDIASTATUS newStatus){
    try {
      OnMediaStatusChanged event=new OnMediaStatusChanged(sender,newStatus);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnObjectDelete {
    private com.skype.SkyLib _sender;
    private com.skype.SkyLib.OBJECTTYPE _objectType;
    private int _objectID;
    public OnObjectDelete(    com.skype.SkyLib sender,    com.skype.SkyLib.OBJECTTYPE objectType,    int objectID){
      _sender=sender;
      _objectType=objectType;
      _objectID=objectID;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public com.skype.SkyLib.OBJECTTYPE getObjectType(){
      return _objectType;
    }
    public int getObjectID(){
      return _objectID;
    }
  }
  public void onObjectDelete(  com.skype.SkyLib sender,  com.skype.SkyLib.OBJECTTYPE objectType,  int objectID){
    try {
      OnObjectDelete event=new OnObjectDelete(sender,objectType,objectID);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnObjectPropertyChangeWithValue {
    private com.skype.SkyLib _sender;
    private int _objectID;
    private com.skype.PROPKEY _propKey;
    private com.skype.Metatag _property;
    public OnObjectPropertyChangeWithValue(    com.skype.SkyLib sender,    int objectID,    com.skype.PROPKEY propKey,    com.skype.Metatag property){
      _sender=sender;
      _objectID=objectID;
      _propKey=propKey;
      _property=property;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public int getObjectID(){
      return _objectID;
    }
    public com.skype.PROPKEY getPropKey(){
      return _propKey;
    }
    public com.skype.Metatag getProperty(){
      return _property;
    }
  }
  public void onObjectPropertyChangeWithValue(  com.skype.SkyLib sender,  int objectID,  com.skype.PROPKEY propKey,  com.skype.Metatag property){
    try {
      OnObjectPropertyChangeWithValue event=new OnObjectPropertyChangeWithValue(sender,objectID,propKey,property);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(propKey,t));
    }
  }
public static class OnOperationModeChanged {
    private com.skype.SkyLib _sender;
    private int _level;
    public OnOperationModeChanged(    com.skype.SkyLib sender,    int level){
      _sender=sender;
      _level=level;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public int getLevel(){
      return _level;
    }
  }
  public void onOperationModeChanged(  com.skype.SkyLib sender,  int level){
    try {
      OnOperationModeChanged event=new OnOperationModeChanged(sender,level);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnProbeDevicesStatusChanged {
    private com.skype.SkyLib _sender;
    private boolean _ready;
    public OnProbeDevicesStatusChanged(    com.skype.SkyLib sender,    boolean ready){
      _sender=sender;
      _ready=ready;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public boolean getReady(){
      return _ready;
    }
  }
  public void onProbeDevicesStatusChanged(  com.skype.SkyLib sender,  boolean ready){
    try {
      OnProbeDevicesStatusChanged event=new OnProbeDevicesStatusChanged(sender,ready);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnProxiedPushNotification {
    private com.skype.SkyLib _sender;
    private int _eventId;
    private String _payload;
    public OnProxiedPushNotification(    com.skype.SkyLib sender,    int eventId,    String payload){
      _sender=sender;
      _eventId=eventId;
      _payload=payload;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public int getEventId(){
      return _eventId;
    }
    public String getPayload(){
      return _payload;
    }
  }
  public void onProxiedPushNotification(  com.skype.SkyLib sender,  int eventId,  String payload){
    try {
      OnProxiedPushNotification event=new OnProxiedPushNotification(sender,eventId,payload);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnPushHandlingComplete {
    private com.skype.SkyLib _sender;
    private int _token;
    private com.skype.SkyLib.PUSHHANDLINGRESULT _result;
    public OnPushHandlingComplete(    com.skype.SkyLib sender,    int token,    com.skype.SkyLib.PUSHHANDLINGRESULT result){
      _sender=sender;
      _token=token;
      _result=result;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public int getToken(){
      return _token;
    }
    public com.skype.SkyLib.PUSHHANDLINGRESULT getResult(){
      return _result;
    }
  }
  public void onPushHandlingComplete(  com.skype.SkyLib sender,  int token,  com.skype.SkyLib.PUSHHANDLINGRESULT result){
    try {
      OnPushHandlingComplete event=new OnPushHandlingComplete(sender,token,result);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnQualityChanged {
    private com.skype.SkyLib _sender;
    private int _objectId;
    private com.skype.msrtc.QualityEventType _type;
    private com.skype.msrtc.QualityLevel _level;
    private com.skype.SkyLib.QUALITY_MEDIATYPE _mediaType;
    public OnQualityChanged(    com.skype.SkyLib sender,    int objectId,    com.skype.msrtc.QualityEventType type,    com.skype.msrtc.QualityLevel level,    com.skype.SkyLib.QUALITY_MEDIATYPE mediaType){
      _sender=sender;
      _objectId=objectId;
      _type=type;
      _level=level;
      _mediaType=mediaType;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public int getObjectId(){
      return _objectId;
    }
    public com.skype.msrtc.QualityEventType getType(){
      return _type;
    }
    public com.skype.msrtc.QualityLevel getLevel(){
      return _level;
    }
    public com.skype.SkyLib.QUALITY_MEDIATYPE getMediaType(){
      return _mediaType;
    }
  }
  public void onQualityChanged(  com.skype.SkyLib sender,  int objectId,  com.skype.msrtc.QualityEventType type,  com.skype.msrtc.QualityLevel level,  com.skype.SkyLib.QUALITY_MEDIATYPE mediaType){
    try {
      OnQualityChanged event=new OnQualityChanged(sender,objectId,type,level,mediaType);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnRegisterContextsComplete {
    private com.skype.SkyLib _sender;
    private com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT _success;
    private int _requestId;
    public OnRegisterContextsComplete(    com.skype.SkyLib sender,    com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT success,    int requestId){
      _sender=sender;
      _success=success;
      _requestId=requestId;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT getSuccess(){
      return _success;
    }
    public int getRequestId(){
      return _requestId;
    }
  }
  public void onRegisterContextsComplete(  com.skype.SkyLib sender,  com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT success,  int requestId){
    try {
      OnRegisterContextsComplete event=new OnRegisterContextsComplete(sender,success,requestId);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnSkypeTokenRequired {
    private com.skype.SkyLib _sender;
    private String _invalidToken;
    public OnSkypeTokenRequired(    com.skype.SkyLib sender,    String invalidToken){
      _sender=sender;
      _invalidToken=invalidToken;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public String getInvalidToken(){
      return _invalidToken;
    }
  }
  public void onSkypeTokenRequired(  com.skype.SkyLib sender,  String invalidToken){
    try {
      OnSkypeTokenRequired event=new OnSkypeTokenRequired(sender,invalidToken);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnTrouterCheckConnectionComplete {
    private com.skype.SkyLib _sender;
    private boolean _isConnected;
    public OnTrouterCheckConnectionComplete(    com.skype.SkyLib sender,    boolean isConnected){
      _sender=sender;
      _isConnected=isConnected;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public boolean getIsConnected(){
      return _isConnected;
    }
  }
  public void onTrouterCheckConnectionComplete(  com.skype.SkyLib sender,  boolean isConnected){
    try {
      OnTrouterCheckConnectionComplete event=new OnTrouterCheckConnectionComplete(sender,isConnected);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnTrouterConnectionStateChanged {
    private com.skype.SkyLib _sender;
    private com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE _eventType;
    public OnTrouterConnectionStateChanged(    com.skype.SkyLib sender,    com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE eventType){
      _sender=sender;
      _eventType=eventType;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
    public com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE getEventType(){
      return _eventType;
    }
  }
  public void onTrouterConnectionStateChanged(  com.skype.SkyLib sender,  com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE eventType){
    try {
      OnTrouterConnectionStateChanged event=new OnTrouterConnectionStateChanged(sender,eventType);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnTrouterSuspendComplete {
    private com.skype.SkyLib _sender;
    public OnTrouterSuspendComplete(    com.skype.SkyLib sender){
      _sender=sender;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
  }
  public void onTrouterSuspendComplete(  com.skype.SkyLib sender){
    try {
      OnTrouterSuspendComplete event=new OnTrouterSuspendComplete(sender);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnTrouterSuspendReady {
    private com.skype.SkyLib _sender;
    public OnTrouterSuspendReady(    com.skype.SkyLib sender){
      _sender=sender;
    }
    public com.skype.SkyLib getSender(){
      return _sender;
    }
  }
  public void onTrouterSuspendReady(  com.skype.SkyLib sender){
    try {
      OnTrouterSuspendReady event=new OnTrouterSuspendReady(sender);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
}
