package io.github.wangrangzhi.processdefinition.service.impl;

import io.github.wangrangzhi.processdefinition.config.ApplicationContext.SpringJobBeanFactory;
import io.github.wangrangzhi.processdefinition.service.ProcessdefinitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;



@Slf4j
public class ThreadRNDemo extends Thread {
    private Thread t;
    private String threadName;


    public ThreadRNDemo() {
        threadName = this.getName();
        System.out.println("Creating " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);

        ProcessdefinitionService processdefinitionService = SpringJobBeanFactory.getBean("processdefinitionServiceImpl");


        processdefinitionService.testone();


        System.out.println("Thread " + threadName + " exiting.");
    }
    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

