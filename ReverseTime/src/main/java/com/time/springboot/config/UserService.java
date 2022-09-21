package com.time.springboot.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.time.springboot.dao.MemberDAO;
import com.time.springboot.domain.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
	
	private final MemberDAO memberDAO;

	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException {
		Member findMember = memberDAO.selectMember(username);
		if (findMember != null) {
			return new Userinfo(findMember);
		}
		return null;
	}
}
