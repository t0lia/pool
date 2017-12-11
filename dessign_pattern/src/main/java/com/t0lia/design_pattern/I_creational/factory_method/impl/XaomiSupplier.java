package com.t0lia.design_pattern.I_creational.factory_method.impl;

import com.t0lia.design_pattern.I_creational.factory_method.PhoneSupplier;

public class XaomiSupplier extends PhoneSupplier<Xaomi> {
    @Override
    public Xaomi get() {
        return new Xaomi();
    }
}
