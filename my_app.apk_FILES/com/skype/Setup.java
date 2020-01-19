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

public interface Setup {
	
	public void delete(String key);

	public byte[] getBin(String key);

	public byte[] getBin(String key, byte[] defaultValue);

	public long getInt64(String key, long defaultValue);

	public long getInt64(String key);

	public int getInt(String key, int defaultValue);

	public int getInt(String key);

	public String getStr(String key);

	public String getStr(String key, String defaultValue);

	public String getSubKey(String key, int index);

	public boolean isDefined(String key);

	public void setBin(String key, byte[] value);

	public void setInt64(String key, long value);

	public void setInt(String key, int value);

	public void setStr(String key, String value);

}

