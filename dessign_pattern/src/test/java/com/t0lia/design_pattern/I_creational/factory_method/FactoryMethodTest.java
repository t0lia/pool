package com.t0lia.design_pattern.I_creational.factory_method;

import com.t0lia.design_pattern.I_creational.factory_method.impl.MeizuSupplier;
import com.t0lia.design_pattern.I_creational.factory_method.impl.XaomiSupplier;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.function.Supplier;


public class FactoryMethodTest {
    @DataProvider(name = "methods")
    public static Object[][] methods() {
        return new Object[][]{
                {new XaomiSupplier()},
                {new MeizuSupplier()},
        };
    }

    @Test(dataProvider = "methods")
    public void testFactoryMethod(Supplier<? extends Phone> sup) {
        Phone phone = sup.get();
        System.out.println(phone);
    }
}
