package com.wangxing.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("serviceProvider")
public interface IHelloService {

	@RequestMapping(method=RequestMethod.GET,value="/sayHello")
	String sayHello();
}
