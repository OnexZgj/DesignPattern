package com.onexzgj.singleton;

public class CEO extends Staff{


    private static final CEO ceo=new CEO();

    private CEO(){

    }

    public static CEO getCeo(){
        return ceo;
    }


    @Override
    public void work() {
        System.out.println("管理总裁");
    }
}

