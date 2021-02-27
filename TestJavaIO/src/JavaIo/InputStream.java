package JavaIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream {
    public static final String PATH = "D:/Demo/File";

    public static void readByte() throws FileNotFoundException {
        File file = new File(PATH + "/" + "document.docx");
        try {
            int i = -1;
            FileInputStream inputStream = new FileInputStream(PATH + "/" + "document.docx");
            while ((i = inputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws FileNotFoundException {
        try {
            InputStream.readByte();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
