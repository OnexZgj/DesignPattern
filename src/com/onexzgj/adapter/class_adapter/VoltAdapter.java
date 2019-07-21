package com.onexzgj.adapter.class_adapter;

/**
 * des：
 * author：onexzgj
 * time：2019/5/27
 */
public class VoltAdapter extends Volt220 implements FiveVolt{
    @Override
    public int getVolt5() {
        return getVolt220()/44;
    }
}
