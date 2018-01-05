package com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.filters;

import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin;
import com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.CoinFilter;

import static com.t0lia.design_pattern.III_behavioral.chain_of_responsibility.Coin.ONE_RUBLE;

public class LessThanOne implements CoinFilter {

    @Override
    public int doFilter(Coin coin) {
        if (coin.size >= ONE_RUBLE.size) {
            return 1;
        } else {
            throw new RuntimeException("coin is very small");
        }
    }


}
