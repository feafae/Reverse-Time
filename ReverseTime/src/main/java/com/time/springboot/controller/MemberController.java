package com.time.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.time.springboot.dao.MemberDAO;
import com.time.springboot.domain.Member;
import com.time.springboot.domain.RoleType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
		@GetMapping("/join")
		public String join() {
			log.info("joinForm");
			return "/member/joinForm";
		}
		@PostMapping("/join")
		public String join(Member member) {
			log.info("member : {}", member);
			int result = memberDAO.insertMember(member);
			return "redirect:/";
		}
		@GetMapping("/login")
		public String loginForm() {
			
			return "/member/loginForm";
		}
		@PostMapping("/login")
		public String login() {
			return "redirect:/";
		}
		
		// change this
		// 이렇게 해주세요
		// change this
		
		//엄ㄴ어ㅏㅜ마ㅓ우ㅏㅁ저우머ㅏㅈㅇㅁㅇㅇ
}

