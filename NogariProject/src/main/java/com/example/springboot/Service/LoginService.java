package com.example.springboot.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Entity.MemberDTO;
import com.example.springboot.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	public MemberDTO login(MemberDTO mDto) throws Exception{
		
		Optional<MemberDTO> findMember = loginRepository.findById(mDto.getId());
		
		if(!findMember.orElseThrow(()-> new Exception("해당 아이디가 존재하지 않습니다.")).checkPassword(mDto.getPw())){
	        throw new IllegalStateException("아이디와 비밀번호가 일치하지 않습니다.");
	    }
		
		return findMember.get(); 
	}
	
	
	
}
