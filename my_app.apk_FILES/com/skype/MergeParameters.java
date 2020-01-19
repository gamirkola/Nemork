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

public interface MergeParameters {
	public interface MergeParametersIListener {
	}

	public void addListener(MergeParametersIListener listener);

	public void removeListener(MergeParametersIListener listener);

	
	public SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	public int getObjectID();

	public void setCauseId(String causeId);

	public void setMessageId(String messageId);

	public void setPickupCode(String pickupCode);

	public void setThreadId(String threadId);

}

