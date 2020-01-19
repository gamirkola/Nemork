/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class GIListener implements com.skype.GI.GIIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnConnStatusChange {
    private com.skype.GI _sender;
    private com.skype.GI.CONNSTATUS _connStatus;
    public OnConnStatusChange(    com.skype.GI sender,    com.skype.GI.CONNSTATUS connStatus){
      _sender=sender;
      _connStatus=connStatus;
    }
    public com.skype.GI getSender(){
      return _sender;
    }
    public com.skype.GI.CONNSTATUS getConnStatus(){
      return _connStatus;
    }
  }
  public void onConnStatusChange(  com.skype.GI sender,  com.skype.GI.CONNSTATUS connStatus){
    try {
      OnConnStatusChange event=new OnConnStatusChange(sender,connStatus);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnFileError {
    private com.skype.GI _sender;
    private com.skype.GI.FILEERROR _error;
    public OnFileError(    com.skype.GI sender,    com.skype.GI.FILEERROR error){
      _sender=sender;
      _error=error;
    }
    public com.skype.GI getSender(){
      return _sender;
    }
    public com.skype.GI.FILEERROR getError(){
      return _error;
    }
  }
  public void onFileError(  com.skype.GI sender,  com.skype.GI.FILEERROR error){
    try {
      OnFileError event=new OnFileError(sender,error);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnLibStatusChange {
    private com.skype.GI _sender;
    private com.skype.GI.LIBSTATUS _newStatus;
    public OnLibStatusChange(    com.skype.GI sender,    com.skype.GI.LIBSTATUS newStatus){
      _sender=sender;
      _newStatus=newStatus;
    }
    public com.skype.GI getSender(){
      return _sender;
    }
    public com.skype.GI.LIBSTATUS getNewStatus(){
      return _newStatus;
    }
  }
  public void onLibStatusChange(  com.skype.GI sender,  com.skype.GI.LIBSTATUS newStatus){
    try {
      OnLibStatusChange event=new OnLibStatusChange(sender,newStatus);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnNodeinfoChange {
    private com.skype.GI _sender;
    private byte[] _nodeinfo;
    public OnNodeinfoChange(    com.skype.GI sender,    byte[] nodeinfo){
      _sender=sender;
      _nodeinfo=nodeinfo;
    }
    public com.skype.GI getSender(){
      return _sender;
    }
    public byte[] getNodeinfo(){
      return _nodeinfo;
    }
  }
  public void onNodeinfoChange(  com.skype.GI sender,  byte[] nodeinfo){
    try {
      OnNodeinfoChange event=new OnNodeinfoChange(sender,nodeinfo);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnProxyAuthenticationFailure {
    private com.skype.GI _sender;
    private com.skype.GI.PROXYTYPE _proxyType;
    public OnProxyAuthenticationFailure(    com.skype.GI sender,    com.skype.GI.PROXYTYPE proxyType){
      _sender=sender;
      _proxyType=proxyType;
    }
    public com.skype.GI getSender(){
      return _sender;
    }
    public com.skype.GI.PROXYTYPE getProxyType(){
      return _proxyType;
    }
  }
  public void onProxyAuthenticationFailure(  com.skype.GI sender,  com.skype.GI.PROXYTYPE proxyType){
    try {
      OnProxyAuthenticationFailure event=new OnProxyAuthenticationFailure(sender,proxyType);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
}
