package com.example.springboot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class MemberDTO {
	
	@Id
	private String id;
	private String pw;	
	
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}


	
}
