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

import com.skype.MergeParameters;

public class MergeParametersImpl extends InMemoryObjectImpl implements MergeParameters, NativeListenable {
	public MergeParametersImpl() {
		this(SkypeFactory.getInstance() );
	}

	public MergeParametersImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createMergeParameters());
		factory.initializeListener(this);
	}

	static class MergeParametersWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		MergeParametersWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyMergeParameters(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new MergeParametersWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<MergeParametersIListener> m_listeners = new HashSet<MergeParametersIListener>();

	@Override
	public void addListener(MergeParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(MergeParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	@Override
	public native int getObjectID();

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
	public void setPickupCode(String pickupCode) {
		setPickupCode(NativeStringConvert.ConvertToNativeBytes(pickupCode));
	}

	private native void setPickupCode(byte[] pickupCode);
	@Override
	public void setThreadId(String threadId) {
		setThreadId(NativeStringConvert.ConvertToNativeBytes(threadId));
	}

	private native void setThreadId(byte[] threadId);
}

