package com.t0lia.design_pattern.III_behavioral.state;

public class WaitForMoneyState implements State {
    private int money;
    private int sugar;

    public WaitForMoneyState(int money) {
        this.money = money;
    }

    @Override
    public void wait(VendingMachine context) {
        // do nothing
    }

    @Override
    public void putCoin(VendingMachine context, int amount) {
        System.out.println("you put " + amount + "coins");
        money += amount;
    }

    @Override
    public void setSugar(VendingMachine context, int amount) {
        System.out.println("you set " + amount + "sugar");
        sugar = amount;
    }

    @Override
    public void setDrink(VendingMachine context, int cost) {
        if (money < cost) {
            System.out.println("please insert more coins");
        } else {
            System.out.println("Sugar parts " + sugar);
            System.out.println("Drink cost " + cost);
            System.out.println("please take your lost money back " + (money - cost));
            context.setState(new WorkingState());
        }
    }

    @Override
    public void cancel(VendingMachine context) {
        System.out.println("please take your money back " + money);
        context.setState(new EmptyState());
    }
}
