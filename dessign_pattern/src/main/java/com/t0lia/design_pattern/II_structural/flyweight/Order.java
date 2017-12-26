package com.t0lia.design_pattern.II_structural.flyweight;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private final Library library;

    private class OrderLine {
        private final Book book;
        private final int count;

        OrderLine(Book book, int count) {
            this.book = book;
            this.count = count;
        }
    }

    private List<OrderLine> lines;

    public Order(Library library) {
        this.library = library;
        lines = new LinkedList<>();
    }

    public boolean add(String title, int count) {
        return library.getByTitle(title)
                .map(book -> new OrderLine(book, count))
                .map(lines::add)
                .isPresent();
    }

}
