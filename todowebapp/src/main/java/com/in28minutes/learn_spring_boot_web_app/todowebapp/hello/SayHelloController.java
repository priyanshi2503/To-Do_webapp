package com.in28minutes.learn_spring_boot_web_app.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	@RequestMapping("say-hello-jsp")
	@ResponseBody
	public String sayHelloJsp() {
		return "sayHello";
	}
}
