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

public class SkypeFactory implements ObjectInterfaceFactory {
	private static volatile SkypeFactory instance;
	public static SkypeFactory getInstance() {
		if (instance == null) {
			synchronized (SkypeFactory.class) {
				instance = new SkypeFactory();
			}

		}

		return instance;
	}

	public native long createMetatag();
	public native long createMetatag(int key, long value);
	public native long createMetatag(int key, byte[] value);
	
	private native long createMetatagString(int key, byte[] value);
	public long createMetatag(int key, String value) {
		return  createMetatagString(key, NativeStringConvert.ConvertToNativeBytes(value));
	}

	public native void destroyMetatag(long nativeObject);
	public native long createObjectInterface();
	public native void destroyObjectInterface(long nativeObject);
	public native long createAccount();
	public native void destroyAccount(long nativeObject);
	public native long createVideo();
	public native void destroyVideo(long nativeObject);
	public native long createContentSharing();
	public native void destroyContentSharing(long nativeObject);
	public native long createDataChannel();
	public native void destroyDataChannel(long nativeObject);
	public native long createCall();
	public native void destroyCall(long nativeObject);
	public native long createInMemoryObject();
	public native void destroyInMemoryObject(long nativeObject);
	public native long createSessionParameters();
	public native void destroySessionParameters(long nativeObject);
	public native long createAddParticipantParameters();
	public native void destroyAddParticipantParameters(long nativeObject);
	public native long createMergeParameters();
	public native void destroyMergeParameters(long nativeObject);
	public native long createAnswerParameters();
	public native void destroyAnswerParameters(long nativeObject);
	public native long createMediaStateConfiguration();
	public native void destroyMediaStateConfiguration(long nativeObject);
	public native long createTransferParameters();
	public native void destroyTransferParameters(long nativeObject);
	public native long createMeetingSettingsParameters();
	public native void destroyMeetingSettingsParameters(long nativeObject);
	public native long createCallHandler();
	public native void destroyCallHandler(long nativeObject);
	public native long createExampleInMemoryObject();
	
	private native long createExampleInMemoryObjectString(byte[] name);
	public long createExampleInMemoryObject(String name) {
		return  createExampleInMemoryObjectString(NativeStringConvert.ConvertToNativeBytes(name));
	}

	
	private native long createExampleInMemoryObjectString(byte[] name, int[] children);
	public long createExampleInMemoryObject(String name, int[] children) {
		return  createExampleInMemoryObjectString(NativeStringConvert.ConvertToNativeBytes(name), children);
	}

	public native void destroyExampleInMemoryObject(long nativeObject);
	public native long createmsrtc();
	public native void destroymsrtc(long nativeObject);
	public native void destroyListener(long nativeObject);
	public native void destroySetup(long nativeObject);
	public native void destroyGI(long nativeObject);
	
	private native long createSkyLibString(byte[] uiVersionString, boolean isMemOnlyMode, boolean useEventPolling);
	public long createSkyLib(String uiVersionString, boolean isMemOnlyMode, boolean useEventPolling) {
		return  createSkyLibString(NativeStringConvert.ConvertToNativeBytes(uiVersionString), isMemOnlyMode, useEventPolling);
	}

	
	private native long createSkyLibString(byte[] uiVersionString, byte[] dbPath, boolean isRemovableDbPath, boolean useEventPolling);
	public long createSkyLib(String uiVersionString, String dbPath, boolean isRemovableDbPath, boolean useEventPolling) {
		return  createSkyLibString(NativeStringConvert.ConvertToNativeBytes(uiVersionString), NativeStringConvert.ConvertToNativeBytes(dbPath), isRemovableDbPath, useEventPolling);
	}

	public native void destroySkyLib(long nativeObject);
	public native long createAddGroupModalityParameters();
	public native void destroyAddGroupModalityParameters(long nativeObject);
	public native long createTerm();
	public native long createTerm(int key, Term.CONDITION cond, long value);
	public native long createTerm(int key, Term.CONDITION cond, byte[] value);
	
	private native long createTermString(int key, Term.CONDITION cond, byte[] value);
	public long createTerm(int key, Term.CONDITION cond, String value) {
		return  createTermString(key, cond, NativeStringConvert.ConvertToNativeBytes(value));
	}

	public native void destroyTerm(long nativeObject);
	public void initializeListener(NativeListenable nativeListenable) {
		nativeListenable.initializeListener();
	}

}

