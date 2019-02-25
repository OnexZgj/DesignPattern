package com.onexzgj.factory;

public class GreenDaoHandler extends IoHandler {
    @Override
    void add(String message) {
        System.out.println("GreenDaoHandler handle add()" + message);
    }

    @Override
    void delete(String message) {
        System.out.println("GreenDaoHandler handle delete()" + message);
    }

    @Override
    void update(String message) {
        System.out.println("GreenDaoHandler handle update()" + message);
    }

    @Override
    void query(String message) {
        System.out.println("GreenDaoHandler handle query()" + message);
    }
}
