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

import com.skype.AddParticipantParameters;

public class AddParticipantParametersImpl extends InMemoryObjectImpl implements AddParticipantParameters, NativeListenable {
	public AddParticipantParametersImpl() {
		this(SkypeFactory.getInstance() );
	}

	public AddParticipantParametersImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createAddParticipantParameters());
		factory.initializeListener(this);
	}

	static class AddParticipantParametersWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		AddParticipantParametersWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyAddParticipantParameters(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new AddParticipantParametersWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<AddParticipantParametersIListener> m_listeners = new HashSet<AddParticipantParametersIListener>();

	@Override
	public void addListener(AddParticipantParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(AddParticipantParametersIListener listener) {
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
	public native void setDisableUnmute(boolean disableUnmute);

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

