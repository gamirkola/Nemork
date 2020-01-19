/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class InMemoryObjectListener implements com.skype.InMemoryObject.InMemoryObjectIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnDummy {
    private com.skype.InMemoryObject _sender;
    public OnDummy(    com.skype.InMemoryObject sender){
      _sender=sender;
    }
    public com.skype.InMemoryObject getSender(){
      return _sender;
    }
  }
  public void onDummy(  com.skype.InMemoryObject sender){
    try {
      OnDummy event=new OnDummy(sender);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
}
