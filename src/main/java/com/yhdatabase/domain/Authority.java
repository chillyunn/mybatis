package com.yhdatabase.domain;

public class Authority {
	private Long id;
	private Member member;
	private String name;

	public Authority() {
	}

	public Authority(Member member, String name) {
		this.member = member;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMember() {
		return this.member.getId();
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
