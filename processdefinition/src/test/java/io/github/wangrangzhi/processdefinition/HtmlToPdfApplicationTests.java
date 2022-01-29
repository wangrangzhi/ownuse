package io.github.wangrangzhi.processdefinition;

import cn.hutool.core.util.IdUtil;
import io.github.wangrangzhi.processdefinition.dao.Processdefinition;
import io.github.wangrangzhi.processdefinition.mapper.ProcessdefinitionMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@Slf4j

@SpringBootTest(classes = ProcessDefinitionApplication.class)

@RunWith(SpringRunner.class)
class HtmlToPdfApplicationTests {

    @Autowired
    private ProcessdefinitionMapper processdefinitionMapper;

    @Test
    void contextLoads() {

        List<Processdefinition> processdefinitionList = new ArrayList<>();

        int ij = 10000;

        for (int i = 0; i < ij; i++) {
            Processdefinition processdefinition = new Processdefinition();
            processdefinition.setId(IdUtil.simpleUUID());
            processdefinition.setCreateby(IdUtil.simpleUUID());

            processdefinitionList.add(processdefinition);
        }

        StringBuffer a = new StringBuffer();

        for (int i = 0; i < ij; i++) {


            if (i != ij-1) {
                a.append(processdefinitionList.get(i).getId()+","+ processdefinitionList.get(i).getCreateby()+ "-");
            } else {
                a.append(processdefinitionList.get(i).getId()+","+ processdefinitionList.get(i).getCreateby());
            }


        }


        log.info(String.valueOf(ij) +"------a.length:"+a.length());

        processdefinitionMapper.callProc(a.toString(), "-",",");

    }

}
