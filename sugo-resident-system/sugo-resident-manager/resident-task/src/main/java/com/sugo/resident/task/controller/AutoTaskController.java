package com.sugo.resident.task.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AutoTaskController {
    @Scheduled(cron = "0 0 1 1 * ?")
    public void test(){
        log.info("123");
    }
}
