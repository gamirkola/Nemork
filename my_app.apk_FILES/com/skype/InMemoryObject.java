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

public interface InMemoryObject {
	public interface InMemoryObjectIListener {
		void onDummy(InMemoryObject sender);
	}

	public void addListener(InMemoryObjectIListener listener);

	public void removeListener(InMemoryObjectIListener listener);

	
	public int getInMemObjectID();

	public SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

}

