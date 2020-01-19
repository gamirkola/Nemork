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

public interface Term {
	public enum CONDITION {
		EQ(0),
		GT(1),
		GE(2),
		LT(3),
		LE(4),
		PREFIX_EQ(5),
		PREFIX_GE(6),
		PREFIX_LE(7),
		CONTAINS_WORDS(8),
		CONTAINS_WORD_PREFIXES(9),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		CONDITION(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<CONDITION> intToTypeMap = new SparseArrayCompat< CONDITION>();
		
		static {
			for (CONDITION type : CONDITION.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static CONDITION fromInt(int i) {
			CONDITION tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : CONDITION.WRAPPER_UNKNOWN_VALUE;
		}
	}

	
}

