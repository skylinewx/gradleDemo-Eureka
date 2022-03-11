package com.wangxing.service;

import com.wangxing.client.CalcClient;
import com.wangxing.client.WelcomeClient;
import com.wangxing.domain.CalcParamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wangxing
 * @date 2022/3/9
 **/
@Service
public class CalcService {

    @Autowired
    private CalcClient calcClient;

    public Object doCalc(String exp, Map<String,Object> param){
        CalcParamVO paramVO = new CalcParamVO();
        paramVO.setParam(param);
        paramVO.setExp(exp);
        return calcClient.doCalc(paramVO);
    }
}
