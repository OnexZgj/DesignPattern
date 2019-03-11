package com.onexzgj.Facade;

public class MobliePhone {

    private Phone mPhone=new PhoneImpl();
    private Camera mCamera=new CameraImpl();


    /**
     * 视频聊天
     */
    public void videoChat(){
        System.out.println("-->视频浏览");
        mCamera.open();
        mPhone.dail();
    }

    /**
     * 挂断电话
     */
    public void hangup(){
        mPhone.hangup();
    }


    /**
     * 拍照
     */
    public void takepic(){
        mCamera.open();
        mCamera.takepicture();
    }


    /**
     * 关闭相机
     */
    public void colseCamera(){
        mCamera.close();
    }


}
