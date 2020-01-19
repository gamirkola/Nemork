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

public interface ObjectInterface {
	String getStrProperty(PROPKEY propKey, String defaultValue);
	String getStrProperty(PROPKEY propKey);

	byte[] getBinProperty(PROPKEY propKey);

	public interface ObjectInterfaceIListener {
		void onPropertyChange(ObjectInterface sender, PROPKEY propKey);
	}

	public void addListener(ObjectInterfaceIListener listener);

	public void removeListener(ObjectInterfaceIListener listener);

	
	public class GetFilenameProperty_Result {
		public boolean m_return;
		public String m_value;
		public void init(byte[] value, boolean funcRet) {
			m_value = NativeStringConvert.ConvertFromNativeBytes(value);
			m_return = funcRet;
		}

	}

	public GetFilenameProperty_Result getFilenameProperty(PROPKEY propKey);

	public long getInt64Property(PROPKEY propKey);

	public long getInt64Property(PROPKEY propKey, int defaultValue);

	public int getIntProperty(PROPKEY propKey);

	public int getIntProperty(PROPKEY propKey, int defaultValue);

	public int getObjectID();

	public boolean getProperty(PROPKEY propKey, Metatag property);

	public boolean getPropertyOrDefault(PROPKEY propKey, Metatag property);

	public String getStrPropertyWithXmlStripped(PROPKEY propKey, String defaultValue);

	public boolean setExtendedProperty(PROPKEY propKey, int value);

	public boolean setExtendedProperty(PROPKEY propKey, String value);

	public boolean setExtendedProperty(Metatag property);

	public void unlink();

}

