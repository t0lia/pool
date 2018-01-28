package com.t0lia.design_pattern.III_behavioral.state;


/**
 * <strong>Description</strong>
 * <p>
 *     Allows an object to alter its behaviour when its internal state changes. The object will
 *     appear to change its class
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 * <li>localize state behaviour</li>
 * <li>implement transition from one state to another</li>
 * <li>class per state</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 * <li>keep logic out of context</li>
 * </ol>
 * <p>
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
 * <p>
 * </code></pre>
 * <p>
 * <strong>Books</strong>
 * <ul>
 * <li>Effective Java, Joshua Bloch</li>
 * <li>Design Pattern, GOF</li>
 * </ul>
 * <p>
 * <string>Related patterns</string>
 * <ul>
 * <li></li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 * <li>{@link State}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 * <li></li>
 * </ul>
 * <p>
 */
public interface State {
    void wait(VendingMachine context);

    void putCoin(VendingMachine context, int amount);

    void setSugar(VendingMachine context, int amount);

    void setDrink(VendingMachine context, int cost);

    void cancel(VendingMachine context);

}
