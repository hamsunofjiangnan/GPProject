package com.itcast;

import java.io.Serializable;

public class Computer implements Serializable{
    private String name;
    private String cpu;

    public Computer(String name, String cpu) {
        this.name = name;
        this.cpu = cpu;
    }
}
