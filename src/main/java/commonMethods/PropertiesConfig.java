package commonMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {
    public static Properties properties = new Properties();
    public static String getPropertyValue(String key) {
        String value;
        try {
            String filePath = System.getProperty("user.dir")+"/src/test/resources/config.properties";
            FileInputStream file = new FileInputStream(filePath);
            properties.load(file);
            value = properties.getProperty(key).toString();
            if(value.isEmpty() || value.isBlank()) {
                throw new Exception("Value is not specified for the key : "+key);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }
}
