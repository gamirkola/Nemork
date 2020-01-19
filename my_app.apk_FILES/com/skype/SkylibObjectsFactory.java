/* =============================================================================
 *                      GENERATED FILE - DO NOT MODIFY
 * =============================================================================
 * Copyright (c) 2016 Microsoft. All rights reserved.
 * 
 */
package com.skype;
import android.support.v4.util.SparseArrayCompat;
import java.util.Set;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import com.skype.NativeStringConvert;

public class SkylibObjectsFactory {
	public static <T extends ObjectInterface> T getSkylibObject(Class <T> clazz, int objectId, SkyLib lib) {
		if (Account.class.equals(clazz) || AccountImpl.class.equals(clazz)) {
			Account rval = new AccountImpl();
			boolean success = lib.getAccount(objectId, rval);
			return (success ? (T) rval : null);
		}

		if (Video.class.equals(clazz) || VideoImpl.class.equals(clazz)) {
			Video rval = new VideoImpl();
			boolean success = lib.getVideo(objectId, rval);
			return (success ? (T) rval : null);
		}

		if (ContentSharing.class.equals(clazz) || ContentSharingImpl.class.equals(clazz)) {
			ContentSharing rval = new ContentSharingImpl();
			boolean success = lib.getContentSharing(objectId, rval);
			return (success ? (T) rval : null);
		}

		if (DataChannel.class.equals(clazz) || DataChannelImpl.class.equals(clazz)) {
			DataChannel rval = new DataChannelImpl();
			boolean success = lib.getDataChannel(objectId, rval);
			return (success ? (T) rval : null);
		}

		if (Call.class.equals(clazz) || CallImpl.class.equals(clazz)) {
			Call rval = new CallImpl();
			boolean success = lib.getCall(objectId, rval);
			return (success ? (T) rval : null);
		}

		if (CallHandler.class.equals(clazz) || CallHandlerImpl.class.equals(clazz)) {
			CallHandler rval = new CallHandlerImpl();
			boolean success = lib.getCallHandler(objectId, rval);
			return (success ? (T) rval : null);
		}

		return null;
	}

}

