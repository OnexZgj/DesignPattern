package com.onexzgj.yuanxing;

public class Client {

    public static void main(String[] args) {

//        BusinessCard card=new BusinessCard();
//        card.setName("张三");
//        card.setCompany("阿里");
//
//        BusinessCard clone = card.clone();
//        clone.setName("李四");
//        clone.setCompany("百度");
//
//        BusinessCard clone2 = card.clone();
//        clone2.setName("王五");
//        clone2.setCompany("腾讯");
//
//        card.show();
//        clone.show();
//        clone2.show();





        DeepBusinessCard card=new DeepBusinessCard();
        card.setName("张三");
        card.setCompany("阿里","望京");

        DeepBusinessCard clone = card.clone();
        clone.setName("李四");
        clone.setCompany("百度","中关村");

        DeepBusinessCard clone2 = card.clone();
        clone2.setName("王五");
        clone2.setCompany("腾讯","西二旗");

        clone.show();
        card.show();
        clone2.show();


    }
}
