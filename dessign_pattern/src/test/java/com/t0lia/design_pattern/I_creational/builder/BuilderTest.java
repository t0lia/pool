package com.t0lia.design_pattern.I_creational.builder;

import org.testng.annotations.Test;

public class BuilderTest {
    @Test public void test() {
        Coffee americano  = new Coffee.CoffeeBuilder(2).water(3).build();
        Coffee espresso   = new Coffee.CoffeeBuilder(1).build();
        Coffee cappuccino = new Coffee.CoffeeBuilder(2).milk(2).foamedMilk(2).build();
        Coffee latte      = new Coffee.CoffeeBuilder(2).milk(10).build();

        System.out.println("americano recipe:  " + americano);
        System.out.println("espresso recipe:   " + espresso);
        System.out.println("cappuccino recipe: " + cappuccino);
        System.out.println("latte recipe:      " + latte);
    }
}
