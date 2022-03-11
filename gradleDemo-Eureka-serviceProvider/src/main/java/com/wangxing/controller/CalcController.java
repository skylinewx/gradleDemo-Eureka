package com.wangxing.controller;

import com.googlecode.aviator.AviatorEvaluator;
import com.wangxing.domain.CalcParamVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author wangxing
 * @date 2022/3/9
 **/
@RestController
public class CalcController {

    @PostMapping("/doCalc")
    public Object doCalc(@RequestBody CalcParamVO paramVO){
        int value = ThreadLocalRandom.current().nextInt(10);
        if (value>3) {
            throw new RuntimeException("运算服务发生异常");
        }
        return AviatorEvaluator.execute(paramVO.getExp(), paramVO.getParam());
    }
}
