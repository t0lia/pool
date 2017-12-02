package com.t0lia.design_pattern.I_creational.singleton.impl;

import com.t0lia.design_pattern.I_creational.singleton.Singleton;

/**
 * Double check locking singleton
 * <pre class="code">
 * ------------------------------
 * lazy                         V
 * thread safe                  V
 * serializable out of the box  X
 * </pre>
 *
 * Classic Double Check Lock {@link Singleton}. Has three main feature:
 * <ol>
 *     <li>use private lock for prevent locking by client</li>
 *     <li>two step check: first common check, second check in monitor</li>
 *     <li>INSTANCE is volatile. Because without volatile first check is not determied in multithreading environment</li>
 * </ol>
 */
public class DCLSingleton {
    private DCLSingleton() { }

    private static volatile DCLSingleton INSTANCE;
    private static final Object lock = new Object();

    public static DCLSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (lock) {
                if (INSTANCE == null) {
                    INSTANCE = new DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }
    public String foo() { return "foo"; }
}
