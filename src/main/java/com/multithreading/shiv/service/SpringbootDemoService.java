package com.multithreading.shiv.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class SpringbootDemoService {

    @Autowired
    SpringbootAsyncDemoService springbootAsyncDemoService;

    public void processTask() throws InterruptedException {

        log.info("Start Preparing the task list");
        List<String> taskList = new ArrayList<>();
        taskList.add("India");
        taskList.add("America");

        taskList.add("China");
        taskList.add("Russia");
        taskList.add("France");
        taskList.add("Japan");
        taskList.add("England");
        taskList.add("Brazil");
        taskList.add("Australia");
        taskList.add("SaudiArabia");
        taskList.add("UAE");
        taskList.add("IRAN");
        taskList.add("Afghanistan");
        taskList.add("Nepal");

        log.info("Start Processing the task list");
        for(String payload : taskList){
            springbootAsyncDemoService.processTask(payload);
        }
        log.info("Completed Processing the task list");
    }

}
