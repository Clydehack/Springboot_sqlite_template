# Springboot_sqlite_template
## windows 快速小型本地数据库通过springboot框架的使用

test:
	localhost:8888/testSqlite/call
	
	1.
	Fri Sep 21 15:35:04 CST 2018
	There was an unexpected error (type=Internal Server Error, status=500).
	### Error updating database. Cause: org.sqlite.SQLiteException: [SQLITE_ERROR] SQL error or missing database (no such table: test) ### SQL: insert into test(service_id,name) values (?,?) ### Cause: org.sqlite.SQLiteException: [SQLITE_ERROR] SQL error or missing database (no such table: test) ; uncategorized SQLException; SQL state [null]; error code [1]; [SQLITE_ERROR] SQL error or missing database (no such table: test); nested exception is org.sqlite.SQLiteException: [SQLITE_ERROR] SQL error or missing database (no such table: test)
	
	2.
	命令行测试失败，网上教程太乱了，理不清建库头绪，直接navicat premium可视化5秒钟建库完成，数据插入测试通过。这回可以快速写写小项目玩了