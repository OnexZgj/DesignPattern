package com.onexzgj.builder;

public class Director {
    Builder mBuilser=null;


    public Director(Builder builer) {
        this.mBuilser = builer;
    }


    public void construct(String board,String display){
        mBuilser.buildDisplay(display);
        mBuilser.buildBoard(board);
        mBuilser.buildOs();
    }
}
