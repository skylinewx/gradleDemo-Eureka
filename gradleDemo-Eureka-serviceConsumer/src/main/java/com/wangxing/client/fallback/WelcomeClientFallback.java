package com.wangxing.client.fallback;

import com.wangxing.client.WelcomeClient;
import org.springframework.stereotype.Component;

/**
 * @author wangxing
 * @date 2022/3/9
 **/
@Component
public class WelcomeClientFallback implements WelcomeClient {

    @Override
    public String info() {
        return "服务发生异常，请稍后~";
    }
}
