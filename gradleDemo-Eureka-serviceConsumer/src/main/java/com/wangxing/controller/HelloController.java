package com.wangxing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wangxing.service.IHelloService;

@RestController
public class HelloController {

	@Autowired
	private IHelloService helloService;
	
	@RequestMapping("/sayHellow")
	public String sayHellow() {
		return helloService.sayHello();
	}
}
