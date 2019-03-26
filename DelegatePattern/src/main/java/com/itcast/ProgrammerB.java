package com.itcast;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/26 23:44
 */
public class ProgrammerB implements Programmer {
    @Override
    public void writeCode(String command) {
        if("python".equals(command)){
            System.out.println("编写python代码");
        }else{
            System.out.println("超出能力范畴");
        }

    }
}
