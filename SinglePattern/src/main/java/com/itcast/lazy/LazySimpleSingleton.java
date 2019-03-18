package com.itcast.lazy;

//最简单的懒汉式
//每次获取实例都锁定整个类，效率较低
public class LazySimpleSingleton {
    private static LazySimpleSingleton instance;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if(instance == null){
            instance = new LazySimpleSingleton();
        }

        return instance;
    }

}
