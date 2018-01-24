package com.t0lia.design_pattern.III_behavioral.observer;

import com.t0lia.design_pattern.III_behavioral.observer.impl.AbstractObserver;

public interface Observerable {
    void notifyObservers(String context);

    void addListener(AbstractObserver.Listener listener);
}
