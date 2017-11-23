package com.t0lia.dessign_pattern.I_creational.singleton.impl;

import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void testSingleton () throws Exception {
        StaticMethodSingleton singleton = StaticMethodSingleton.getInstance();
        System.out.println(singleton.foo());
    }
}