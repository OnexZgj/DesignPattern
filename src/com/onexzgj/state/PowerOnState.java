package com.onexzgj.state;

/**
 * 关机状态下功能
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("调换到下个节目");
    }

    @Override
    public void preChannel() {
        System.out.println("调换到上个节目");
    }

    @Override
    public void turnUp() {
        System.out.println("音量调大");
    }

    @Override
    public void turnDown() {
        System.out.println("音量调小");
    }
}
