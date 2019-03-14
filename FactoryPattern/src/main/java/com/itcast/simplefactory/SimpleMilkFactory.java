package com.itcast.simplefactory;

public class SimpleMilkFactory {
    public IMilk product(MilkType type){
        switch (type){
            case MengNiu:
                return new MengNiu();
            case YiLi:
                return new YiLi();
            case GuangMing:
                return new GuangMing();
            default:
                return null;
        }
    }
}
