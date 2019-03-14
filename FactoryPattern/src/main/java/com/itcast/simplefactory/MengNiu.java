package com.itcast.simplefactory;

public class MengNiu implements IMilk {
    @Override
    public void create() {
        System.out.println("生产蒙牛！");
    }
}
