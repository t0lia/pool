package com.t0lia.design_pattern.I_creational.factory_method.impl;

import com.t0lia.design_pattern.I_creational.factory_method.PhoneSupplier;

public class MeizuSupplier extends PhoneSupplier<Meizu> {
    @Override
    public Meizu get() {
        return new Meizu();
    }
}
