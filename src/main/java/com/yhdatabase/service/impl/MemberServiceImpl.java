package com.yhdatabase.service.impl;

import org.springframework.stereotype.Service;

import com.yhdatabase.domain.Member;
import com.yhdatabase.repository.MemberMapper;
import com.yhdatabase.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	private final MemberMapper memberMapper;


	public MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}


	@Override
	public void insert(Member member) {
		memberMapper.insert(member);
	}



}
