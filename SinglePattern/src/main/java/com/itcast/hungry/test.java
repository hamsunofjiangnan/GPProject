package com.itcast.hungry;

import java.lang.reflect.Constructor;

public class test {
    public static void main(String[] args) throws Exception {
        //HungrySingleton.getInstance();
        Class<?> clazz = HungrySingleton.class;
        Constructor<?> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o = c.newInstance();
        Object o1 = c.newInstance();
        System.out.println(o==o1);
        System.out.println(o);
    }
}
