package com.t0lia.design_pattern.I_creational.prorotype;

class CookieMachine {
    private CookieCutter base;

    CookieMachine(CookieCutter base) {
        this.base = base;
    }

    public CookieCutter copy() {
        try {
            return this.base.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
