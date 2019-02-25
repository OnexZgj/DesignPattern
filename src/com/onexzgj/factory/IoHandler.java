package com.onexzgj.factory;

public abstract class IoHandler {

    /**
     * 添加数据方法
     * @param message
     */
    abstract void add(String message);

    /**
     * 删除方法
     * @param message
     */
    abstract void delete(String message);

    /**
     * 更新
     * @param message
     */
    abstract void update(String message);

    /**
     * 查找
     * @param message
     */
    abstract void query(String message);

}
