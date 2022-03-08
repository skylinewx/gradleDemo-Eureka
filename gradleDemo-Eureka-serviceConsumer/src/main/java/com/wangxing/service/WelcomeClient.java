package com.wangxing.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wangxing
 */
@FeignClient(name = "serviceProvider")
public interface WelcomeClient {

	@RequestMapping(method=RequestMethod.GET,value="/welcome/info")
	String info();
}
