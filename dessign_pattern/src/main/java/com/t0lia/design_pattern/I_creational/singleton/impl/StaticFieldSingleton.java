package com.t0lia.design_pattern.I_creational.singleton.impl;

import com.t0lia.design_pattern.I_creational.singleton.Singleton;

/**
 * static field singleton
 * <pre class="code">
 * ------------------------------
 * lazy                         X
 * thread safe                  V
 * serializable out of the box  X
 * </pre>
 *
 * Common implementation of {@link Singleton}. Use public static field to store instance
 */
public class StaticFieldSingleton implements Singleton{
    private StaticFieldSingleton() { }

    public static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();

    public String foo() { return "foo"; }
}
