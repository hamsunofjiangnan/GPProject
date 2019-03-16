package com.itcast.abstractfactory.Production;

import com.itcast.abstractfactory.IProduction.PowderedMilk;

public class GuangMingPowderedMilk implements PowderedMilk {
    @Override
    public void create() {
        System.out.println("生产光明奶粉......");
    }
}
