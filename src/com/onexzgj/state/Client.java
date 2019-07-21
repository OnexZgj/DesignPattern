package com.onexzgj.state;

public class Client {

    public static void main(String[] args){

        TvControl tvControl=new TvControl();
        tvControl.powerOn();

        tvControl.nextChannel();
        tvControl.powerOff();
        tvControl.preChannel();
    }
}
