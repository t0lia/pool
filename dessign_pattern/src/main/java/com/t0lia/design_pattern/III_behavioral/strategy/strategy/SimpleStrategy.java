package com.t0lia.design_pattern.III_behavioral.strategy.strategy;


import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;
import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.NumberExpression;
import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.OperatorExpression;

import java.util.ArrayDeque;
import java.util.List;

/**
 * Convert from input to postfix notation with precedence for +, -, *
 */
public class SimpleStrategy implements Strategy {

    public void handle(List<Expression> output, ArrayDeque<Expression> operators, String token) {
        if (NumberExpression.check(token)) {
            NumberExpression number = new NumberExpression(token);
            output.add(number);
        } else if (OperatorExpression.check(token)) {
            OperatorExpression operator = OperatorExpression.of(token);

            while (!operators.isEmpty()
                    && operators.peek()!=null
                    && operators.peek().isOperator()
                    && ((OperatorExpression) operators.peek()).precedence() > operator.precedence()
                    ) {
                output.add(operators.pop());
            }
            operators.push(operator);
        }

    }

}
