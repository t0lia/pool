package com.t0lia.design_pattern.II_structural.decorator;

import org.testng.annotations.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Printer printer = new NumberPrinter(123);

        System.out.println(new SquareBracketDecorator(new QuoteDecorator(printer)).print());
        System.out.println(new AngleBracketDecorator(new SquareBracketDecorator(new QuoteDecorator(printer))).print());
        System.out.println(new SquareBracketDecorator(new SquareBracketDecorator(printer)).print());

    }
}