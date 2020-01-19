/** 
 * (c) 2017 Skype
 * AUTOMATICALLY GENERATED CODE - DO NOT EDIT
 * Dec 1, 2019 12:16:12 PM
 */
package com.skype.android.gen;
public class ContentSharingLogListener implements com.skype.ContentSharing.ContentSharingIListener, com.skype.ObjectInterface.ObjectInterfaceIListener {
  public void onJoinContentSharingResult(  com.skype.ContentSharing sender,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    android.util.Log.d("ContentSharingLogListener","onJoinContentSharingResult");
  }
  public void onTakeContentSharingControlResult(  com.skype.ContentSharing sender,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    android.util.Log.d("ContentSharingLogListener","onTakeContentSharingControlResult");
  }
  public void onUpdateContentSharingParticipantStateResult(  com.skype.ContentSharing sender,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    android.util.Log.d("ContentSharingLogListener","onUpdateContentSharingParticipantStateResult");
  }
  public void onUpdateContentSharingSessionStateResult(  com.skype.ContentSharing sender,  String id,  com.skype.ContentSharing.FAILUREREASON failureReason,  int code,  int subCode){
    android.util.Log.d("ContentSharingLogListener","onUpdateContentSharingSessionStateResult");
  }
  public void onPropertyChange(  com.skype.ObjectInterface sender,  com.skype.PROPKEY propKey){
    android.util.Log.d("ContentSharingLogListener","onPropertyChange");
  }
}
