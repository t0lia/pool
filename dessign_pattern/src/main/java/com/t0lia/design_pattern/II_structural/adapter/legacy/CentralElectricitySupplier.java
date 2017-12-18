package com.t0lia.design_pattern.II_structural.adapter.legacy;

public class CentralElectricitySupplier implements ElectricitySupplier {
    @Override
    public void supply() {
        System.out.println("central supply");
    }
}
