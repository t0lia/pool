package com.t0lia.design_pattern.III_behavioral.command.data;

public class LadaGranta implements Car {
    private int gear = 0;

    @Override
    public void rotateWheelLeft() {
        System.out.println("rotateWheelLeft");
    }

    @Override
    public void rotateWheelRight() {
        System.out.println("rotateWheelRight");
    }

    @Override
    public void pressAccelerate() {
        System.out.println("pressAccelerate");
    }

    @Override
    public void pressBrackets() {
        System.out.println("pressBrackets");
    }

    @Override
    public void lowerGear() {
        gear--;
        System.out.println(String.format("lowerGear (%s)", gear));

    }

    @Override
    public void upperGear() {
        gear++;
        System.out.println(String.format("upperGear (%s)", gear));

    }

    @Override
    public void start() {
        System.out.println("start");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }

    @Override
    public void startEngine() {
        System.out.println("startEngine");

    }

    @Override
    public void stopEngine() {
        System.out.println("stopEngine");

    }
}
