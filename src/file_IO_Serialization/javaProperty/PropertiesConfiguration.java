package file_IO_Serialization.javaProperty;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesConfiguration {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/file_IO_Serialization/javaProperty/config.properties"));
            prop.list(System.out);

            System.out.println(prop.getProperty("file_name"));
            System.out.println(prop.getProperty("author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
