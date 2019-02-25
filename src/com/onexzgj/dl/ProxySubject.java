package com.onexzgj.dl;

/**
 * 代理类
 */
public class ProxySubject extends Subject {

    private  Subject mSubject;

    public ProxySubject(Subject subject) {
        this.mSubject=subject;
    }

    @Override
    void visit() {
        mSubject.visit();
    }
}
