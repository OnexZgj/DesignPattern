package com.onexzgj.state.android_state;

/**
 * 登录状态行为
 */
public class LoginState implements UserState {
    @Override
    public void commont() {
        System.out.println("评论成功!");
    }

    @Override
    public void forward() {
        System.out.println("转发成功!");
    }
}
