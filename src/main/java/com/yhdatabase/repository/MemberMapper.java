package com.yhdatabase.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yhdatabase.domain.Member;

@Mapper
public interface MemberMapper {
	void insert(@Param("member") Member member);
}
