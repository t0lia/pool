package com.t0lia.design_pattern.III_behavioral.mediator.impl;

import com.t0lia.design_pattern.III_behavioral.mediator.Colleague;
import com.t0lia.design_pattern.III_behavioral.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Bus implements Mediator {
    private List<Colleague> colleagues;

    @Override
    public void sendMsg(String msg) {
        System.out.println(msg);

        colleagues.forEach(receiver -> receiver.receiveMsg(msg));

    }

    public Bus() {
        colleagues = new ArrayList<>();
    }

    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void unregister(Colleague colleague) {
        colleagues.remove(colleague);
    }
}
