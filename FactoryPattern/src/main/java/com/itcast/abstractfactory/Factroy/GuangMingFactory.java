package com.itcast.abstractfactory.Factroy;

import com.itcast.abstractfactory.IFactory.IMilkFactory;
import com.itcast.abstractfactory.IProduction.LiquidMilk;
import com.itcast.abstractfactory.IProduction.PowderedMilk;
import com.itcast.abstractfactory.IProduction.Yogurt;
import com.itcast.abstractfactory.Production.GuangMingLiquidMilk;
import com.itcast.abstractfactory.Production.GuangMingPowderedMilk;
import com.itcast.abstractfactory.Production.GuangMingYogurt;

public class GuangMingFactory implements IMilkFactory {

    @Override
    public LiquidMilk productLiquidMilk() {
        return new GuangMingLiquidMilk();
    }

    @Override
    public PowderedMilk productPowderedMilk() {
        return new GuangMingPowderedMilk();
    }

    @Override
    public Yogurt productYogurt() {
        return new GuangMingYogurt();
    }
}
