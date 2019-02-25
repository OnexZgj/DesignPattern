package com.onexzgj.zrldemo;

/**
 * 抽象领导
 */
public abstract class Leader {

    Leader nextHandler;

    abstract int limit();

    abstract void handler(int money);

    void handerRequest(int money) {
        if (money < limit()) {
            handler(money);
        } else {
            if (nextHandler != null)
                nextHandler.handerRequest(money);
        }
    }
}
