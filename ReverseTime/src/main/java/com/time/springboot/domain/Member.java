package com.time.springboot.domain;

import java.time.LocalDate;
import java.util.Collection;

import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Member {
	
	private String memberid;
	private String memberpw;
	private String membername;
	private String phone;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birth;
	private RoleType rolename;	//사용자 구분. 'ROLE_USER':일반사용자
}
