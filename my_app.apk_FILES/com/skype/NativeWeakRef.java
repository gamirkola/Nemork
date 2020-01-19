package com.skype;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class NativeWeakRef<T> extends WeakReference<T> {

    protected final long nativeObject;

    public NativeWeakRef(T referent, ReferenceQueue<T> queue, long nativeObject) {
        super(referent, queue);
        this.nativeObject = nativeObject;
    }

    public abstract void destroyNativeObject();

}