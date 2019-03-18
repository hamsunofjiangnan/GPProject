package com.itcast.seriable;

import com.itcast.lazy.LazyInnerClassSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSeriableSingleton {
    public static void main(String[] args) {
        SeriableSingleton instance = SeriableSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();;
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SeriableSingleton o = (SeriableSingleton)ois.readObject();
            ois.close();

            System.out.println(instance);
            System.out.println(o);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
