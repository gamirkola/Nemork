package com.skype.android.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.skype.ObjectInterface;

/**
 * A handler callback to wrap and rethrow exceptions produced in reverse JNI.
 */
public class ListenerErrorReporter implements Handler.Callback {
	private static final int REVERSE_JNI = 0x494e4a52; // little-endian "RJNI"
	private static final Handler handler = new Handler(Looper.getMainLooper(), new ListenerErrorReporter());

	@Override
	public boolean handleMessage(Message msg) {
		Object object = msg.obj;
		if (object instanceof Error) {
			throw (Error) object;
		}
		return false;
	}
	
	public static void report(ListenerError listenerError) {
		final Message msg = new Message();
		msg.what = REVERSE_JNI;
		msg.obj  = listenerError;
		handler.sendMessage(msg);
	}
}
