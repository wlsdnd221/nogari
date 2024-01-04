package com.example.springboot.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Entity.MemberDTO;
import com.example.springboot.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;
	
	// 신규등록 및 수정
	public void join(MemberDTO mDto, String flag) throws Exception {
		
		if("N".equals(flag)) {
			boolean dupChk = duplicateChk(mDto.getId());		// 중복체크
			if(!dupChk) {
				throw new IllegalStateException("이미 사용중인 아이디 입니다.");
			}
		}
		
		memberRepository.save(mDto);
		
	}
	
	// 아이디 중복체크
	public boolean duplicateChk(String id) {
		
		Optional<MemberDTO> findId = memberRepository.findById(id);
		
		if(findId.isPresent()) return false;
		
		return true;
		
	}
	
	// 회원삭제
	public void resign(MemberDTO mDto) {
		memberRepository.deleteById(mDto.getId());
	}
	
	
}
