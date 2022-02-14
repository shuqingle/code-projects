package com.sugo.resident.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.sugo.resident.console","com.sugo.resident.commonapi"})
//@MapperScan("com.sugo.resident.console.ruser.dao")
public class ResidentApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ResidentApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ResidentApplication.class);
    }
}
