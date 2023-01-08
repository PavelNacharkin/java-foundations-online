package ru.itsjava.iostreams.lesson;

import java.io.*;

public class IOStreamsPractice {
    public static void main(String[] args) {

//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//               e.printStackTrace();
//            }
//        }

//      try with resources


//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//
//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src/main/resources/file.txt");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("Строка 1");
            printWriter.println("Строка 2");
            printWriter.println("Строка 3");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = "";
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
