package net.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // In this class we will implement the repeated steps of reading
    // from configurations.properties file
    // 1 - Create the object of Properties
    // 2 - Get path and open file
    // 3 - Load the opened file into the properties object
    // 4 - Use the object to read from the configurations.properties file

    // 1
    private static Properties properties = new Properties();

    // 2
    static{
        try {
            FileInputStream file = new FileInputStream("configurations.properties");

            // 3
            properties.load(file);

            // closing the file in JVM memory
            file.close(); // manually closes the file in JVM memory

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 4
    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }

}
