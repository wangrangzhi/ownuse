package io.github.wangrangzhi.htmltopdf.service;

import java.util.HashMap;


public interface WorkPermitService {


    /**
     *
     * @param

     * @throws Exception
     */
    public byte[] downloadpdf(HashMap<String, String> datamap, byte[] htmlByte) throws Exception;


}


