package com.itcast.lazy;

import java.io.Serializable;

public class LazyInnerClassSingleton{

    private LazyInnerClassSingleton(){
        if(InnerClass.instance!=null){//防止反射实例化
            throw new RuntimeException("单例已经实例化,不能重复构建");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    //内部类是延时加载的，也就是说只会在第一次使用时加载。不使用就不加载
    private static class InnerClass{
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();//静态变量，只加载一次，也就是只调用一次构造方法

    }
}
