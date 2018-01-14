package com.t0lia.design_pattern.III_behavioral.command;


/**
 * <strong>Description</strong>
 * <p>
 *     Encapsulating request as an object, thereby letting you parametrize clients with different
 *     requests, queue or log requests, and support undoable operations
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 *      <li>history of command</li>
 *      <li>repeat and revert command</li>
 *      <li>can execute on several clients implementation</li>
 *      <li>can union several command as macro</li>
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
 *      <li>Effective Java, Joshua Bloch</li>
 *      <li>Design Pattern, GOF</li>
 * </ul>
 * <p>
 * <string>Related patterns</string>
 * <ul>
 * <li></li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link SelfDriver}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *      <li>{@link Runnable}</li>
 * </ul>
 * <p>
 */
public interface Command {
}
