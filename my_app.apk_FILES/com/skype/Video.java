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

public interface Video extends ObjectInterface {
	public enum STATUS {
		NOT_AVAILABLE(0),
		AVAILABLE(1),
		STARTING(2),
		RUNNING(4),
		STOPPING(5),
		PAUSED(6),
		NOT_STARTED(7),
		UNKNOWN(9),
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

	public enum MEDIATYPE {
		MEDIA_SCREENSHARING(1),
		MEDIA_VIDEO(0),
		MEDIA_SR_AUGMENTED(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		MEDIATYPE(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<MEDIATYPE> intToTypeMap = new SparseArrayCompat< MEDIATYPE>();
		
		static {
			for (MEDIATYPE type : MEDIATYPE.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static MEDIATYPE fromInt(int i) {
			MEDIATYPE tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : MEDIATYPE.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum FAILUREREASON {
		NONE(0),
		NO_DEVICE(1),
		CANNOT_START_DEVICE(2),
		DEVICE_REMOVED(3),
		RENDERER_FAILURE(4),
		SUBSCRIPTION_FAILURE(5),
		VIDEO_REJECTED(6),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		FAILUREREASON(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<FAILUREREASON> intToTypeMap = new SparseArrayCompat< FAILUREREASON>();
		
		static {
			for (FAILUREREASON type : FAILUREREASON.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static FAILUREREASON fromInt(int i) {
			FAILUREREASON tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : FAILUREREASON.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public STATUS getStatusProp();

	public String getErrorProp();

	public String getDebuginfoProp();

	public String getDimensionsProp();

	public MEDIATYPE getMediaTypeProp();

	public int getDuration1080Prop();

	public int getDuration720Prop();

	public int getDurationHqvProp();

	public int getDurationVgad2Prop();

	public int getDurationLtvgad2Prop();

	public String getLabelProp();

	public int getTimestampProp();

	public int getHqPresentProp();

	public int getDurationSsProp();

	public int getSsTimestampProp();

	public int getConvoIdProp();

	public String getDevicePathProp();

	public String getDeviceNameProp();

	public int getParticipantIdProp();

	public int getRankProp();

	public FAILUREREASON getFailureReasonProp();

	public String getEndpointIdProp();

	public String getParticipantLegIdProp();

	public String getParticipantMriProp();

	public String getNegotiationTagProp();

	public interface VideoIListener {
	}

	public void addListener(VideoIListener listener);

	public void removeListener(VideoIListener listener);

	
	public class GetCurrentVideoDevice_Result {
		public Video.MEDIATYPE m_return;
		public String m_deviceName;
		public String m_devicePath;
		public void init(byte[] deviceName, byte[] devicePath, Video.MEDIATYPE funcRet) {
			m_deviceName = NativeStringConvert.ConvertFromNativeBytes(deviceName);
			m_devicePath = NativeStringConvert.ConvertFromNativeBytes(devicePath);
			m_return = funcRet;
		}

	}

	public GetCurrentVideoDevice_Result getCurrentVideoDevice();

	public void setScreenCaptureRectangle(int x0, int y0, int width, int height, int monitorNumber, int windowHandle);

	public void setScreenCaptureRectangle(int x0, int y0, int width, int height);

	public void setScreenCaptureRectangle(int x0, int y0, int width, int height, int monitorNumber);

	public void start(String negotiationTag);

	public void start();

	public void stop(String negotiationTag);

	public void stop();

}

