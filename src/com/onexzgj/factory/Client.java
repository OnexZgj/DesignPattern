package com.onexzgj.factory;

public class Client {

    public static void main(String[] args){

        AbastractIoFactory ioFactory=new IoFactory();

        IoHandler greenDaoHandler = ioFactory.getIoHandler(GreenDaoHandler.class);
        greenDaoHandler.add("One X");
        greenDaoHandler.delete("One X");
        greenDaoHandler.update("One X");
        greenDaoHandler.query("One X");


        IoHandler realRoomHandler = ioFactory.getIoHandler(RealRoomHandler.class);
        realRoomHandler.add("One X");
        realRoomHandler.delete("One X");
        realRoomHandler.update("One X");
        realRoomHandler.query("One X");

    }
}
