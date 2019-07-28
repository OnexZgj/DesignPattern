package com.onexzgj.observer;

public class Test {

    public static void main(String[] args) {
        DevCenterObservable observable=new DevCenterObservable();

        Coder coder1= new Coder("onex0");
        Coder coder2= new Coder("onex1");
        Coder coder3= new Coder("onex2");
        Coder coder4= new Coder("onex3");

        observable.addObserver(coder1);
        observable.addObserver(coder2);
        observable.addObserver(coder3);
        observable.addObserver(coder4);

        observable.postMewActicle("新文章Android");
        observable.postMewActicle("新文章IOS");

    }

}
