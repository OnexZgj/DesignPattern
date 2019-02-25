package com.onexzgj.android.httpdl;

public class VolleyModle implements Ihttp {
    @Override
    public void get(String url) {
        //模拟Volley请求网络
        System.out.println("Volley request get()" +url);
    }

    @Override
    public void post(String url, String params) {
        System.out.println("Volley request post(params)" +url);
    }
}
