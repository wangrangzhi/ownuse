package io.github.wangrangzhi.htmltopdf.controller;

import io.github.wangrangzhi.htmltopdf.service.WorkPermitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/workpermit")

@Slf4j
public class JobWorkPermitController {


    @Autowired
    private WorkPermitService workPermitService;


    @RequestMapping("/download")
    public byte[] download(HashMap<String, String> datamap, byte[] htmlByte) throws Exception {


        byte[] bytes = workPermitService.downloadpdf(datamap, htmlByte);
        return bytes;


    }

    @RequestMapping("/df")
    public String download() throws Exception {

        log.info("sedf");
        return "sdf";


    }
}
