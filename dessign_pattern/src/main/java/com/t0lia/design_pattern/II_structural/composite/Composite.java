package com.t0lia.design_pattern.II_structural.composite;

/**
 * <strong>Description</strong>
 * <p>
 *    Used to implement tree structure. Each node of that tree implement both some interface and
 *    interface which provide add sub node functionality. Implementing the composite pattern allow
 *    client to treat individual objects and composition uniformly
 * <p>
 *
 * <strong>Pros:</strong>
 * <ol>
 *      <li>Components represent part of whole structure</li>
 *      <li>Individual object treated as an Composite</li>
 *      <li>Compose objects into tree structures</li>
 *      <li>Same operations applied on individual and composites</li>
 * </ol>
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
 *     <li>{@link CompositeImpl}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li></li>
 * </ul>
 * <p>
 */
public interface Composite extends Component {

    Composite addChild(Component child);

    void removeChild(int index);

    int size();

    Component getChild(int index);
}
