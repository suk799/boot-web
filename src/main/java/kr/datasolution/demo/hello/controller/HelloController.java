package kr.datasolution.demo.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TEST_1
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "hello";
	}

}
