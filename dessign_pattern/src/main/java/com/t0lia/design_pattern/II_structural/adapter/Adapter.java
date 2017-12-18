package com.t0lia.design_pattern.II_structural.adapter;

import com.t0lia.design_pattern.II_structural.adapter.client.solar.SolarBattery;
import com.t0lia.design_pattern.II_structural.adapter.client.wind.WindTurbine;
import com.t0lia.design_pattern.II_structural.decorator.Decorator;

import java.util.Enumeration;

/**
 * <strong>Description</strong>
 * <p>
 * This pattern allow interface of an existing class to be used as another interface.
 * <p/>
 * <strong>Pros:</strong>
 * <ol>
 *      <li>help to integrate with legacy code</li>
 *      <li>can provide multiple adapter</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 * </ol>
 * <p>
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
 * Arrays.asList(array)
 * adapt array to list interface
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
 *     <li>{@link Decorator}- uses to provide same interface with different functionality</li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link SolarBattery}</li>
 *     <li>{@link WindTurbine}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li>{@link java.util.Arrays#asList(Object[])}</li>
 *     <li>{@link java.util.Collections#list(Enumeration)}}</li>
 *     <li>{@link java.io.InputStreamReader}}</li>
 *     <li>{@link java.io.OutputStreamWriter}}</li>
 * </ul>
 * <p>
 */
public interface Adapter { }
