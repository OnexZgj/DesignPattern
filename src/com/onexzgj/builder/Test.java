package com.onexzgj.builder;

public class Test {

    public static void main(String[] args){
        Builder builder=new MacBookBuilder();
        Director pcDirector=new Director(builder);
        pcDirector.construct("英特尔主板","Retina显示器");

        Computer computer = builder.build();
        System.out.println(computer.toString());
    }

}
