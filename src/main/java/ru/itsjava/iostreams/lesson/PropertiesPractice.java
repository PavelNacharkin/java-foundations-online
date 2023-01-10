package ru.itsjava.iostreams.lesson;

import java.io.*;
import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/application.properties");

        Properties props = new Properties();
        props.load(new FileInputStream(file));

        System.out.println("props.get(\"key1\") = " + props.get("key1"));

        props.setProperty("key2","value2");
        System.out.println("props.get(\"key2\") = " + props.get("key2"));


        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");

        Properties propsFromStream = new Properties();
        propsFromStream.load(inputStream);
        System.out.println("propsFromStream.get(\"key1\") = " + propsFromStream.get("key1"));


    }
}
