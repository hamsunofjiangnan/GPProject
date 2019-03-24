package com.itcast.riskmodel;

/**
 * 风控模型
 */
public abstract class RiskControllModel {

    public abstract String getName();

    public abstract String doAction(int flag);

    public void printRes(int flag){
        System.out.println(getName()+":"+doAction(flag));
    }


}
