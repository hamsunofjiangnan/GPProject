package com.itcast.simplefactory;

public class GuangMing implements IMilk {
    @Override
    public void create() {
        System.out.println("生产光明！");
    }
}
