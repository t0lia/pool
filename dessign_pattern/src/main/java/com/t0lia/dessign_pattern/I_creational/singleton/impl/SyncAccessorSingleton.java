package com.t0lia.dessign_pattern.I_creational.singleton.impl;

import com.t0lia.dessign_pattern.I_creational.singleton.Singleton;

/**
 * synchronized accessor singleton
 *
 * <pre class="code">
 * lazy                         V
 * thread safe                  V
 * serializable out of the box  X
 * </pre>
 *
 * Synchronized accessor {@link Singleton} use synchronized method in instance initialization.
 * Used private lock which not allow client to lock on class
 */
public class SyncAccessorSingleton {
    private final static Object lock = new Object();
    private static SyncAccessorSingleton instance;

    public static SyncAccessorSingleton getInstance() {
        synchronized (lock) {
            if (instance == null) {
                return instance = new SyncAccessorSingleton();
            } else {
                return instance;
            }
        }
    }
    public String foo() { return "foo"; }
}
