package com.t0lia.design_pattern.II_structural.proxy.custom;

import com.t0lia.design_pattern.II_structural.proxy.data.Person;

public class AccessProxy implements Person {
    private Person target;

    public AccessProxy(Person person) {
        this.target = person;
    }

    @Override
    public String getName() {
        return target.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("can't change object");
    }

    @Override
    public int getAge() {
        return target.getAge();
    }

    @Override
    public void setAge(int age) {
        System.out.println("can't change object");
    }
}
