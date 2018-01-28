package com.t0lia.design_pattern.III_behavioral.state;

public class WorkingState implements State {

    @Override
    public void wait(VendingMachine context) {
        System.out.println("machine is working ...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignore) {
        }
        System.out.println("your drink is ready");
        context.setState(new EmptyState());
    }

    @Override
    public void putCoin(VendingMachine context, int amount) {
        // do nothing
    }

    @Override
    public void setSugar(VendingMachine context, int amount) {
        // do nothing
    }

    @Override
    public void setDrink(VendingMachine context, int cost) {
        // do nothing
    }

    @Override
    public void cancel(VendingMachine context) {
        // do nothing
    }
}
