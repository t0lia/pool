package com.t0lia.dessign_pattern.I_creational.singleton.impl;

import com.t0lia.dessign_pattern.I_creational.singleton.Singleton;

/**
 * single check singleton
 * <pre class="code">
 * ------------------------------
 * lazy                         V
 * thread safe                  X
 * serializable out of the box  X
 * </pre>
 *
 * This {@link Singleton} implementation isn't prevent repeated initialization. Using volatile instance
 * our null check is multithread ready, but if block isn't atomic and can interrupt by other thread
 */
public class SCSingleton {
    private SCSingleton() { }

    private static volatile SCSingleton INSTANCE;

    public static SCSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SCSingleton();
        }
        return INSTANCE;
    }
    public String foo() { return "foo"; }
}
