package com.skype.android.event;

import com.skype.PROPKEY;

/**
 * A reverse JNI error rethrown to the main thread.
 */
public class ListenerError extends Error {

	public ListenerError(Throwable throwable) {
		super(throwable);
	}

	public ListenerError(PROPKEY propkey, Throwable throwable) {
		super(propkey.name(), throwable);
	}
	
	public ListenerError(int objectId, Throwable throwable) {
		super(hexPrint(objectId), throwable);
	}
	
	public ListenerError(PROPKEY propkey, int objectId, Throwable throwable) {
		super(propkey.name() + hexPrint(objectId), throwable);
	}

	private static String hexPrint(int objectId) {
		return String.format("ObjectID: 0x%08x", objectId);
	}
}
