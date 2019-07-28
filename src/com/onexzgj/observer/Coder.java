package com.onexzgj.observer;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {

    public String mName;


    public Coder(String name) {
        this.mName = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hi:" +mName + "网站更新了内容：" + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
