package com.onexzgj.state;

/**
 * 关机状态下功能
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("电源关闭，没有反应哦!");
    }

    @Override
    public void preChannel() {
        System.out.println("电源关闭，没有反应哦!");
    }

    @Override
    public void turnUp() {
        System.out.println("电源关闭，没有反应哦!");
    }

    @Override
    public void turnDown() {
        System.out.println("电源关闭，没有反应哦!");
    }
}
