package com.itcast.CglibProxy;

import com.itcast.Hamsun;

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
