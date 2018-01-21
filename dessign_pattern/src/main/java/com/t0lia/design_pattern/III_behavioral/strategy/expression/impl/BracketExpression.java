package com.t0lia.design_pattern.III_behavioral.strategy.expression.impl;

import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;

import java.util.Deque;
import java.util.stream.Stream;

public enum BracketExpression implements Expression {
    LEFT_BRACKET;

    @Override
    public void resolve(Deque<Integer> stack) {

    }


    public static boolean check(String token) {
        return Stream.of("(", ")").anyMatch(token::equals);
    }
}
