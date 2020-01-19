/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class GILogListener implements com.skype.GI.GIIListener {
  public void onConnStatusChange(  com.skype.GI sender,  com.skype.GI.CONNSTATUS connStatus){
    android.util.Log.d("GILogListener","onConnStatusChange");
  }
  public void onFileError(  com.skype.GI sender,  com.skype.GI.FILEERROR error){
    android.util.Log.d("GILogListener","onFileError");
  }
  public void onLibStatusChange(  com.skype.GI sender,  com.skype.GI.LIBSTATUS newStatus){
    android.util.Log.d("GILogListener","onLibStatusChange");
  }
  public void onNodeinfoChange(  com.skype.GI sender,  byte[] nodeinfo){
    android.util.Log.d("GILogListener","onNodeinfoChange");
  }
  public void onProxyAuthenticationFailure(  com.skype.GI sender,  com.skype.GI.PROXYTYPE proxyType){
    android.util.Log.d("GILogListener","onProxyAuthenticationFailure");
  }
}
