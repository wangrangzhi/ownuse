package io.github.wangrangzhi.htmltopdf.service.impl.workpermitpdf;

import lombok.experimental.UtilityClass;

import java.io.*;

/**
 * @author darren
 * @date 2019-05-25
 */
@UtilityClass
public class IOUtils {
    public static void copyInputStreamToFile(InputStream inputStream, File file)
            throws IOException {

        try (FileOutputStream outputStream = new FileOutputStream(file)) {

            int read;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }

           //  commons-io
          //  IOUtils.copy(inputStream, outputStream);

        }
    }

    public byte[] toByteArray(InputStream stream) throws IOException {
        return toByteArray(stream, Integer.MAX_VALUE);
    }

    public byte[] toByteArray(InputStream stream, int length) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(length == Integer.MAX_VALUE ? 4096 : length);

        byte[] buffer     = new byte[4096];
        int    totalBytes = 0, readBytes;
        do {
            readBytes = stream.read(buffer, 0, Math.min(buffer.length, length - totalBytes));
            totalBytes += Math.max(readBytes, 0);
            if (readBytes > 0) {
                baos.write(buffer, 0, readBytes);
            }
        } while (totalBytes < length && readBytes > -1);

        if (length != Integer.MAX_VALUE && totalBytes < length) {
            throw new IOException("unexpected EOF");
        }

        return baos.toByteArray();
    }
}
