package com.t0lia.dessign_pattern.I_creational.prorotype;

/**
 * <strong>Description</strong>
 * <p>
 * Prototype is design pattern which uses when you need to create object with predefined state. Often for implement that
 * pattern in Java uses clone method.
 * <p>
 * <strong>Shallow copy vs Deep Copy</strong>
 * <p>
 * {@link Cloneable} performs shallow copy. It means that all primitive fields are copied but object fields aren't copied. Deep copy
 * it when all fields are copied and if fields have some internal fields that fields also copied. Deep copy is expensive
 * operation because you can copy a lot of objects. Shallow copy is not so expensive but when you use shallow copy you
 * have to prepared that yours new object can include references to fields of old objects. For implement Deep copy in
 * Java uses interface {@link java.io.Serializable}
 * <p>
 * TODO implement examples of deep and shallow copy
 * <p>
 * <ol>
 *     <li>avoid subclasses in client code. For copy prototype you need only to invoke clone method</li>
 *     <li>avoid overhead of creating objects with constructor</li>
 * </ol>
 * <p>
 * <strong>Cons:</strong>
 * <ol>
 *     <li>not invoke constructor. It can became a cause of a bug</li>
 * </ol>
 *
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
 *      CookieCutter cookie = new CookieCutter(3, STAR);
 *      CookieMachine cookieMachine = new CookieMachine(cookie);
 * </code></pre>
 * <p>
 * <strong>Books</strong>
 * <ul>
 *     <li>Effective Java, Joshua Bloch</li>
 *     <li>Design Pattern, GOF</li>
 * </ul>
 *
 * <strong>Related patterns</strong>
 * <ul></ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link CookieCutter}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul><li>{@link Cloneable} interface</li></ul>
 * <p>
 **/
public interface Prototype {
}
