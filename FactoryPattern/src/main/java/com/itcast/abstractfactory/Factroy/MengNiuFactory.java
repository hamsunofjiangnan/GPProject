package com.itcast.abstractfactory.Factroy;

import com.itcast.abstractfactory.IFactory.IMilkFactory;
import com.itcast.abstractfactory.IProduction.LiquidMilk;
import com.itcast.abstractfactory.IProduction.PowderedMilk;
import com.itcast.abstractfactory.IProduction.Yogurt;

public class MengNiuFactory implements IMilkFactory {

    @Override
    public LiquidMilk productLiquidMilk() {
        return null;
    }

    @Override
    public PowderedMilk productPowderedMilk() {
        return null;
    }

    @Override
    public Yogurt productYogurt() {
        return null;
    }
}
