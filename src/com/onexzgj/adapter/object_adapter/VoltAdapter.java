package com.onexzgj.adapter.object_adapter;

import com.onexzgj.adapter.class_adapter.FiveVolt;

/**
 * des：
 * author：onexzgj
 * time：2019/5/27
 */
public class VoltAdapter implements FiveVolt{


    private Volt220 mVolt220;

    public VoltAdapter(Volt220 volt220){
        this.mVolt220=volt220;
    }

    @Override
    public int getVolt5() {

        if (mVolt220!=null)
           return mVolt220.getVolt220()/44;
        return 220;
    }
}
