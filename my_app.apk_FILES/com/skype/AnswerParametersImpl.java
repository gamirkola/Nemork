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

import com.skype.AnswerParameters;

public class AnswerParametersImpl extends InMemoryObjectImpl implements AnswerParameters, NativeListenable {
	public AnswerParametersImpl() {
		this(SkypeFactory.getInstance() );
	}

	public AnswerParametersImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createAnswerParameters());
		factory.initializeListener(this);
	}

	static class AnswerParametersWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		AnswerParametersWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyAnswerParameters(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new AnswerParametersWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<AnswerParametersIListener> m_listeners = new HashSet<AnswerParametersIListener>();

	@Override
	public void addListener(AnswerParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(AnswerParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	@Override
	public native int getObjectID();

	@Override
	public void setMediaStateConfiguration(String mediaStateConfigurationJson) {
		setMediaStateConfiguration(NativeStringConvert.ConvertToNativeBytes(mediaStateConfigurationJson));
	}

	private native void setMediaStateConfiguration(byte[] mediaStateConfigurationJson);
}

