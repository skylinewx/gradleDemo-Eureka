package com.wangxing.controller;

import com.wangxing.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxing
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	private final WelcomeService welcomeService;

	@Autowired
	public WelcomeController(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}

	@RequestMapping("/info")
	public String info() {
		return welcomeService.info();
	}
}
