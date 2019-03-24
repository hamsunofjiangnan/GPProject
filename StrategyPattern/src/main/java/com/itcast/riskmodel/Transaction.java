package com.itcast.riskmodel;

/**
 * 交易类
 */
public class Transaction {
    public void verification(RiskControllModel rcm,int flag){
        rcm.doAction(flag);
        rcm.printRes(flag);
    }


}
