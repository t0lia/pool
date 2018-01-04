
package com.t0lia.design_pattern.II_structural.decorator;

public class SquareBracketDecorator implements Printer {
    private Printer printer;

    public SquareBracketDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return "[" + printer.print() + "]";
    }
}
