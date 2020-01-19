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

import com.skype.GI;

public class GIImpl implements GI, ShutdownDestructible {
	protected long m_nativeObject;

	protected GIImpl(long nativeObject) {
		this(SkypeFactory.getInstance(),  nativeObject);
	}

	protected GIImpl(ObjectInterfaceFactory factory, long nativeObject) {
		m_nativeObject = nativeObject;
		ShutdownManager.getInstance().addDestructibleObject(factory, this);
	}

	static class GIWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		GIWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyGI(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new GIWeakRef(factory, this, queue, m_nativeObject);
	}

	private final Set<GIIListener> m_listeners = new HashSet<GIIListener>();

	@Override
	public void addListener(GIIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(GIIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onConnStatusChange(GI.CONNSTATUS connStatus) {
		synchronized (m_listeners) {
			for (GIIListener listener : m_listeners) {
				listener.onConnStatusChange(this, connStatus);
			}
		}
	}

	public void onFileError(GI.FILEERROR error) {
		synchronized (m_listeners) {
			for (GIIListener listener : m_listeners) {
				listener.onFileError(this, error);
			}
		}
	}

	public void onLibStatusChange(GI.LIBSTATUS newStatus) {
		synchronized (m_listeners) {
			for (GIIListener listener : m_listeners) {
				listener.onLibStatusChange(this, newStatus);
			}
		}
	}

	public void onNodeinfoChange(byte[] nodeinfo) {
		synchronized (m_listeners) {
			for (GIIListener listener : m_listeners) {
				listener.onNodeinfoChange(this, nodeinfo);
			}
		}
	}

	public void onProxyAuthenticationFailure(GI.PROXYTYPE proxyType) {
		synchronized (m_listeners) {
			for (GIIListener listener : m_listeners) {
				listener.onProxyAuthenticationFailure(this, proxyType);
			}
		}
	}

	@Override
	public String getActiveLogFileName() {
		return NativeStringConvert.ConvertFromNativeBytes(getActiveLogFileNameNativeString());
	}

	private native byte[] getActiveLogFileNameNativeString();
	@Override
	public String getDebugInfo() {
		return NativeStringConvert.ConvertFromNativeBytes(getDebugInfoNativeString());
	}

	private native byte[] getDebugInfoNativeString();
	@Override
	public String getFatalErrorMessage() {
		return NativeStringConvert.ConvertFromNativeBytes(getFatalErrorMessageNativeString());
	}

	private native byte[] getFatalErrorMessageNativeString();
	@Override
	public native GetLastFileError_Result getLastFileError();

	@Override
	public native GI.LIBSTATUS getLibStatus();

	@Override
	public native Setup getSetup();

	@Override
	public Setup getSetup(String profile) {
		return getSetup(NativeStringConvert.ConvertToNativeBytes(profile));
	}

	private native Setup getSetup(byte[] profile);
	public static void initPlatform(String appDataPath, String logFileNameUTF8, boolean encryptLog) {
		initPlatform(NativeStringConvert.ConvertToNativeBytes(appDataPath), NativeStringConvert.ConvertToNativeBytes(logFileNameUTF8), encryptLog);
	}

	private native static void initPlatform(byte[] appDataPath, byte[] logFileNameUTF8, boolean encryptLog);
	public static void initPlatform(String logFileNameUTF8, boolean encryptLog, boolean logThreadID, boolean mainProcess) {
		initPlatform(NativeStringConvert.ConvertToNativeBytes(logFileNameUTF8), encryptLog, logThreadID, mainProcess);
	}

	private native static void initPlatform(byte[] logFileNameUTF8, boolean encryptLog, boolean logThreadID, boolean mainProcess);
	public static void initPlatform() {
		initPlatform("", true, true, true);
	}
	public static void initPlatform(String logFileNameUTF8) {
		initPlatform(logFileNameUTF8, true, true, true);
	}
	public static void initPlatform(String logFileNameUTF8, boolean encryptLog) {
		initPlatform(logFileNameUTF8, encryptLog, true, true);
	}
	public static void initPlatform(String logFileNameUTF8, boolean encryptLog, boolean logThreadID) {
		initPlatform(logFileNameUTF8, encryptLog, logThreadID, true);
	}
	public static void initPlatform(String logFileNameUTF8, String buildVersion) {
		initPlatform(NativeStringConvert.ConvertToNativeBytes(logFileNameUTF8), NativeStringConvert.ConvertToNativeBytes(buildVersion));
	}

	private native static void initPlatform(byte[] logFileNameUTF8, byte[] buildVersion);
	@Override
	public void log(String subsystem, String format) {
		log(NativeStringConvert.ConvertToNativeBytes(subsystem), NativeStringConvert.ConvertToNativeBytes(format));
	}

	private native void log(byte[] subsystem, byte[] format);
	@Override
	public native void pollEvents(int waitMs);

	@Override
	public void pollEvents() {
		pollEvents(0);
	}
	public native static void uninitPlatform();

	@Override
	public native void updateLogName();

}

