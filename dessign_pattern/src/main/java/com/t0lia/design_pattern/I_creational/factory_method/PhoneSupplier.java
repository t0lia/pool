package com.t0lia.design_pattern.I_creational.factory_method;

import java.util.function.Supplier;

public abstract class PhoneSupplier<T extends Phone> implements Supplier<T> { }
