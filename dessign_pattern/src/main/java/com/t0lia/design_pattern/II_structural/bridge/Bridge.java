package com.t0lia.design_pattern.II_structural.bridge;

import com.t0lia.design_pattern.II_structural.bridge.abstraction.Printer;

/**
 * <strong>Description</strong>
 * <p>
 * Decouple an abstraction from its implementation so that the two can vary independently.
 * Pattern should be used when abstraction and implementation should not be bound in compile
 * time and should be independently extensible.
 * <p>
 *
 * <strong>Pros:</strong>
 * <ol>
 *      <li>Useful when abstraction and implementation vary often</li>
 *      <li>Formatter can be selected in runtime</li>
 *
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 *      <li></li>
 * </ol>
 * <p>
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
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
 * <strong>Implementations</strong>
 * <ul>
 *     <li>{@link Printer}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li>{@link java.sql.Driver}</li>
 * </ul>
 * <p>
 */
public interface Bridge {
}
