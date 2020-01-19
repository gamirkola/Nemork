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

import com.skype.ContentSharing;

public class ContentSharingImpl extends ObjectInterfaceImpl implements ContentSharing, ObjectInterface, NativeListenable {
	public ContentSharingImpl() {
		this(SkypeFactory.getInstance() );
	}

	public ContentSharingImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createContentSharing());
		factory.initializeListener(this);
	}

	static class ContentSharingWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		ContentSharingWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyContentSharing(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new ContentSharingWeakRef(factory, this, queue, m_nativeObject);
	}

	@Override
	public int getCallIdProp() {
		return getIntProperty(PROPKEY.CONTENTSHARING_CALL_ID);
	}

	@Override
	public String getIdentityProp() {
		return getStrProperty(PROPKEY.CONTENTSHARING_IDENTITY);
	}

	@Override
	public int getStatusProp() {
		return getIntProperty(PROPKEY.CONTENTSHARING_STATUS);
	}

	@Override
	public String getSharingIdProp() {
		return getStrProperty(PROPKEY.CONTENTSHARING_SHARING_ID);
	}

	@Override
	public String getStateProp() {
		return getStrProperty(PROPKEY.CONTENTSHARING_STATE);
	}

	@Override
	public int getFailureReasonProp() {
		return getIntProperty(PROPKEY.CONTENTSHARING_FAILUREREASON);
	}

	@Override
	public int getFailurecodeProp() {
		return getIntProperty(PROPKEY.CONTENTSHARING_FAILURECODE);
	}

	@Override
	public int getFailuresubcodeProp() {
		return getIntProperty(PROPKEY.CONTENTSHARING_FAILURESUBCODE);
	}

	public native void initializeListener();
	
	private final Set<ContentSharingIListener> m_listeners = new HashSet<ContentSharingIListener>();

	@Override
	public void addListener(ContentSharingIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ContentSharingIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onJoinContentSharingResult(ContentSharing.FAILUREREASON failureReason, int code, int subCode) {
		synchronized (m_listeners) {
			for (ContentSharingIListener listener : m_listeners) {
				listener.onJoinContentSharingResult(this, failureReason, code, subCode);
			}
		}
	}

	public void onTakeContentSharingControlResult(ContentSharing.FAILUREREASON failureReason, int code, int subCode) {
		synchronized (m_listeners) {
			for (ContentSharingIListener listener : m_listeners) {
				listener.onTakeContentSharingControlResult(this, failureReason, code, subCode);
			}
		}
	}

	public void onUpdateContentSharingParticipantStateResult(ContentSharing.FAILUREREASON failureReason, int code, int subCode) {
		synchronized (m_listeners) {
			for (ContentSharingIListener listener : m_listeners) {
				listener.onUpdateContentSharingParticipantStateResult(this, failureReason, code, subCode);
			}
		}
	}

	public void onUpdateContentSharingSessionStateResult(byte[] id, ContentSharing.FAILUREREASON failureReason, int code, int subCode) {
		synchronized (m_listeners) {
			for (ContentSharingIListener listener : m_listeners) {
				listener.onUpdateContentSharingSessionStateResult(this, NativeStringConvert.ConvertFromNativeBytes(id), failureReason, code, subCode);
			}
		}
	}

	@Override
	public native boolean startContentSharing();

	@Override
	public native void stopContentSharing();

	@Override
	public native boolean takeContentSharingControl();

	@Override
	public native boolean updateContentSharingParticipantState();

	@Override
	public boolean updateContentSharingSessionState(String id, String sessionState) {
		return updateContentSharingSessionState(NativeStringConvert.ConvertToNativeBytes(id), NativeStringConvert.ConvertToNativeBytes(sessionState));
	}

	private native boolean updateContentSharingSessionState(byte[] id, byte[] sessionState);
}

