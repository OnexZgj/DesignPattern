package com.onexzgj.celue;

public class Context {

    private TravelWays travelWays;

    public Context(TravelWays travelWays) {
        this.travelWays = travelWays;
    }

    public void selectTransportation(){
        travelWays.selectTransportation();
    }
}
