package com.itcast.CglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/28 23:32
 */
public class CglibScalper implements MethodInterceptor{
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object o1 = methodProxy.invokeSuper(o, objects);
        after();
        return o1;
    }

    private void before(){
        System.out.println("准备拍牌程序");
    }

    private void after(){
        System.out.println("拍牌成功");
    }
}
