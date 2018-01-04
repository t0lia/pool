package com.t0lia.design_pattern.II_structural.decorator;

import com.t0lia.design_pattern.II_structural.adapter.Adapter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * <strong>Description</strong>
 *
 * <p>
 * Allows for the dynamic wrapping of objects in order to modify their existing responsibilities and behaviour.
 * Alternatives for creation a subclass. But in case of creation subclass not possible to create a lot implementation.
 * Use Decorator pattern when you need to dynamically modify behaviour.
 * <p>
 *
 * <strong>Pros:</strong>
 * <ol>
 *      <li>Decouple implementation from responsibilities and behaviours</li>
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
 *     <li>{@link Adapter} - change interface, but not change behaviour</li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link QuoteDecorator}</li>
 *     <li>{@link AngleBracketDecorator}</li>
 *     <li>{@link SquareBracketDecorator}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li> {@link Collections#checkedList(List, Class)}</li>
 *     <li> {@link Collections#checkedSet(Set, Class)} }</li>
 *     <li> {@link Collections#checkedCollection(Collection, Class)} </li>
 *     <li> --- </li>
 *     <li> {@link Collections#synchronizedList(List)} } </li>
 *     <li> {@link Collections#synchronizedSet(Set)} } </li>
 *     <li> {@link Collections#synchronizedCollection(Collection)} </li>
 *     <li> --- </li>
 *     <li> {@link BufferedInputStream} </li>
 *     <li> {@link BufferedOutputStream}  </li>
 *     <li> {@link GZIPInputStream} </li>
 *     <li> {@link GZIPOutputStream} </li>
 * </ul>
 * <p>
 */
public interface Decorator {
}
