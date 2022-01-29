package io.github.wangrangzhi.htmltopdf.service.impl.workpermitpdf;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试用例
 *
 * @author darren
 * @date 2019-05-25
 */
public class Run {


    public static String htmlTagString = "STARTTAG";
    public static String htmlTagEndString = "ENDTAG";

    public static String imgStart = " <img ";
    public static String imgEnd = "\">";

    public static File runPdf(HashMap<String, String> datamap, byte[] htmlByte) throws Exception {


        PdfGenerator itext7 = Itext7Generator.getInstanse();

        String savePath = System.getProperty("user.dir");//生成PDF的保存目录


//        String FILE_TO = "e:\\google.txt";
//        File file = new File(FILE_TO);
//        IOUtils.copyInputStreamToFile(inputStream, file);
//
//        String str = FileUtils.readFileToString(file, "UTF-8");
//        System.out.println(str);
//
//        InputStream inputhj = new FileInputStream(file);

        String raw = new String(htmlByte, "UTF-8");


        String containsData = insertMapData(raw, datamap);

        String imgHandler = imgHandler(containsData);


        itext7.generatePdf(imgHandler, savePath + "itext7.pdf");

        File file = new File(savePath + "itext7.pdf");
        return file;
    }

    private static String imgHandler(String containsData) throws IOException {

        if (!StringUtils.containsAny(containsData, imgStart)) {
            return containsData;
        }

        String htmlResult = replaceImgData(containsData);


        return htmlResult;

    }

    private static String replaceImgData(String containsData) throws IOException {

        String[] strings = containsData.split("\n");


        List<String> listA = Arrays.asList(strings);


        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i).indexOf(imgStart) != -1) {


                String re = replaceImgInTheLine(listA.get(i));

                listA.set(i, re);


            }


        }


        String a = listA.parallelStream().map(ap -> ap + "\n").collect(Collectors.joining());


        return a;


    }

    private static String replaceImgInTheLine(String s) throws IOException {

        String a = s.trim();


        int nm = a.indexOf("src=\"");
        int start = nm + 5;
        String b = a.substring(start, a.length() - 1);
        int end = b.indexOf("\"");

        String imgsrcName = b.substring(0, end);

        // System.out.println(imgname);

        File ajpg = new File("a.jpg");

        FileUtils.writeByteArrayToFile(ajpg, getTheByteImg(imgsrcName));

        String imgBase64 = genbase64(ajpg.toString());


        String n = a.substring(0, start) + "data:image/jpg;base64," + imgBase64 + "\"/>";
        String res = s.replace(a, n);

        ajpg.delete();


        return res;
    }

    public final static OkHttpClient client = new OkHttpClient();

    private static byte[] getTheByteImg(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().bytes();
        }
    }

    private static String genbase64(String filename) throws IOException {

        File file = new File
                (filename);

        file.toString();


        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(file);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        Base64.Encoder encoder = Base64.getEncoder();
        // 返回Base64编码过的字节数组字符串


        String ba = encoder.encodeToString(data);
        ;
        // System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(data)));


        return ba;
    }

    private static String insertMapData(String raw, HashMap<String, String> j) {


        if (!StringUtils.containsAny(raw, htmlTagString)) {
            return raw;
        }

        String htmlResult = replaceStringData(raw, j);


        return htmlResult;
    }

    private static String replaceStringData(String raw, HashMap<String, String> j) {


        String[] strings = raw.split("\n");

        //  System.out.println(strings);

        List<String> listA = Arrays.asList(strings);

//        Stream<Object> stringStream = listA.parallelStream().map(htmlSingalLine -> {
//
//            if (htmlSingalLine.indexOf(htmlTagString) != -1) {
//                return replaceInTheLine(htmlSingalLine, j);
//            }
//
//            return htmlSingalLine;
//
//        });

        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i).indexOf(htmlTagString) != -1) {


                String re = replaceInTheLine(listA.get(i), j).toString();

                listA.set(i, re);


            }


        }


//        List<String> result = stringStream.map(a -> a.toString()).collect(Collectors.toList());
//
//
//        StringBuffer sb = new StringBuffer();
//
//        result.parallelStream().forEach(a -> sb.append(a));

        String a = listA.parallelStream().map(ap -> ap + "\n").collect(Collectors.joining());


        return a;
    }

    private static Object replaceInTheLine(String htmlSingalLine, HashMap<String, String> HtmlValueHashMap) {


        String[] strings = htmlSingalLine.split(htmlTagString);
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            if (StringUtils.containsAny(s, htmlTagEndString)) {

                int valueTagIndex = s.indexOf(htmlTagEndString);
                String hashkey = s.substring(0, valueTagIndex);
                Stream<String> stringStream =
                        HtmlValueHashMap.keySet().parallelStream().filter(a -> a.equals(hashkey));


                Boolean insert = false;
                for (String key : HtmlValueHashMap.keySet()) {
                    //System.out.println("Key: "+key+" Value: "+map.get(key));

                    if (hashkey.equals(key)) {


                        String sd = stringStream.toString();
                        String dfge = HtmlValueHashMap.get(key);

                        String df = dfge + htmlTagEndString;
                        String sdf = stringStream.toString();
                        String s1 = df.replace(df, dfge);

                        sb.append(s1);
                        insert = true;
                    }
                }

                if (!insert) {
                    sb.append(s);
                }


            } else {
                sb.append(s);
            }


        }

//
//        Stream<String> result = Arrays.stream(strings).parallel().map(s -> {
//
//            int valueTagIndex = s.indexOf(htmlTagEndString);
//            String hashkey = s.substring(0, valueTagIndex);
//            Stream<String> stringStream =
//                    stringHashMap.keySet().parallelStream().filter(a -> a.equals(hashkey));
//
//
//            String lambdaResult = s.replace(hashkey + htmlTagEndString, stringStream.toString());
//            return lambdaResult;
//
//        });
//
//        String collect = result.collect(Collectors.joining());


        return sb;
    }


}
