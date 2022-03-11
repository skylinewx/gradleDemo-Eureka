package com.wangxing.service;

import com.wangxing.client.WelcomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxing
 * @date 2022/3/9
 **/
@Service
public class WelcomeService {

    @Autowired
    private WelcomeClient welcomeClient;

    public String info(){
        return welcomeClient.info();
    }
}
