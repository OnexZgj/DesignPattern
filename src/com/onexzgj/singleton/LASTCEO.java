package com.onexzgj.singleton;

/**
 * 最终单例模式
 */
public class LASTCEO {

    private static LASTCEO instance=null;

    private LASTCEO(){

    }


    public static LASTCEO getInstance(){
        if (instance==null){
            synchronized (LASTCEO.class) {
                if (instance==null)
                instance = new LASTCEO();
            }
        }
        return instance;
    }
}
