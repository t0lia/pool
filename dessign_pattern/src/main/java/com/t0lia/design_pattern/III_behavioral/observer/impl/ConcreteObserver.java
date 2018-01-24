package com.t0lia.design_pattern.III_behavioral.observer.impl;

public class ConcreteObserver extends AbstractObserver {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String context) {
        System.out.println(name + " :: " + context);
    }


}
