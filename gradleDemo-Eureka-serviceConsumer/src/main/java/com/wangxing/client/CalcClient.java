package com.wangxing.client;

import com.wangxing.client.fallback.CalcClientFallback;
import com.wangxing.domain.CalcParamVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangxing
 */
@FeignClient(name = "serviceProvider",contextId = "CalcClient",fallback = CalcClientFallback.class)
public interface CalcClient {

	/**
	 * 调用serviceProvider的计算逻辑
	 * @param paramVO
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST,value="/doCalc")
	Object doCalc(@RequestBody CalcParamVO paramVO);
}
