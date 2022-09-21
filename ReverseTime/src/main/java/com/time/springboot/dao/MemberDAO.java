package com.time.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.time.springboot.domain.Member;

@Mapper
public interface MemberDAO {
	
	public int insertMember(Member member);
	
	public Member selectMember(String memberid);
}
