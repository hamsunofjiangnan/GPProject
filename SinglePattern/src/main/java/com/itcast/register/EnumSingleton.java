package com.itcast.register;

public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void doSomething(){
        System.out.println("执行枚举对象的方法");
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
