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

import com.skype.ObjectInterface;

public class ObjectInterfaceImpl implements ObjectInterface, ShutdownDestructible {
	@Override
	public boolean equals(Object o) {
		if(o instanceof ObjectInterface) {
			ObjectInterface objectInterface = (ObjectInterface) o;
			return objectInterface.getObjectID() == getObjectID();
		}

		return false;
	}

	@Override
	public int hashCode() {
		return getObjectID();
	}

	protected long m_nativeObject;

	public ObjectInterfaceImpl() {
		this(SkypeFactory.getInstance() );
	}

	public ObjectInterfaceImpl(ObjectInterfaceFactory factory) {
		m_nativeObject = factory.createObjectInterface();
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	protected ObjectInterfaceImpl(long nativeObject) {
		this(SkypeFactory.getInstance(),  nativeObject);
	}

	protected ObjectInterfaceImpl(ObjectInterfaceFactory factory, long nativeObject) {
		m_nativeObject = nativeObject;
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	static class ObjectInterfaceWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		ObjectInterfaceWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyObjectInterface(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new ObjectInterfaceWeakRef(factory, this, queue, m_nativeObject);
	}

	private final Set<ObjectInterfaceIListener> m_listeners = new HashSet<ObjectInterfaceIListener>();

	@Override
	public void addListener(ObjectInterfaceIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ObjectInterfaceIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onPropertyChange(PROPKEY propKey) {
		synchronized (m_listeners) {
			for (ObjectInterfaceIListener listener : m_listeners) {
				listener.onPropertyChange(this, propKey);
			}
		}
	}

	@Override
	public native GetFilenameProperty_Result getFilenameProperty(PROPKEY propKey);

	@Override
	public native long getInt64Property(PROPKEY propKey);

	@Override
	public native long getInt64Property(PROPKEY propKey, int defaultValue);

	@Override
	public native int getIntProperty(PROPKEY propKey);

	@Override
	public native int getIntProperty(PROPKEY propKey, int defaultValue);

	@Override
	public native int getObjectID();

	@Override
	public native boolean getProperty(PROPKEY propKey, Metatag property);

	@Override
	public native boolean getPropertyOrDefault(PROPKEY propKey, Metatag property);

	@Override
	public String getStrPropertyWithXmlStripped(PROPKEY propKey, String defaultValue) {
		return NativeStringConvert.ConvertFromNativeBytes(getStrPropertyWithXmlStrippedNativeString(propKey, NativeStringConvert.ConvertToNativeBytes(defaultValue)));
	}

	private native byte[] getStrPropertyWithXmlStrippedNativeString(PROPKEY propKey, byte[] defaultValue);
	@Override
	public native boolean setExtendedProperty(PROPKEY propKey, int value);

	@Override
	public boolean setExtendedProperty(PROPKEY propKey, String value) {
		return setExtendedProperty(propKey, NativeStringConvert.ConvertToNativeBytes(value));
	}

	private native boolean setExtendedProperty(PROPKEY propKey, byte[] value);
	@Override
	public native boolean setExtendedProperty(Metatag property);

	@Override
	public native void unlink();

	@Override
	public native byte[] getBinProperty(PROPKEY propKey);
	private native byte[] getStrPropertyNativeString(PROPKEY propKey);
	private native byte[] getStrPropertyNativeString(PROPKEY propKey, byte[] defaultValue);
	@Override
	public String getStrProperty(PROPKEY propKey) {
	    return NativeStringConvert.ConvertFromNativeBytes(getStrPropertyNativeString(propKey));
	}
	@Override
	public String getStrProperty(PROPKEY propKey, String defaultValue) {
	    return NativeStringConvert.ConvertFromNativeBytes(getStrPropertyNativeString(propKey, NativeStringConvert.ConvertToNativeBytes(defaultValue)));
	}
}

