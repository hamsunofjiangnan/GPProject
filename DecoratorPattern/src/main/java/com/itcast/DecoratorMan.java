package com.itcast;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/26 23:18
 */
public class DecoratorMan extends Decorator{

    public DecoratorMan(Person person) {
        super(person);
    }

    public void work() {
        System.out.println("负责赚钱!");
    }
}
