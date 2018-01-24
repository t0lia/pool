package com.t0lia.design_pattern.III_behavioral.mediator.impl;

import com.t0lia.design_pattern.III_behavioral.mediator.Mediator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FactBot extends AbstractColleague {

    static private final List<String> FACTS = Arrays.asList("Bones found at Seymour Island indicate that at one time, 37 to 40 million years ago, penguins stood at a formidable 6 feet tall and weighed 250 pounds",
            "In season two of The Joy of Painting, Bob Ross created a monochromatic landscape for a viewer who was worried that his color blindness would prevent him from being able to paint.",
            "China owns all of the pandas in the world. They rent them out for about $1 million a year.",
            "Salvador Dali avoided paying restaurant tabs by using checks. He would draw on the back as the waiter watched, knowing no one would ever cash the art.",
            "During Prohibition, moonshiners would wear \"cow shoes.\" The fancy footwear left hoofprints instead of footprints, helping distillers and smugglers evade police.");

    public FactBot(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMsg(String msg) {
        if (msg.contains("fact")) {
            Random random = new Random();
            int index = random.nextInt(5);
            sendMsg("FactBot :: " + FACTS.get(index));
        }
    }
}
