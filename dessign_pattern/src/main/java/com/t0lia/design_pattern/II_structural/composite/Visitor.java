package com.t0lia.design_pattern.II_structural.composite;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

public class Visitor {
    private Consumer<Deque<String>> action;
    private Component component;
    private Deque<String> stack;

    public Visitor(Consumer<Deque<String>> action, Component component) {
        this.action = action;
        this.component = component;
    }

    public void walkThrough() {
        stack = new ArrayDeque<>();
        stack.push(component.name());
        visit(component);
        stack.pop();

    }

    private void walkThrough(Component component) {
        stack.push(component.name());
        visit(component);
        stack.pop();
    }

    private void visit(Component component) {
        if (component instanceof Composite) {
            Composite composite = (Composite) component;
            for (int i = 0; i < composite.size(); i++) {
                walkThrough(composite.getChild(i));
            }
        } else {
            action.accept(stack);
        }
    }

}
