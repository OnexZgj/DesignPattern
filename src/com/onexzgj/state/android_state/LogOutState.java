package com.onexzgj.state.android_state;

/**
 * 注销状态行为
 */
public class LogOutState implements UserState {
    @Override
    public void commont() {

        System.out.println("不能评论，没有登录，跳到登录页面");
    }

    @Override
    public void forward() {
        System.out.println("不能转发，没有登录，跳到登录页面");
    }
}
