package com.t0lia.design_pattern.I_creational.abstract_factory.impl;

import com.t0lia.design_pattern.I_creational.abstract_factory.Battery;
import com.t0lia.design_pattern.I_creational.abstract_factory.Body;
import com.t0lia.design_pattern.I_creational.abstract_factory.Display;
import com.t0lia.design_pattern.I_creational.abstract_factory.PhoneFactory;

public class Phone {
    private Body body;
    private Display display;
    private Battery battery;

    public Phone(PhoneFactory factory) {
        this.body = factory.getBody();
        this.display = factory.getDisplay();
        this.battery = factory.getBattery();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "body=" + body +
                ", display=" + display +
                ", battery=" + battery +
                '}';
    }
}
