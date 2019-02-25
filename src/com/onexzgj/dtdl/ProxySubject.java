package com.onexzgj.dtdl;

/**
 * 代理类
 */
public class ProxySubject implements Subject {

    private Subject mSubject;

    public ProxySubject(Subject subject) {
        this.mSubject = subject;
    }


    @Override
    public void visit() {
        mSubject.visit();
    }
}
