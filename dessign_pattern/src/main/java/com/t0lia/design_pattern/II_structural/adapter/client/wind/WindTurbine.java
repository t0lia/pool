package com.t0lia.design_pattern.II_structural.adapter.client.wind;

import com.t0lia.design_pattern.II_structural.adapter.Adapter;
import com.t0lia.design_pattern.II_structural.adapter.legacy.ElectricitySupplier;

public class WindTurbine implements ElectricitySupplier, Adapter {
    private Wind wind;

    public WindTurbine(Wind wind) {
        this.wind = wind;
    }

    @Override
    public void supply() {
       wind.blow();
    }
}
