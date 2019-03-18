package com.itcast.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable{
    private static final long serialVersionUID = 2806584055749419362L;

    private final static SeriableSingleton instance= new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return instance;
    }

    //ObjectInputStream中hasReadResolveMethod会判断是否有readResolve方法，如果有则调用其返回结果覆盖原来的object返回
    private  Object readResolve(){
        return  instance;
    }

}
