package file_IO_Serialization.javaProperty.configuringManager;

public class ConfigApplication {
    private static final String CONFIG_FILE_PATH = "config.properties";
    public static void main(String[] args) {
        ConfigureManager configManager = new ConfigureManager(CONFIG_FILE_PATH);

        System.out.println("Current configuration:");
        System.out.println("App Name: "+configManager.getProperty("app.name"));
        System.out.println("App Version: "+configManager.getProperty("app.version"));
        System.out.println("App Language: "+configManager.getProperty("app.language"));

        configManager.setProperty("app.language", "bn");
        configManager.setProperty("app.version", "2.0");

        System.out.println("Updated Configuration:");
        System.out.println("App Name: "+configManager.getProperty("app.name"));
        System.out.println("App Version: "+configManager.getProperty("app.version"));
        System.out.println("App Language: "+configManager.getProperty("app.language"));
    }
}
