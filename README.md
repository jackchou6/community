## 麻将社区
## 资料
[Spring 文档](www.baidu.com)

[Spring Web](www.baidu.com)

[es](www.baidu.com)

[Github OAuth Document](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

## 工具

##sql脚本
```sql
CREATE TABLE USER
(
	ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
	NAME VARCHAR(50),
	ACCOUNT_ID VARCHAR(100),
	TOKEN CHAR(50),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT
);

```
```bash
mvn flyway:migrate
```
