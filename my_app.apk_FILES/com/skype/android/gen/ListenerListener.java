/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class ListenerListener implements com.skype.Listener.ListenerIIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnChange {
    private com.skype.Listener _sender;
    private String _key;
    public OnChange(    com.skype.Listener sender,    String key){
      _sender=sender;
      _key=key;
    }
    public com.skype.Listener getSender(){
      return _sender;
    }
    public String getKey(){
      return _key;
    }
  }
  public void onChange(  com.skype.Listener sender,  String key){
    try {
      OnChange event=new OnChange(sender,key);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
}
