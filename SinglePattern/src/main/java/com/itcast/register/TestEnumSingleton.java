package com.itcast.register;

import com.itcast.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//枚举类防止反射以及序列化的源码跟读？？？
public class TestEnumSingleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*EnumSingleton instance = EnumSingleton.getInstance();
        Constructor<EnumSingleton> c = EnumSingleton.class.getDeclaredConstructor();
        c.setAccessible(true);
        EnumSingleton enumSingleton = c.newInstance("bk",666);
        System.out.println(enumSingleton);*/
        EnumSingleton instance = EnumSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();;
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            EnumSingleton o = (EnumSingleton)ois.readObject();
            ois.close();

            System.out.println(instance==o);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
