package com.itcast.MyProxy;


import com.itcast.Hamsun;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class MyProxyTest {

    public static void main(String[] args) throws Exception {
        Object instance = new MyScalper().getInstance(new Hamsun());//instance即为$Proxy0.class
        Method takeCard = instance.getClass().getMethod("takeCard", null);//反射调用$Proxy0的takeCard方法，$Proxy0调用的MyScapler的takeCard方法
        takeCard.invoke(instance);
    }

}

