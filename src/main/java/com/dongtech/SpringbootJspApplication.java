package com.dongtech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dongtech.dao")
public class SpringbootJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJspApplication.class, args);
    }
}
