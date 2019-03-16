package com.itcast.abstractfactory.Factroy;

import com.itcast.abstractfactory.IFactory.IMilkFactory;
import com.itcast.abstractfactory.IProduction.LiquidMilk;
import com.itcast.abstractfactory.IProduction.PowderedMilk;
import com.itcast.abstractfactory.IProduction.Yogurt;
import com.itcast.abstractfactory.Production.YiLiLiquidMilk;
import com.itcast.abstractfactory.Production.YiLiPowderedMilk;
import com.itcast.abstractfactory.Production.YiLiYogurt;

public class YiLiFactory implements IMilkFactory {

    @Override
    public LiquidMilk productLiquidMilk() {
        return new YiLiLiquidMilk();
    }

    @Override
    public PowderedMilk productPowderedMilk() {
        return new YiLiPowderedMilk();
    }

    @Override
    public Yogurt productYogurt() {
        return new YiLiYogurt();
    }
}
