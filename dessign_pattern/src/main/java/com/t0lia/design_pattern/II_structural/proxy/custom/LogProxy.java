package com.t0lia.design_pattern.II_structural.proxy.custom;

import com.t0lia.design_pattern.II_structural.proxy.data.Person;

public class LogProxy implements Person {
    private Person target;

    public LogProxy(Person person) {
        this.target = person;
    }

    @Override
    public String getName() {
        System.out.println("invocation of getName method");
        return target.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("invocation of setName method");
        target.setName(name);
    }

    @Override
    public int getAge() {
        System.out.println("invocation of getAge method");
        return target.getAge();
    }

    @Override
    public void setAge(int age) {
        System.out.println("invocation of setAge method");
        target.setAge(age);
    }
}
