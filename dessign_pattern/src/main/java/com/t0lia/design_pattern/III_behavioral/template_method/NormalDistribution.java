package com.t0lia.design_pattern.III_behavioral.template_method;

import java.util.Random;

public class NormalDistribution extends Distribution {

    private static Random random = new Random();

    @Override
    public int next() {
        return (int) (random.nextGaussian() * 15 + 50);
    }
}
