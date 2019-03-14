package com.itcast.factorymethod;

public class MengNiu implements IMilk {
    @Override
    public void create() {
        System.out.println("生产蒙牛！");
    }
}
