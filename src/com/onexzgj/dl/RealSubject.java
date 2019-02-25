package com.onexzgj.dl;

/**
 * 业务真实处理类
 */
public class RealSubject extends Subject {
    @Override
    void visit() {
        System.out.println("真正的实现方法");
    }
}
