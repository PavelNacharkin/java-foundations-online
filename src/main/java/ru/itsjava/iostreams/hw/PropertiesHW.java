package ru.itsjava.iostreams.hw;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHW {

    public static void main(String[] args) throws IOException {

        ClassLoader classLoader = PropertiesHW.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("app.properties");

        Properties props = new Properties();
        props.load(inputStream);
        System.out.println("My props :" + props.get("name") + " " + props.get("nickname"));
    }
}
