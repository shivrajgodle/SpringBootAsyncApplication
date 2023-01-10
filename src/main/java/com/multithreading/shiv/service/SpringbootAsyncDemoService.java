package com.multithreading.shiv.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpringbootAsyncDemoService {

    @Async("multithreadingdemoasyncthread")
    public void processTask(String payload) throws InterruptedException {
        log.info("Starting Thread {} - Processing Payload {}",payload);
        log.info("Length of payload String is {}",payload.length());
        Thread.sleep(500);
        log.info("Exiting Thread - Processing payload {} completed", payload);

    }
}
