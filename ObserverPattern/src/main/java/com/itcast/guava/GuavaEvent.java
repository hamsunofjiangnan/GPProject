package com.itcast.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/26 23:02
 */
public class GuavaEvent {

    /**
     * 只有通过@Subscribe注解的方法才会被注册进EventBus
     * 而且方法有且只能有1个参数
     *
     * @param teacher
     */
    @Subscribe
    public void subscribe(Teacher teacher){
        System.out.println(teacher.getName()+"老师你好，你收到一个问题！");
    }

    /**
     * 多个方法，会根据参数类型匹配，若参数类型一样则都会执行
     * @param integer
     */
    @Subscribe
    public void subscribe1(Integer integer){
        System.out.println(integer);
    }

    /**
     * 多个方法，会根据参数类型匹配，若参数类型一样则都会执行
     * @param integer
     */
    @Subscribe
    public void subscribe3(Integer integer){
        System.out.println(integer);
    }
}
