package com.dzkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dzkj.dao")
public class SpringbootDay1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDay1Application.class, args);
    }
}
