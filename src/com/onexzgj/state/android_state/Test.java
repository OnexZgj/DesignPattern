package com.onexzgj.state.android_state;

public class Test {

    public static void main(String[] args){

        LoginContext.getInstance().commont();

        //登录成功
        LoginContext.getInstance().setState(new LoginState());
        LoginContext.getInstance().commont();
        LoginContext.getInstance().forward();

        //注销成功
        LoginContext.getInstance().setState(new LogOutState());
        LoginContext.getInstance().forward();

    }
}
