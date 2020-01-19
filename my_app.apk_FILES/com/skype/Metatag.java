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

public interface Metatag {
	public enum TYPE {
		INTEGER(0),
		STRING(1),
		BINARY(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		TYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<TYPE> intToTypeMap = new SparseArrayCompat< TYPE>();
		
		static {
			for (TYPE type : TYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static TYPE fromInt(int i) {
			TYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : TYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	
	public int getAllocedSize();

	public byte[] getBinValue();

	public long getInt64Value();

	public int getIntValue();

	public int getKey();

	public String getStrValue();

	public Metatag.TYPE getType();

	public boolean isFullEqual(Metatag m);

	public boolean isKeyEqual(Metatag m);

	public boolean isNull();

	public boolean isValueEqual(Metatag m);

}

