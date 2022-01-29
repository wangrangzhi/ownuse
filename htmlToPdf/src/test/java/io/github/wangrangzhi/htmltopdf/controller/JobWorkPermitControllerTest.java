package io.github.wangrangzhi.htmltopdf.controller;

import io.github.wangrangzhi.htmltopdf.HtmlToPdfApplication;
import io.github.wangrangzhi.htmltopdf.service.WorkPermitService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.HashMap;

@Slf4j

@SpringBootTest(classes = HtmlToPdfApplication.class)

@RunWith(SpringRunner.class)
class JobWorkPermitControllerTest {

    @Autowired
    private WorkPermitService workPermitService;

    @Test
    void download() throws Exception {

        HashMap<String, String> j = new HashMap<>();
        j.put("htmlmap.title", "java中自定义的标题");
        j.put("htmlmap.dfg", "gggggg说如果v");


        File files = new File(
                "C:\\Users\\Administrator\\Desktop\\" +
                        "新建文件夹\\1\\htmlToPdf" +
                        "\\src\\main\\resources" +
                        "\\tpl\\sampleTestData.html"
        );

        byte[] a = FileUtils.readFileToByteArray(files);

        byte[] bytes = workPermitService.downloadpdf(j, a);

        File file = new File(System.getProperty("user.dir") + "w.pdf");

        log.info(file.getPath());

        FileUtils.writeByteArrayToFile(file, bytes);
    }

    @Test
    void pathtest() {
        System.out.println(HtmlToPdfApplication.class.getResource("/").getPath());
        System.out.println(HtmlToPdfApplication.class.getResource("/application.properties").getPath());
        System.out.println(HtmlToPdfApplication.class.getResource("").getPath());
        System.out.println(HtmlToPdfApplication.class.getResource("/application.properties").getPath());
        System.out.println("-------------------");
        System.out.println(this.getClass().getResource("/").getPath());
        System.out.println(this.getClass().getResource("/application.properties").getPath());
        System.out.println(this.getClass().getResource("").getPath());
        // System.out.println(this.getClass().getResource("application.properties").getPath());
        System.out.println("-------------------");
        System.out.println(HtmlToPdfApplication.class.getClassLoader().getResource("").getPath());
        System.out.println(HtmlToPdfApplication.class.getClassLoader().getResource("application.properties").getPath());
        System.out.println(HtmlToPdfApplication.class.getClassLoader().getResource("mapper/DictMapper.xml").getPath());
        // System.out.println(HbYhpcSysApplication.class.getClassLoader().getResource("zero/xml/config/app.properties").getPath());
    }
}