package com.onexzgj.singleton;

/**
 * 副总裁
 */
public class VP extends Staff {
    @Override
    public void work() {
        super.work();
        System.out.println("管理员工");
    }
}
