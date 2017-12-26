package com.t0lia.design_pattern.II_structural.flyweight;
/**
 * <strong>Description</strong>
 * <p>
 * Flyweight using to minimize memory usage. Often state of object consist from two part extrinsic state and intrinsic
 * state. Intrinsic data make object unique. Extrinsic data can be passed to another object. If you cat made some data
 * of object extrinsic you can use flyweight. Extrinsic data have to be immutable because that data shared across
 * several objects and this object don't have permission to change this data.
 * <p>
 *
 * <strong>Pros:</strong>
 * <ol>
 *      <li>Minimize memory usage in case of using a lot similar objects with high cost</li>
 *      <li>Use pool to get access to objects</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 *      <li>A little bit complex</li>
 * </ol>
 * <p>
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
 *     {@link Library#getByTitle(String)}
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
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link Book}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li>{@link java.lang.Integer#valueOf(int)}</li>
 *     <li>{@link java.lang.String}</li>
 * </ul>
 * <p>
 */
public interface Flyweight {
}
