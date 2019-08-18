package com.onexzgj.yuanxing;

public class BusinessCard implements Cloneable {


    private String name;
    private String company;


    public BusinessCard() {
        System.out.println("执行了构造方法BusinessCard构造方法");
    }


    @Override
    protected BusinessCard clone()  {


        BusinessCard card=null;
        try {
            card= (BusinessCard) super.clone();
            return card;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void show(){
        System.out.println("BusinessCard{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}');
    }

}
