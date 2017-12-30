package com.t0lia.design_pattern.II_structural.composite;

import org.testng.annotations.Test;

import java.util.Deque;
import java.util.function.Consumer;

public class CompositeTest {
    private Consumer<Deque<String>> printInverse = stack -> {
        stack.descendingIterator().forEachRemaining(System.out::print);
        System.out.println();
    };

    @Test
    public void testComposite() {
        Component root = new CompositeImpl("")
                .addChild(new Leaf("home"))
                .addChild(new CompositeImpl("blog")
                        .addChild(new Leaf("1"))
                        .addChild(new Leaf("2")))
                .addChild(new Leaf("about"));


        Visitor visitor = new Visitor(printInverse, root);
        visitor.walkThrough();
    }


}