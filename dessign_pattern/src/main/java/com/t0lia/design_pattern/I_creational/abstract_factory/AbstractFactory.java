package com.t0lia.design_pattern.I_creational.abstract_factory;

import com.t0lia.design_pattern.I_creational.factory_method.FactoryMethod;

/**
 * <strong>Description</strong>
 * <p>
 * Creates groups of objects without specified concrete classes. Used in plugin architecture
 * Every class of that group represents as {@link FactoryMethod}. Client work with concrete instance
 * of AbstractFactory using interface and doesn't know which concrete instance use.
 * <p>
 * <pre class="code">
 * <strong>Pros:</strong>
 * <ul>
 *     <li>Application become independent of how it object created</li>
 *     <li>Class become independent of how objects it required created</li>
 *     <li>Creating families of related or dependent objects</li>
 * </ul>
 * <p>
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
 * <li>Effective Java, Joshua Bloch</li>
 * <li>Design Pattern, GOF</li>
 * </ul>
 * <p>
 * <string>Related patterns</string>
 * <ul>{@link FactoryMethod} - simple case with only one provided class</ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul><li>jdbc connection</li></ul>
 * <p>
 **/
public interface AbstractFactory {
}

