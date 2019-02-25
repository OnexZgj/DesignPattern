package com.onexzgj.abstractFactory;


public class Client {

    public static void main(String[] args){

        AbstractFactory factory=new RealFactory1();
        AbastractProductA productA = factory.createProductA();

        productA.method();

        AbastractProductB productB = factory.createProductB();
        productB.method();

        AbstractFactory factoryB=new RealFactory2();
        AbastractProductA productA1 = factoryB.createProductA();
        productA1.method();

        AbastractProductB productB1 = factoryB.createProductB();
        productB1.method();
    }
}
