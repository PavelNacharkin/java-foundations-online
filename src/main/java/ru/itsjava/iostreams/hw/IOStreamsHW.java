package ru.itsjava.iostreams.hw;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsHW {
    public static void main(String[] args) {
        /* Создали два файла*/
        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");

        /* Записали текст в первый файл*/
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println("Текст из первого файла");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /* Записали текст во второй файл*/
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("Текст из второго файла");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /* Создали коллекцию 1*/
        List<String> collection1 = new ArrayList<>();

        /* Считали текст из file1  в коллекцию*/
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            collection1.add(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* Создали коллекцию 2*/
        List<String> collection2 = new ArrayList<>();

        /* Считали текст из file2  в коллекцию*/
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            collection2.add(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* Записали текст из коллекции в file1*/
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println(collection2.get(0));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /* Записали текст из коллекции в file2*/
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println(collection1.get(0));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
