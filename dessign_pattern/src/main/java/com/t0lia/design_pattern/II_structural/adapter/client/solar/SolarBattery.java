package com.t0lia.design_pattern.II_structural.adapter.client.solar;

import com.t0lia.design_pattern.II_structural.adapter.legacy.ElectricitySupplier;
import com.t0lia.design_pattern.II_structural.decorator.Decorator;

public class SolarBattery implements ElectricitySupplier, Decorator {
    private Sun sun;

    public SolarBattery(Sun sun) {
        this.sun = sun;
    }

    @Override
    public void supply() {
        sun.shine();
    }
}
