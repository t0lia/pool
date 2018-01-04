package com.t0lia.design_pattern.II_structural.proxy.java.proxy;

import com.t0lia.design_pattern.II_structural.proxy.data.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.reflect.Proxy.newProxyInstance;

public class AccessHandler implements InvocationHandler {
    private Person target;

    public static Person newProxyFor(Person target) {
        return (Person) newProxyInstance(getSystemClassLoader(), new Class[]{Person.class}, new AccessHandler(target));
    }

    private AccessHandler(Person target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.startsWith("get")) {
            return method.invoke(target, args);
        } else if (methodName.startsWith("set")) {
            System.out.println("can't change object");
        }
        return null;
    }
}
