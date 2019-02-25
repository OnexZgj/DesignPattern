package com.onexzgj.ZRL;

public class Handler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("handler2Request")){
            System.out.println("Handler2 handler request");
            return;
        }else{
            successor.handleRequest(condition);
        }
    }
}
