package com.onexzgj.Facade;

public interface Camera {

    /**
     * 打开相机
     */
    void open();

    /**
     * 拍照
     */
    void takepicture();

    /**
     * 关闭相机
     */
    void close();

}
