package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/getName")
	@ResponseBody
	public String getName() {
		return port;
	}
}
