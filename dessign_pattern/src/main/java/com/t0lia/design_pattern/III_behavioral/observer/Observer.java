package com.t0lia.design_pattern.III_behavioral.observer;

import com.t0lia.design_pattern.III_behavioral.observer.impl.AbstractObserver;

/**
 * <strong>Description</strong>
 * <p>
 *     Define one-to-many dependency between objects so that when one object change state, all its dependents
 *     are notified and updated automatically.
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 * <li>reduce coupling between objects</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 * <li>Required explicit registration and deregistration. Can cause memory leaks</li>
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
 * <li>{@link Observer}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 * <li>{@link java.util.Observer}</li>
 * </ul>
 * <p>
 */
public interface Observer {
    interface Listener {
        void fireEvent(String context);
    }

    void handleEvent(String context);

    AbstractObserver.Listener getListener();
}
