package com.onexzgj.yuanxing;

public class DeepBusinessCard implements Cloneable {


    private String name;
    private Company company =new Company();


    public DeepBusinessCard() {
        System.out.println("执行了构造方法BusinessCard构造方法");
    }


    @Override
    protected DeepBusinessCard clone()  {


        DeepBusinessCard card=null;
        try {
            card= (DeepBusinessCard) super.clone();
            card.company=this.company.clone();
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(String name,String address) {
        this.company.setName(name);
        this.company.setAddress(address);
    }


    public void show(){
        System.out.println("BusinessCard{" +
                "name='" + name + '\'' +
                ", address='" + company.getAddress() + '\'' +"name"+company.getName()+
                '}');
    }

}
