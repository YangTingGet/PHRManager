package com.group2.phrmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.group2.phrmanager.dao")
public class PhrmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhrmanagerApplication.class, args);
    }

}
