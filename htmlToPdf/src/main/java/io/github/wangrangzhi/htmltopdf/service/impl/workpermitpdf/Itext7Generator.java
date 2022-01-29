package io.github.wangrangzhi.htmltopdf.service.impl.workpermitpdf;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.attach.impl.OutlineHandler;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.WriterProperties;
import com.itextpdf.layout.font.FontProvider;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

import java.io.InputStream;
import java.net.URL;

/**
 * Itext7 实现HTML转PDF
 *
 * @author darren
 * @date 2019-05-25
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Itext7Generator implements PdfGenerator {

    //private FontProvider fontProvider;

    private volatile static Itext7Generator instanse;

    public static PdfGenerator getInstanse() {
        if (instanse == null) {
            synchronized (Itext7Generator.class) {
                if (instanse == null) {
                    instanse = new Itext7Generator();
                    instanse.initFont();
                }
            }
        }

        return instanse;
    }

    private void initFont() {


    }

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void generatePdf(String html, String outputFile) throws Exception {
        //outputFile也可以是输出流
        PdfWriter writer = new PdfWriter(outputFile, new WriterProperties().setFullCompressionMode(Boolean.TRUE));
        PdfDocument doc = new PdfDocument(writer);
        doc.setDefaultPageSize(PageSize.A4);
        doc.getDefaultPageSize().applyMargins(20, 20, 20, 20, true);

        //获取字体，提供给水印 和 页码使用

        FontProvider fontProvider = new FontProvider();
        fontProvider.addFont(fontpath());
        fontProvider.addFont(FontConstants.TIMES_ITALIC);

        PdfFont pdfFont = fontProvider.getFontSet()
                .getFonts()
                .stream()
                .findFirst()
                .map(fontProvider::getPdfFont)
                .orElse(null);


        URL resource = this.getClass().getClassLoader().getResource("Fonts/Alibaba-PuHuiTi-Regular.otf");


        InputStream is = new URL(resource.toString()).openStream();


        byte[] fontBytes = IOUtils.toByteArray(is); // from Apache Commons IO

        PdfFont font = PdfFontFactory.createFont(fontBytes, PdfEncodings.UTF8, true);
        //PdfFont d = new PdfFont(, 14f);

        //  doc.addEventHandler(PdfDocumentEvent.END_PAGE, new WaterMarker(pdfFont));

        doc.addEventHandler(PdfDocumentEvent.END_PAGE, new PageMarker(font));

        ConverterProperties properties = new ConverterProperties();
        properties.setFontProvider(fontProvider);
        //PDF目录
        properties.setOutlineHandler(OutlineHandler.createStandardHandler());
        HtmlConverter.convertToPdf(html, doc, properties);
    }
}
