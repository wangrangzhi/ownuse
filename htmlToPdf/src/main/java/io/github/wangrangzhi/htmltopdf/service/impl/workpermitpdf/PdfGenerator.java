package io.github.wangrangzhi.htmltopdf.service.impl.workpermitpdf;

/**
 * @author darren
 * @date 2019-05-25
 */
public interface PdfGenerator {

    default String fontpath() {
        return "Fonts/Alibaba-PuHuiTi-Regular.otf";
    }




    void generatePdf(String html, String outputFile) throws Exception;


}
