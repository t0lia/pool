package com.t0lia.design_pattern.III_behavioral.interpreter.expression;

import java.util.Deque;

public interface Expression {

    default boolean isOperator() {
        return false;
    }

    void resolve(Deque<Integer> stack);
}
