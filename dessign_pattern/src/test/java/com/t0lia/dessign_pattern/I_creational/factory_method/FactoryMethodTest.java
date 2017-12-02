package com.t0lia.dessign_pattern.I_creational.factory_method;

import org.testng.annotations.Test;


public class FactoryMethodTest {
    private void printSomeNewCar(CarSupplier factoryMethod) {
        System.out.println(factoryMethod.get());
    }

    @Test
    public void testMain() {
        printSomeNewCar(new HondaSupplier());
        printSomeNewCar(new MazdaSupplier());
        printSomeNewCar(new MitsubishiSupplier());
    }
}
