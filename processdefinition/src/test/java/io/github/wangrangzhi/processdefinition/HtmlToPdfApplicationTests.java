package io.github.wangrangzhi.processdefinition;

import cn.hutool.core.util.IdUtil;
import io.github.wangrangzhi.processdefinition.dao.Processdefinition;
import io.github.wangrangzhi.processdefinition.mapper.ProcessdefinitionMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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


            if (i != ij - 1) {
                a.append(processdefinitionList.get(i).getId() + "," + processdefinitionList.get(i).getCreateby() + "-");
            } else {
                a.append(processdefinitionList.get(i).getId() + "," + processdefinitionList.get(i).getCreateby());
            }


        }


        log.info(String.valueOf(ij) + "------a.length:" + a.length());

        processdefinitionMapper.callProc(a.toString(), "-", ",");

    }


    /**
     * @Description: 批量新增发送明细数据一次性插入1000条
     * @Param:
     * @return:
     * @Author: fanghuaiming
     * @Date:
     */

    @Autowired
    private DataSource dataSource;

    @Test
    public void savebatchDtlBatch() throws SQLException {
        log.info("Fuction:savebatchDtlBatch start insert into mysql batch 【 sms_msg_dtl 】");
        Connection conn = DataSourceUtils.getConnection(dataSource);
        long before = System.currentTimeMillis();
        int count = 0;
        log.info("Fuction:savebatchDtlBatch Connection has opend");
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO processdefinition ( id, createby, createtime, processname, processtype, remark )\n" +
                            "VALUES\n" +
                            "\t(\n" +
                            "\t\t?,?,?,?,?,?\n" +
                            "\t);");
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100000; i++) {
            try {
                Processdefinition smsSendHistoryDetail = new Processdefinition();
                pstmt.setString(1, IdUtil.simpleUUID());
                pstmt.setString(2, IdUtil.simpleUUID());
                pstmt.setTimestamp(3, new Timestamp(new Date().getTime()));
                pstmt.setString(4, IdUtil.simpleUUID());
                pstmt.setString(5, IdUtil.simpleUUID());
                pstmt.setString(6, IdUtil.simpleUUID());

                pstmt.addBatch();


            } catch (
                    SQLException e) {
                log.info("Fuction:savebatchDtlBatch mysql 【 sms_msg_dtl 】  batch insert get some Exception : {} ", e);
                e.printStackTrace();
            }
        }
        pstmt.executeBatch();

        conn.commit();
        pstmt.clearBatch();

        long after = System.currentTimeMillis();
        log.info("Fuction:savebatchDtlBatch  had done insert into mysql batch 【 sms_msg_dtl 】And Time-consuming : {} milliseconds", after - before);
        DataSourceUtils.releaseConnection(conn, dataSource);
        log.info("Fuction:savebatchDtlBatch Connection has released");
    }

}
