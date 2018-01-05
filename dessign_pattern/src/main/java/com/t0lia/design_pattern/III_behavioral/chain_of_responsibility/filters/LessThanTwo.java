package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.filters;

import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin;
import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.CoinFilter;

import static com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin.TWO_RUBLES;

public class LessThanTwo implements CoinFilter {
    private CoinFilter next;

    @Override
    public int doFilter(Coin coin) {
        return coin.size >= TWO_RUBLES.size ? 2 : next.doFilter(coin);
    }

    public LessThanTwo(CoinFilter next) {
        this.next = next;
    }

}
