package com.itcast.threadlocal;

public class ThreadLocalSingleton {
    //threadlocal顾名思义存储线程本地变量的对象，多数据源切换可以用来存储数据源的key，多请求并发访问时互不影响
    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }

}
