package file_IO_Serialization.javaProperty;

import java.io.FileOutputStream;
import java.util.Properties;

public class CreateProperty {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            System.out.println(prop.setProperty("Dhaka", "Shyamoli"));
            System.out.println(prop.setProperty("Chattogram", "Pahartuli"));
            System.out.println(prop.setProperty("Rajshahi", "Chapai"));
            System.out.println(prop.setProperty("Sylhet", "Jaflong"));
            System.out.println(prop.setProperty("Barisal", "Patuakhali"));
            System.out.println(prop.setProperty("Khulna", "Khalishpur"));

            prop.store(new FileOutputStream("setProperty.properites"), "created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
