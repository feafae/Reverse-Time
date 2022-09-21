package com.time.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.springboot.dao.MemberDAO;
import com.time.springboot.domain.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberSeviceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public int insertMember(Member member) {
		return memberDAO.insertMember(member);
	}
}
