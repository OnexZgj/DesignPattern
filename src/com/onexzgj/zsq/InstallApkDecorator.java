package com.onexzgj.zsq;

public class InstallApkDecorator extends Decorator {


    public InstallApkDecorator(MobilePhone mobilePhone) {
        super(mobilePhone);
    }


    @Override
    void call() {
        super.call();
        installApk("抖音！");
    }

    private void installApk(String s) {

        System.out.println("具有了抖音APP功能!");

    }
}
