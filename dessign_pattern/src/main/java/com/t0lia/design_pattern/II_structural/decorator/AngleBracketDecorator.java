package com.t0lia.design_pattern.II_structural.decorator;

public class AngleBracketDecorator implements Printer {
    private Printer printer;

    public AngleBracketDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return "<" + printer.print() + ">";
    }
}
