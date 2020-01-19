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

import com.skype.Metatag;

public class MetatagImpl implements Metatag, ShutdownDestructible {
	protected long m_nativeObject;

	public MetatagImpl() {
		this(SkypeFactory.getInstance() );
	}

	public MetatagImpl(ObjectInterfaceFactory factory) {
		m_nativeObject = factory.createMetatag();
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	public MetatagImpl(int key, long value) {
		this(SkypeFactory.getInstance() , key, value);
	}

	public MetatagImpl(ObjectInterfaceFactory factory, int key, long value) {
		m_nativeObject = factory.createMetatag(key, value);
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	public MetatagImpl(int key, byte[] value, boolean isString) {
		this(SkypeFactory.getInstance() , key, value, isString);
	}

	public MetatagImpl(ObjectInterfaceFactory factory, int key, byte[] value, boolean isString) {
		if (isString) {
			m_nativeObject = factory.createMetatag(key, NativeStringConvert.ConvertFromNativeBytes(value));
		} else {
			m_nativeObject = factory.createMetatag(key, value);
		}

		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	protected MetatagImpl(long nativeObject) {
		this(SkypeFactory.getInstance(),  nativeObject);
	}

	protected MetatagImpl(ObjectInterfaceFactory factory, long nativeObject) {
		m_nativeObject = nativeObject;
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	static class MetatagWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		MetatagWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyMetatag(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new MetatagWeakRef(factory, this, queue, m_nativeObject);
	}

	@Override
	public native int getAllocedSize();

	@Override
	public native byte[] getBinValue();

	@Override
	public native long getInt64Value();

	@Override
	public native int getIntValue();

	@Override
	public native int getKey();

	@Override
	public String getStrValue() {
		return NativeStringConvert.ConvertFromNativeBytes(getStrValueNativeString());
	}

	private native byte[] getStrValueNativeString();
	@Override
	public native Metatag.TYPE getType();

	@Override
	public native boolean isFullEqual(Metatag m);

	@Override
	public native boolean isKeyEqual(Metatag m);

	@Override
	public native boolean isNull();

	@Override
	public native boolean isValueEqual(Metatag m);

}

