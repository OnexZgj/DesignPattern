package com.onexzgj.factory;

public class RealRoomHandler extends IoHandler {
    @Override
    void add(String message) {
        System.out.println("RealRoomHandler handle add()" + message);
    }

    @Override
    void delete(String message) {
        System.out.println("RealRoomHandler handle delete()" + message);
    }

    @Override
    void update(String message) {
        System.out.println("RealRoomHandler handle update()" + message);
    }

    @Override
    void query(String message) {
        System.out.println("RealRoomHandler handle query()" + message);
    }
}
