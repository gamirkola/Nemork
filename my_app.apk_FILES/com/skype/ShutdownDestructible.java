package com.skype;

import java.lang.ref.ReferenceQueue;

interface ShutdownDestructible {
    NativeWeakRef<?> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue);
}
