package com.onexzgj.dtdl;

/**
 * 业务真实处理类
 */
public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("真正的实现方法");
    }
}
