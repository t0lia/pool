package com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl;


import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;

import java.util.Deque;

import static java.lang.Integer.parseInt;

public class NumberExpression implements Expression {

    public static boolean check(String token) {
        try {
            parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private int value;

    @Override
    public void resolve(Deque<Integer> stack) {
        stack.push(value);
    }

    public NumberExpression(String token) {
        value = parseInt(token);
    }
}
