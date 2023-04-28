package com.yhdatabase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yhdatabase.domain.Member;
import com.yhdatabase.service.MemberService;

@RestController
public class MemberController {

	private final MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@PostMapping(value = "/api/member/save")
	public void save(@RequestBody Member member) {
		memberService.insert(member);
	}


}
