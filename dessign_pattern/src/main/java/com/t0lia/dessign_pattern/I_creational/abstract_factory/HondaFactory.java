package com.t0lia.dessign_pattern.I_creational.abstract_factory;

import com.t0lia.dessign_pattern.I_creational.abstract_factory.data.*;

class HondaFactory implements AbstractCarFactory {
    @Override public Whell newWheel() { return new HondaWheel(); }
    @Override public Engine newEngine() { return new HondaEngine(); }
    @Override public Body newBody() { return new HondaBody(); }
}
