package com.t0lia.design_pattern.III_behavioral.observer.jul;

import java.util.Observable;
import java.util.Observer;

class Subscriber implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Subscriber::I see");
    }
}

class Publisher extends Observable {
    public void foo() {
        System.out.println("Publisher::something changed!");
        setChanged();
        notifyObservers();
    }
}

public class SomeTest {
}
//}
//    @Test
//    public void testName() {
//        Subscriber subscriber = new Subscriber();
//        Publisher publisher = new Publisher();
//
//        publisher.addObserver(subscriber);
//
//        publisher.foo();
//        publisher.foo();
//    }
//}
