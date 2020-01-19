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

public interface GI {
	public enum LIBSTATUS {
		CONSTRUCTED(0),
		STARTING(1),
		RUNNING(2),
		STOPPING(3),
		STOPPED(4),
		FATAL_ERROR(5),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		LIBSTATUS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<LIBSTATUS> intToTypeMap = new SparseArrayCompat< LIBSTATUS>();
		
		static {
			for (LIBSTATUS type : LIBSTATUS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static LIBSTATUS fromInt(int i) {
			LIBSTATUS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : LIBSTATUS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum FILEERROR {
		NO_FILEERROR(0),
		DISK_FULL(1),
		CREATE_ERROR(2),
		OPEN_ERROR(3),
		READ_ERROR(4),
		WRITE_ERROR(5),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		FILEERROR(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<FILEERROR> intToTypeMap = new SparseArrayCompat< FILEERROR>();
		
		static {
			for (FILEERROR type : FILEERROR.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static FILEERROR fromInt(int i) {
			FILEERROR tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : FILEERROR.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum CONNSTATUS {
		OFFLINE(0),
		CONNECTING(1),
		PAUSING(2),
		ONLINE(3),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		CONNSTATUS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<CONNSTATUS> intToTypeMap = new SparseArrayCompat< CONNSTATUS>();
		
		static {
			for (CONNSTATUS type : CONNSTATUS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static CONNSTATUS fromInt(int i) {
			CONNSTATUS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : CONNSTATUS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum PROXYTYPE {
		HTTPS_PROXY(0),
		SOCKS_PROXY(1),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		PROXYTYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<PROXYTYPE> intToTypeMap = new SparseArrayCompat< PROXYTYPE>();
		
		static {
			for (PROXYTYPE type : PROXYTYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static PROXYTYPE fromInt(int i) {
			PROXYTYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : PROXYTYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum NETWORKACTIVITYLEVEL {
		NAL_NORMAL_LEVEL(3),
		NAL_FIRST_QUIET_LEVEL(7),
		NAL_QUIET_WITH_NETWORK_LEVEL(7),
		NAL_QUIET_SUSPENDED_LEVEL(8),
		NAL_QUIET_SUSPENDED_OFFLINE_LEVEL(9),
		NAL_LAST_LEVEL_DONT_USE(10),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		NETWORKACTIVITYLEVEL(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<NETWORKACTIVITYLEVEL> intToTypeMap = new SparseArrayCompat< NETWORKACTIVITYLEVEL>();
		
		static {
			for (NETWORKACTIVITYLEVEL type : NETWORKACTIVITYLEVEL.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static NETWORKACTIVITYLEVEL fromInt(int i) {
			NETWORKACTIVITYLEVEL tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : NETWORKACTIVITYLEVEL.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public interface GIIListener {
		void onConnStatusChange(GI sender, GI.CONNSTATUS connStatus);
		void onFileError(GI sender, GI.FILEERROR error);
		void onLibStatusChange(GI sender, GI.LIBSTATUS newStatus);
		void onNodeinfoChange(GI sender, byte[] nodeinfo);
		void onProxyAuthenticationFailure(GI sender, GI.PROXYTYPE proxyType);
	}

	public void addListener(GIIListener listener);

	public void removeListener(GIIListener listener);

	
	public String getActiveLogFileName();

	public String getDebugInfo();

	public String getFatalErrorMessage();

	public class GetLastFileError_Result {
		public GI.FILEERROR m_return;
		public int m_lowlevelCode;
		public String m_filename;
		public void init(int lowlevelCode, byte[] filename, GI.FILEERROR funcRet) {
			m_lowlevelCode = lowlevelCode;
			m_filename = NativeStringConvert.ConvertFromNativeBytes(filename);
			m_return = funcRet;
		}

	}

	public GetLastFileError_Result getLastFileError();

	public GI.LIBSTATUS getLibStatus();

	public Setup getSetup();

	public Setup getSetup(String profile);

	public void log(String subsystem, String format);

	public void pollEvents(int waitMs);

	public void pollEvents();

	public void updateLogName();

}

