package com.t0lia.design_pattern.I_creational.abstract_factory.impl;

import com.t0lia.design_pattern.I_creational.abstract_factory.Battery;
import com.t0lia.design_pattern.I_creational.abstract_factory.Body;
import com.t0lia.design_pattern.I_creational.abstract_factory.Display;
import com.t0lia.design_pattern.I_creational.abstract_factory.PhoneFactory;

public class MeizuPhoneFactory implements PhoneFactory {
    final private static Body MEIZU_BODY = new Body() {
        @Override
        public String toString() {
            return "meizu body";
        }
    };
    final private static Battery MEIZU_BATTERY = new Battery() {
        @Override
        public String toString() {
            return "meizu battery";
        }
    };
    final private static Display MEIZU_DISPLAY = new Display() {
        @Override
        public String toString() {
            return "meizu display";
        }
    };

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
