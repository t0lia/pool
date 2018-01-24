package com.t0lia.design_pattern.III_behavioral.mediator;

import com.t0lia.design_pattern.III_behavioral.mediator.impl.Bus;
import com.t0lia.design_pattern.III_behavioral.mediator.impl.Chat;
import com.t0lia.design_pattern.III_behavioral.mediator.impl.FactBot;
import com.t0lia.design_pattern.III_behavioral.mediator.impl.MathBot;
import org.testng.annotations.Test;

public class MediatorTest {

    @Test
    public void testMediator() {
        Mediator mediator = new Bus();
        Colleague chat = new Chat(mediator, "User");
        Colleague factBot = new FactBot(mediator);
        Colleague mathBot = new MathBot(mediator);

        chat.sendMsg("hello world!");
        chat.sendMsg("2 + 4");
        chat.sendMsg("2 * 4");
        chat.sendMsg("fact");
    }
}