package com.t0lia.design_pattern.II_structural.facade;

public class Laptop implements Facade {
    private final Display display;
    private final Battery battery;
    private final Cooler cooler;

    public Laptop(Display display, Battery battery, Cooler Cooler) {
        this.display = display;
        this.battery = battery;
        this.cooler = Cooler;
    }

    public void turnOn() {
        display.light();
        battery.discharge();
        cooler.blow();
    }

}
