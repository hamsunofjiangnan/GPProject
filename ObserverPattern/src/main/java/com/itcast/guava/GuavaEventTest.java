package com.itcast.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/26 23:02
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post(new Teacher("Tom"));
        eventBus.post(new Teacher("James"));

    }
}
