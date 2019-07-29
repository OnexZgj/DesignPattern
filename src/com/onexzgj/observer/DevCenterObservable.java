package com.onexzgj.observer;


import java.util.Observable;

/**
 * 具体被观察者（ConcreteSubject）
 */
public class DevCenterObservable extends Observable {

    public void postMewActicle(String content){
        setChanged();

        notifyObservers(content);
    }

}
