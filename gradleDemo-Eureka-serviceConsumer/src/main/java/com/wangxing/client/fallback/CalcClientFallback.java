package com.wangxing.client.fallback;

import com.wangxing.client.CalcClient;
import com.wangxing.domain.CalcParamVO;
import org.springframework.stereotype.Component;

/**
 * @author wangxing
 * @date 2022/3/9
 **/
@Component
public class CalcClientFallback implements CalcClient {
    @Override
    public Object doCalc(CalcParamVO paramVO) {
        return "运算服务当前不可用，请稍后再试";
    }
}
