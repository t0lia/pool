package com.t0lia.dessign_pattern.I_creational.builder;


class Coffee {
    private final int espresso;
    private final int milk;
    private final int foamedMilk;
    private final int water;

    public static class CoffeeBuilder implements Builder<Coffee> {
        // required fields
        private final int espresso;

        // optional fields
        private int milk = 0;
        private int foamedMilk = 0;
        private int water = 0;

        @Override
        public Coffee build() { return new Coffee(this); }

        CoffeeBuilder(int espresso) { this.espresso = espresso; }

        public CoffeeBuilder foamedMilk(int foamedMilk)     { this.foamedMilk = foamedMilk; return this; }
        public CoffeeBuilder water(int water)               { this.water = water; return this; }
        public CoffeeBuilder milk(int milk)                 { this.milk = milk; return this; }
    }

    @Override
    public String toString() {
        return "espresso: " + espresso + ", water: " + water + ", milk: " + milk + ", foamed milk: " + foamedMilk + ";";
    }

    private Coffee(CoffeeBuilder builder) {
        this.foamedMilk = builder.foamedMilk;
        this.espresso = builder.espresso;
        this.water = builder.water;
        this.milk = builder.milk;
    }
}
