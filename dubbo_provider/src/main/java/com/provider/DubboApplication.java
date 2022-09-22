package com.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DubboApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
