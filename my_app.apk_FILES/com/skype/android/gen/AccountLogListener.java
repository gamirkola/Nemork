/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class AccountLogListener implements com.skype.Account.AccountIListener, com.skype.ObjectInterface.ObjectInterfaceIListener {
  public void onSkypeTokenRequired(  com.skype.Account sender,  String invalidToken){
    android.util.Log.d("AccountLogListener","onSkypeTokenRequired");
  }
  public void onPropertyChange(  com.skype.ObjectInterface sender,  com.skype.PROPKEY propKey){
    android.util.Log.d("AccountLogListener","onPropertyChange");
  }
}
