package com.t0lia.design_pattern.III_behavioral.strategy.strategy;


import com.t0lia.design_pattern.III_behavioral.interpreter.expression.Expression;
import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.NumberExpression;
import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.OperatorExpression;

import java.util.ArrayDeque;
import java.util.List;

/**
 * Convert from input to postfix notation without precendence for +, -, *
 */
public class BareStrategy implements Strategy {

    public void handle(List<Expression> output, ArrayDeque<Expression> operators, String token) {
        if (NumberExpression.check(token)) {
            NumberExpression number = new NumberExpression(token);
            output.add(number);
        } else if (OperatorExpression.check(token)) {
            OperatorExpression operator = OperatorExpression.of(token);
            operators.push(operator);
        }
    }
}
