package com.t0lia.design_pattern.III_behavioral.memento;

import java.util.NavigableMap;
import java.util.TreeMap;

import static java.util.stream.Collectors.joining;

public class CareTaker {
    @Override
    public String toString() {
        return history.values().stream()
                .map(memento -> "" + memento.fst+":"+memento.snd)
                .collect(joining("\n"));

    }

    private NavigableMap<Long, Memento> history;

    public CareTaker() {
        history = new TreeMap<>();
    }

    public void add(Memento memento) {
        history.put(memento.fst, memento);
    }

    public Memento get(long bound) {
        return history.ceilingEntry(bound).getValue();
    }
}
