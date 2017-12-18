package com.t0lia.design_pattern.II_structural.adapter.legacy;

public class House {
    public void supply(ElectricitySupplier supplier) {
        supplier.supply();
    }
}
