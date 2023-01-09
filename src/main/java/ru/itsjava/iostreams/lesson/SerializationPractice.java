package ru.itsjava.iostreams.lesson;

import ru.itsjava.collections.maps.Man;

import java.io.*;

public class SerializationPractice {

    public static void main(String[] args) {

//        Man man = new Man("Павел");
//
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream
//                (new FileOutputStream("src/main/resources/man.out"))) {
//            objectOutputStream.writeObject(man);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try (ObjectInputStream objectInputStream = new ObjectInputStream
                (new FileInputStream("src/main/resources/man.out"))) {
            Object obj = objectInputStream.readObject();
            Man man = (Man) obj;
            System.out.println("man = " + man);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
