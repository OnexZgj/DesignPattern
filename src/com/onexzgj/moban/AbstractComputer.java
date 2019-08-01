package com.onexzgj.moban;

public abstract class AbstractComputer {
    /**
     * 开机
     */
    protected void powerOn(){
        System.out.println("开启电源");

    }

    protected void loadOS(){
        System.out.println("加载操作系统");
    }


    protected void login(){
        System.out.println("小白进入系统，无需登录");
    }


    public final void startUp(){
        System.out.println("===开机===");
        powerOn();
        loadOS();
        login();
        System.out.println("===关机===");
    }
}
