package com.meiying.blogserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * 通用mapper与业务mapper不要放到同一个包下 MapperScan不能扫描到通用mapper
 */
@SpringBootApplication
@MapperScan("com.meiying.blogserver.mapper")
public class BlogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogServerApplication.class, args);
    }

}
