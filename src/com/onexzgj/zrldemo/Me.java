package com.onexzgj.zrldemo;

public class Me {

    public static void main(String args[]) {

        GroupHandler groupHandler = new GroupHandler();
        ManagerHandler managerHandler = new ManagerHandler();
        BossHandler bossHandler = new BossHandler();

        groupHandler.nextHandler = managerHandler;
        managerHandler.nextHandler = bossHandler;

        groupHandler.handerRequest(500);
        groupHandler.handerRequest(1900);
        groupHandler.handerRequest(8000);
    }
}
