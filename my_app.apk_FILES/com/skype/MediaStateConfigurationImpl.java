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

import com.skype.MediaStateConfiguration;

public class MediaStateConfigurationImpl extends InMemoryObjectImpl implements MediaStateConfiguration, NativeListenable {
	public MediaStateConfigurationImpl() {
		this(SkypeFactory.getInstance() );
	}

	public MediaStateConfigurationImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createMediaStateConfiguration());
		factory.initializeListener(this);
	}

	static class MediaStateConfigurationWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		MediaStateConfigurationWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyMediaStateConfiguration(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new MediaStateConfigurationWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<MediaStateConfigurationIListener> m_listeners = new HashSet<MediaStateConfigurationIListener>();

	@Override
	public void addListener(MediaStateConfigurationIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(MediaStateConfigurationIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	@Override
	public String getMediaStateConfigurationJson() {
		return NativeStringConvert.ConvertFromNativeBytes(getMediaStateConfigurationJsonNativeString());
	}

	private native byte[] getMediaStateConfigurationJsonNativeString();
	@Override
	public native int getObjectID();

	@Override
	public void setMediaState(CallHandler.MODALITY_TYPE modalityType, String label, boolean isDisabled) {
		setMediaState(modalityType, NativeStringConvert.ConvertToNativeBytes(label), isDisabled);
	}

	private native void setMediaState(CallHandler.MODALITY_TYPE modalityType, byte[] label, boolean isDisabled);
	@Override
	public void setMediaState(CallHandler.MODALITY_TYPE modalityType) {
		setMediaState(modalityType, "", false);
	}
	@Override
	public void setMediaState(CallHandler.MODALITY_TYPE modalityType, String label) {
		setMediaState(modalityType, label, false);
	}
}

