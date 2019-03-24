package com.itcast.riskmodel;

/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/24 14:12
 */
public class TestRiskModel {
    public static void main(String[] args) {
        new Transaction().verification(RiskModelStrategy.getModel(RiskModelStrategy.KJHK),3);
    }

}
