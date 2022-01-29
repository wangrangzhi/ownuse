package io.github.wangrangzhi.processdefinition.service.impl;

import io.github.wangrangzhi.processdefinition.config.ApplicationContext.SpringJobBeanFactory;
import io.github.wangrangzhi.processdefinition.service.ProcessdefinitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ThreadTheOtherDemo extends Thread {
    private Thread t;
    private String threadName;


    public ThreadTheOtherDemo() {
        threadName = this.getName();

    }

    public void run() {


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

