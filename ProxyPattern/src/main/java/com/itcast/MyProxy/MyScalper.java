package com.itcast.MyProxy;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class MyScalper implements MyInvocationHandler {
    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("准备拍牌程序");
    }

    private void after(){
        System.out.println("拍牌成功");
    }
}
