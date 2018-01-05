package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility;

public enum Coin {
    TWO_EURO(260), // the biggest coin
    TEN_CENTS(200),// the smallest coin
    ONE_RUBLE(205), TWO_RUBLES(230), FIVE_RUBLES(250), TEN_RUBLES(220);

    public final int size;

    Coin(int size) { this.size = size; }
}
