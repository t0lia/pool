package com.t0lia.design_pattern.I_creational.singleton.impl;

import com.t0lia.design_pattern.I_creational.singleton.Singleton;

/**
 * On demand holder singleton
 * <pre class="code">
 * ------------------------------
 * lazy                         V
 * thread safe                  V
 * serializable out of the box  X
 * </pre>
 *
 * On demand holder idiom. Use ideas what {@link Singleton} init when client trying access inner class aka Holder.
 * In case accessing Singleton class INSTANCE is not initialized.
 */
public class ODHSingleton implements Singleton{

    public static ODHSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final ODHSingleton INSTANCE = new ODHSingleton();

    }
    public String foo() { return "foo"; }
}
