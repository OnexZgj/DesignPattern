package com.onexzgj.abstractFactory;

public class RealFactory1 extends AbstractFactory {
    @Override
    public AbastractProductA createProductA() {
        return new RealProductA1();
    }

    @Override
    public AbastractProductB createProductB() {
        return new RealProductB1();
    }
}
