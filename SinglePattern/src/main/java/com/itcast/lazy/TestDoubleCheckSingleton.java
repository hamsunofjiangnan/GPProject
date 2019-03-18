package com.itcast.lazy;

public class TestDoubleCheckSingleton {
    public static void main(String[] args) {
        new Thread(()->{
            LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+"###"+instance);
        }).start();
        new Thread(()->{
            LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+"###"+instance);
        }).start();
    }
}
