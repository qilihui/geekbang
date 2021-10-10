package com.example.geekbang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.geekbang.mapper")
public class GeekbangApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeekbangApplication.class, args);
    }

}
