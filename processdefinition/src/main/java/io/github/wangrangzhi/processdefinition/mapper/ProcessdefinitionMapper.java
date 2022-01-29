package io.github.wangrangzhi.processdefinition.mapper;

import io.github.wangrangzhi.processdefinition.dao.Processdefinition;
import io.github.wangrangzhi.processdefinition.dao.ProcessdefinitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessdefinitionMapper {
    int countByExample(ProcessdefinitionExample example);

    int deleteByExample(ProcessdefinitionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Processdefinition record);

    int insertSelective(Processdefinition record);

    List<Processdefinition> selectByExample(ProcessdefinitionExample example);

    Processdefinition selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Processdefinition record, @Param("example") ProcessdefinitionExample example);

    int updateByExample(@Param("record") Processdefinition record, @Param("example") ProcessdefinitionExample example);

    int updateByPrimaryKeySelective(Processdefinition record);

    int updateByPrimaryKey(Processdefinition record);
}