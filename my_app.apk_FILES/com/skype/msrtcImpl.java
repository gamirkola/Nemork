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

import com.skype.msrtc;

public class msrtcImpl implements msrtc, ShutdownDestructible {
	protected long m_nativeObject;

	public msrtcImpl() {
		this(SkypeFactory.getInstance() );
	}

	public msrtcImpl(ObjectInterfaceFactory factory) {
		m_nativeObject = factory.createmsrtc();
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	static class msrtcWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		msrtcWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroymsrtc(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new msrtcWeakRef(factory, this, queue, m_nativeObject);
	}

}

