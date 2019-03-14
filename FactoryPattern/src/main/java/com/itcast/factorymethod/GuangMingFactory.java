package com.itcast.factorymethod;

public class GuangMingFactory implements IMilkFactory {
    @Override
    public IMilk product() {
        return new GuangMing();
    }
}
