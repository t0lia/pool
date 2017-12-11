package com.t0lia.design_pattern.I_creational.abstract_factory.impl;

import com.t0lia.design_pattern.I_creational.abstract_factory.PhoneFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AbstractFactoryTest {
    @DataProvider(name = "factories")
    public static Object[][] factories() {
        return new Object[][]{
                {new XaomiPhoneFactory()},
                {new MeizuPhoneFactory()},
        };
    }

    @Test(dataProvider = "factories")
    public void testAbstractFactory(PhoneFactory factory) {
        Phone phone = new Phone(factory);
        System.out.println(phone);
    }

}