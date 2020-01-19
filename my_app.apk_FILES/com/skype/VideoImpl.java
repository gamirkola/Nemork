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

import com.skype.Video;

public class VideoImpl extends ObjectInterfaceImpl implements Video, ObjectInterface, NativeListenable {
	public VideoImpl() {
		this(SkypeFactory.getInstance() );
	}

	public VideoImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createVideo());
		factory.initializeListener(this);
	}

	static class VideoWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		VideoWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyVideo(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new VideoWeakRef(factory, this, queue, m_nativeObject);
	}

	@Override
	public STATUS getStatusProp() {
		return STATUS.fromInt(getIntProperty(PROPKEY.VIDEO_STATUS));
	}

	@Override
	public String getErrorProp() {
		return getStrProperty(PROPKEY.VIDEO_ERROR);
	}

	@Override
	public String getDebuginfoProp() {
		return getStrProperty(PROPKEY.VIDEO_DEBUGINFO);
	}

	@Override
	public String getDimensionsProp() {
		return getStrProperty(PROPKEY.VIDEO_DIMENSIONS);
	}

	@Override
	public MEDIATYPE getMediaTypeProp() {
		return MEDIATYPE.fromInt(getIntProperty(PROPKEY.VIDEO_MEDIA_TYPE));
	}

	@Override
	public int getDuration1080Prop() {
		return getIntProperty(PROPKEY.VIDEO_DURATION_1080);
	}

	@Override
	public int getDuration720Prop() {
		return getIntProperty(PROPKEY.VIDEO_DURATION_720);
	}

	@Override
	public int getDurationHqvProp() {
		return getIntProperty(PROPKEY.VIDEO_DURATION_HQV);
	}

	@Override
	public int getDurationVgad2Prop() {
		return getIntProperty(PROPKEY.VIDEO_DURATION_VGAD2);
	}

	@Override
	public int getDurationLtvgad2Prop() {
		return getIntProperty(PROPKEY.VIDEO_DURATION_LTVGAD2);
	}

	@Override
	public String getLabelProp() {
		return getStrProperty(PROPKEY.VIDEO_LABEL);
	}

	@Override
	public int getTimestampProp() {
		return getIntProperty(PROPKEY.VIDEO_TIMESTAMP);
	}

	@Override
	public int getHqPresentProp() {
		return getIntProperty(PROPKEY.VIDEO_HQ_PRESENT);
	}

	@Override
	public int getDurationSsProp() {
		return getIntProperty(PROPKEY.VIDEO_DURATION_SS);
	}

	@Override
	public int getSsTimestampProp() {
		return getIntProperty(PROPKEY.VIDEO_SS_TIMESTAMP);
	}

	@Override
	public int getConvoIdProp() {
		return getIntProperty(PROPKEY.VIDEO_CONVO_ID);
	}

	@Override
	public String getDevicePathProp() {
		return getStrProperty(PROPKEY.VIDEO_DEVICE_PATH);
	}

	@Override
	public String getDeviceNameProp() {
		return getStrProperty(PROPKEY.VIDEO_DEVICE_NAME);
	}

	@Override
	public int getParticipantIdProp() {
		return getIntProperty(PROPKEY.VIDEO_PARTICIPANT_ID);
	}

	@Override
	public int getRankProp() {
		return getIntProperty(PROPKEY.VIDEO_RANK);
	}

	@Override
	public FAILUREREASON getFailureReasonProp() {
		return FAILUREREASON.fromInt(getIntProperty(PROPKEY.VIDEO_FAILUREREASON));
	}

	@Override
	public String getEndpointIdProp() {
		return getStrProperty(PROPKEY.VIDEO_ENDPOINT_ID);
	}

	@Override
	public String getParticipantLegIdProp() {
		return getStrProperty(PROPKEY.VIDEO_PARTICIPANT_LEG_ID);
	}

	@Override
	public String getParticipantMriProp() {
		return getStrProperty(PROPKEY.VIDEO_PARTICIPANT_MRI);
	}

	@Override
	public String getNegotiationTagProp() {
		return getStrProperty(PROPKEY.VIDEO_NEGOTIATION_TAG);
	}

	public native void initializeListener();
	
	private final Set<VideoIListener> m_listeners = new HashSet<VideoIListener>();

	@Override
	public void addListener(VideoIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(VideoIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	@Override
	public native GetCurrentVideoDevice_Result getCurrentVideoDevice();

	@Override
	public native void setScreenCaptureRectangle(int x0, int y0, int width, int height, int monitorNumber, int windowHandle);

	@Override
	public void setScreenCaptureRectangle(int x0, int y0, int width, int height) {
		setScreenCaptureRectangle(x0, y0, width, height, 0, 0);
	}
	@Override
	public void setScreenCaptureRectangle(int x0, int y0, int width, int height, int monitorNumber) {
		setScreenCaptureRectangle(x0, y0, width, height, monitorNumber, 0);
	}
	@Override
	public void start(String negotiationTag) {
		start(NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native void start(byte[] negotiationTag);
	@Override
	public void start() {
		start("");
	}
	@Override
	public void stop(String negotiationTag) {
		stop(NativeStringConvert.ConvertToNativeBytes(negotiationTag));
	}

	private native void stop(byte[] negotiationTag);
	@Override
	public void stop() {
		stop("");
	}
	public native void createBinding(int type, long binding);
	public native void releaseBindingEx(int type, long binding);
	public native void releaseBinding(long binding);
}

