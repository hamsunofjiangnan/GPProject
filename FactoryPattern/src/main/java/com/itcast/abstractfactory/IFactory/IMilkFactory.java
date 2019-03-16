package com.itcast.abstractfactory.IFactory;

import com.itcast.abstractfactory.IProduction.LiquidMilk;
import com.itcast.abstractfactory.IProduction.PowderedMilk;
import com.itcast.abstractfactory.IProduction.Yogurt;

public interface IMilkFactory {
    public LiquidMilk productLiquidMilk();
    public PowderedMilk productPowderedMilk();
    public Yogurt productYogurt();
}
