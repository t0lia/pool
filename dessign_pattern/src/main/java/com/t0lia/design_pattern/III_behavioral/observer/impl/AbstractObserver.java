package com.t0lia.design_pattern.III_behavioral.observer.impl;

import com.t0lia.design_pattern.III_behavioral.observer.Observer;

public abstract class AbstractObserver implements Observer {
    public abstract void handleEvent(String context);

    public class Listener implements Observer.Listener {
        public void fireEvent(String context) {
            handleEvent(context);
        }
    }

    public Listener getListener() {
        return new Listener();
    }
}
