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

import com.skype.Setup;

public class SetupImpl implements Setup {
	protected long m_nativeObject;

	protected SetupImpl(long nativeObject) {
		this(SkypeFactory.getInstance(),  nativeObject);
	}

	protected SetupImpl(ObjectInterfaceFactory factory, long nativeObject) {
		m_nativeObject = nativeObject;
	}

	@Override
	public void delete(String key) {
		delete(NativeStringConvert.ConvertToNativeBytes(key));
	}

	private native void delete(byte[] key);
	@Override
	public byte[] getBin(String key) {
		return getBin(NativeStringConvert.ConvertToNativeBytes(key));
	}

	private native byte[] getBin(byte[] key);
	@Override
	public byte[] getBin(String key, byte[] defaultValue) {
		return getBin(NativeStringConvert.ConvertToNativeBytes(key), defaultValue);
	}

	private native byte[] getBin(byte[] key, byte[] defaultValue);
	@Override
	public long getInt64(String key, long defaultValue) {
		return getInt64(NativeStringConvert.ConvertToNativeBytes(key), defaultValue);
	}

	private native long getInt64(byte[] key, long defaultValue);
	@Override
	public long getInt64(String key) {
		return getInt64(key, 0);
	}
	@Override
	public int getInt(String key, int defaultValue) {
		return getInt(NativeStringConvert.ConvertToNativeBytes(key), defaultValue);
	}

	private native int getInt(byte[] key, int defaultValue);
	@Override
	public int getInt(String key) {
		return getInt(key, 0);
	}
	@Override
	public String getStr(String key) {
		return NativeStringConvert.ConvertFromNativeBytes(getStrNativeString(NativeStringConvert.ConvertToNativeBytes(key)));
	}

	private native byte[] getStrNativeString(byte[] key);
	@Override
	public String getStr(String key, String defaultValue) {
		return NativeStringConvert.ConvertFromNativeBytes(getStrNativeString(NativeStringConvert.ConvertToNativeBytes(key), NativeStringConvert.ConvertToNativeBytes(defaultValue)));
	}

	private native byte[] getStrNativeString(byte[] key, byte[] defaultValue);
	@Override
	public String getSubKey(String key, int index) {
		return NativeStringConvert.ConvertFromNativeBytes(getSubKeyNativeString(NativeStringConvert.ConvertToNativeBytes(key), index));
	}

	private native byte[] getSubKeyNativeString(byte[] key, int index);
	@Override
	public boolean isDefined(String key) {
		return isDefined(NativeStringConvert.ConvertToNativeBytes(key));
	}

	private native boolean isDefined(byte[] key);
	@Override
	public void setBin(String key, byte[] value) {
		setBin(NativeStringConvert.ConvertToNativeBytes(key), value);
	}

	private native void setBin(byte[] key, byte[] value);
	@Override
	public void setInt64(String key, long value) {
		setInt64(NativeStringConvert.ConvertToNativeBytes(key), value);
	}

	private native void setInt64(byte[] key, long value);
	@Override
	public void setInt(String key, int value) {
		setInt(NativeStringConvert.ConvertToNativeBytes(key), value);
	}

	private native void setInt(byte[] key, int value);
	@Override
	public void setStr(String key, String value) {
		setStr(NativeStringConvert.ConvertToNativeBytes(key), NativeStringConvert.ConvertToNativeBytes(value));
	}

	private native void setStr(byte[] key, byte[] value);
}

