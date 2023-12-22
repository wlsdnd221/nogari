package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.MemberDTO;

/* @RestController 어노테이션 사용 시 리턴값에 자동으로 @ResponseBody가 붙게되어,
 * 별도 어노테이션을 명시해주지 않아도 HTTP 응답데이터(body)에 자바 객체가 매핑되어 전달 된다. 
 * @RequestBody http요청의 본문(body)통째로 전달되고, 자바객체로 변환
 */

@RestController
public class LoginController {
	
	@PostMapping("/login")
	public MemberDTO Login(@RequestBody MemberDTO memberDto) {
		
		System.out.println("@@@@@@@@@@@@@ >> "+memberDto.toString());
		System.out.println("@@@@@@@@@@@@@ >> "+memberDto.getId());
		System.out.println("@@@@@@@@@@@@@ >> "+memberDto.getPw());
		
		memberDto.setId("test2");
		
		return memberDto;
	}
	
}
