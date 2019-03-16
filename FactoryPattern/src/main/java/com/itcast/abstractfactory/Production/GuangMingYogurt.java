package com.itcast.abstractfactory.Production;

import com.itcast.abstractfactory.IProduction.Yogurt;

public class GuangMingYogurt implements Yogurt {
    @Override
    public void create() {
        System.out.println("生产光明酸奶....");
    }
}
