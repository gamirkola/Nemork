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

import com.skype.TransferParameters;

public class TransferParametersImpl extends InMemoryObjectImpl implements TransferParameters, NativeListenable {
	public TransferParametersImpl() {
		this(SkypeFactory.getInstance() );
	}

	public TransferParametersImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createTransferParameters());
		factory.initializeListener(this);
	}

	static class TransferParametersWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		TransferParametersWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyTransferParameters(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new TransferParametersWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<TransferParametersIListener> m_listeners = new HashSet<TransferParametersIListener>();

	@Override
	public void addListener(TransferParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(TransferParametersIListener listener) {
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
	public native void setConsultativeCall(int consultativeCallObjectId);

	@Override
	public void setPickupCode(String pickupCode) {
		setPickupCode(NativeStringConvert.ConvertToNativeBytes(pickupCode));
	}

	private native void setPickupCode(byte[] pickupCode);
}

