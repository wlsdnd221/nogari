package com.example.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.Entity.MemberDTO;

public interface MemberRepository extends JpaRepository<MemberDTO, String>{
	
	@Override
	MemberDTO save(MemberDTO mDto);
	
	@Override
	Optional<MemberDTO> findById(String id);
	
	@Override
	void deleteById(String id);
}
