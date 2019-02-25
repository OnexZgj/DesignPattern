package com.onexzgj.factory;

public class LitepalHandler extends IoHandler {
    @Override
    void add(String message) {
        System.out.println("LitepalHandler handle add()" + message);
    }

    @Override
    void delete(String message) {
        System.out.println("LitepalHandler handle delete()" + message);
    }

    @Override
    void update(String message) {
        System.out.println("LitepalHandler handle update()" + message);
    }

    @Override
    void query(String message) {
        System.out.println("LitepalHandler handle query()" + message);
    }
}
