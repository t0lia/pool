package com.t0lia.design_pattern.II_structural.proxy;

import com.t0lia.design_pattern.II_structural.decorator.Decorator;

/**
 * <strong>Description</strong>
 * <p>
 * Allows for object level access control by acting as a pass through entity or placeholder object
 * <p>
 *
 * <strong>Pros:</strong>
 * <ol>
 *      <li>Implement the same interface as real object</li>
 *      <li>Useful when you want to implement same logic on bunch of methods</li>
 *      <li>Useful when you want to control access to an object</li>
 *      <li>Provide additional functionality when accessing real object</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
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
 *     <li>{@link Decorator} use when you need to dynamically change behaviour</li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link }</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li>{@link java.lang.reflect.Proxy}</li>
 * </ul>
 * <p>
 */
public interface Proxy {
}
