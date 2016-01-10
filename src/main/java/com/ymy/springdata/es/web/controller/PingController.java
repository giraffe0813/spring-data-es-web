package com.ymy.springdata.es.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ping
 */
@Controller
@RequestMapping("/base")
public class PingController {
	
	/**
	 * 简单判断服务是否启动成功
	 * 
	 * @return
	 */
	@RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	String ping() {
		return "ping success";
	}

}
