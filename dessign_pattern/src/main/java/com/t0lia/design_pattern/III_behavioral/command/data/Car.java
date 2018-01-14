package com.t0lia.design_pattern.III_behavioral.command.data;

public interface Car {
    void rotateWheelLeft();
    void rotateWheelRight();
    void pressAccelerate();
    void pressBrackets();

    void lowerGear();
    void upperGear();

    // switch to parking
    void start();
    // switch from parking
    void stop();

    void startEngine();
    void stopEngine();
}
