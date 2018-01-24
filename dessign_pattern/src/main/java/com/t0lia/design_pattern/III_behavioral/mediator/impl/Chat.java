package com.t0lia.design_pattern.III_behavioral.mediator.impl;

import com.t0lia.design_pattern.III_behavioral.mediator.Mediator;

public class Chat extends AbstractColleague {
    private final String name;

    public Chat(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void receiveMsg(String msg) {
    }

    @Override
    public void sendMsg(String msg) {
        super.sendMsg(name + " :: " + msg);
    }
}
