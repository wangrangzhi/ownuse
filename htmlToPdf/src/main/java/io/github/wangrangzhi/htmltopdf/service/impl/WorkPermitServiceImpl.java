package io.github.wangrangzhi.htmltopdf.service.impl;


import io.github.wangrangzhi.htmltopdf.service.WorkPermitService;
import io.github.wangrangzhi.htmltopdf.service.impl.workpermitpdf.Run;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.HashMap;

@Slf4j
@Service
public class WorkPermitServiceImpl implements WorkPermitService {


    @Override
    public byte[] downloadpdf(HashMap<String, String> datamap, byte[] htmlByte) throws Exception {





        File downloadFile = Run.runPdf(datamap,htmlByte);
        byte[] readFileToByteArray=  FileUtils.readFileToByteArray(downloadFile);

        downloadFile.delete();

        return readFileToByteArray;
    }
}
