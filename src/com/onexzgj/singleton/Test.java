package com.onexzgj.singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println(CEO.getCeo());
        System.out.println(CEO.getCeo());
        System.out.println(new VP());
        System.out.println(new VP());

        System.out.println(new Staff());
        System.out.println(new Staff());
        System.out.println(new Staff());
        System.out.println(new Staff());
    }

//    com.onexzgj.singleton.CEO@61bbe9ba
//    com.onexzgj.singleton.CEO@61bbe9ba
//    com.onexzgj.singleton.VP@610455d6
//    com.onexzgj.singleton.VP@511d50c0
//    com.onexzgj.singleton.Staff@60e53b93
//    com.onexzgj.singleton.Staff@5e2de80c
//    com.onexzgj.singleton.Staff@1d44bcfa
//    com.onexzgj.singleton.Staff@266474c2
}
