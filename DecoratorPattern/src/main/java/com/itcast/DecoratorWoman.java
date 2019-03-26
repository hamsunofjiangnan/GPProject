package com.itcast;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/26 23:18
 */
public class DecoratorWoman extends Decorator {

    public DecoratorWoman(Person person) {
        super(person);
    }

    public void work() {
        System.out.println("负责带娃!");
    }
}
