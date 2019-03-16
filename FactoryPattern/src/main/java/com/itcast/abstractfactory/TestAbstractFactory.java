package com.itcast.abstractfactory;


import com.itcast.abstractfactory.Factroy.GuangMingFactory;
import com.itcast.abstractfactory.Factroy.YiLiFactory;

/**
 * 相比工厂方法，可扩展性更强
 * 产品族（品牌）和产品等级结构（同品牌不同的产品种类）
 * 确定：增加类文件，增加代码结构复杂性
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        new GuangMingFactory().productLiquidMilk().create();
        new GuangMingFactory().productYogurt().create();
        new GuangMingFactory().productPowderedMilk().create();

        new YiLiFactory().productLiquidMilk().create();
        new YiLiFactory().productYogurt().create();
        new YiLiFactory().productPowderedMilk().create();
    }
}
