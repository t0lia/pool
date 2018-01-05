package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.filters;

import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin;
import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.CoinFilter;

import static com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin.FIVE_RUBLES;

public class LessThanFive implements CoinFilter {
    private CoinFilter next;

    @Override
    public int doFilter(Coin coin) {
        return coin.size >= FIVE_RUBLES.size ? 5 : next.doFilter(coin);
    }

    public LessThanFive(CoinFilter next) {
        this.next = next;
    }

}
