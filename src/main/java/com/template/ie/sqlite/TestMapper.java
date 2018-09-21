package com.template.ie.sqlite;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {

	/* 测试SQLite - CURD */
	@Insert("insert into test(service_id,name) values (#{service_id},#{name})")
	int insertData(@Param("service_id") String service_id,@Param("name") String name);
}