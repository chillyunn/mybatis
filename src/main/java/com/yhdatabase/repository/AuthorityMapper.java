package com.yhdatabase.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yhdatabase.domain.Authority;

@Mapper
public interface AuthorityMapper {
	void save(@Param("authority")Authority authority);

	Authority findByMemberEmail(String email);

}
