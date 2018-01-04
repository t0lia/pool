package com.t0lia.design_pattern.II_structural.proxy.data;

public class PersonBean implements Person{
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + " : " + age + " years";
    }

    public PersonBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
