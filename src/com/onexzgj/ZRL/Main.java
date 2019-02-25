package com.onexzgj.ZRL;

public class Main {

    public static  void main(String args[]){
        //how to use
        Handler1 handler1=new Handler1();

        Handler2 handler2 =new Handler2();

        handler1.successor=handler2;
        handler2.successor=handler1;

        handler1.handleRequest("handler2Request");

    }

}
