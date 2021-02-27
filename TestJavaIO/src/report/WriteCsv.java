package report;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteCsv {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,code,name";

    public static void main(String[] args) {
        String filename = "TestJavaIO/country.csv";
      writeCsvFile(filename);
    }

    public static void writeCsvFile(String fileName) {
        Country country = new Country(1,"A","Viet Nam");
        Country country1 = new Country(2,"B","Trung Quoc");
        Country country2 = new Country(3,"C","Nhat Ban");

        List<Country> countryList = new ArrayList<>();
        countryList.add(country);
        countryList.add(country1);
        countryList.add(country2);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Country c: countryList) {
                fileWriter.append(String.valueOf(c.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Wirte file success!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
