package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 申请授权码
 * http://localhost:8080/oauth/authorize
 * client_id=client
 * response_type=code
 * 申请token
 * http://client:secret@localhost:8080/oauth/token
 * 参数
 * grant_type =
 * code=
 *
 * 网站 https://www.funtl.com/
 * https://juejin.im/post/6844903807067881480
 *
 * 官方sql
 * https://github.com/spring-projects/spring-security-oauth/blob/master/spring-security-oauth2/src/test/resources/schema.sql
 */
@SpringBootApplication
@MapperScan(basePackages = "com.my.mapper")
public class BootAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootAuth2Application.class, args);
    }

}
