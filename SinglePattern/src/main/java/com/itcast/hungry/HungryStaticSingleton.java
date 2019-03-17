package com.itcast.hungry;

//静态饿汉式跟普通饿汉式没有本质区别，只是实例化从静态变量延迟到静态代码块，依然可以被反射攻击
public class HungryStaticSingleton {
    private static final HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}


    public static HungryStaticSingleton getInstance(){
        return instance;
    }
}
