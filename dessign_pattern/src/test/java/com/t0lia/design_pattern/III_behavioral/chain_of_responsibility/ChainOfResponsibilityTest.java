package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin.*;

public class ChainOfResponsibilityTest {
    private VendingMachine machine;

    @BeforeMethod
    public void setUp() {
        machine = new VendingMachine();
    }

    @Test
    public void testChainRight() {
        List<Coin> coins = Arrays.asList(ONE_RUBLE, ONE_RUBLE, TWO_RUBLES, TEN_RUBLES);
        int amount = coins.stream().map(machine::put).mapToInt(i -> i).sum();
        System.out.println(amount);
    }

    @Test
    public void testChainSmall() {
        List<Coin> coins = Arrays.asList(ONE_RUBLE, TEN_CENTS, TWO_RUBLES, TEN_RUBLES);
        try {
            int amount = coins.stream().map(machine::put).mapToInt(i -> i).sum();
            System.out.println(amount);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testChainBig() {
        List<Coin> coins = Arrays.asList(ONE_RUBLE, TWO_EURO, TWO_RUBLES, TEN_RUBLES);
        try {
            int amount = coins.stream().map(machine::put).mapToInt(i -> i).sum();
            System.out.println(amount);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
