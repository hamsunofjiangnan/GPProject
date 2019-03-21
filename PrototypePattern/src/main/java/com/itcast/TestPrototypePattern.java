package com.itcast;

import java.io.IOException;

public class TestPrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Programmer programmer = new Programmer();
        programmer.name = "hamsun";
        programmer.age = 18;
        programmer.computer = new Computer("ASUS","COREi7");

        Programmer simpleClone = (Programmer)programmer.clone();
        Programmer deepClone = (Programmer)programmer.deepClone();

        System.out.println("programmer:"+programmer);
        System.out.println("simpleClone:"+simpleClone);
        System.out.println("deepClone:"+deepClone);

        System.out.println(simpleClone.computer==programmer.computer);
        System.out.println(deepClone.computer==programmer.computer);

    }
}
