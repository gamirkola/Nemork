package com.skype;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;

class ShutdownManager {

    private final Set<NativeWeakRef<?>> referencesSet = Collections
            .newSetFromMap(new ConcurrentHashMap<NativeWeakRef<?>, Boolean>());

    private final ReferenceQueue<ShutdownDestructible> queue = new ReferenceQueue<ShutdownDestructible>();

    private Thread thread = new Thread("ShutdownManager") {
        public void run() {
            while (true) {
                NativeWeakRef<? extends ShutdownDestructible> reference;
                try {
                    reference = (NativeWeakRef<? extends ShutdownDestructible>) queue.remove();
                    referencesSet.remove(reference);
                    reference.destroyNativeObject();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    };

    private ShutdownManager() {
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.setDaemon(true);
        thread.start();
    }

    private static volatile ShutdownManager instance;

    public static ShutdownManager getInstance() {
        if (instance == null) {
            synchronized (ShutdownManager.class) {
                if (instance == null)
                    instance = new ShutdownManager();
            }
        }
        return instance;
    }

    public void addDestructibleObject(ObjectInterfaceFactory factory, ShutdownDestructible destructible) {
        referencesSet.add(destructible.createNativeWeakRef(factory, queue));
    }

}
