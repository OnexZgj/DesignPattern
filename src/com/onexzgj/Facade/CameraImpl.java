package com.onexzgj.Facade;

public class CameraImpl implements Camera {
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takepicture() {
        System.out.println("拍照");

    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
