package com.itcast.lazy;

//doublecheck比较经典的懒汉式单例
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if(instance==null){//只有第一次需要构建实例的时候有锁竞争
            synchronized (LazyDoubleCheckSingleton.class) {
                if(instance==null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
