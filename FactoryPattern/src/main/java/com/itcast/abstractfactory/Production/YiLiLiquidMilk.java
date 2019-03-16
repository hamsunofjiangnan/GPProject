package com.itcast.abstractfactory.Production;

import com.itcast.abstractfactory.IProduction.LiquidMilk;

public class YiLiLiquidMilk implements LiquidMilk {

    @Override
    public void create() {
        System.out.println("生产伊利液态奶.....");
    }
}
