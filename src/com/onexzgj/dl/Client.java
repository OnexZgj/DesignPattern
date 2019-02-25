package com.onexzgj.dl;

public class Client {

    public static void main(String[] args){

        RealSubject realSubject=new RealSubject();
        ProxySubject proxySubject=new ProxySubject(realSubject);
        proxySubject.visit();
    }
}
