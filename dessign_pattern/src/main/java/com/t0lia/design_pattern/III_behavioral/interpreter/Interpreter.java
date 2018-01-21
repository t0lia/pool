package com.t0lia.design_pattern.III_behavioral.interpreter;

import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.Evaluation;

import java.util.regex.Pattern;

/**
 * <strong>Description</strong>
 * <p>
 * Given a language, define a representation for its grammar along with an interpreter
 * that uses the representation to interpret sentences in the language.
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 * <li>Use when you are working with grammar which can be represented as a syntax tree</li>
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
 * <li>Composite often used to represent syntax tree produced by interpreter</li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 * <li>{@link Evaluation}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 * <li>{@link Pattern}</li>
 * </ul>
 * <p>
 */
public interface Interpreter {
}
