package com.t0lia.design_pattern.II_structural.adapter;

import com.t0lia.design_pattern.II_structural.adapter.client.solar.SolarBattery;
import com.t0lia.design_pattern.II_structural.adapter.client.solar.Sun;
import com.t0lia.design_pattern.II_structural.adapter.client.wind.Wind;
import com.t0lia.design_pattern.II_structural.adapter.client.wind.WindTurbine;
import com.t0lia.design_pattern.II_structural.adapter.legacy.CentralElectricitySupplier;
import com.t0lia.design_pattern.II_structural.adapter.legacy.House;
import org.testng.annotations.Test;

public class AdapterTest {
    @Test
    public void testAdapter() {
        House house1 = new House();
        SolarBattery supplier = new SolarBattery(Sun.INSTANCE);
        house1.supply(supplier);

        House house2 = new House();
        house1.supply(new WindTurbine(Wind.INSTANCE));

        House house3 = new House();
        house1.supply(new CentralElectricitySupplier());

    }
}