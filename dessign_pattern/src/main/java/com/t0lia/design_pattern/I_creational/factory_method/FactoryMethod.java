package com.t0lia.design_pattern.I_creational.factory_method;

import java.util.function.Supplier;


interface CarSupplier extends Supplier<Car> {
}

class Honda extends Car {
    @Override
    public String toString() {
        return "honda";
    }
}

class MitsubishiSupplier implements CarSupplier {
    @Override
    public Car get() {
        return new Mitsubishi();
    }
}

class HondaSupplier implements CarSupplier {
    @Override
    public Car get() {
        return new Honda();
    }
}

class Mazda extends Car {
    @Override
    public String toString() {
        return "mazda";
    }
}

class MazdaSupplier implements CarSupplier {
    @Override
    public Car get() {
        return new Mazda();
    }
}

class Mitsubishi extends Car {
    @Override
    public String toString() {
        return "mitsubishi";
    }
}