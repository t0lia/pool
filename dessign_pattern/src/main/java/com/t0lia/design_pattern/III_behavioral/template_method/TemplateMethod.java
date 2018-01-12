package com.t0lia.design_pattern.III_behavioral.template_method;

/**
 * <strong>Description</strong>
 * <p>
 *    Define the skeleton of an algorithm in a method, deferring some steps to subclasses.
 *    Template method lets subclasses redefine certain steps of an algorithm without changing
 *    the algorithm structure
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 *      <li>Letting subclasses implement behaviour through overriding</li>
 *      <li>avoid code duplication implementing variations of algorithms in subclasses</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 * <li></li>
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
 *      <li>{@link Distribution#avg()}</li>
 *      <li>{@link Distribution#min()}</li>
 *      <li>{@link Distribution#dev()}</li>
 *      <li>...</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *      <li>{@link java.util.AbstractMap}</li>
 *      <li>{@link java.io.InputStream}</li>
 *      <li>{@link java.io.OutputStream}</li>
 * </ul>
 * <p>
 */
public interface TemplateMethod { }
