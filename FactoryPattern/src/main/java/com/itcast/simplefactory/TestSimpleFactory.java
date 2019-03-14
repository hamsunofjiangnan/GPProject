package com.itcast.simplefactory;

/**
 * 简单工厂模式
 * 适合产品种类不多，产品不复杂的情形
 * 不符合开闭原则，不属于GoF23种，不易扩展
 *
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        new SimpleMilkFactory().product(MilkType.GuangMing).create();
        new SimpleMilkFactory().product(MilkType.MengNiu).create();
    }
}
