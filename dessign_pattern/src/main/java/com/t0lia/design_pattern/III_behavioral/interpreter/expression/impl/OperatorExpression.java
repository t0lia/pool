package com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl;


import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;

import java.util.Deque;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public enum OperatorExpression implements Expression {
    PLS((x, y) -> x + y, 0),
    MIN((x, y) -> x - y, 0),
    MUL((x, y) -> x * y, 1);

    private static Map<String, OperatorExpression> ops = Map.of("-", MIN, "+", PLS, "*", MUL);

    private int precedence;
    private Consumer<Deque<Integer>> command;

    public int precedence() {
        return precedence;
    }

    OperatorExpression(BinaryOperator<Integer> op, int precedence) {
        this.precedence = precedence;
        command = stack -> stack.push(op.apply(stack.pop(), stack.pop()));
    }

    @Override
    public boolean isOperator() {
        return true;
    }

    @Override
    public void resolve(Deque<Integer> stack) {
        command.accept(stack);
    }

    public static boolean check(String token) {
        return ops.keySet().stream().anyMatch(token::equals);
    }

    public static OperatorExpression of(String token) {
        return ops.get(token);
    }

}
