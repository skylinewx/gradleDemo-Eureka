package com.wangxing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${spring.cloud.client.ip-address}")
	private String ip;
	
	@Value("${server.port}")
	private String port;
	
	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		return "this hello is from server:"+ip+":"+port+"</br>"
				+ "applicationName is "+appName;
	}
}
