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

public interface DataChannel extends ObjectInterface {
	public enum STATUS {
		UNKNOWN(1),
		AVAILABLE(2),
		STARTING(3),
		ACTIVE(4),
		STOPPING(5),
		NOT_STARTED(6),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		STATUS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<STATUS> intToTypeMap = new SparseArrayCompat< STATUS>();
		
		static {
			for (STATUS type : STATUS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static STATUS fromInt(int i) {
			STATUS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : STATUS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public int getStatusProp();

	public interface DataChannelIListener {
	}

	public void addListener(DataChannelIListener listener);

	public void removeListener(DataChannelIListener listener);

	
	public void resetDataDevice();

	public void sendUserEvents(String events, String[] participantIds);

	public boolean setDataDevice(int sourceDeviceId, int sinkDeviceId);

	public void start(String negotiationTag);

	public void start();

	public void stop(String negotiationTag);

	public void stop();

	public void deleteDevice(int deviceId);

}

