package com.time.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http
		.csrf().disable()
		.headers().frameOptions().disable()
		.and()
			.authorizeRequests()
			.antMatchers("/",
					"/member/join",
					"/member/login"
					).permitAll()
			.antMatchers("/admin/**").hasAnyRole("USER")
			.anyRequest().authenticated()
		.and()
			.formLogin()
			.loginPage("/member/login")
			.loginProcessingUrl("/member/login").permitAll()
			.usernameParameter("memberid")
			.passwordParameter("memberpw")
		.and()
			.logout()
			.logoutUrl("/member/logout")
			.logoutSuccessUrl("/").permitAll()
		.and()
			.cors();
		return http.build();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
