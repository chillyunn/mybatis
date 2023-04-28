package com.yhdatabase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yhdatabase.domain.Authority;
import com.yhdatabase.service.AuthorityService;

@RestController
public class AuthorityController {
	private final AuthorityService authorityService;

	public AuthorityController(AuthorityService authorityService) {
		this.authorityService = authorityService;
	}

	@PostMapping(value = "/api/authority/save")
	void save(@RequestBody Authority authority) {
		authorityService.insert(authority);
	}

}
