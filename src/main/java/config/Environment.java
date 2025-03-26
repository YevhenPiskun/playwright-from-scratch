package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Environment {

    public static final Properties PROPERTIES;
    private static final String PROPERTIES_FILE_NAME = "local.properties";

    static {
        try {
            PROPERTIES = new Properties();
            InputStream inputStream = Environment.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME);
            PROPERTIES.load(inputStream);
            assert inputStream != null;
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) {
        String systemProp = System.getenv().get(key);
        if (systemProp != null) {
            return systemProp;
        }

        return PROPERTIES.getProperty(key);
    }
}