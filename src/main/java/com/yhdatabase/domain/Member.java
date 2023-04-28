package com.yhdatabase.domain;

import java.util.List;

public class Member {
	private Long id;
	private String name;
	private String email;
	private List<Authority> authorities;


	public Member() {
	}


	public Member(String name,String email) {
		this.name = name;
		this.email = email;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Authority> getAuthorities() {
		return authorities;
	}


	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}



}
