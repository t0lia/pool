package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.filters;

import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin;
import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.CoinFilter;

public class CoinKeeper implements CoinFilter {
private CoinFilter next;

    public CoinKeeper(CoinFilter next) {
        this.next = next;
    }

    @Override
    public int doFilter(Coin coin) {
        if (coin.size > Coin.FIVE_RUBLES.size) {
            throw new RuntimeException("you can't put such big coins in coin keeper");
        } else {
            return next.doFilter(coin);
        }
    }


}
