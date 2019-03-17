package com.itcast.hungry;

public class HungrySingleton {
    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){
        System.out.println("静态变量");
    }
    static {
        System.out.println("静态代码块");
    }


    public static HungrySingleton getInstance(){
        return instance;
    }


}
