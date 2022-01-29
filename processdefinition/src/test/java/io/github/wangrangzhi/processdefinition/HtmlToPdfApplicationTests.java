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

@Slf4j

@SpringBootTest(classes = ProcessDefinitionApplication.class)

@RunWith(SpringRunner.class)
class HtmlToPdfApplicationTests {

	@Autowired
	private ProcessdefinitionMapper processdefinitionMapper;

	@Test
	void contextLoads() {
		Processdefinition processdefinition = new Processdefinition();
		processdefinition.setId(IdUtil.simpleUUID());

		processdefinitionMapper.insert(processdefinition);

	}

}
