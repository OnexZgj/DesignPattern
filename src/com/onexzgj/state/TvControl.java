package com.onexzgj.state;

public class TvControl implements  PowerController ,TvState{
    private TvState mState;

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦...");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦...");
    }


    private void setTvState(TvState state){
        this.mState=state;
    }


    @Override
    public void nextChannel() {
        mState.nextChannel();
    }

    @Override
    public void preChannel() {
        mState.preChannel();
    }

    @Override
    public void turnUp() {
        mState.turnUp();
    }

    @Override
    public void turnDown() {
        mState.turnDown();
    }
}
