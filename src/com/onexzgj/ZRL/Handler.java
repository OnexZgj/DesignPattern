package com.onexzgj.ZRL;

/**
 * 抽象处理着角色，声明请求处理方法，并在其中保留一个对下一个处理节点的对象的引用
 */
public abstract class Handler {

    /**
     * 下一个节点的处理者
     */
    protected Handler successor;

    /**
     * 处理请求方法
     * @param condition
     */
    public abstract void handleRequest(String condition);


}
