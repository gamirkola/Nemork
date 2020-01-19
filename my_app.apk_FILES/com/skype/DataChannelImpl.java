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

import com.skype.DataChannel;

public class DataChannelImpl extends ObjectInterfaceImpl implements DataChannel, ObjectInterface, NativeListenable {
	public DataChannelImpl() {
		this(SkypeFactory.getInstance() );
	}

	public DataChannelImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createDataChannel());
		factory.initializeListener(this);
	}

	static class DataChannelWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		DataChannelWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyDataChannel(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new DataChannelWeakRef(factory, this, queue, m_nativeObject);
	}

	@Override
	public int getStatusProp() {
		return getIntProperty(PROPKEY.DATACHANNEL_STATUS);
	}

	public native void initializeListener();
	
	private final Set<DataChannelIListener> m_listeners = new HashSet<DataChannelIListener>();

	@Override
	public void addListener(DataChannelIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(DataChannelIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native void resetDataDevice();

	@Override
	public void sendUserEvents(String events, String[] participantIds) {
		sendUserEvents(NativeStringConvert.ConvertToNativeBytes(events), NativeStringConvert.ConvertArrToNativeByteArr(participantIds));
	}

	private native void sendUserEvents(byte[] events, byte[][] participantIds);
	@Override
	public native boolean setDataDevice(int sourceDeviceId, int sinkDeviceId);

	@Override
	public void start(String negotiationTag) {
		start(NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native void start(byte[] negotiationTag);
	@Override
	public void start() {
		start("");
	}
	@Override
	public void stop(String negotiationTag) {
		stop(NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native void stop(byte[] negotiationTag);
	@Override
	public void stop() {
		stop("");
	}
	@Override
	public native void deleteDevice(int deviceId);

	public int createSinkDevice(com.skype.android.data.DataSink dataSink) {
		return createSinkDevice(dataSink != null ? dataSink.getNativePtr() : 0);
	}
	private native int createSinkDevice(long dataSinkNativePtr);
	public int createSourceDevice(com.skype.android.data.DataSource dataSource) {
		return createSourceDevice(dataSource != null ? dataSource.getNativePtr() : 0);
	}
	private native int createSourceDevice(long dataSourceNativePtr);
	public boolean registerDataSink(int deviceId, com.skype.android.data.DataSink dataSink) {
		return registerDataSink(deviceId, dataSink != null ? dataSink.getNativePtr() : 0);
	}
	private native boolean registerDataSink(int deviceId, long dataSinkNativePtr);
	public boolean registerDataSource(int deviceId, com.skype.android.data.DataSource dataSource) {
		return registerDataSource(deviceId, dataSource != null ? dataSource.getNativePtr() : 0);
	}
	private native boolean registerDataSource(int deviceId, long dataSourceNativePtr);
	public boolean unregisterDataSink(int deviceId, com.skype.android.data.DataSink dataSink) {
		return unregisterDataSink(deviceId, dataSink != null ? dataSink.getNativePtr() : 0);
	}
	private native boolean unregisterDataSink(int deviceId, long dataSinkNativePtr);
	public boolean unregisterDataSource(int deviceId, com.skype.android.data.DataSource dataSource) {
		return unregisterDataSource(deviceId, dataSource != null ? dataSource.getNativePtr() : 0);
	}
	private native boolean unregisterDataSource(int deviceId, long dataSourceNativePtr);
}

