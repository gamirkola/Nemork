/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class AccountListener implements com.skype.Account.AccountIListener, com.skype.ObjectInterface.ObjectInterfaceIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnSkypeTokenRequired {
    private com.skype.Account _sender;
    private String _invalidToken;
    public OnSkypeTokenRequired(    com.skype.Account sender,    String invalidToken){
      _sender=sender;
      _invalidToken=invalidToken;
    }
    public com.skype.Account getSender(){
      return _sender;
    }
    public String getInvalidToken(){
      return _invalidToken;
    }
  }
  public void onSkypeTokenRequired(  com.skype.Account sender,  String invalidToken){
    try {
      OnSkypeTokenRequired event=new OnSkypeTokenRequired(sender,invalidToken);
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
