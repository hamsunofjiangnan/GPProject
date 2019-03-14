package com.itcast.factorymethod;

/**
 * 一个工厂负责创建一种产品，分工明确
 * 符合开闭原则，扩展性强
 * 工厂方法让类的实例化推迟到子类中进行
 * 客户端不用关心产品实例化细节，创建对应工厂即可得到对应对象
 * 缺点：增加类结构和代码复杂性
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        new GuangMingFactory().product().create();
        new YiLiFactory().product().create();
    }
}
