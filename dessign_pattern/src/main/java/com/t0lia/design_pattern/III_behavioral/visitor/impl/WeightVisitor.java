package com.t0lia.design_pattern.III_behavioral.visitor.impl;

import com.t0lia.design_pattern.III_behavioral.visitor.Visitor;
import com.t0lia.design_pattern.III_behavioral.visitor.good.Camera;
import com.t0lia.design_pattern.III_behavioral.visitor.good.Laptop;
import com.t0lia.design_pattern.III_behavioral.visitor.good.Phone;

public class WeightVisitor implements Visitor {
    @Override
    public int getTotal() {
        return total;
    }

    private int total = 0;

    @Override
    public void visit(Camera camera) {
        total += camera.getWeight();
    }

    @Override
    public void visit(Phone phone) {
        total += phone.getWeight();
    }

    @Override
    public void visit(Laptop laptop) {
        total += laptop.getWeight();
    }

}
