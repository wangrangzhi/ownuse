package io.github.wangrangzhi.testAndOkhttp;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
class cmdTests {


    @Test
    public void sny() throws IOException {
        // String str = RuntimeUtil.execForStr("ipconfig");
//        log.info(str);
//
//        log.info("getTotalMemory:" + RuntimeUtil.getTotalMemory());

//        File f = new File("C:\\Users\\Administrator\\Desktop\\新建文件夹 (4)\\ownuse\\shell\\1.bat");
//        //  log.info("-------------file:"+ FileUtil.readString(f, StandardCharsets.UTF_8));
//
//
//        String str = RuntimeUtil.execForStr("cmd /c", "cd \"C:\\Users\\Administrator\\Desktop\\新建文件夹 (4)\\ownuse\\testAndOkhttp\\shell\\1.bat", "1.bat");
//        Console.log(str);

//        Process a = RuntimeUtil.exec(null, f,".1.bat");
//        log.info(a.toString());

        importDateTohive();
        // log.info(a);

    }


    private String execCmdWithResult() {
        try {
            String command = "cmd.exe /C 'C:\\Users\\Administrator\\Desktop\\新建文件夹 (4)\\ownuse\\testAndOkhttp\\shell\\1.bat'";
            //接收正常结果流
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            //接收异常结果流
            ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
            CommandLine commandline = CommandLine.parse(command);
            DefaultExecutor exec = new DefaultExecutor();
            exec.setExitValues(null);
            //设置一分钟超时
            ExecuteWatchdog watchdog = new ExecuteWatchdog(60 * 1000);
            exec.setWatchdog(watchdog);
            PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream, errorStream);
            exec.setStreamHandler(streamHandler);
            exec.execute(commandline);
            //不同操作系统注意编码，否则结果乱码
            String out = outputStream.toString("GBK");
            String error = errorStream.toString("GBK");
            return out + error;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }


    public void importDateTohive() {
        try {
            String shpath = "/Users/Administrator/Desktop/新建文件夹 (4)/ownuse/testAndOkhttp/shell/1.sh";
            Process ps = Runtime.getRuntime().exec(shpath);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("数据刷新成功");
    }


}
