package com.t0lia.design_pattern.II_structural.proxy.java.proxy;

import com.t0lia.design_pattern.II_structural.proxy.data.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.reflect.Proxy.newProxyInstance;

public class LogHandler implements InvocationHandler {
    private Person target;

    public static Person newProxyFor(Person target) {
        return (Person) newProxyInstance(getSystemClassLoader(), new Class[]{Person.class}, new LogHandler(target));
    }

    private LogHandler(Person target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invocation of " + method.getName() + " method");
        return method.invoke(target, args);
    }

}
