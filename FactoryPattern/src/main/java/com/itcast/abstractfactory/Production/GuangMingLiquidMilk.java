package com.itcast.abstractfactory.Production;

import com.itcast.abstractfactory.IProduction.LiquidMilk;

public class GuangMingLiquidMilk implements LiquidMilk {

    @Override
    public void create() {
        System.out.println("生产光明液态奶.....");
    }
}
