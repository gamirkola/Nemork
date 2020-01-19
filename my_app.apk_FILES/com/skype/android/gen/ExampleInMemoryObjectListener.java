/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class ExampleInMemoryObjectListener implements com.skype.ExampleInMemoryObject.ExampleInMemoryObjectIListener {
  final com.skype.android.event.EventBus eventBus=com.skype.android.event.EventBusInstance.get();
public static class OnChildrenChanged {
    private com.skype.ExampleInMemoryObject _sender;
    private int[] _newChildren;
    public OnChildrenChanged(    com.skype.ExampleInMemoryObject sender,    int[] newChildren){
      _sender=sender;
      _newChildren=newChildren;
    }
    public com.skype.ExampleInMemoryObject getSender(){
      return _sender;
    }
    public int[] getNewChildren(){
      return _newChildren;
    }
  }
  public void onChildrenChanged(  com.skype.ExampleInMemoryObject sender,  int[] newChildren){
    try {
      OnChildrenChanged event=new OnChildrenChanged(sender,newChildren);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
public static class OnNameChanged {
    private com.skype.ExampleInMemoryObject _sender;
    private String _newName;
    private String _oldName;
    public OnNameChanged(    com.skype.ExampleInMemoryObject sender,    String newName,    String oldName){
      _sender=sender;
      _newName=newName;
      _oldName=oldName;
    }
    public com.skype.ExampleInMemoryObject getSender(){
      return _sender;
    }
    public String getNewName(){
      return _newName;
    }
    public String getOldName(){
      return _oldName;
    }
  }
  public void onNameChanged(  com.skype.ExampleInMemoryObject sender,  String newName,  String oldName){
    try {
      OnNameChanged event=new OnNameChanged(sender,newName,oldName);
      eventBus.sendEvent(event);
    }
 catch (    java.lang.Throwable t) {
      com.skype.android.event.ListenerErrorReporter.report(new com.skype.android.event.ListenerError(t));
    }
  }
}
