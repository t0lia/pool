package com.t0lia.design_pattern.II_structural.facade;

import org.testng.annotations.Test;

public class FacadeTest {
    @Test
    public void testTurnOn() {
        Laptop laptop = new Laptop(
                () -> System.out.println("display light"),
                () -> System.out.println("battery discharged"),
                () -> System.out.println("cooler blow")
        );
        laptop.turnOn();
    }
}