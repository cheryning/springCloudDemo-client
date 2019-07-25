package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Controller
public class DemoController {

	@Autowired
	RestOperations  restTemplate;; 
	
	@RequestMapping("/getString")
	@ResponseBody
	public String getString() {
		
		String url = "http://CLIENTDEMO/getName";
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}
}
