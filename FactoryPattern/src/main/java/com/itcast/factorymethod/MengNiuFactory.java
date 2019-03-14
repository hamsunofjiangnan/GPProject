package com.itcast.factorymethod;

public class MengNiuFactory implements IMilkFactory {
    @Override
    public IMilk product() {
        return new MengNiu();
    }
}
