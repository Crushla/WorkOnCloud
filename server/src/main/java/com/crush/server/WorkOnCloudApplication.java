package com.crush.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.crush.server.mapper")
public class WorkOnCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkOnCloudApplication.class,args);
    }
}
