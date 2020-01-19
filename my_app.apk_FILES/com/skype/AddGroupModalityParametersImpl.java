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

import com.skype.AddGroupModalityParameters;

public class AddGroupModalityParametersImpl extends InMemoryObjectImpl implements AddGroupModalityParameters, NativeListenable {
	public AddGroupModalityParametersImpl() {
		this(SkypeFactory.getInstance() );
	}

	public AddGroupModalityParametersImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createAddGroupModalityParameters());
		factory.initializeListener(this);
	}

	static class AddGroupModalityParametersWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		AddGroupModalityParametersWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyAddGroupModalityParameters(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new AddGroupModalityParametersWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<AddGroupModalityParametersIListener> m_listeners = new HashSet<AddGroupModalityParametersIListener>();

	@Override
	public void addListener(AddGroupModalityParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(AddGroupModalityParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	@Override
	public native int getObjectID();

	@Override
	public void setAdditionalData(String additionalData) {
		setAdditionalData(NativeStringConvert.ConvertToNativeBytes(additionalData));
	}

	private native void setAdditionalData(byte[] additionalData);
	@Override
	public void setCauseId(String causeId) {
		setCauseId(NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native void setCauseId(byte[] causeId);
	@Override
	public void setMessageId(String messageId) {
		setMessageId(NativeStringConvert.ConvertToNativeBytes(messageId));
	}

	private native void setMessageId(byte[] messageId);
	@Override
	public void setThreadId(String threadId) {
		setThreadId(NativeStringConvert.ConvertToNativeBytes(threadId));
	}

	private native void setThreadId(byte[] threadId);
}

