package com.itcast.CglibProxy;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/28 23:32
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        Hamsun instance = (Hamsun)new CglibScalper().getInstance(Hamsun.class);
        instance.takeCard();
    }
}
