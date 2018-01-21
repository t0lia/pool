package com.t0lia.design_pattern.III_behavioral.strategy.strategy;

import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <strong>Description</strong>
 * <p>
 * Defines a set of encapsulated algorithms that can be swapped to carry out a specific behaviour
 * <p>
 * <p>
 * <strong>Pros:</strong>
 * <ol>
 * <li>you can use this pattern if you change algorithms in runtime</li>
 * <li>reduce conditional statements</li>
 * <li>externalizes algorithms</li>
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
 * <li>{@link Strategy}</li>
 * <li>{@link BareStrategy}</li>
 * <li>{@link SimpleStrategy}</li>
 * <li>{@link ExtendStrategy}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 * <li>{@link Comparator}</li>
 * </ul>
 * <p>
 */
public interface Strategy {

    default List<Expression> apply(List<String> tokens) {

        List<Expression> output = new ArrayList<>();
        ArrayDeque<Expression> operators = new ArrayDeque<>();

        tokens.forEach(token -> handle(output, operators, token));

        while (!operators.isEmpty()) {
            output.add(operators.pop());
        }
        return output;
    }


    void handle(List<Expression> output, ArrayDeque<Expression> operators, String token);

}
