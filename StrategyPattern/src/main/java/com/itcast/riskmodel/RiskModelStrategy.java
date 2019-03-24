package com.itcast.riskmodel;

import java.util.HashMap;

public class RiskModelStrategy {
    public static String KJHK = "KJHK";//跨境汇款
    public static String KJSK = "KJSK";//跨境收款

    private static HashMap<String,RiskControllModel> strategys = new HashMap<String, RiskControllModel>();

    static {//风控策略注册到容器
        strategys.put(KJHK,new KJHKRiskModel());
        strategys.put(KJSK,new KJSKRiskModel());
    }

    public static RiskControllModel getModel(String modelName){
        return strategys.get(modelName);
    }


}
