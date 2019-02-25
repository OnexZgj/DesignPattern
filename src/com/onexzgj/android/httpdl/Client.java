package com.onexzgj.android.httpdl;


public class Client {
    public static void main(String[] args){

        //如果使用volley请求框架
//        HttpProxy.getInstance().setHttpModle(new VolleyModle());

        //如果使用okhttp请求框架
        HttpProxy.getInstance().setHttpModle(new OkhttpModle());


        HttpProxy.getInstance().get("http://www.baidu.com");


    }
}
