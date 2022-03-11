package com.wangxing.controller;

import com.wangxing.domain.CalcParamVO;
import com.wangxing.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxing
 */
@RestController
public class CalcController {

	private final CalcService calcService;

	@Autowired
	public CalcController(CalcService calcService) {
		this.calcService = calcService;
	}

	@PostMapping("/doCalc")
	public Object doCalc(@RequestBody CalcParamVO calcParamVO) {
		return calcService.doCalc(calcParamVO.getExp(), calcParamVO.getParam());
	}
}
