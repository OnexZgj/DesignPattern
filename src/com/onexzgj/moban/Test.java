package com.onexzgj.moban;

public class Test {

    public static void main(String[] args) {
        AbstractComputer winComputer=new WinComputer();
        winComputer.startUp();

        AbstractComputer macComputer=new MacComputer();
        macComputer.startUp();
    }
}
