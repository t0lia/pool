package com.t0lia.design_pattern.III_behavioral.observer.impl;

public class MensHealths extends AbstractObserverable {
    private int edition = 0;

    public void newEdittion() {
        notifyObservers("Mens Health. Edition " + ++edition);
    }

}

