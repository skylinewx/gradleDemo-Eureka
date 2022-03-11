package com.wangxing.client;

import com.wangxing.client.fallback.WelcomeClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wangxing
 */
@FeignClient(name = "serviceProvider",contextId = "WelcomeClient",fallback = WelcomeClientFallback.class)
public interface WelcomeClient {

	@RequestMapping(method=RequestMethod.GET,value="/welcome/info")
	String info();
}
