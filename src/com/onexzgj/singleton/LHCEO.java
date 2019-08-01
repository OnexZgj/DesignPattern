package com.onexzgj.singleton;

/**
 * 懒汉CEO，方法是加锁的，所以耗时比较严重
 */
public class LHCEO {
    private static LHCEO instance;

    private LHCEO(){

    }


    public static synchronized LHCEO getInstance(){
        if (instance==null){
            instance=new LHCEO();
        }
        return instance;
    }

}
