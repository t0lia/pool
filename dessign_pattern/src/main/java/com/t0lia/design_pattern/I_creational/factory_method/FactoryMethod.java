package com.t0lia.design_pattern.I_creational.factory_method;

import java.util.function.Supplier;


interface CarSupplier extends Supplier<Phone> {
}

class Honda extends Phone {
    @Override
    public String toString() {
        return "honda";
    }
}

class MitsubishiSupplier implements CarSupplier {
    @Override
    public Phone get() {
        return new Mitsubishi();
    }
}

class HondaSupplier implements CarSupplier {
    @Override
    public Phone get() {
        return new Honda();
    }
}

class Mazda extends Phone {
    @Override
    public String toString() {
        return "mazda";
    }
}

class MazdaSupplier implements CarSupplier {
    @Override
    public Phone get() {
        return new Mazda();
    }
}

class Mitsubishi extends Phone {
    @Override
    public String toString() {
        return "mitsubishi";
    }
}