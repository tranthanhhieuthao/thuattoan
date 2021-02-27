package JavaIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileClass {
    public static final String PATH = "D:/Demo/File";

    public static void readByte() throws FileNotFoundException {
        File file = new File(PATH + "/" + "document.docx");
        try {
            if (file.exists()) {
                System.out.println("can read :" + file.canRead());
                System.out.println("can write :" + file.canWrite());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getParent());
                System.out.println(file.getPath());
                System.out.println(file.isAbsolute());
                System.out.println(file.isDirectory());
                System.out.println(file.listFiles());
                System.out.println(file.toURI());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws FileNotFoundException {
        try {
            FileClass.readByte();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
