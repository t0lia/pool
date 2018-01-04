package com.t0lia.design_pattern.II_structural.decorator;

public class NumberPrinter implements Printer {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public String print() {
        return Integer.toString(number);
    }
}
