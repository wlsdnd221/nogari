package com.example.springboot.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.Entity.MemberDTO;
import com.example.springboot.Service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = {"/join", "/modify"})
	public String join(@RequestBody MemberDTO mdto, HttpServletRequest req) throws Exception {
		
		String flag = "";
		if(req.getServletPath().equals("/join")) { // 신규등록
			flag = "N";
		}else if(req.getServletPath().equals("/modify")) { // 수정
			flag = "O";
		}
		memberService.join(mdto, flag);
		
		return "redirect:/";
	}
	
	@PostMapping("/resign")
	public String resign(@RequestBody MemberDTO mDto) {
		memberService.resign(mDto);
		return "redirect:/";
	}
	
	
}
