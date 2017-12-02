package com.t0lia.dessign_pattern.I_creational.abstract_factory;

import com.t0lia.dessign_pattern.I_creational.abstract_factory.data.Body;
import com.t0lia.dessign_pattern.I_creational.abstract_factory.data.Engine;
import com.t0lia.dessign_pattern.I_creational.abstract_factory.data.Whell;

/**
 * <strong>Description</strong>
 * <p>
 * <p>
 * <pre class="code">
 * <strong>Pros:</strong>
 * <ol></ol>
 * <strong>Cons:</strong>
 * <ol></ol>
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
 * <string>Родственные шаблоны</string>
 * <ul></ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul></ul>
 * <p>
**/
public interface AbstractCarFactory {
    Whell newWheel();
    Engine newEngine();
    Body newBody();
}

