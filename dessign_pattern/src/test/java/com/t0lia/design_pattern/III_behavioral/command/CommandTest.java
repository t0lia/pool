package com.t0lia.design_pattern.III_behavioral.command;

import com.t0lia.design_pattern.III_behavioral.command.data.Car;
import com.t0lia.design_pattern.III_behavioral.command.data.LadaGranta;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.t0lia.design_pattern.III_behavioral.command.SelfDriver.*;

public class CommandTest {
    private SelfDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        Car lada = new LadaGranta();
        driver = new SelfDriver(lada);
    }

    @Test
    public void testCommand() throws Exception {
        System.out.println("=== box parking ===");
        driver.exec(START_ENGINE);
        driver.exec(BOX_PARKING);
        driver.exec(STOP_ENGINE);
    }

    @Test
    public void testParallelParking() throws Exception {
        System.out.println("=== parallel parking ===");
        driver.exec(START_ENGINE);
        driver.exec(PARALLEL_PARKING);
        driver.exec(STOP_ENGINE);
        System.out.println("last commands:");
        driver.repeatLast();
    }

    @Test
    public void testTurnBack() throws Exception {
        System.out.println("=== turn back ===");
        driver.exec(START_ENGINE);
        driver.exec(TURN_BACK);
        driver.exec(STOP_ENGINE);
        System.out.println("all commands:");
        driver.repeatAll();
    }
}