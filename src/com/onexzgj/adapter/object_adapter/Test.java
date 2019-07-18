package com.onexzgj.adapter.object_adapter;

public class Test {

    public static void main(String[] args){
        int volt5 = new VoltAdapter(new Volt220()).getVolt5();
        System.out.println(volt5);
    }
}
