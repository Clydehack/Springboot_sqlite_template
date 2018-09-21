package com.template.ie.sqlite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {

	@Autowired
	TestMapper testMapper;
	
	public String testService(String service_id, String name) {
		int count = testMapper.insertData(service_id, name);
		return "测试的次数" + count;
	}
}