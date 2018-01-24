package com.t0lia.design_pattern.III_behavioral.observer.impl;

public class RollingStones extends AbstractObserverable {

    private int edition = 0;

    public void newEdittion() {
        notifyObservers("Rolling Stones. Edition " + ++edition);
    }


}

