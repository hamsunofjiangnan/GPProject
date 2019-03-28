package com.itcast.JdkProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/28 23:29
 */
public class TestJdkProxy {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object instance = new JdkScalper().getInstance(new Hamsun());
        Method takeCard = instance.getClass().getMethod("takeCard", null);
        takeCard.invoke(instance);
    }
}
