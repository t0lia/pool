package com.t0lia.design_pattern.III_behavioral.strategy.strategy;

import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;
import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.NumberExpression;
import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.OperatorExpression;
import com.t0lia.design_pattern.III_behavioral.strategy.expression.impl.BracketExpression;

import java.util.ArrayDeque;
import java.util.List;

import static com.t0lia.design_pattern.III_behavioral.strategy.expression.impl.BracketExpression.LEFT_BRACKET;

/**
 * Convert from input to postfix notation with precedence for +, -, *, (, )
 */
public class ExtendStrategy implements Strategy {
    @Override
    public void handle(List<Expression> output, ArrayDeque<Expression> operators, String token) {
        if (NumberExpression.check(token)) {
            NumberExpression number = new NumberExpression(token);
            output.add(number);
        } else if (OperatorExpression.check(token)) {
            OperatorExpression operator = OperatorExpression.of(token);

            while (!operators.isEmpty()
                    && operators.peek()!= null
                    && operators.peek().isOperator()
                    && ((OperatorExpression) operators.peek()).precedence() > operator.precedence()) {
                output.add(operators.pop());
            }
            operators.push(operator);
        } else if (BracketExpression.check(token)) {

            if ("(".equals(token)) {

                operators.push(LEFT_BRACKET);

            } else if (")".equals(token)) {

                while (!operators.isEmpty()
                        && operators.peek()!= null
                        && operators.peek().isOperator()) {
                    output.add(operators.pop());
                }
                operators.pop();

            }
        }
    }
}
