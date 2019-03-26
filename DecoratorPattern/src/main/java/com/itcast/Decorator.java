package com.itcast;

/**
 * 原始装饰类
 * @author hamsun
 *
 */
public class Decorator implements Person{
    @SuppressWarnings("unused")
    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        System.out.println("在高档餐厅吃麻辣烫");
    }

}