package com.t0lia.design_pattern.III_behavioral.visitor.good;

import com.t0lia.design_pattern.III_behavioral.visitor.Good;
import com.t0lia.design_pattern.III_behavioral.visitor.Visitor;

public class Laptop implements Good {
    private final int discount = 67;
    private final int weight = 1250;
    private final int price = 65800;

    public int getDiscount() {
        return discount;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
