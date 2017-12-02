package com.t0lia.dessign_pattern.I_creational.prorotype;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static com.t0lia.dessign_pattern.I_creational.prorotype.CookieForm.STAR;
import static java.util.stream.Collectors.toList;

public class PrototypeTest {
    @Test
    public void testPrototype() {
        CookieCutter cookie = new CookieCutter(3, STAR);
        CookieMachine cookieMachine = new CookieMachine(cookie);
        Random random = new Random();
        List<CookieCutter> cookies = Stream.generate(cookieMachine::copy)
                .map(x -> x.setContent(random.nextBoolean() ? "coconut" : "ginger"))
                .limit(5)
                .collect(toList());
        cookies.forEach(System.out::println);
    }
}
