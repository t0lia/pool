package com.t0lia.design_pattern.III_behavioral.template_method;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public abstract class Distribution implements TemplateMethod {
    private List<Integer> vars;

    public Distribution() {
        this.vars = Stream.iterate(0, ignore -> next()).limit(100).collect(toList());
    }

    public abstract int next();

    final public Double avg() {
        return vars.stream().collect(summarizingInt(i -> i)).getAverage();
    }

    final public long sum() {
        return vars.stream().collect(summarizingInt(i -> i)).getSum();
    }

    final public long max() {
        return vars.stream().collect(summarizingInt(i -> i)).getMax();
    }

    final public long min() {
        return vars.stream().collect(summarizingInt(i -> i)).getMin();
    }

    final public double dev() {
        Double avg = avg();
        return Math.sqrt(vars.stream().map(v -> v - avg).mapToDouble(i -> i).sum() / 10);
    }

    @Override
    final public String toString() {
        return vars.stream().sorted().map(Object::toString).collect(joining(" "));
    }
}
