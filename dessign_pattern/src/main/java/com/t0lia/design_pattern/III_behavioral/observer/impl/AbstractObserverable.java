package com.t0lia.design_pattern.III_behavioral.observer.impl;

import com.t0lia.design_pattern.III_behavioral.observer.Observerable;

import java.util.ArrayList;
import java.util.List;

public class AbstractObserverable implements Observerable {
    private List<AbstractObserver.Listener> listeners = new ArrayList<>();

    @Override
    public void notifyObservers(String context) {
        listeners.forEach(listener -> listener.fireEvent(context));
    }

    @Override
    public void addListener(AbstractObserver.Listener listener) {
        listeners.add(listener);
    }
}
