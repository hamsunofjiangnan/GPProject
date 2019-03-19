package com.itcast.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//springioc的思想
public class ContainerSingleton {
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object o = Class.forName(className).newInstance();
                ioc.put(className,o);
                return o;
            }else{
                return ioc.get(className);
            }
        }
    }

}
