package com.t0lia.design_pattern.II_structural.adapter.client.wind;

public class Wind {
    public static final Wind INSTANCE = new Wind();

    private Wind() {
    }

    void blow() {
        System.out.println("blow");
    }
}
