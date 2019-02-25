package com.onexzgj.android.httpdl;

public interface Ihttp {

    /**
     * GET 请求
     * @param url
     */
    void get(String url);

    /**
     * POST 请求
     * @param url
     * @param params
     */
    void post(String url,String params);

    //....

}
