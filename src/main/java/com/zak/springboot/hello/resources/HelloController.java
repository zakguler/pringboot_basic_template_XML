package com.zak.springboot.hello.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//@RequestMapping("/hello")
	@RequestMapping(value = "/hello", method = RequestMethod.GET,
					produces = { "application/json", "application/xml" })
	public String sayHi() {
		return "Zak:3000...Hi from spring boot";
	}
	
}
