package com.wangxing.domain;

import java.util.Map;

/**
 * @author wangxing
 * @date 2022/3/9
 **/
public class CalcParamVO {
    private String exp;
    private Map<String,Object> param;

    public CalcParamVO setExp(String exp) {
        this.exp = exp;
        return this;
    }

    public CalcParamVO setParam(Map<String, Object> param) {
        this.param = param;
        return this;
    }

    public String getExp() {
        return exp;
    }

    public Map<String, Object> getParam() {
        return param;
    }
}
