package com.t0lia.design_pattern.II_structural.adapter.client.solar;

public class Sun {
    public static final Sun INSTANCE = new Sun();

    private Sun() { }

    void shine(){
        System.out.println("shine");
    }
}
