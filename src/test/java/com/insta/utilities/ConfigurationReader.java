package com.insta.utilities;

import javafx.beans.property.Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;
    static {
        try {
            String path = "configuration.properties";
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyValue){
        return properties.getProperty(keyValue);
    }
}
