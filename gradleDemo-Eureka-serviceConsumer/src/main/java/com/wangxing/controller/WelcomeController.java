package com.wangxing.controller;

import com.wangxing.service.WelcomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxing
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	@Autowired
	private WelcomeClient helloService;
	
	@RequestMapping("/info")
	public String info() {
		return helloService.info();
	}
}
