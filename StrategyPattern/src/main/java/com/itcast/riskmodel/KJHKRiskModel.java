package com.itcast.riskmodel;

public class KJHKRiskModel extends RiskControllModel {
    public String getName() {
        return "跨境汇款风控模型";
    }

    public String doAction(int flag) {
        if(flag == 1){
            return "指纹识别";
        }else if(flag == 2){
            return "验证码识别";
        }else {
            return "强制修改密码，重新登录";
        }
    }
}
