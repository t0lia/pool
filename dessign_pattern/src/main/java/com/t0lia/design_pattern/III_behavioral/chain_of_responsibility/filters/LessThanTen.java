package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.filters;

import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin;
import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.CoinFilter;

import static com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin.TEN_RUBLES;

public class LessThanTen implements CoinFilter {
    private CoinFilter next;

    @Override
    public int doFilter(Coin coin) {
        return coin.size >= TEN_RUBLES.size ? 10 : next.doFilter(coin);
    }

    public LessThanTen(CoinFilter next) {
        this.next = next;
    }

}
