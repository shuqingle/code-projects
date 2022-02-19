package com.sugo.resident.task.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AutoTaskController {
    /**
     * 每月1号凌晨1点执行一次自动生成公私钥，并持久化到数据库，并缓存到redis中
     */
    @Scheduled(cron = "0 0 1 1 * ?")
    public void test(){
        log.info("123");
    }
}
