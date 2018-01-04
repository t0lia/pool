package com.t0lia.design_pattern.II_structural.proxy.java.proxy;

import com.t0lia.design_pattern.II_structural.proxy.custom.AccessProxy;
import com.t0lia.design_pattern.II_structural.proxy.custom.LogProxy;
import com.t0lia.design_pattern.II_structural.proxy.data.Person;
import com.t0lia.design_pattern.II_structural.proxy.data.PersonBean;
import org.testng.annotations.Test;

public class ProxyTest {
    @Test
    public void testProxy() {
        Person john = new PersonBean("John" , 12);
        System.out.println(john);

        System.out.println("access proxy:");
        Person accessProxy = AccessHandler.newProxyFor(john);
        accessProxy.getAge();
        accessProxy.setAge(13);
        System.out.println(john);

        System.out.println("log proxy:");
        Person logProxy = LogHandler.newProxyFor(john);
        logProxy.getAge();
        logProxy.setAge(13);
        System.out.println(john);
    }

    @Test
    public void testMyProxy() {
        Person jane = new PersonBean("Jane", 22);
        System.out.println(jane);

        System.out.println("access proxy:");
        Person accessProxy = new AccessProxy(jane);
        accessProxy.getAge();
        accessProxy.setAge(23);
        System.out.println(jane);

        System.out.println("log proxy:");
        Person logProxy = new LogProxy(jane);
        logProxy.getAge();
        logProxy.setAge(23);
        System.out.println(jane);

    }
}