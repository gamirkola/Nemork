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

public interface MediaStateConfiguration {
	public interface MediaStateConfigurationIListener {
	}

	public void addListener(MediaStateConfigurationIListener listener);

	public void removeListener(MediaStateConfigurationIListener listener);

	
	public SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	public String getMediaStateConfigurationJson();

	public int getObjectID();

	public void setMediaState(CallHandler.MODALITY_TYPE modalityType, String label, boolean isDisabled);

	public void setMediaState(CallHandler.MODALITY_TYPE modalityType);

	public void setMediaState(CallHandler.MODALITY_TYPE modalityType, String label);

}

