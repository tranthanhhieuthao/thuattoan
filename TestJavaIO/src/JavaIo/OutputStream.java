package JavaIo;

import java.io.*;
import java.nio.file.Files;

public class OutputStream {
    public static final String PATH = "D:/Demo/File";

    public static void outputStream() throws IOException {
        File file = new File(PATH + "/" + "document.xlsx");
        FileOutputStream outputStream = new FileOutputStream(PATH + "/" + "HieuThao.xlsx");
        try {
            byte[] bt = Files.readAllBytes(file.toPath());
            outputStream.write(bt);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
        }
    }

    public static void main (String[] args) throws IOException {
        OutputStream.outputStream();
    }
}
