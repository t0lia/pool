package com.t0lia.design_pattern.III_behavioral.state;

import org.testng.annotations.Test;

public class StateTest {

    @Test
    public void testState() {
        VendingMachine machine = new VendingMachine();

        machine.putCoin(20);
        machine.putCoin(20);
        machine.putCoin(50);
        machine.setSugar(3);
        machine.setDrink(80);
        machine.waitThreeSeconds();
    }
}