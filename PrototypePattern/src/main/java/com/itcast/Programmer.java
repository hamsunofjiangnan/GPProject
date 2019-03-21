package com.itcast;

import java.io.*;

public class Programmer implements Cloneable,Serializable{
    protected String name;
    protected int age;
    protected Computer computer;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        Object o = ois.readObject();
        return o;
    }
}
