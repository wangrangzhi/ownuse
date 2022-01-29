package io.github.wangrangzhi.processdefinition.service.impl;

import cn.hutool.core.thread.ExecutorBuilder;
import io.github.wangrangzhi.processdefinition.dao.Processdefinition;
import io.github.wangrangzhi.processdefinition.mapper.ProcessdefinitionMapper;
import io.github.wangrangzhi.processdefinition.service.ProcessdefinitionService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ExecutorService;

@Service
@Slf4j
@Scope("singleton")
public class ProcessdefinitionServiceImpl implements ProcessdefinitionService {

    @Autowired
    private ProcessdefinitionMapper processdefinitionMapper;

    private static String priid = "e9";


    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void SERIALIZABLE() {

        Processdefinition p = processdefinitionMapper.selectByPrimaryKey(priid);

        p.setCreateby(Integer.toString(Integer.parseInt(p.getCreateby()) + 1));

        processdefinitionMapper.updateByPrimaryKey(p);
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void REPEATABLE_READ() {

        Processdefinition p = processdefinitionMapper.selectByPrimaryKey(priid);

        p.setProcessname(Integer.toString(Integer.parseInt(p.getProcessname()) + 1));

        processdefinitionMapper.updateByPrimaryKey(p);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void READ_COMMITTED() {

        Processdefinition p = processdefinitionMapper.selectByPrimaryKey(priid);

        p.setProcesstype(Integer.toString(Integer.parseInt(p.getProcesstype()) + 1));

        processdefinitionMapper.updateByPrimaryKey(p);
    }

    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void READ_UNCOMMITTED() {

        Processdefinition p = processdefinitionMapper.selectByPrimaryKey(priid);

        p.setRemark(Integer.toString(Integer.parseInt(p.getRemark()) + 1));

        processdefinitionMapper.updateByPrimaryKey(p);
    }

    @Transactional(isolation = Isolation.READ_UNCOMMITTED, propagation = Propagation.REQUIRES_NEW)
    @Override
    public void testone() {

        Processdefinition p = processdefinitionMapper.selectByPrimaryKey(priid);

        p.setRemark(Integer.toString(Integer.parseInt(p.getRemark()) + 1));

        processdefinitionMapper.updateByPrimaryKey(p);
    }

    @Override
    @Transactional(isolation = Isolation.READ_UNCOMMITTED, propagation = Propagation.REQUIRED)
    public void rn() throws InterruptedException {
        Processdefinition p = processdefinitionMapper.selectByPrimaryKey(priid);

        log.info("first-------------------" + p.toString());


        ThreadRNDemo T1 = new ThreadRNDemo();
        T1.start();

        Thread.sleep(5000);


        log.info("middle:-------------------" + p.toString());
        p.setProcesstype(Integer.toString(Integer.parseInt(p.getProcesstype()) + 1));

        processdefinitionMapper.updateByPrimaryKey(p);

        log.info("last:-------------------" + p.toString());
    }


    @Override
    public void hutoolpool() {
        ExecutorService executor = ExecutorBuilder.create()
                .setCorePoolSize(2)
                .setMaxPoolSize(2)
                .useSynchronousQueue()
                .build();


        for (int i = 0; i < 2; i++) {

            executor.submit(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {


                    log.info("Thread.currentThread().getName():" + Thread.currentThread().getName());
                    tran();
                }
            });
        }

    }
    @Override
    public void tran() throws InterruptedException {
        Processdefinition p = processdefinitionMapper.selectByPrimaryKey(priid);


        log.info("first-------------------" + p.toString());
        log.info("t1start");
        ThreadMainDemo T1 = new ThreadMainDemo();
        T1.start();

        log.info("midlle-------------------" + processdefinitionMapper.selectByPrimaryKey(priid).toString());
        log.info("t2start");
        ThreadTheOtherDemo T2 = new ThreadTheOtherDemo();
        T2.start();



        Thread.sleep(5000);
        log.info("end-------------------" + processdefinitionMapper.selectByPrimaryKey(priid).toString());

    }
}
