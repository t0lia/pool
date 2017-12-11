package com.t0lia.design_pattern.I_creational.abstract_factory.impl;

import com.t0lia.design_pattern.I_creational.abstract_factory.Battery;
import com.t0lia.design_pattern.I_creational.abstract_factory.Body;
import com.t0lia.design_pattern.I_creational.abstract_factory.Display;
import com.t0lia.design_pattern.I_creational.abstract_factory.PhoneFactory;

public class XaomiPhoneFactory implements PhoneFactory {
    final private static Body XAOMI_BODY = new Body() {
        @Override
        public String toString() {
            return "xaomi body";
        }
    };
    final private static Battery XAOMI_BATTERY = new Battery() {
        @Override
        public String toString() {
            return "xaomi battery";
        }
    };
    final private static Display XAOMI_DISPLAY = new Display() {
        @Override
        public String toString() {
            return "xaomi display";
        }
    };


    @Override
    public Body getBody() {
        return XAOMI_BODY;
    }

    @Override
    public Display getDisplay() {
        return XAOMI_DISPLAY;
    }

    @Override
    public Battery getBattery() {
        return XAOMI_BATTERY;
    }

}
