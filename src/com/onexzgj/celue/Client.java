package com.onexzgj.celue;

public class Client {

    public static void main(String[] args) {

        Context context;

        //短途选择自行车
        TravelWays bicycle=new BicycleWay();
        context=new Context(bicycle);
        context.selectTransportation();

        //中短途选择公交
        TravelWays bus=new BusWay();
        context=new Context(bus);
        context.selectTransportation();

        //远程选择小汽车
        TravelWays car=new CarWay();
        context=new Context(car);
        context.selectTransportation();

    }
}
