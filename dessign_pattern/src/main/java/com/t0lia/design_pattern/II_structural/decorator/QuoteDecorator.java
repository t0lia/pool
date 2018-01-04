package com.t0lia.design_pattern.II_structural.decorator;

public class QuoteDecorator implements Printer {
    private Printer printer;

    public QuoteDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return "\"" + printer.print() + "\"";
    }
}
