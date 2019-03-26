package com.itcast;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/26 23:48
 */
public class Manager {
    private Map<String,Programmer> map = new HashMap<>();

    public Manager() {
        map.put("java",new ProgrammerA());
        map.put("python",new ProgrammerB());
    }

    public void completeProject(String commond){
        if(map.containsKey(commond)){
            map.get(commond).writeCode(commond);
        }else {
            System.out.println("超出能力范畴");
        }

    }
}
