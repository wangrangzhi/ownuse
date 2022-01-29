package io.github.wangrangzhi.processdefinition.controller;

import io.github.wangrangzhi.processdefinition.service.ProcessdefinitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-api/vue-admin-template/user")

@Slf4j
public class ProcessController {


    @Autowired
    private ProcessdefinitionService  processdefinitionService;


    @PostMapping("/all")
    public String all() {
        processdefinitionService.SERIALIZABLE();
        processdefinitionService.REPEATABLE_READ();
        processdefinitionService.READ_COMMITTED();
        processdefinitionService.READ_UNCOMMITTED();
        return "1";
    }

    @PostMapping("/READ_UNCOMMITTED")
    public String READ_UNCOMMITTED() throws InterruptedException {
        processdefinitionService.rn();
        return "1";
    }

    @PostMapping("/hutoolpool")
    public String hutoolpool() throws InterruptedException {
        processdefinitionService.hutoolpool();
        return "1";
    }

    @PostMapping("/tran")
    public String tran() throws InterruptedException {
        processdefinitionService.tran();
        return "1";
    }
}
