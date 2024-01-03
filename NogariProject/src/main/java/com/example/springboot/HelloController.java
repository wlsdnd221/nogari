package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "TEST1";
	}

//	@GetMapping("/test")
//	public String test(String pw) {
//		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
//		String a = bcpe.encode("test1");
//		if(bcpe.matches(pw, a)) return "accept";
//		else return "wrong";
//	}
	
}
