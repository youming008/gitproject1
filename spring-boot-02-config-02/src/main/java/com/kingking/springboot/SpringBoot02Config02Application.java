package com.kingking.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot02Config02Application {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir")); // 获取当先项目路径   也就是./ 是在哪个目录

        SpringApplication.run(SpringBoot02Config02Application.class, args);
    }

}
