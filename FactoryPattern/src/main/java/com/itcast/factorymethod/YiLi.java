package com.itcast.factorymethod;

public class YiLi implements IMilk {
    @Override
    public void create() {
        System.out.println("生产伊利！");
    }
}
