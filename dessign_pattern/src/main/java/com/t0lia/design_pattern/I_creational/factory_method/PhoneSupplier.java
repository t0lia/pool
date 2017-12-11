package com.t0lia.design_pattern.I_creational.factory_method;

import java.util.function.Supplier;

public interface PhoneSupplier<T extends Phone> extends Supplier<T>, FactoryMethod { }
