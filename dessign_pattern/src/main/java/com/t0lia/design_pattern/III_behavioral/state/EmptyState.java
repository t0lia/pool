package com.t0lia.design_pattern.III_behavioral.state;

public class EmptyState implements State {
    @Override
    public void wait(VendingMachine context) {
        // do nothing
    }

    @Override
    public void putCoin(VendingMachine context, int amount) {
        System.out.println("you put " + amount + "coins");
        context.setState(new WaitForMoneyState(amount));
    }

    @Override
    public void setSugar(VendingMachine context, int amount) {
        System.out.println("please insert coin");
    }

    @Override
    public void setDrink(VendingMachine context, int cost) {
        System.out.println("please insert coin");
    }

    @Override
    public void cancel(VendingMachine context) {
        // do nothing
    }
}
