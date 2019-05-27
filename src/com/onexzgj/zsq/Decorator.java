package com.onexzgj.zsq;

public abstract class Decorator extends MobilePhone {

    private MobilePhone mobilePhone;

    public Decorator(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    @Override
    void call() {
        mobilePhone.call();
    }
}
