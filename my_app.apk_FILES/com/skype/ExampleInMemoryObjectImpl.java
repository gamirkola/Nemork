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

import com.skype.ExampleInMemoryObject;

public class ExampleInMemoryObjectImpl extends InMemoryObjectImpl implements ExampleInMemoryObject, NativeListenable {
	public ExampleInMemoryObjectImpl() {
		this(SkypeFactory.getInstance() );
	}

	public ExampleInMemoryObjectImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createExampleInMemoryObject());
		factory.initializeListener(this);
	}

	public ExampleInMemoryObjectImpl(String name) {
		this(SkypeFactory.getInstance() , name);
	}

	public ExampleInMemoryObjectImpl(ObjectInterfaceFactory factory, String name) {
		super(factory,factory.createExampleInMemoryObject(name));
		factory.initializeListener(this);
	}

	public ExampleInMemoryObjectImpl(String name, int[] children) {
		this(SkypeFactory.getInstance() , name, children);
	}

	public ExampleInMemoryObjectImpl(ObjectInterfaceFactory factory, String name, int[] children) {
		super(factory,factory.createExampleInMemoryObject(name, children));
		factory.initializeListener(this);
	}

	static class ExampleInMemoryObjectWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		ExampleInMemoryObjectWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyExampleInMemoryObject(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new ExampleInMemoryObjectWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<ExampleInMemoryObjectIListener> m_listeners = new HashSet<ExampleInMemoryObjectIListener>();

	@Override
	public void addListener(ExampleInMemoryObjectIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ExampleInMemoryObjectIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onChildrenChanged(int[] newChildren) {
		synchronized (m_listeners) {
			for (ExampleInMemoryObjectIListener listener : m_listeners) {
				listener.onChildrenChanged(this, newChildren);
			}
		}
	}

	public void onNameChanged(byte[] newName, byte[] oldName) {
		synchronized (m_listeners) {
			for (ExampleInMemoryObjectIListener listener : m_listeners) {
				listener.onNameChanged(this, NativeStringConvert.ConvertFromNativeBytes(newName), NativeStringConvert.ConvertFromNativeBytes(oldName));
			}
		}
	}

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	@Override
	public native GetName_Result getName();

	@Override
	public native void setChildren(int[] newChildren);

	@Override
	public void setName(String newName) {
		setName(NativeStringConvert.ConvertToNativeBytes(newName));
	}

	private native void setName(byte[] newName);
}

