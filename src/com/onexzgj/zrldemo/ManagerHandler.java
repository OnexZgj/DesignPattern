package com.onexzgj.zrldemo;

/**
 * 经理
 */
public class ManagerHandler extends Leader {
    @Override
    int limit() {
        return 3000;
    }

    @Override
    void handler(int money) {
        System.out.println("项目经理报销了：" + money);
    }
}
