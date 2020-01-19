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

import com.skype.MeetingSettingsParameters;

public class MeetingSettingsParametersImpl extends InMemoryObjectImpl implements MeetingSettingsParameters, NativeListenable {
	public MeetingSettingsParametersImpl() {
		this(SkypeFactory.getInstance() );
	}

	public MeetingSettingsParametersImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createMeetingSettingsParameters());
		factory.initializeListener(this);
	}

	static class MeetingSettingsParametersWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		MeetingSettingsParametersWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyMeetingSettingsParameters(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new MeetingSettingsParametersWeakRef(factory, this, queue, m_nativeObject);
	}

	public native void initializeListener();
	
	private final Set<MeetingSettingsParametersIListener> m_listeners = new HashSet<MeetingSettingsParametersIListener>();

	@Override
	public void addListener(MeetingSettingsParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(MeetingSettingsParametersIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	@Override
	public native int getObjectID();

	@Override
	public native void setAllowRaiseHands(boolean allowRaiseHands);

	@Override
	public void setCauseId(String causeId) {
		setCauseId(NativeStringConvert.ConvertToNativeBytes(causeId));
	}

	private native void setCauseId(byte[] causeId);
}

