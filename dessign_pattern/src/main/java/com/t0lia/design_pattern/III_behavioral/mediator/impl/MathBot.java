package com.t0lia.design_pattern.III_behavioral.mediator.impl;

import com.t0lia.design_pattern.III_behavioral.interpreter.expression.impl.Evaluation;
import com.t0lia.design_pattern.III_behavioral.mediator.Mediator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathBot extends AbstractColleague {

    public MathBot(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMsg(String msg) {
        Pattern pattern = Pattern.compile(".*\\d+ [-*+] \\d+$");
        Matcher matcher = pattern.matcher(msg);
        if (matcher.matches()) {
            Evaluation evaluation = new Evaluation(msg);
            sendMsg("MathBot :: " + msg + " = " + evaluation.resolve());
        }
    }
}
