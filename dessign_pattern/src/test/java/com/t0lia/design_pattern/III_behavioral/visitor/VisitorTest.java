package com.t0lia.design_pattern.III_behavioral.visitor;

import com.t0lia.design_pattern.III_behavioral.visitor.good.Camera;
import com.t0lia.design_pattern.III_behavioral.visitor.good.Laptop;
import com.t0lia.design_pattern.III_behavioral.visitor.good.Phone;
import org.testng.annotations.Test;

public class VisitorTest {

    @Test
    public void testName() {
        Order order = new Order();
        order.add(new Laptop());
        order.add(new Laptop());
        order.add(new Phone());
        order.add(new Camera());

        System.out.println("Total price:");
        System.out.println(order.getTotalPrice());
        System.out.println("Total price with discount:");
        System.out.println(order.getDiscountTotalPrice());
        System.out.println("Total weight:");
        System.out.println(order.getTotalWeight());

    }
}