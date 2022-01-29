package io.github.wangrangzhi.processdefinition.service.impl;

import io.github.wangrangzhi.processdefinition.config.ApplicationContext.SpringJobBeanFactory;
import io.github.wangrangzhi.processdefinition.service.ProcessdefinitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;



@Slf4j
public class ThreadMainDemo extends Thread {
    private Thread t;
    private String threadName;


    public ThreadMainDemo() {
        threadName = this.getName();

    }

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ProcessdefinitionService processdefinitionService = SpringJobBeanFactory.getBean("processdefinitionServiceImpl");



        processdefinitionService.SERIALIZABLE();



    }

    public void start() {

        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

