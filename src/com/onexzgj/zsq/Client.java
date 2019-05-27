package com.onexzgj.zsq;

public class Client {

    public  static void main(String[] args){

        MobilePhone mobilePhone=new NewPhone();
        mobilePhone.call();

        System.out.println("装饰器装饰，让有浏览短视频功能!");

        Decorator zsq=new InstallApkDecorator(mobilePhone);

        zsq.call();

    }
}
