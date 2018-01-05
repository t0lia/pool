package com.t0lia.design_pattern.II_structural.bridge.abstraction;

public abstract class Printer<T> {

    protected Formatter formatter;

    public Printer(Formatter formatter) {
        this.formatter = formatter;
    }

    public abstract String print(T object);
}
