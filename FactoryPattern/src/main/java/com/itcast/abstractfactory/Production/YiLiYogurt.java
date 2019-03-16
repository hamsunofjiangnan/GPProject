package com.itcast.abstractfactory.Production;

import com.itcast.abstractfactory.IProduction.Yogurt;

public class YiLiYogurt implements Yogurt {
    @Override
    public void create() {
        System.out.println("生产伊利酸奶....");
    }
}
