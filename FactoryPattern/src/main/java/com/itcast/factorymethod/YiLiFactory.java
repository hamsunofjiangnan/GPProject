package com.itcast.factorymethod;

public class YiLiFactory implements IMilkFactory {
    @Override
    public IMilk product() {
        return new YiLi();
    }
}
