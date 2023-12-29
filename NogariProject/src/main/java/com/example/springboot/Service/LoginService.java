package com.example.springboot.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Entity.MemberDTO;
import com.example.springboot.repository.LoginRepository;

@Service
public class LoginService {
	
	private final LoginRepository loginRepository;

	@Autowired
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
	
	public Optional<MemberDTO> login(MemberDTO mDto) {
		return loginRepository.findById(mDto.getId());
	}
	
	
	
}
