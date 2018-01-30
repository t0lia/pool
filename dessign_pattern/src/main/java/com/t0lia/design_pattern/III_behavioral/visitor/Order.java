package com.t0lia.design_pattern.III_behavioral.visitor;

import com.t0lia.design_pattern.III_behavioral.visitor.impl.DiscountPriceVisitor;
import com.t0lia.design_pattern.III_behavioral.visitor.impl.PriceVisitor;
import com.t0lia.design_pattern.III_behavioral.visitor.impl.WeightVisitor;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public Order() {
        goods = new ArrayList<>();
    }

    private List<Good> goods;

    public void add(Good good) {
        goods.add(good);
    }

    private void accept(Visitor visitor) {
        goods.forEach(goodLine -> goodLine.accept(visitor));
    }

    int getTotalWeight() {
        return vst(new WeightVisitor());
    }

    int getTotalPrice() {
        return vst(new PriceVisitor());
    }

    int getDiscountTotalPrice() {
        return vst(new DiscountPriceVisitor());
    }

    private int vst(Visitor visitor) {
        accept(visitor);
        return visitor.getTotal();
    }

}
