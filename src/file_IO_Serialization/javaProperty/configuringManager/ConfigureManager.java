package file_IO_Serialization.javaProperty.configuringManager;

import java.io.*;
import java.util.Properties;

public class ConfigureManager {
    private Properties properties;
    private String propertiesFilePath;

    public ConfigureManager(String propertiesFilePath) {
        this.propertiesFilePath = propertiesFilePath;
        properties = new Properties();
        loadProperties();
    }

    private void loadProperties() {
        try(InputStream in = new FileInputStream(propertiesFilePath)) {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public String getProperty(String key) {
        return properties.getProperty(key);
   }
   public void setProperty(String key, String value) {
        properties.setProperty(key, value);

   }
   private void saveProperties() {
        try(OutputStream out = new FileOutputStream(propertiesFilePath)) {
            properties.store(out, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
}
