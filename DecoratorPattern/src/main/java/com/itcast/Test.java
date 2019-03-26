package com.itcast;

/**
 * @Author: hamsun
 * @Description:装饰器返回的对象是对原对象的增强，需要实现原对象的接口，或者继承同一父类，跟原对象是is-a的关系
 * 适配器模式可以使原对象兼容其他更多的接口，但适配器无需实现原对象的接口
 * @Date: 2019/3/26 23:19
 */
public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.eat();
        woman.eat();
        new DecoratorMan(man).eat();
        new DecoratorMan(man).work();
        new DecoratorWoman(woman).eat();
        new DecoratorWoman(woman).work();
    }
}
