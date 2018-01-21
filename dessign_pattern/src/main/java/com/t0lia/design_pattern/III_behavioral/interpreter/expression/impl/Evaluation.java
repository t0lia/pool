package com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl;


import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static java.util.Arrays.asList;

public class Evaluation implements Expression {

    private List<Expression> postfix;

    public Evaluation(String input) {
        postfix = extract(asList(input.split(" ")));
    }

    private List<Expression> extract(List<String> tokens) {

        List<Expression> output = new ArrayList<>();
        ArrayDeque<Expression> operators = new ArrayDeque<>();

        tokens.forEach(token -> {
                    if (OperatorExpression.check(token)) {
                        OperatorExpression operator = OperatorExpression.of(token);

                        while (!operators.isEmpty()
                                && operators.peek() != null
                                && operators.peek().isOperator()
                                && ((OperatorExpression) operators.peek()).precedence() > operator.precedence()
                                ) {
                            output.add(operators.pop());
                        }
                        operators.push(operator);
                    } else if (NumberExpression.check(token)) {
                        NumberExpression number = new NumberExpression(token);
                        output.add(number);
                    }
                }
        );

        while (!operators.isEmpty()) {
            output.add(operators.pop());
        }
        return output;
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
