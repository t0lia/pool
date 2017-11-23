package com.t0lia.dessign_pattern.I_creational.singleton;

import com.t0lia.dessign_pattern.I_creational.singleton.impl.*;

/**
 * <strong>Description</strong>
 * <p>
 * Singleton - creation template. Allow one instance per application. Also this template use as
 * example of anti pattern because of it overused
 * <p>
 *
 * <strong>Pros:</strong>
 * <ol>
 *      <li>allow to create only one instance for application</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 *      <li>high coupling</li>
 *      <li>hard to test</li>
 *      <li>problems with multiple class loaders</li>
 * </ol>
 * <p>
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
 * Singleton instance = Singleton.getInstance();
 * </code></pre>
 * <p>
 * <strong>Books</strong>
 * <ul>
 *     <li>Effective Java, Joshua Bloch</li>
 *     <li>Design Pattern, GOF</li>
 * </ul>
 *
 * <p/>
 * <strong>Related patterns</strong>
 * <p/>
 * ---
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link StaticFieldSingleton}</li>
 *     <li>{@link StaticMethodSingleton}</li>
 *     <li>{@link EnumSingleton}</li>
 *     <li>{@link ODHSingleton}</li>
 *     <li>{@link SyncAccessorSingleton}</li>
 *     <li>{@link SCSingleton}</li>
 *     <li>{@link DCLSingleton}</li>
 * </ul>
 * <p/>
 * <strong>Improvements</strong>
 * <p/>
 * ---
 * <p/>
 * <strong>JDK examples:</strong>
 * <p/>
 * <ul>
 *     <li>{@link java.lang.Runtime}</li>
 *     <li>{@link java.lang.System}</li>
 * </ul>
 * <p>
 */
public interface Singleton { }
