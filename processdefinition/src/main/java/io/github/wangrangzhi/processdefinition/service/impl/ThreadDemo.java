package io.github.wangrangzhi.processdefinition.service.impl;

import io.github.wangrangzhi.processdefinition.config.ApplicationContext.SpringJobBeanFactory;
import io.github.wangrangzhi.processdefinition.service.ProcessdefinitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;


    public ThreadDemo() {
        threadName = this.getName();
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);

        ProcessdefinitionService processdefinitionService = SpringJobBeanFactory.getBean("processdefinitionServiceImpl");

        for (int i = 4; i > 0; i--) {
           processdefinitionService.READ_UNCOMMITTED();
           processdefinitionService.SERIALIZABLE();
//            processdefinitionService.READ_COMMITTED();
            processdefinitionService.REPEATABLE_READ();
        }

        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

