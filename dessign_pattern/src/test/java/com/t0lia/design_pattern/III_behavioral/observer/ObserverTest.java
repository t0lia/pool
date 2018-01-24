package com.t0lia.design_pattern.III_behavioral.observer;

import com.t0lia.design_pattern.III_behavioral.observer.impl.ConcreteObserver;
import com.t0lia.design_pattern.III_behavioral.observer.impl.MensHealths;
import com.t0lia.design_pattern.III_behavioral.observer.impl.RollingStones;
import org.testng.annotations.Test;

public class ObserverTest {
    @Test
    public void testObserver() {

        RollingStones rollingStones = new RollingStones();
        MensHealths mensHealths = new MensHealths();

        ConcreteObserver vasia = new ConcreteObserver("Vasia");
        ConcreteObserver petia = new ConcreteObserver("Petia");

        rollingStones.addListener(vasia.getListener());
        rollingStones.addListener(petia.getListener());
        mensHealths.addListener(petia.getListener());

        rollingStones.newEdittion();
        System.out.println("== == == == == == == == == == ==");
        rollingStones.newEdittion();
        System.out.println("== == == == == == == == == == ==");
        mensHealths.newEdittion();
    }

}