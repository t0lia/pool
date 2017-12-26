package com.t0lia.design_pattern.II_structural.flyweight;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlyweightTest {
    static private final Random RANDOM = new Random();

    static private final Library LIBRARY = new Library(
            new Book("Design Patterns",
                    "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, Grady Booch",
                    "978-0201633610",
                    395),
            new Book("Effective Java",
                    "Joshua Bloch",
                    "978-0321356680",
                    346),
            new Book("Thinking in Java",
                    "Bruce Eckel",
                    "978-0131872486",
                    1150)
    );

    @Test
    public void testFlyweight() {
        List<Order> orders = Stream.iterate(1, i -> i + 1)
                .limit(1000)
                .map(client -> createOrder())
                .collect(Collectors.toList());
        System.out.println(orders.size());
    }

    private Order createOrder() {
        Order order = new Order(LIBRARY);
        order.add("Design pattern", randomCount());
        order.add("Effective Java", randomCount());
        order.add("Thinking in Java", randomCount());
        return order;
    }

    private int randomCount() {
        return RANDOM.nextInt(10);
    }
}