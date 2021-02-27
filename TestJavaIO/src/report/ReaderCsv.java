package report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderCsv {

    public static void main(String[] args) {
        String fileName = "TestJavaIO/country.csv";
        ReadCsvFile(fileName);

    }

    public static void ReadCsvFile(String fileName) {
        try {
            String line;
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                for(String e : line.split(",")) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
