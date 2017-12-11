package com.t0lia.design_pattern.I_creational.abstract_factory.impl;

import com.t0lia.design_pattern.I_creational.abstract_factory.Battery;
import com.t0lia.design_pattern.I_creational.abstract_factory.Body;
import com.t0lia.design_pattern.I_creational.abstract_factory.Display;
import com.t0lia.design_pattern.I_creational.abstract_factory.PhoneFactory;

public class MeizuPhoneFactory implements PhoneFactory {
    final private static Body    MEIZU_BODY    = new Body() { };
    final private static Battery MEIZU_BATTERY = new Battery() { };
    final private static Display MEIZU_DISPLAY = new Display() { };

    @Override
    public Body getBody() {
        return MEIZU_BODY;
    }

    @Override
    public Display getDisplay() {
        return MEIZU_DISPLAY;
    }

    @Override
    public Battery getBattery() {
        return MEIZU_BATTERY;
    }
}
