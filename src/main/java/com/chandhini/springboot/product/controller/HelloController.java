package com.chandhini.springboot.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(@RequestParam String name) {
		return "Hello " + name + "! Welcome to Software Solutions";
	}

}
