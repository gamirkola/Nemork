/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class ContentSharingListener implements com.skype.ContentSharing.ContentSharingIListener, com.skype.ObjectInterface.ObjectInterfaceIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnJoinContentSharingResult {
    private com.skype.ContentSharing _sender;
    private com.skype.ContentSharing.FAILUREREASON _failureReason;
    private int _code;
    private int _subCode;
    public OnJoinContentSharingResult(    com.skype.ContentSharing sender,    com.skype.ContentSharing.FAILUREREASON failureReason,    int code,    int subCode){
      _sender=sender;
      _failureReason=failureReason;
      _code=code;
      _subCode=subCode;
    }
    public com.skype.ContentSharing getSender(){
      return _sender;
    }
    public com.skype.ContentSharing.FAILUREREASON getFailureReason(){
      return _failureReason;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
  }
  public void onJoinContentSharingResult(  com.skype.ContentSharing sender,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    try {
      OnJoinContentSharingResult event=new OnJoinContentSharingResult(sender,failureReason,code,subCode);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnTakeContentSharingControlResult {
    private com.skype.ContentSharing _sender;
    private com.skype.ContentSharing.FAILUREREASON _failureReason;
    private int _code;
    private int _subCode;
    public OnTakeContentSharingControlResult(    com.skype.ContentSharing sender,    com.skype.ContentSharing.FAILUREREASON failureReason,    int code,    int subCode){
      _sender=sender;
      _failureReason=failureReason;
      _code=code;
      _subCode=subCode;
    }
    public com.skype.ContentSharing getSender(){
      return _sender;
    }
    public com.skype.ContentSharing.FAILUREREASON getFailureReason(){
      return _failureReason;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
  }
  public void onTakeContentSharingControlResult(  com.skype.ContentSharing sender,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    try {
      OnTakeContentSharingControlResult event=new OnTakeContentSharingControlResult(sender,failureReason,code,subCode);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnUpdateContentSharingParticipantStateResult {
    private com.skype.ContentSharing _sender;
    private com.skype.ContentSharing.FAILUREREASON _failureReason;
    private int _code;
    private int _subCode;
    public OnUpdateContentSharingParticipantStateResult(    com.skype.ContentSharing sender,    com.skype.ContentSharing.FAILUREREASON failureReason,    int code,    int subCode){
      _sender=sender;
      _failureReason=failureReason;
      _code=code;
      _subCode=subCode;
    }
    public com.skype.ContentSharing getSender(){
      return _sender;
    }
    public com.skype.ContentSharing.FAILUREREASON getFailureReason(){
      return _failureReason;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
  }
  public void onUpdateContentSharingParticipantStateResult(  com.skype.ContentSharing sender,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    try {
      OnUpdateContentSharingParticipantStateResult event=new OnUpdateContentSharingParticipantStateResult(sender,failureReason,code,subCode);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnUpdateContentSharingSessionStateResult {
    private com.skype.ContentSharing _sender;
    private String _id;
    private com.skype.ContentSharing.FAILUREREASON _failureReason;
    private int _code;
    private int _subCode;
    public OnUpdateContentSharingSessionStateResult(    com.skype.ContentSharing sender,    String id,    com.skype.ContentSharing.FAILUREREASON failureReason,    int code,    int subCode){
      _sender=sender;
      _id=id;
      _failureReason=failureReason;
      _code=code;
      _subCode=subCode;
    }
    public com.skype.ContentSharing getSender(){
      return _sender;
    }
    public String getId(){
      return _id;
    }
    public com.skype.ContentSharing.FAILUREREASON getFailureReason(){
      return _failureReason;
    }
    public int getCode(){
      return _code;
    }
    public int getSubCode(){
      return _subCode;
    }
  }
  public void onUpdateContentSharingSessionStateResult(  com.skype.ContentSharing sender,  String id,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    try {
      OnUpdateContentSharingSessionStateResult event=new OnUpdateContentSharingSessionStateResult(sender,id,failureReason,code,subCode);
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
