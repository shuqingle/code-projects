package com.sugo.resident.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//微服务必须扫描到commonApi的模块路径，否则无法获取对应的bean
@SpringBootApplication(scanBasePackages = {"com.sugo.resident.task","com.sugo.resident.commonapi"})
@EnableScheduling
public class ResidentTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResidentTaskApplication.class, args);
    }

}
