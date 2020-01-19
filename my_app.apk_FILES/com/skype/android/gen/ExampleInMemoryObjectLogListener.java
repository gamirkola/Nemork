/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class ExampleInMemoryObjectLogListener implements com.skype.ExampleInMemoryObject.ExampleInMemoryObjectIListener {
  public void onChildrenChanged(  com.skype.ExampleInMemoryObject sender,  int[] newChildren){
    android.util.Log.d("ExampleInMemoryObjectLogListener","onChildrenChanged");
  }
  public void onNameChanged(  com.skype.ExampleInMemoryObject sender,  String newName,  String oldName){
    android.util.Log.d("ExampleInMemoryObjectLogListener","onNameChanged");
  }
}
