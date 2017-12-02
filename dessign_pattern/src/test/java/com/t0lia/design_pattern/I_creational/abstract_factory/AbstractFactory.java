package com.t0lia.design_pattern.I_creational.abstract_factory;

import org.testng.annotations.Test;

public class AbstractFactory {
    private void test(AbstractCarFactory factory){
        factory.newBody();
        factory.newEngine();
        factory.newWheel();
    }
    @Test
    public void factoryTest () {
        test(new MazdaFactory());
        test(new HondaFactory());
    }
}
