package com.template.ie.sqlite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Windows本地快速数据库SQLite
 * @author Clyde
 */
@RestController
@RequestMapping(value="/testSqlite")
public class TestController {

	@Autowired
	TestService testSer;
	
	@RequestMapping(value="/call")
	public String call() {
		testSer.testService("sss", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		return "OK";
	}
}