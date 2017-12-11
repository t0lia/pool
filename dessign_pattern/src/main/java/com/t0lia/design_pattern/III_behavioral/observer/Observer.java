package com.t0lia.design_pattern.III_behavioral.observer;

//import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

class Publisher {
    private List<Subscriber.Observer> listeners = new ArrayList<>();

    private void notifyObservers() { listeners.forEach(Subscriber.Observer::fireEvent); }
    void addObserver(Subscriber.Observer listener) { listeners.add(listener); }
    /////////////////////////////////////////////////////////////////////////////////////////////

    void foo() {
        System.out.println("Publisher::something changed!");
        notifyObservers();
    }

}

class Subscriber {
    private void bar() { System.out.println("Subscriber::I see"); }
    Subscriber() { }
    class Observer { public void fireEvent() { bar(); } }
}


public class Observer {
//    @Test
    public void testName() {
        Publisher publisher = new Publisher();
        Subscriber subscriber = new Subscriber();
        publisher.addObserver(subscriber.new Observer());

        publisher.foo();
        publisher.foo();
    }
}
