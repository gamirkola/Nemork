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

import com.skype.InMemoryObject;

public class InMemoryObjectImpl implements InMemoryObject, ShutdownDestructible {
	protected long m_nativeObject;

	public InMemoryObjectImpl() {
		this(SkypeFactory.getInstance() );
	}

	public InMemoryObjectImpl(ObjectInterfaceFactory factory) {
		m_nativeObject = factory.createInMemoryObject();
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	protected InMemoryObjectImpl(long nativeObject) {
		this(SkypeFactory.getInstance(),  nativeObject);
	}

	protected InMemoryObjectImpl(ObjectInterfaceFactory factory, long nativeObject) {
		m_nativeObject = nativeObject;
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	static class InMemoryObjectWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		InMemoryObjectWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyInMemoryObject(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new InMemoryObjectWeakRef(factory, this, queue, m_nativeObject);
	}

	private final Set<InMemoryObjectIListener> m_listeners = new HashSet<InMemoryObjectIListener>();

	@Override
	public void addListener(InMemoryObjectIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(InMemoryObjectIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onDummy() {
		synchronized (m_listeners) {
			for (InMemoryObjectIListener listener : m_listeners) {
				listener.onDummy(this);
			}
		}
	}

	@Override
	public native int getInMemObjectID();

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

}

