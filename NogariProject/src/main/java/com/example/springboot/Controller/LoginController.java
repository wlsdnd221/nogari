package com.example.springboot.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.MemberDTO;
import com.example.springboot.Service.LoginService;

/* @RestController 어노테이션 사용 시 리턴값에 자동으로 @ResponseBody가 붙게되어,
 * 별도 어노테이션을 명시해주지 않아도 HTTP 응답데이터(body)에 자바 객체가 매핑되어 전달 된다. 
 * @RequestBody http요청의 본문(body)통째로 전달되고, 자바객체로 변환
 */

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;

	
	@PostMapping("/login")
	public MemberDTO Login(@RequestBody MemberDTO memberDto) throws Exception {
		
		MemberDTO loginMember = loginService.login(memberDto);
		
		return loginMember;
	}
	
}
