package com.t0lia.design_pattern.III_behavioral.mediator.impl;

import com.t0lia.design_pattern.III_behavioral.mediator.Colleague;
import com.t0lia.design_pattern.III_behavioral.mediator.Mediator;

public abstract class AbstractColleague implements Colleague {
    protected Mediator mediator;

    public AbstractColleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    @Override
    public void sendMsg(String msg) {
        mediator.sendMsg(msg);
    }
}
