package com.example.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.Entity.MemberDTO;

public interface LoginRepository extends JpaRepository<MemberDTO, String> {
	
	@Override
	Optional<MemberDTO> findById(String id);
}
