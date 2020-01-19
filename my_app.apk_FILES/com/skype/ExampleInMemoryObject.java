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

public interface ExampleInMemoryObject {
	public interface ExampleInMemoryObjectIListener {
		void onChildrenChanged(ExampleInMemoryObject sender, int[] newChildren);
		void onNameChanged(ExampleInMemoryObject sender, String newName, String oldName);
	}

	public void addListener(ExampleInMemoryObjectIListener listener);

	public void removeListener(ExampleInMemoryObjectIListener listener);

	
	public SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	public class GetName_Result {
		public boolean m_return;
		public String m_name;
		public void init(byte[] name, boolean funcRet) {
			m_name = NativeStringConvert.ConvertFromNativeBytes(name);
			m_return = funcRet;
		}

	}

	public GetName_Result getName();

	public void setChildren(int[] newChildren);

	public void setName(String newName);

}

