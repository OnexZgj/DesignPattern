package com.onexzgj.dtdl;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args){

//        RealSubject realSubject=new RealSubject();
//        ProxySubject proxySubject=new ProxySubject(realSubject);
//        proxySubject.visit();

        Subject subject=new RealSubject();
        DynamicProxy proxy = new DynamicProxy(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();

        Subject real = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
        real.visit();

    }
}
