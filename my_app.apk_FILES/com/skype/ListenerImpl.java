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

import com.skype.Listener;

public class ListenerImpl implements Listener, NativeListenable {
	protected long m_nativeObject;

	protected ListenerImpl(long nativeObject) {
		this(SkypeFactory.getInstance(),  nativeObject);
	}

	protected ListenerImpl(ObjectInterfaceFactory factory, long nativeObject) {
		m_nativeObject = nativeObject;
	}

	public native void initializeListener();
	
	private final Set<ListenerIIListener> m_listeners = new HashSet<ListenerIIListener>();

	@Override
	public void addIListener(ListenerIIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeIListener(ListenerIIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onChange(byte[] key) {
		synchronized (m_listeners) {
			for (ListenerIIListener listener : m_listeners) {
				listener.onChange(this, NativeStringConvert.ConvertFromNativeBytes(key));
			}
		}
	}

}

