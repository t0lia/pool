package com.t0lia.design_pattern.III_behavioral.interpreter;

import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.Evaluation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InterpreterTest {
    @DataProvider(name = "dataEvaluationDefault")
    public static Object[][] dataEvaluationDefault() {
        return new Object[][]{
                {"12", 12},
                {"1 + 2", 3},
                {"3 * 1 + 2", 5},
                {"1 + 2 * 3", 7},
        };
    }

    @Test(dataProvider = "dataEvaluationDefault")
    public void testInterpreter(String intput, int expected) {
        Evaluation evaluation = new Evaluation(intput);
        int actual = evaluation.resolve();
        Assert.assertEquals(expected, actual);
    }
}