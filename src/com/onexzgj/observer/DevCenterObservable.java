package com.onexzgj.observer;


import java.util.Observable;

public class DevCenterObservable extends Observable {

    public void postMewActicle(String content){
        setChanged();

        notifyObservers(content);
    }

}
