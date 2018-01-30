package com.t0lia.design_pattern.III_behavioral.memento;

public class Originator {
    public Originator(String name) {
        this.name = name;
        number1 = 1;
        number2 = 0;
    }

    private final String name;

    private long number1;
    private long number2;

    public long next() {
        long ret = number2;
        long next = number1 + number2;
        number2 = number1;
        number1 = next;
        return ret;
    }

    public Memento memento() {
        return new Memento(number1, number2);
    }

    public Originator revert(Memento memento) {
        this.number1 = memento.fst;
        this.number2 = memento.snd;
        return this;

    }

    @Override
    public String toString() {
        return "" + number2 + ":" + number1;
    }

}
