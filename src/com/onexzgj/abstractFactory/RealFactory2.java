package com.onexzgj.abstractFactory;

public class RealFactory2 extends AbstractFactory {
    @Override
    public AbastractProductA createProductA() {
        return new RealProductA2();
    }

    @Override
    public AbastractProductB createProductB() {
        return new RealProductB2();
    }
}
