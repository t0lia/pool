package com.t0lia.design_pattern.III_behavioral.iterator;

/**
 * <strong>Description</strong>
 * <p>
 *     Provides a way to access the elements of an aggregate object without exposing its underlying
 *     representation.
 *     Iterator provide interface. Often use factory method for getting iterator. Iterators are
 *     fail fast (enumerator is fail safe)
 * <p>
 *
 * <strong>Pros:</strong>
 * <ol>
 *     <li>Traverse container</li>
 *     <li>Don't expose internal structure of container</li>
 *     <li>Decouples traverse algorithm</li>
 * </ol>
 *
 * <strong>Cons:</strong>
 * <ol>
 *      <li></li>
 * </ol>
 * <p>
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
 *
 * </code></pre>
 * <p>
 * <strong>Books</strong>
 * <ul>
 *     <li>Effective Java, Joshua Bloch</li>
 *     <li>Design Pattern, GOF</li>
 * </ul>
 *
 * <string>Related patterns</string>
 * <ul>
 *     <li></li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li></li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li>{@link java.util.Iterator}>
 *     <li>{@link java.util.Enumeration}>
 * </ul>
 * <p>
 */
public interface Iterator {
    boolean hasNext();

    String next();
}
