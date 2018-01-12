package com.t0lia.design_pattern.III_behavioral.template_method;

import org.testng.annotations.Test;

public class TemplateMethodTest {
    @Test
    public void testTemplateMethod() {
        Distribution normal = new NormalDistribution();
        Distribution uniform = new UniformDistribution();

        System.out.println("====> uniform");
        System.out.println("sum: " + uniform.sum());
        System.out.println("avg: " + uniform.avg());
        System.out.println("min: " + uniform.min());
        System.out.println("max: " + uniform.max());
        System.out.println("dev: " + uniform.dev());
        System.out.println(uniform);

        System.out.println("====> normal");
        System.out.println("sum: " + normal.sum());
        System.out.println("avg: " + normal.avg());
        System.out.println("min: " + normal.min());
        System.out.println("max: " + normal.max());
        System.out.println("dev: " + normal.dev());
        System.out.println(normal);
    }
}