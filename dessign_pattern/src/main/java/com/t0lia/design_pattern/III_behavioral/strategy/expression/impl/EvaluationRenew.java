package com.t0lia.design_pattern.III_behavioral.strategy.expression.impl;


import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;
import com.t0lia.design_pattern.III_behavioral.strategy.strategy.SimpleStrategy;
import com.t0lia.design_pattern.III_behavioral.strategy.strategy.Strategy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static java.util.Arrays.asList;

public class EvaluationRenew implements Expression {

    private static final Strategy DEFAULT_STRATEGY = new SimpleStrategy();

    private final Strategy strategy;
    private List<Expression> postfix;

    public EvaluationRenew(String input, Strategy strategy) {
        this.strategy = strategy;
        postfix = extract(asList(input.split(" ")));
    }

    public EvaluationRenew(String input) {
        this(input, DEFAULT_STRATEGY);
    }

    private List<Expression> extract(List<String> tokens) {
        return strategy.apply(tokens);
    }

    @Override
    public void resolve(Deque<Integer> stack) {
        postfix.forEach(expression -> expression.resolve(stack));
    }

    public int resolve() {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        resolve(stack);
        return stack.pop();
    }
}
