package com.t0lia.design_pattern.III_behavioral.mediator;

import com.t0lia.design_pattern.III_behavioral.command.Command;
import com.t0lia.design_pattern.III_behavioral.mediator.impl.Bus;

import java.lang.reflect.Method;

/**
 * <strong>Description</strong>
 * <p>
 *     Allows loose coupling by encapsulating the way disparate sets of objects interact
 *     and communicate with each other. Allows for the actions of each object set to vary
 *     independently of one another.
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 * <li>Simplify communication of objects</li>
 * <li>In java it is JMS</li>
 * <li>Can change interaction between objects independently</li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 * <li>Mediator can be very complicated itself</li>
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
 * <li>Often use with {@link Command} pattern</li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 * <li>{@link Bus}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 * <li>{@link Method#invoke(Object, Object...)}</li>
 * <li>JMS</li>
 * </ul>
 * <p>
 */
public interface Mediator {
    void sendMsg(String msg);

    void register(Colleague colleague);

    void unregister(Colleague colleague);
}
