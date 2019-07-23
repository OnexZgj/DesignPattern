package com.onexzgj.state.android_state;

public class LoginContext implements UserState {

    UserState mState=new LoginOutState();

    static LoginContext sLoginContext=new LoginContext();


    public static LoginContext getInstance(){
        return sLoginContext;
    }


    public void setState(UserState state){
        if (state instanceof LoginContext) {
            System.out.println("切换登录状态");
        }else{
            System.out.println("切换注销状态");
        }
        mState=state;
    }


    @Override
    public void commont() {
        mState.commont();
    }

    @Override
    public void forward() {
        mState.forward();
    }
}
