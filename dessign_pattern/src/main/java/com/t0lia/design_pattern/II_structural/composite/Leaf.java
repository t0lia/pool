package com.t0lia.design_pattern.II_structural.composite;

public class Leaf implements Component {
    public Leaf(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    private String name;
}
