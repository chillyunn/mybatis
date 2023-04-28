package com.yhdatabase.service.impl;

import org.springframework.stereotype.Service;

import com.yhdatabase.domain.Authority;
import com.yhdatabase.repository.AuthorityMapper;
import com.yhdatabase.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	private final AuthorityMapper authorityMapper;

	public AuthorityServiceImpl(AuthorityMapper authorityMapper) {
		this.authorityMapper = authorityMapper;
	}

	@Override
	public void insert(Authority authority) {
		authorityMapper.save(authority);

	}



}
