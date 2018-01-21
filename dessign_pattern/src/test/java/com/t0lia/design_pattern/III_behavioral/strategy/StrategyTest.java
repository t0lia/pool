package com.t0lia.design_pattern.III_behavioral.strategy;

import com.t0lia.design_pattern.III_behavioral.strategy.expression.impl.EvaluationRenew;
import com.t0lia.design_pattern.III_behavioral.strategy.strategy.BareStrategy;
import com.t0lia.design_pattern.III_behavioral.strategy.strategy.ExtendStrategy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StrategyTest {
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
   public void testStrategy(String intput, int expected) {
        EvaluationRenew evaluation = new EvaluationRenew(intput);
        int actual = evaluation.resolve();
        Assert.assertEquals(expected, actual);
    }

    @DataProvider(name = "dataEvaluationBare")
    public static Object[][] dataEvaluationBare() {
        return new Object[][]{
                {"12", 12},
                {"1 + 2", 3},
                {"3 * 1 + 2", 9},
                {"1 + 2 * 3", 7},
        };
    }

    @Test(dataProvider = "dataEvaluationBare")
    public void testStrategyI(String intput, int expected) {
        EvaluationRenew evaluation = new EvaluationRenew(intput, new BareStrategy());
        int actual = evaluation.resolve();
        Assert.assertEquals(expected, actual);
    }

    @DataProvider(name = "dataEvaluationExtend")
    public static Object[][] dataEvaluationExtend() {
        return new Object[][]{
                {"12", 12},
                {"1 + 2", 3},
                {"3 * 1 + 2", 5},
                {"1 + 2 * 3", 7},
                {"( 1 + 2 ) * 3", 9},
                {"3 * ( 1 + 2 )", 9},
        };
    }

    @Test(dataProvider = "dataEvaluationExtend")
    public void testStrategyII(String intput, int expected) {
        EvaluationRenew evaluation = new EvaluationRenew(intput, new ExtendStrategy());
        int actual = evaluation.resolve();
        Assert.assertEquals(expected, actual);
    }
}