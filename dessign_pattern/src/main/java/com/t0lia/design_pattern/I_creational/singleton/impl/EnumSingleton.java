package com.t0lia.design_pattern.I_creational.singleton.impl;

import com.t0lia.design_pattern.I_creational.singleton.Singleton;

/**
 * Enum singleton implementation
 * <pre class="code">
 * ------------------------------
 * lazy                         X
 * thread safe                  V
 * serializable out of the box  V
 * </pre>
 *
 * {@link Singleton} recomended by J.Bloch implementation. Pros: serilization out of the box. But this implementation is not lazy
 */
public enum EnumSingleton implements Singleton{
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
    public String foo() { return "foo"; }
}
