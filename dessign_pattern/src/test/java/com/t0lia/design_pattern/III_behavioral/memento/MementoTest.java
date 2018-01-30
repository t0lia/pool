package com.t0lia.design_pattern.III_behavioral.memento;

import org.testng.annotations.Test;

import static java.lang.Integer.MAX_VALUE;

public class MementoTest {

    @Test
    public void testName() {
        Originator originator = new Originator("fst");

        CareTaker careTaker = new CareTaker();
        while (originator.next() < MAX_VALUE) {
            careTaker.add(originator.memento());
        }

        printState(originator, careTaker, 200);
        printState(originator, careTaker, 1200);
        printState(originator, careTaker, MAX_VALUE/2);
    }

    public void printState(Originator originator, CareTaker careTaker, int i) {
        System.out.println(Integer.toString(i) + " " + originator.revert(careTaker.get(i)));
    }
}