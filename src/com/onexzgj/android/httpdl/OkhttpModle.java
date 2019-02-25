package com.onexzgj.android.httpdl;

public class OkhttpModle implements Ihttp {
    @Override
    public void get(String url) {
        //模拟okhttp请求网络
        System.out.println("Okhttp request get()" + url);
    }

    @Override
    public void post(String url, String params) {
        System.out.println("Okhttp request post(params)" + url);
    }
}
