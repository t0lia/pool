package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility;

import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.filters.*;

public class VendingMachine implements ChainOfResponsibility{
    private CoinFilter coinKeeper;

    VendingMachine() {
        CoinFilter lessThanOne = new LessThanOne();
        CoinFilter lessThanTen = new LessThanTen(lessThanOne);
        CoinFilter lessThanTwo = new LessThanTwo(lessThanTen);
        CoinFilter lessThanFive = new LessThanFive(lessThanTwo);
        coinKeeper = new CoinKeeper(lessThanFive);
    }

    public int put(Coin coin) {
        return coinKeeper.doFilter(coin);
    }
}
