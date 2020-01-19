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

public interface Listener {
	public interface ListenerIIListener {
		void onChange(Listener sender, String key);
	}

	public void addIListener(ListenerIIListener listener);

	public void removeIListener(ListenerIIListener listener);

	
}

