package com.t0lia.design_pattern.I_creational.singleton.impl;

import com.t0lia.design_pattern.I_creational.singleton.Singleton;

/**
 * static field singleton
 * <pre class="code">
 * ------------------------------
 * lazy                         X
 * thread safe                  V
 * serializable out of the box  X
 * ------------------------------
 * </pre>
 *
 * This {@link Singleton} use static method to access private instance. This implementation is not lazy.
 */
public class StaticMethodSingleton implements Singleton{
    private StaticMethodSingleton() { }

    private static final StaticMethodSingleton INSTANCE = new StaticMethodSingleton();

    public static StaticMethodSingleton getInstance() {
        return INSTANCE;
    }

    public String foo() { return "foo"; }
}
