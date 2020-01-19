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

public interface ObjectInterfaceFactory {
	public long createMetatag();
	public long createMetatag(int key, long value);
	public long createMetatag(int key, byte[] value);
	public long createMetatag(int key, String value);
	public void destroyMetatag(long nativeObject);
	public long createObjectInterface();
	public void destroyObjectInterface(long nativeObject);
	public long createAccount();
	public void destroyAccount(long nativeObject);
	public long createVideo();
	public void destroyVideo(long nativeObject);
	public long createContentSharing();
	public void destroyContentSharing(long nativeObject);
	public long createDataChannel();
	public void destroyDataChannel(long nativeObject);
	public long createCall();
	public void destroyCall(long nativeObject);
	public long createInMemoryObject();
	public void destroyInMemoryObject(long nativeObject);
	public long createSessionParameters();
	public void destroySessionParameters(long nativeObject);
	public long createAddParticipantParameters();
	public void destroyAddParticipantParameters(long nativeObject);
	public long createMergeParameters();
	public void destroyMergeParameters(long nativeObject);
	public long createAnswerParameters();
	public void destroyAnswerParameters(long nativeObject);
	public long createMediaStateConfiguration();
	public void destroyMediaStateConfiguration(long nativeObject);
	public long createTransferParameters();
	public void destroyTransferParameters(long nativeObject);
	public long createMeetingSettingsParameters();
	public void destroyMeetingSettingsParameters(long nativeObject);
	public long createCallHandler();
	public void destroyCallHandler(long nativeObject);
	public long createExampleInMemoryObject();
	public long createExampleInMemoryObject(String name);
	public long createExampleInMemoryObject(String name, int[] children);
	public void destroyExampleInMemoryObject(long nativeObject);
	public long createmsrtc();
	public void destroymsrtc(long nativeObject);
	public void destroyListener(long nativeObject);
	public void destroySetup(long nativeObject);
	public void destroyGI(long nativeObject);
	public long createSkyLib(String uiVersionString, boolean isMemOnlyMode, boolean useEventPolling);
	public long createSkyLib(String uiVersionString, String dbPath, boolean isRemovableDbPath, boolean useEventPolling);
	public void destroySkyLib(long nativeObject);
	public long createAddGroupModalityParameters();
	public void destroyAddGroupModalityParameters(long nativeObject);
	public long createTerm();
	public long createTerm(int key, Term.CONDITION cond, long value);
	public long createTerm(int key, Term.CONDITION cond, byte[] value);
	public long createTerm(int key, Term.CONDITION cond, String value);
	public void destroyTerm(long nativeObject);
	public void initializeListener(NativeListenable nativeListenable);
}

