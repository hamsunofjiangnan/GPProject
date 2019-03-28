package com.itcast.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/28 23:05
 */
public class JdkScalper implements InvocationHandler {
    private Object proxyee;

    public Object getInstance(Object proxyee){
        this.proxyee = proxyee;
        Class<?> clazz = proxyee.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.proxyee, args);
        after();
        return invoke;
    }

    private void before(){
        System.out.println("准备拍牌程序");
    }

    private void after(){
        System.out.println("拍牌成功");
    }

}
