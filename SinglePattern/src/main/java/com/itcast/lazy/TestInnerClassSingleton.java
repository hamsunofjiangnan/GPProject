package com.itcast.lazy;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestInnerClassSingleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //System.out.println(LazyInnerClassSingleton.getInstance()==LazyInnerClassSingleton.getInstance());
        Constructor<LazyInnerClassSingleton> c = LazyInnerClassSingleton.class.getDeclaredConstructor();
        c.setAccessible(true);
        LazyInnerClassSingleton o1 = c.newInstance();
        System.out.println("o1:"+o1);
        LazyInnerClassSingleton o2 = c.newInstance();
        System.out.println("o2:"+o2);
    }
}
