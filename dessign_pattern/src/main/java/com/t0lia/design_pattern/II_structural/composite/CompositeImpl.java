package com.t0lia.design_pattern.II_structural.composite;

import java.util.LinkedList;
import java.util.List;

public class CompositeImpl implements Component, Composite {
    private String name;
    private List<Component> subRoutes;

    private CompositeImpl() {
    }

    CompositeImpl(String name) {
        this.name = name;
        subRoutes = new LinkedList<>();
    }

    public Composite addChild(Component component) {
        subRoutes.add(component);
        return this;
    }

    public int size() {
        return subRoutes.size();
    }

    public Component getChild(int index) {
        return subRoutes.get(index);
    }

    public void removeChild(int index) {
        subRoutes.remove(index);
    }

    public String name() {
        return name + "/";
    }
}
