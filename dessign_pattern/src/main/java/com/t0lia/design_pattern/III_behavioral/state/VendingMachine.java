package com.t0lia.design_pattern.III_behavioral.state;

public class VendingMachine {

    public VendingMachine() {
        state = new EmptyState();
    }


    public void setState(State state) {
        this.state = state;
    }

    private State state;

    public void waitThreeSeconds() {
        state.wait(this);
    }

    public void putCoin(int amount) {
        state.putCoin(this, amount);
    }

    public void setSugar(int amount) {
        state.setSugar(this, amount);
    }

    public void setDrink(int cost) {
        state.setDrink(this, cost);

    }

    public void cancel() {
        state.cancel(this);
    }
}
