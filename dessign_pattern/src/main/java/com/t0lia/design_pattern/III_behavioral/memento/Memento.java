package com.t0lia.design_pattern.III_behavioral.memento;


/**
 * <strong>Description</strong>
 * <p>
 *     Without violating encapsulation, capture and externalize an object's internal
 *     state so that the object can be restored to this state later."
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 * <li>provide undo mechanism in your application</li>
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
 * <li>{@link Memento}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 * <li>{@link java.io.Serializable}</li>
 * </ul>
 * <p>
 */
public class Memento {
    public final long snd;
    public final long fst;

    @Override
    public String toString() {
        return "";
    }

    public Memento(long fst, long snd) {
        this.fst = fst;
        this.snd = snd;
    }
}
