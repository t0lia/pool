package com.t0lia.design_pattern.III_behavioral.visitor;

import com.t0lia.design_pattern.III_behavioral.visitor.good.Camera;
import com.t0lia.design_pattern.III_behavioral.visitor.good.Laptop;
import com.t0lia.design_pattern.III_behavioral.visitor.good.Phone;

import java.nio.file.FileVisitor;

/**
 * <strong>Description</strong>
 * <p>
 *     Allows for one or more operation to be applied to a set of objects at runtime, decoupling
 *     the operations from the object structure
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 * <li>valuable if you want decouple some logical code from the elements</li>
 * <li>valuable if you have to perform a number of unrelated operations across the classes</li>
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
 * <li>{@link Visitor}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 * <li>{@link FileVisitor}</li>
 * </ul>
 * <p>
 */
public interface Visitor {
    int getTotal();

    void visit(Camera camera);

    void visit(Phone phone);

    void visit(Laptop laptop);
}
