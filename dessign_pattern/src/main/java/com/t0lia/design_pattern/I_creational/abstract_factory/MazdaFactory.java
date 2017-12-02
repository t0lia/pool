package com.t0lia.design_pattern.I_creational.abstract_factory;

import com.t0lia.design_pattern.I_creational.abstract_factory.data.*;

class MazdaFactory implements AbstractCarFactory{
    @Override public Whell newWheel() { return new MazdaWheel(); }
    @Override public Engine newEngine() { return new MazdaEngine(); }
    @Override public Body newBody() { return new MazdaBody(); }}
