package com.t0lia.design_pattern.I_creational.factory_method;

import com.t0lia.design_pattern.I_creational.abstract_factory.AbstractFactory;

import java.util.Calendar;

/**
 * <strong>Description</strong>
 * <p>
 * Create a object without specifying exact class. This method can be overridden rather that calling constructor
 * <p>
 * <pre class="code">
 * <strong>Pros:</strong>
 * <ul>
 *      <li>Child classes can override method rather than constructor</li>
 * </ul>
 * <strong>Cons:</strong>
 * <ul>
 * <ol></ol>
 * </ul>
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
 * <ul><li>{@link AbstractFactory} - creates a group of related object. Each creation method is a factory method</li></ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>{@link Calendar#getInstance()}</ul>
 * <ul>{@link java.util.EnumSet#of()}</ul>
 * <p>
 */
public interface FactoryMethod {
}
